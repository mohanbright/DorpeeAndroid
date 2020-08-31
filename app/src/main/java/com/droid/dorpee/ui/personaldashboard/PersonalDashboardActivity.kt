package com.droid.dorpee.ui.personaldashboard

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityPersonalDashboardBinding
import com.droid.dorpee.ui.RegisterRequest
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.PersonalAccountRegisterActivity
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.booking.BookingActivity
import com.droid.dorpee.ui.personaldashboard.adapter.DashItem
import com.droid.dorpee.ui.personaldashboard.adapter.PersonalDashboardAdapter
import com.droid.dorpee.ui.personaldashboard.models.MDBooking
import com.droid.dorpee.ui.personaldashboard.personalItem.*
import com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel
import com.droid.dorpee.ui.search.DashboardActivity
import com.droid.dorpee.ui.venue.venueresponse.PlanX
import com.droid.dorpee.ui.venuedashboard.VenueDashboardActivity
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class PersonalDashboardActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityPersonalDashboardBinding
    var viewModel: PersonalViewModel? = null
    private var plan_credits: Int? = 0
    private var total_credits: Int? = 0
    private var user: User? = null
    private var planName: String? = null
    private var planExpiry: String? = null
    var upComingBookings: ArrayList<MDBooking>? = ArrayList()
    private var plans: ArrayList<PlanX> = ArrayList()


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonalDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user = AppPreferences.getInstance(this)?.user?.user
        viewModel = setUpVM() as PersonalViewModel
        attachObserver()
        setUPdashList()
        bindData()
        getData()
