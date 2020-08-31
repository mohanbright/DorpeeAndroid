package com.droid.dorpee.ui.personaldashboard.personalItem

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityDorpeePlanBinding
import com.droid.dorpee.ui.ChangePlanRequest
import com.droid.dorpee.ui.PurchasePlanRequest
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.LoginResponse
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.personaldashboard.PersonalDashboardActivity
import com.droid.dorpee.ui.personaldashboard.adapter.PlansAdapter
import com.droid.dorpee.ui.personaldashboard.viewmodel.PlansViewModel
import com.droid.dorpee.ui.venue.venueresponse.PlanX
import com.droid.dorpee.ui.venuedashboard.VenueDashboardActivity
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.skydoves.powerspinner.IconSpinnerItem
import org.jetbrains.anko.startActivityForResult

class DorpeePlanActivity : BaseActivity(), View.OnClickListener {
    private var isActivePlan: Boolean? = null
    private var plan_id: Int? = 0
    private lateinit var binding: ActivityDorpeePlanBinding
    var viewModel: PlansViewModel? = null
    private var planIdToPurchase: Int? = null
    private var planCredits: Int? = 0
    private var planName: String? = null
    private var data: ArrayList<PlanX> = ArrayList()
    private var purchaseData: ArrayList<PlanX> = ArrayList()
    var user: User? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDorpeePlanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as PlansViewModel

        attachObserver()
        if(AppPreferences.getInstance(this)!= null) {
            user = AppPreferences.getInstance(this)?.user?.user
            plan_id = AppPreferences.getInstance(this)?.getPlanId();
            Log.e("The login ","Login 222111")
            planCredits = AppPreferences.getInstance(this)?.getPlanCredits()
            isActivePlan = AppPreferences.getInstance(this)?.getIsActivePlan()
            planName = AppPreferences.getInstance(this)?.getPlanName()
        }

