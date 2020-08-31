package com.droid.dorpee.ui.booking

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityBookingBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.booking.frags.BookingStep1Fragment
import com.droid.dorpee.ui.booking.viewmodel.BookingStepsViewModel
import com.droid.dorpee.ui.venue.adapter.TabLineAdapter
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom


class BookingActivity : BaseActivity(), View.OnClickListener {

    private lateinit var binding: ActivityBookingBinding
    lateinit var viewModel: BookingStepsViewModel
    var space: Space? = null
    var scondition: String? = null
    var isFromRebook: Boolean = false
    var isFromUpcomming: Boolean = false
    var isNumberPeople: String = ""
    var isNumberWorkspace: String = ""
    var bookingId : String = "0"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        scondition = intent.getStringExtra("scondition")
        isFromRebook = intent.getBooleanExtra("isFromRebook", false)
        isFromUpcomming = intent.getBooleanExtra("isFromUpcomming", false)
        try {
            scondition?.let {
                val sConditions = scondition?.split("+")
                if (sConditions != null) {
                    if (sConditions.isNotEmpty()) {
                        AppPreferences.getInstance(this)?.setOpeningDate(sConditions[2])
                        AppPreferences.getInstance(this)?.setclosingDate(sConditions[3])
                    }
                    if (isFromUpcomming){
                        isNumberPeople = sConditions[4]
                        isNumberWorkspace = sConditions[5]
                        bookingId = sConditions[6]
                    }
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }

        Log.e("The data is ", "Get Boolean Upcomming : " + isFromUpcomming)
        space = intent.getSerializableExtra("space") as? Space
        viewModel = setUpVM() as BookingStepsViewModel
        val listOfTab = arrayListOf(true, false, false)
        setUpTabLine(listOfTab)
        space?.let {
            if (scondition == null) {
                scondition = "${space?.venue?.address}+${space?.createdAt} + ${space?.deletedAt} + " +
                        "${space?.createdAt}";
                scondition?.let {
                    val sConditions = scondition?.split("+")
                    if (sConditions != null) {
                        if (sConditions.isNotEmpty()) {
                            AppPreferences.getInstance(this)?.setOpeningDate(sConditions[2])
                            AppPreferences.getInstance(this)?.setclosingDate(sConditions[3])
                        }
                        if (isFromUpcomming){
                            isNumberPeople = sConditions[4]
                            isNumberWorkspace = sConditions[5]
                            bookingId = sConditions[6]
                        }
                    }
                }
            }
            loadFragment(BookingStep1Fragment.newInstance(space!!, scondition!!, isFromRebook,isFromUpcomming, isNumberPeople,isNumberWorkspace,bookingId))
            Log.e("The Booking Act","Boooking Activity "+isNumberPeople +" "+ isNumberWorkspace+" "+bookingId)
        }
        viewModel.getServices()
        attachObserver()
    }

    private fun setUpTabLine(listOfTab: ArrayList<Boolean>) {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerTabId.layoutManager = layoutManager
        binding.recyclerTabId.adapter =
                TabLineAdapter(this, listOfTab)
    }

    fun setUpTabline(listOfTab: ArrayList<Boolean>) {
        (binding.recyclerTabId.adapter as TabLineAdapter).setTabList(listOfTab)
    }

    override fun bindData() {}

    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(
                BookingStepsViewModel()
        )
        return ViewModelProvider(this, provider).get(BookingStepsViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> {
                onBackPressed()
            }
        }
    }

    fun loadFragment(fragment: Fragment?) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragContainer.id, fragment!!)
        fragmentTransaction.commitAllowingStateLoss()
    }

    fun replaceFragment(fragment: Fragment?) {
        val backStateName = fragment!!.javaClass.name
        val manager: FragmentManager = supportFragmentManager
        val fragmentPopped: Boolean = manager.popBackStackImmediate(backStateName, 0)
        if (!fragmentPopped) { //fragment not in back stack, create it.
            val ft: FragmentTransaction = manager.beginTransaction()
            ft.replace(binding.fragContainer.id, fragment!!)
            ft.addToBackStack(backStateName)
            ft.commit()
        }
    }

    private fun attachObserver() {
        this.viewModel.apiServicesResponse.observe(this, Observer {

        })
        this.viewModel.apiError.observe(this, Observer {
//            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        })
        this.viewModel.isLoading.observe(this, Observer {
//            showProgress(it)
        })
    }

    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }
}