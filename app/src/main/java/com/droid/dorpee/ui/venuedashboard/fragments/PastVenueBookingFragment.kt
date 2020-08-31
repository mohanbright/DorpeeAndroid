package com.droid.dorpee.ui.venuedashboard.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.databinding.FragmentPastBookingBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.personaldashboard.personalItem.Maps
import com.droid.dorpee.ui.venuedashboard.adapter.PastVenueAdapter
import com.droid.dorpee.ui.venuedashboard.model.VenueBooking
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel

class PastVenueBookingFragment : BaseFragment() {
    private lateinit var binding: FragmentPastBookingBinding
    var viewModel: VenueDashViewModel? = null
    var pastBooking: ArrayList<VenueBooking>? = ArrayList()
    private var index: Int = -1

    override fun bindData() {}
    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueDashViewModel())
        return ViewModelProvider(this, provider).get(VenueDashViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPastBookingBinding.inflate(layoutInflater)
        viewModel = setUpVM() as VenueDashViewModel
        pastBooking = arguments?.getSerializable("data") as ArrayList<VenueBooking>?
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpPastVenueList()
    }

    private fun setUpPastVenueList() {
        if (pastBooking.isNullOrEmpty()) {
            binding.textViewMsg.visibility = View.VISIBLE
            binding.textViewMsg.text = "No Bookings"
        } else {
            binding.textViewMsg.visibility = View.VISIBLE
            val layoutManager = LinearLayoutManager(requireContext())
            binding.pastBookingList.layoutManager = layoutManager
            binding.pastBookingList.adapter =
                PastVenueAdapter(requireContext(), pastBooking ?: ArrayList())
            (binding.pastBookingList.adapter as PastVenueAdapter).itemClick =
                { type, booking, position ->
                    index = position
                    when (type) {
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
}