        initListeners()
        binding.textView38.visibility = View.INVISIBLE
        binding.layTopup.visibility = View.INVISIBLE
        binding.layEmployeeplan.visibility = View.INVISIBLE

    }

    fun openEmailBox(){
        val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:support@dorpee.com")
        }
        startActivity(Intent.createChooser(emailIntent, "Dorpee Enquiry"))
    }

    override fun bindData() {
        Glide
            .with(this)
            .load(user?.avatar)
            .dontAnimate()
            .centerInside()
            .circleCrop()
            .placeholder(R.drawable.profile_holder)
            .into(binding.imageViewProfilePic)
    }

    override fun initListeners() {
        Log.e("The login ","Login 222")
        binding.imageViewProfilePic.setOnClickListener {
            val user = AppPreferences.getInstance(this)?.user
            if (user == null) {
                val navController =
                        Navigation.findNavController(this, R.id.nav_host_fragment)
                navController.popBackStack()
            } else {
                if (user.user?.role != null && user.user?.role?.size ?: 0 > 0) {
                    val roleList = user.user?.role?.map { it.id!! }
                    if (!roleList.isNullOrEmpty() && roleList.contains(2) && roleList.contains(3)) {
                        startActivity(Intent(this, VenueDashboardActivity::class.java))
                    } else {
                        startActivity(
                                Intent(
                                        this,
                                        PersonalDashboardActivity::class.java
                                )
                        )
                    }
                }
            }
        }
        setUPlanList()
    }



    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(PlansViewModel())
        return ViewModelProvider(this, provider).get(PlansViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> onBackPressed()
            binding.btTopUCredits.id -> startActivity(Intent(this, TopUpActivity::class.java))
            binding.btEnqNow.id -> openEmailBox()

        }
    }

    private fun setUPlanList() {
        val layoutManager = GridLayoutManager(this,2)
        layoutManager.orientation = GridLayoutManager.VERTICAL
        binding.recyclerViewPlans.layoutManager = layoutManager
        binding.recyclerViewPlans.adapter = PlansAdapter(this, data, user!!, plan_id!!)
        (binding.recyclerViewPlans.adapter as PlansAdapter).itemClick = { plan, _ ->
            if (AppPreferences.getInstance(this)!!.getISCardActive()) {
                    if ((user?.cards?.isNotEmpty()!! && user?.isSubscribed!!) || this!!.isActivePlan!!) {
                        showDialog(plan)
                    }else{

                        viewModel?.purchasePlan(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token),
                                PurchasePlanRequest(plan.id, AppPreferences.getInstance(this)?.getTokenId())
                                ,this, this,planCredits,planName)

                    }
            }
            else {
                // Go to add card screen
                planIdToPurchase = plan.id
                planCredits = plan.credits
                planName = plan.name
                startActivityForResult<AddCardActivity>(1)
            }
        }
    }

    public fun setAdapterPlan(plan_id: Int){
        Log.e("ahabj","adakjo")
        binding.recyclerViewPlans.adapter = PlansAdapter(this, data, user!!,plan_id)
    }

    private fun showDialog(plan: PlanX){
        // Late initialize an alert dialog object
        lateinit var dialog:AlertDialog
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Alert")
        builder.setMessage("Are you sure. You want to Change the current Plan.")
        val dialogClickListener = DialogInterface.OnClickListener{ _, which ->
            when(which){
                DialogInterface.BUTTON_POSITIVE ->  changePlan(plan)
                DialogInterface.BUTTON_NEGATIVE -> dialog.dismiss()
            }
        }
        builder.setPositiveButton("YES",dialogClickListener)
        builder.setNegativeButton("NO",dialogClickListener)
        dialog = builder.create()
        dialog.show()
    }

    private fun attachObserver() {
        if (isNetworkAvailable()) {
            viewModel?.getPlans(this)
        } else {
            showSnackBarCustom(
                getString(R.string.network_unavailble),
                binding.alertView,
                ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        }

        this.viewModel?.apiPlansResponse?.observe(this, Observer {

            if (AppPreferences.getInstance(this)?.getIsActivePlan()!!){
                for (i in 0 until it.data!!.size!!){
                    if (plan_id !==1){
                        if (it.data.get(i).id!=1){
                            data.add(it.data.get(i))
                        }
                    }else{
                        data.add(it.data.get(i))
                    }
                }
                }
            else{
                data.addAll(it.data)
            }
            binding.recyclerViewPlans.adapter?.notifyDataSetChanged()
            binding.textView38.visibility = View.VISIBLE
            binding.layTopup.visibility = View.VISIBLE
            binding.layEmployeeplan.visibility = View.VISIBLE

        })

        this.viewModel?.apiPurchasePlanRequest?.observe(this, Observer {
            Log.e("The login ","Login 222 1111")
            val loginResponse: LoginResponse? = AppPreferences.getInstance(this)?.user
            loginResponse?.user?.planId = plan_id
            binding.recyclerViewPlans.adapter = PlansAdapter(this, data, user!!,plan_id!!)
        })

        this.viewModel?.apiError?.observe(this, Observer {
            showProgress(false)
            showSnackBarCustom(
                it,
                binding.alertView,
                ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        })
        this.viewModel?.isLoading?.observe(this, Observer {
            showProgress(it)
        })
    }

    public fun disableFreePlans() {
        for (i in 0 until data.size) {
            if (!(data.get(i).price.equals(0)) && !(data.get(i).price.equals(0.0)) &&  !(data.get(i).price.equals(0.00)))
                purchaseData.addAll(data )
            Log.e("The added data is ","Data added without 0 price Id "+purchaseData.get(i).id);
        }
    }

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
            }
        }
    }

    private fun changePlan(plan: PlanX) {
        if (isNetworkAvailable()) {
            viewModel?.changePlan(
                RequestWithHeader(AppPreferences.getInstance(this)?.user?.token),
                ChangePlanRequest(plan.id),this, this,plan.credits,plan.name)
        } else {
            showSnackBarCustom(
                getString(R.string.network_unavailble),
                binding.alertView,
                ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 1){
            viewModel?.purchasePlan(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token),
                PurchasePlanRequest(planIdToPurchase, data?.getStringExtra("data")),this, this,planCredits,planName)
        }
    }

}
