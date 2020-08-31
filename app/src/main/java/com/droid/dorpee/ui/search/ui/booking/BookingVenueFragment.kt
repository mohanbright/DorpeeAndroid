package com.droid.dorpee.ui.search.ui.booking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentBookingVenueBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.search.ui.booking.venuefrag.PastVenueBookingFrag
import com.droid.dorpee.ui.search.ui.booking.venuefrag.TodayVenueBookingFrag
import com.droid.dorpee.ui.search.ui.booking.venuefrag.UpcomingVenueBookingFrag
import com.droid.dorpee.ui.venuedashboard.model.VenueBooking
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.google.android.material.tabs.TabLayout
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class BookingVenueFragment : BaseFragment() {

    private lateinit var binding: FragmentBookingVenueBinding
 var viewModel: VenueDashViewModel? = null
    var upComingBookings: ArrayList<VenueBooking>? = ArrayList()
    var todaysBookings: ArrayList<VenueBooking>? = ArrayList()
    private var user: User? = null
    var pastBookings: ArrayList<VenueBooking>? = ArrayList()

    override fun bindData() {
        val user = AppPreferences.getInstance(requireContext())?.user?.user
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
                            val bundle = Bundle()
                            bundle.putSerializable("data", todaysBookings)
                            val fragment = TodayVenueBookingFrag()
                            fragment.arguments = bundle
                            loadFragment(fragment)
                        }).run()
                    }
                    1 -> {
                        Thread(Runnable {
                            val bundle = Bundle()
                            bundle.putSerializable("data", upComingBookings)
                            val fragment = UpcomingVenueBookingFrag()
                            fragment.arguments = bundle
                            loadFragment(fragment)
                        }).run()
                    }
                    else -> {
                        Thread(Runnable {
                            val bundle = Bundle()
                            bundle.putSerializable("data", pastBookings)
                            val fragment = PastVenueBookingFrag()
                            fragment.arguments = bundle
                            loadFragment(fragment)
                        }).run()
                    }
                }
            }
        })
        binding.imageViewProfilePic.setOnClickListener {
            val user = AppPreferences.getInstance(requireContext())?.user
            if (user?.user?.role != null && user.user?.role?.size ?: 0 > 0) {
                val navController =
                        Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
                val roleList = user.user?.role?.map { it.id!! }
                if (!roleList.isNullOrEmpty() && roleList.contains(2) && roleList.contains(3)) {
                    navController.navigate(R.id.action_bookingVenueFragment_to_venueDashFragment)
                } else {
                    navController.navigate(R.id.action_bookingVenueFragment_to_personalDashFragment)
                }
            }
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueDashViewModel())
        return ViewModelProvider(this, provider).get(VenueDashViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBookingVenueBinding.inflate(layoutInflater)
        user = AppPreferences.getInstance(requireContext())?.user?.user
        viewModel = setUpVM() as VenueDashViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadFragment(TodayVenueBookingFrag())
        viewModel?.getVenueDashboard(RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token))
        attachObserver()
        loadFragment(UpcomingVenueBookingFrag())
        bindData()
    }
    fun attachObserver() {
        viewModel?.apiVenueDashboardResponse?.observe(viewLifecycleOwner, Observer {
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
                    fragment = TodayVenueBookingFrag()
                    fragment.arguments = bundle
                }
                1 -> {
                    val bundle = Bundle()
                    bundle.putSerializable("data", upComingBookings)
                    fragment = UpcomingVenueBookingFrag()
                    fragment.arguments = bundle

                }
                2 -> {
                    val bundle = Bundle()
                    bundle.putSerializable("data", pastBookings)
                    fragment = PastVenueBookingFrag()
                    fragment.arguments = bundle

                }
                else -> {
                    val bundle = Bundle()
                    bundle.putSerializable("data", todaysBookings)
                    fragment = TodayVenueBookingFrag()
                    fragment.arguments = bundle
                }
            }
            if (fragment != null)
                loadFragment(fragment)
        })

        this.viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
            showProgress(it)
        })

        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        })

    }

    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(requireContext(), R.color.colorError)
        )
    }

    fun loadFragment(fragment: Fragment?) {
        val fragmentTransaction = childFragmentManager.beginTransaction()
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