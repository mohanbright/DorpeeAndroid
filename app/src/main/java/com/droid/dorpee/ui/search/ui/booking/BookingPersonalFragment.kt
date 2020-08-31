package com.droid.dorpee.ui.search.ui.booking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentBookingBinding
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.personaldashboard.fragments.PastBookingFragment
import com.droid.dorpee.ui.personaldashboard.fragments.UpcomingBookingFragment
import com.droid.dorpee.utils.preference.AppPreferences
import com.google.android.material.tabs.TabLayout

class BookingPersonalFragment: BaseFragment() {

    private lateinit var binding: FragmentBookingBinding
    var viewModel: BookingViewModel? = null
    private var user: User? = null

    override fun bindData() {
            Glide
            .with(this)
            .load(user?.avatar)
            .dontAnimate()
            .circleCrop()
            .centerInside()
            .placeholder(R.drawable.profile_holder)
            .into(binding.imageViewProfilePic)}

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
                            loadFragment(UpcomingBookingFragment())
                        }).run()
                    }
                    1 -> {
                        Thread(Runnable {
                            loadFragment(PastBookingFragment())
                        }).run()
                    }
                    else -> {
                        Thread(Runnable {
                            loadFragment(UpcomingBookingFragment())
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
                    navController.navigate(R.id.action_navigation_booking_to_venueDashFragment)
                } else {
                    navController.navigate(R.id.action_navigation_booking_to_personalDashFragment)
                }
            }
        }
        }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(BookingViewModel())
        return ViewModelProvider(this, provider).get(BookingViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBookingBinding.inflate(layoutInflater)
                 user = AppPreferences.getInstance(requireContext())?.user?.user
        viewModel = setUpVM() as BookingViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        viewModel?.getBookings(RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token))
        attachObserver()
         loadFragment(UpcomingBookingFragment())
        bindData()
    }



    private fun attachObserver() {
        this.viewModel?.apiBookingsResponse?.observe(viewLifecycleOwner, Observer {
//            log(it)
        })
        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            /*showProgress(false)
            showSnackBarCustom(
                it,
                binding.alertView,
                ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )*/
        })
        this.viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
//            showProgress(it)
        })

    }


    fun loadFragment(fragment: Fragment?) {
        val fragmentTransaction = childFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.container.id, fragment!!)
        fragmentTransaction.commitAllowingStateLoss()
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
}
