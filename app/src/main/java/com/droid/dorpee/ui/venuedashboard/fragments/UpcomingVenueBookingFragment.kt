package com.droid.dorpee.ui.venuedashboard.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.databinding.FragmentUpcomingBookingBinding
import com.droid.dorpee.ui.ChangeStatusRequest
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.personaldashboard.personalItem.Maps
import com.droid.dorpee.ui.venuedashboard.adapter.UpcomingVenueAdapter
import com.droid.dorpee.ui.venuedashboard.model.VenueBooking
import com.droid.dorpee.ui.venuedashboard.venueItem.VenueBookingActivity
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences

class UpcomingVenueBookingFragment : BaseFragment() {
    private lateinit var binding: FragmentUpcomingBookingBinding
    var viewModel: VenueDashViewModel? = null
    var upComingBookings: ArrayList<VenueBooking>? = ArrayList()
    private var index: Int = -1

    override fun bindData() {}

    override fun initListeners() {
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
        binding = FragmentUpcomingBookingBinding.inflate(layoutInflater)
        viewModel = setUpVM() as VenueDashViewModel
        upComingBookings = arguments?.getSerializable("data") as ArrayList<VenueBooking>?

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUPUpcomingList()
        viewModel?.apiBookingChangeStatus?.observe(viewLifecycleOwner, Observer { v ->
            upComingBookings?.map {
                if (v.id == it.id) {
                    v
                } else {
                    it
                }
            }
            setUPUpcomingList()
        })
        attachObserver()
    }
    fun attachObserver() {
        viewModel?.apiBookingChangeStatus?.observe(viewLifecycleOwner, Observer { v ->
         showProgress(false)
            ( activity as VenueBookingActivity).viewModel?.getVenueDashboard(RequestWithHeader(AppPreferences.
            getInstance(requireContext())?.user?.token))

    /*        upComingBookings?.map {
                if (v.id == it.id) {
                    v
                } else {
                    it
                }
            }
            (binding.recyclerUpcoming.adapter as UpcomingVenueAdapter).setData(upComingBookings?:
            emptyList<VenueBooking>() as ArrayList<VenueBooking>)*/

//            setUPUpcomingList()
        })

        this.viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
            showProgress(it)
        })

        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
           showProgress(false)
            ( activity as VenueBookingActivity).showUpSnackError(it)

        })

    }
    private fun setUPUpcomingList() {
        if (upComingBookings.isNullOrEmpty()) {
            binding.textViewMsg.visibility = View.VISIBLE
            binding.textViewMsg.text = "No Bookings"
        } else {
            binding.textViewMsg.visibility = View.GONE
            val layoutManager = LinearLayoutManager(requireContext())
            binding.recyclerUpcoming.layoutManager = layoutManager
            binding.recyclerUpcoming.adapter =
                    UpcomingVenueAdapter(requireContext(), upComingBookings ?: ArrayList())
            (binding.recyclerUpcoming.adapter as UpcomingVenueAdapter).itemClick = { type, booking, position ->
                index = position
                when (type) {
                    "Check Out" -> {
                        // Check-Out
                        viewModel?.changeVenueBookingStatus(
                                RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                                ChangeStatusRequest(booking.id ?: 0, "Checked-Out")
                        )

                    }
                    "Check In" -> {
                        viewModel?.changeVenueBookingStatus(
                                RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                                ChangeStatusRequest(booking.id ?: 0, "Checked-In")
                        )
                    }
                    "map" -> {
                        try {
                            val intent = Intent(requireContext(), Maps::class.java)
                            val bundle = Bundle()
                            bundle.putSerializable("data", booking)
                            intent.putExtras(bundle)
                            startActivity(intent)
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }
                    "phone" -> {
                        if (!booking.user?.phoneNumber.isNullOrEmpty()) {
                            try {
                                val intent = Intent(Intent.ACTION_DIAL)
                                intent.data = Uri.parse("tel:${booking.user?.phoneNumber}")
                                startActivity(intent)
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                        }

                    }
                }
            }

        }
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