//        if (isNetworkAvailable()) {
//            viewModel?.getBookings(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token))
//            viewModel?.getPlans()
//            this.viewModel?.apiPlansResponse?.observe(this, Observer {
//                plans.addAll(it.data as ArrayList<PlanX>)
//                if (it.data.isNotEmpty()) {
//                    binding.totalCreditsTV.visibility = View.VISIBLE
//                    binding.totalCreditsTV.text = "Plan Credits " + it.data.size;
//                } else {
//                    binding.totalCreditsTV.visibility = View.GONE
//                }
//            })
//
//        } else {
//            showSnackBarCustom(
//                getString(R.string.network_unavailble),
//                binding.alertView,
//                ContextCompat.getColor(this, R.color.colorPrimaryDark)
//            )
//        }

    }

    fun getData(){
        plan_credits = AppPreferences.getInstance(this)?.getPlanCredits()
        total_credits = AppPreferences.getInstance(this)?.getRemainingCredit()
        planName = AppPreferences.getInstance(this)?.getPlanName()
        planExpiry = AppPreferences.getInstance(this)?.getPlanExpiry()
        if((AppPreferences.getInstance(this)?.getIsActivePlan()!!) && plan_credits!!>0){
            binding.totalCreditsTV.visibility = View.VISIBLE
            binding.totalCreditsTV.text = "Plan Credits " + plan_credits
        }
        else{
            binding.totalCreditsTV.visibility = View.GONE
        }
        if (total_credits!= null)
            binding.remainingCreditsTV.setText(""+total_credits!!)
        if (planExpiry!=null)
            binding.planRenewalTV.setText(planExpiry)
        if (planName!=null)
            binding.currentPlanTV.setText(planName)
        binding.currentBookingTV.text = upComingBookings?.size.toString()

    }

    override fun bindData() {
        Glide
                .with(this)
                .load(user?.avatar)
                .dontAnimate()
                .centerInside()
                .placeholder(R.drawable.profile_holder)
                .into(binding.imageViewProfilePic)
        binding.nameTV.text = user?.fullName
        // binding.currentPlanTV.text = user?.plan?.name
//        binding.typeTV.text = if (user?.role != null && user?.role?.size!! > 0) user?.role?.get(0)!!.title else ""
//        binding.textViewSwitch.visibility = if (user?.role != null && user?.role?.size!! == 1 && user?.role?.get(0)!!.id == 2) View.GONE else View.VISIBLE
        if (user?.role != null && user?.role?.size ?: 0 > 0) {
            binding.textViewSwitch.visibility = View.GONE
            val roleList = user?.role?.map { it.id!! }
            roleList?.let {
                if ( roleList.contains(2)&& roleList.contains(3) ){
                    binding.textViewSwitch.visibility = View.VISIBLE
                    binding.typeTV.text = if (user?.role != null && user?.role?.size!! > 0) user?.role?.get(0)!!.title else ""
                } else if ( roleList.contains(2)&& roleList.contains(4) ){
                    binding.textViewSwitch.visibility = View.GONE
                    binding.typeTV.text = ""
                }else{
                    binding.textViewSwitch.visibility = View.GONE
                    binding.typeTV.text = if (user?.role != null && user?.role?.size!! > 0) user?.role?.get(0)!!.title else ""
                }
            }

        }
    }

    override fun initListeners() {
        binding.imageViewEdit.setOnClickListener {
            startActivity(
                    Intent(
                            this,
                            PersonalAccountRegisterActivity::class.java
                    ).apply {
                        putExtra("isEditProfile",true)
                    })
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(PersonalViewModel())
        return ViewModelProvider(this, provider).get(PersonalViewModel::class.java)
    }

    private fun attachObserver() {
        viewModel?.getBookings(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token))
        this.viewModel?.apiBookingsResponse?.observe(this, Observer {
            it.data.forEach {
                if (compareDate(it.end_date) == 1) {
                    upComingBookings?.add(it)
                }
            }
            if (it.data.isNotEmpty()){
                val cUser = it.data[0].user
                binding.currentBookingTV.text = upComingBookings?.size.toString()
                binding.planRenewalTV.text = cUser.planExpiry
                binding.remainingCreditsTV.text = cUser.totalCredits.toString()
                if (user?.plan == null) {
                    binding.totalCreditsTV.visibility = View.GONE
                }
            }

            //
            binding.currentBookingTV.text = upComingBookings?.size.toString()

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

    private fun setUPdashList() {
        val listOfDash = arrayListOf<DashItem>()
        listOfDash.add(
                DashItem(
                        "My Bookings",
                        R.drawable.ic_dorpee,
                        Intent(this, BookingsActivity::class.java)
                )
        )
        listOfDash.add(
                DashItem(
                        "Address Book",
                        R.drawable.ic_book_open_light,
                        Intent(this, AddressBookActivity::class.java)
                )
        )
        listOfDash.add(
                DashItem(
                        "Top Up Credits",
                        R.drawable.ic_crdits,
                        Intent(this, TopUpActivity::class.java)
                )
        )
        if(AppPreferences.getInstance(this)!!.getIsActivePlan()){
            listOfDash.add(
                    DashItem(
                            "Change Plan",
                            R.drawable.ic_repeat,
                            Intent(this, DorpeePlanActivity::class.java)
                    )
            )
        }else{
            listOfDash.add(
                    DashItem(
                            "Get Plan",
                            R.drawable.ic_repeat,
                            Intent(this, DorpeePlanActivity::class.java)
                    )
            )
        }

        listOfDash.add(
                DashItem(
                        "Search Preferences",
                        R.drawable.ic_search_prefrences,
                        Intent(this, SearchPrefrencesActivity::class.java)
                )
        )
        listOfDash.add(
                DashItem(
                        "Settings",
                        R.drawable.ic_setting,
                        Intent(this, SettingsActivity::class.java)
                )
        )
        val layoutManager = GridLayoutManager(this, 2)
        layoutManager.orientation = GridLayoutManager.VERTICAL
        binding.dashList.layoutManager = layoutManager
        binding.dashList.adapter = PersonalDashboardAdapter(this, listOfDash)
        (binding.dashList.adapter as PersonalDashboardAdapter).itemClick = {
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.textViewLogOut.id -> {
                AppPreferences.getInstance(this)?.clearPreferenceData()
                startActivity(Intent(this, DashboardActivity::class.java))
                finishAffinity()
            }
            binding.backbtn.id -> {
                onBackPressed()
            }
            binding.textViewSwitch.id -> {
                startActivity(Intent(this, VenueDashboardActivity::class.java))
                finish()
//                finishAffinity()
            }
//            binding.imageViewEdit.id->{
//                this.startActivity(
//                        Intent(
//                                this,
//                                RegisterRequest::class.java
//                        ).apply {
//                            putExtra("isFromEdit",true)
//                        })            }
        }
    }

    private fun showProgress(it: Boolean?) {
        /*  it?.let {
              if (it) {
                  binding.loginLoader.visibility = View.VISIBLE
                  binding.register.visibility = View.INVISIBLE
              } else {
                  binding.loginLoader.visibility = View.INVISIBLE
                  binding.register.visibility = View.VISIBLE
              }
          }*/
    }

    private fun compareDate(input: String): Int {
        if (!input.isEmpty()) {
            try {
                val dateFormat = SimpleDateFormat("MM/dd/yyyy");
                val endDate = dateFormat.parse(input)
                val currentDateFormat = dateFormat.format(Calendar.getInstance().time)
                val currentDate = dateFormat.parse(currentDateFormat)
                if (currentDate < endDate) {
                    return 1
                }
            } catch (e: ParseException) {
                e.printStackTrace()
            } catch (e: NullPointerException) {
                e.printStackTrace()
            }
        }
        return 0
    }

    override fun onResume() {
        super.onResume()
        getData();
    }

}
