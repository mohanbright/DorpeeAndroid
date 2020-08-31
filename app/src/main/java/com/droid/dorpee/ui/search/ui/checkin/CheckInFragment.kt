package com.droid.dorpee.ui.search.ui.checkin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentCheckinBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.search.DashboardActivity
import com.droid.dorpee.ui.venuedashboard.venueItem.VenueDetailActivity
import com.droid.dorpee.utils.preference.AppPreferences
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.util.*

class CheckInFragment : BaseFragment() {
    private val TAG = "CheckInFragment"
    private lateinit var binding: FragmentCheckinBinding
    var viewModel: CheckInViewModel? = null

    override fun bindData() {}

    override fun initListeners() {
        binding.buttonManualCheckIn.setOnClickListener {
            val user = AppPreferences.getInstance(requireContext())?.user
            if (user != null) {
                val navController =
                        Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
                navController.navigate(R.id.navigation_booking)
            }
        }
        binding.buttonScanCheckIn.setOnClickListener {
            scannerResult.launch(Intent(requireContext(), ScannerActivity::class.java))
        }

        binding.imageViewProfilePic.setOnClickListener {
            val user = AppPreferences.getInstance(requireContext())?.user?.user
            val navController =
                    Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
            if (user != null) {
                if (user.role != null && user.role!!.isNotEmpty()) {
                    val roleList = user.role!!.map { it.id!! }
                    if (!roleList.isNullOrEmpty() && roleList.contains(2) && roleList.contains(3)) {
                        navController.navigate(R.id.action_navigation_check_in_to_venueDashFragment)
                    } else {
                        navController.navigate(R.id.action_navigation_check_in_to_personalDashFragment)
                    }
                }
            }
        }
    }

    val scannerResult: ActivityResultLauncher<Intent> = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
        if (result.resultCode == Activity.RESULT_OK) {
            val venueId = result.data?.getStringExtra("venueId")
            // Handle the Intent val
            if (venueId?.contains("Dorpee_", true) == true) {

                val id = venueId.removePrefix("Dorpee_").toIntOrNull()
                Log.e(TAG, "scannerResult: $venueId")
                if (id != null) {
                    if (isNetworkAvailable()) {
                        viewModel?.autoCheckIn(RequestWithHeader(AppPreferences.getInstance(requireContext())
                                ?.user?.token), id)
                    } else {
                        (requireActivity() as DashboardActivity).showUpSnackError(getString(R.string
                                .network_unavailble))
                    }
                } else
                    (activity as DashboardActivity).showUpSnackError("The venue id must be an integer")
            } else {
                (activity as DashboardActivity).showUpSnackError("Invalid QR Code!")
            }
        }

    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(CheckInViewModel())
        return ViewModelProvider(this, provider).get(CheckInViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCheckinBinding.inflate(layoutInflater)
        viewModel = setUpVM() as CheckInViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val user = AppPreferences.getInstance(requireContext())?.user
        if (user != null) {
            Glide.with(this)
                    .load(user.user?.avatar ?: "")
                    .dontAnimate()
                    .centerCrop()
                    .circleCrop()
                    .placeholder(R.drawable.profile_holder)
                    .into(binding.imageViewProfilePic)

        }
        attachObserver()
    }


    private fun attachObserver() {
        val user = AppPreferences.getInstance(requireContext())?.user

        this.viewModel?.apiAutoCheckInResponse?.observe(viewLifecycleOwner, Observer {
            it.data?.message?.let {
                val navController =
                        Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
                when (it.toLowerCase(Locale.ROOT)) {
                    "checked in" -> {
                        showMsgDialog("You are Checked-In")
                    }
                    "checked out" -> {
                        if (user != null) {
                            navController.navigate(R.id.navigation_booking)
                        } else {
                            navController.navigate(R.id.navigation_login)
//                            startActivity(Intent(requireContext(), LoginActivity::class.java))
                        }
                    }
                    "no bookings" -> {
                        showDialogYesNo("Would you like to make a booking at this venue?")
                    }
                    "future bookings" -> {
                        if (user != null) {
                            navController.navigate(R.id.navigation_booking)
                        } else {
                            navController.navigate(R.id.navigation_login)
//                            startActivity(Intent(requireContext(), LoginActivity::class.java))
                        }
                    }
                    "booking ids" -> {
                        if (user != null) {
                            navController.navigate(R.id.navigation_booking)

                        } else {
                            navController.navigate(R.id.navigation_login)
//                            startActivity(Intent(requireContext(), LoginActivity::class.java))
                        }
                    }
                    else -> {
                        (activity as DashboardActivity).showUpSnackError(it)
                    }
                }
            }
        })
        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            (activity as DashboardActivity).showUpSnackError(it)
        })
        this.viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
            showProgress(it)
        })

    }

    private fun showMsgDialog(msg: String) {
        val dialogBuilder = MaterialAlertDialogBuilder(requireContext())
        dialogBuilder.setMessage(msg)
                .setCancelable(false)
                .setNeutralButton("Ok") { dialog, _ ->
                    dialog.cancel()
                }
        val alert = dialogBuilder.create()
//        alert.setTitle(getString(R.string.title_checkin))
        alert.show()
    }

    private fun showDialogYesNo(msg: String) {
        val dialogBuilder = MaterialAlertDialogBuilder(requireContext())
        dialogBuilder.setMessage(msg)
                .setCancelable(false)
                .setPositiveButton("YES") { dialog, _ ->
                    startActivity(Intent(requireContext(), VenueDetailActivity::class.java))
                    dialog.cancel()
                }
                .setNegativeButton("No") { dialog, _ ->
                    dialog.cancel()
                }
        val alert = dialogBuilder.create()
//        alert.setTitle(getString(R.string.title_checkin))
        alert.show()
    }

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
                binding.buttonScanCheckIn.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.buttonScanCheckIn.visibility = View.VISIBLE
            }
        }
    }
}
