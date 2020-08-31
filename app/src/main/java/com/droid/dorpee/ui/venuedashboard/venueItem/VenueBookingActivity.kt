package com.droid.dorpee.ui.venuedashboard.venueItem

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityVenueBookingBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.venuedashboard.fragments.PastVenueBookingFragment
import com.droid.dorpee.ui.venuedashboard.fragments.TodayVenueBookingFragment
import com.droid.dorpee.ui.venuedashboard.fragments.UpcomingVenueBookingFragment
import com.droid.dorpee.ui.venuedashboard.model.VenueBooking
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.google.android.material.tabs.TabLayout
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class VenueBookingActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityVenueBookingBinding
    var viewModel: VenueDashViewModel? = null
    var upComingBookings: ArrayList<VenueBooking>? = ArrayList()
    var todaysBookings: ArrayList<VenueBooking>? = ArrayList()
    private var user: User? = null
    var pastBookings: ArrayList<VenueBooking>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVenueBookingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as VenueDashViewModel
        loadFragment(TodayVenueBookingFragment())
        viewModel?.getVenueDashboard(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token))
        attachObserver()
    }

    override fun bindData() {
        val user = AppPreferences.getInstance(this)?.user?.user
        Glide
                .with(this)
                .load(user?.avatar ?: "")
                .dontAnimate()
                .centerCrop()
                .circleCrop()
                .placeholder(R.drawable.profile_holder)
                .into(binding.imageViewProfilePic)
    }

    override fun initListeners() {
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {}
            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> {
                        Thread(Runnable {
                            val bundle = Bundle()
                            bundle.putSerializable("data", todaysBookings)
                            val fragment = TodayVenueBookingFragment()
                            fragment.arguments = bundle
                            loadFragment(fragment)
                        }).run()
                    }
                    1 -> {
                        Thread(Runnable {
                            val bundle = Bundle()
                            bundle.putSerializable("data", upComingBookings)
                            val fragment = UpcomingVenueBookingFragment()
                            fragment.arguments = bundle
                            loadFragment(fragment)
                        }).run()
                    }
                    else -> {
                        Thread(Runnable {
                            val bundle = Bundle()
                            bundle.putSerializable("data", pastBookings)
                            val fragment = PastVenueBookingFragment()
                            fragment.arguments = bundle
                            loadFragment(fragment)
                        }).run()
                    }
                }
            }

        })
        binding.imageViewProfilePic.setOnClickListener {
            onBackPressed()
     /*       val user = AppPreferences.getInstance(this)?.user
            if (user?.user?.role != null && user.user?.role?.size ?: 0 > 0) {
                val roleList = user.user?.role?.map { it.id!! }
                if (!roleList.isNullOrEmpty() && roleList.contains(2) && roleList.contains(3)) {
                    startActivity(Intent(this, VenueDashboardActivity::class.java))
                    this@VenueBookingActivity.finish()
                } else {
                    startActivity(
                            Intent(
                                    this,
                                    PersonalDashboardActivity::class.java
                            )
                    )
//                    this@VenueBookingActivity.finish()
                }
            }*/
        }

    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueDashViewModel())
        return ViewModelProvider(this, provider).get(VenueDashViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> onBackPressed()
        }
    }

    fun attachObserver() {
        viewModel?.apiVenueDashboardResponse?.observe(this, Observer {
            upComingBookings?.clear()
            todaysBookings?.clear()
            pastBookings?.clear()
            it.data?.venues?.allBookings?.forEach {
                if (compareDate(it.endDate ?: "") == 1) {
                    upComingBookings?.add(it)
                } else if (compareDate(it.endDate ?: "") == 2) {
                    todaysBookings?.add(it)
                } else {
                    pastBookings?.add(it)
                }
            }
            var fragment: Fragment? = null
            when (binding.tabLayout.selectedTabPosition) {
                0 -> {
                    val bundle = Bundle()
                    bundle.putSerializable("data", todaysBookings)
                    fragment = TodayVenueBookingFragment()
                    fragment.arguments = bundle
                }
                1 -> {
                    val bundle = Bundle()
                    bundle.putSerializable("data", upComingBookings)
                    fragment = UpcomingVenueBookingFragment()
                    fragment.arguments = bundle

                }
                2 -> {
                    val bundle = Bundle()
                    bundle.putSerializable("data", pastBookings)
                    fragment = PastVenueBookingFragment()
                    fragment.arguments = bundle

                }
                else -> {
                    val bundle = Bundle()
                    bundle.putSerializable("data", todaysBookings)
                    fragment = TodayVenueBookingFragment()
                    fragment.arguments = bundle
                }
            }
            if (fragment != null)
                loadFragment(fragment)
        })

        this.viewModel?.isLoading?.observe(this, Observer {
            showProgress(it)
        })

        this.viewModel?.apiError?.observe(this, Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        })

    }

    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }

    fun loadFragment(fragment: Fragment?) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.container.id, fragment!!)
        fragmentTransaction.commitAllowingStateLoss()
    }

    private fun compareDate(input: String): Int {
        if (!input.isEmpty()) {
            try {
                val dateFormat = SimpleDateFormat("MM/dd/yyyy");
                val endDate = dateFormat.parse(input)
                val currentDateFormat = dateFormat.format(Calendar.getInstance().time)
                val currentDate = dateFormat.parse(currentDateFormat) ?: Date()
                if (currentDate < endDate) {
                    return 1
                } else if (currentDate == endDate) {
                    return 2
                } else {
                    return 0
                }
            } catch (e: ParseException) {
                e.printStackTrace()
            } catch (e: NullPointerException) {
                e.printStackTrace()
            }
        }
        return 0
    }

    fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
            }
        }
    }
}
