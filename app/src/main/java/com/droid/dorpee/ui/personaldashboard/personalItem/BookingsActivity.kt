package com.droid.dorpee.ui.personaldashboard.personalItem

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityBookingsBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.personaldashboard.PersonalDashboardActivity
import com.droid.dorpee.ui.personaldashboard.fragments.PastBookingFragment
import com.droid.dorpee.ui.personaldashboard.fragments.UpcomingBookingFragment
import com.droid.dorpee.ui.personaldashboard.models.MDBooking
import com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel
import com.droid.dorpee.ui.venuedashboard.VenueDashboardActivity
import com.droid.dorpee.utils.preference.AppPreferences
import com.google.android.material.tabs.TabLayout

class BookingsActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityBookingsBinding
    var viewModel: PersonalViewModel? = null
    var upComingBookings: ArrayList<MDBooking>? = ArrayList()
    private var user: User? = null
    var pastBookings: ArrayList<MDBooking>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user = AppPreferences.getInstance(this)?.user?.user
        viewModel = setUpVM() as PersonalViewModel
        viewModel?.getBookings(RequestWithHeader(AppPreferences.getInstance(this)?.user?.token))
//        loadData()
        loadFragment(UpcomingBookingFragment())
        bindData()
    }

//    fun loadData() {
//        viewModel?.apiBookingsResponse?.observe(this, Observer {
//            it.data.forEach {
//                if (compareDate(it.end_date) == 1) {
//                    upComingBookings?.add(it)
//                } else {
//                    pastBookings?.add(it)
//                }
//            }
//            val bundle = Bundle()
//            bundle.putSerializable("data", upComingBookings)
//            val fragment = UpcomingBookingFragment()
//            fragment.arguments = bundle
//            loadFragment(fragment)
//        })
//
//        this.viewModel?.isLoading?.observe(this, Observer {
//            showProgress(it)
//        })
//
//        this.viewModel?.apiError?.observe(this, Observer {
//            showProgress(false)
//            showSnackBarCustom(
//                it,
//                binding.alertView,
//                ContextCompat.getColor(this, R.color.colorPrimaryDark)
//            )
//        })
//
//    }

    override fun bindData() {
        Glide
            .with(this)
            .load(user?.avatar)
            .dontAnimate()
            .circleCrop()
            .centerInside()
            .placeholder(R.drawable.profile_holder)
            .into(binding.imageViewProfilePic)
    }

    override fun initListeners() {
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> {
                        Thread(Runnable {
//                            val bundle = Bundle()
//                            bundle.putSerializable("data", upComingBookings)
//                            val fragment = UpcomingBookingFragment()
//                            fragment.arguments = bundle
                            loadFragment(UpcomingBookingFragment())
                        }).run()
                    }
                    1 -> {
                        Thread(Runnable {
//                            val bundle = Bundle()
//                            bundle.putSerializable("data", pastBookings)
//                            val fragment = PastBookingFragment()
//                            fragment.arguments = bundle
                            loadFragment(PastBookingFragment())
                        }).run()
                    }
                    else -> {
                        Thread(Runnable {
//                            val bundle = Bundle()
//                            bundle.putSerializable("data", upComingBookings)
//                            val fragment = UpcomingBookingFragment()
//                            fragment.arguments = bundle
                            loadFragment(UpcomingBookingFragment())
                        }).run()
                    }
                }
            }
        })
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
                else{
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

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(PersonalViewModel())
        return ViewModelProvider(this, provider).get(PersonalViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> onBackPressed()
        }
    }

    fun loadFragment(fragment: Fragment?) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.container.id, fragment!!)
        fragmentTransaction.commitAllowingStateLoss()
    }

//    private fun compareDate(input: String): Int {
//        if (!input.isEmpty()) {
//            try {
//                val dateFormat = SimpleDateFormat("MM/dd/yyyy");
//                val endDate = dateFormat.parse(input)
//                val currentDateFormat = dateFormat.format(Calendar.getInstance().time)
//                val currentDate = dateFormat.parse(currentDateFormat)
//                if (currentDate < endDate) {
//                    return 1
//                }
//            } catch (e: ParseException) {
//                e.printStackTrace()
//            } catch (e: NullPointerException) {
//                e.printStackTrace()
//            }
//        }
//        return 0
//    }


    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
            }
        }
    }
}
