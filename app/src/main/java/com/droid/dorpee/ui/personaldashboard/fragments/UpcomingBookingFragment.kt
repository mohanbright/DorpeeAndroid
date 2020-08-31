package com.droid.dorpee.ui.personaldashboard.fragments

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentUpcomingBookingBinding
import com.droid.dorpee.ui.ChangeStatusRequest
import com.droid.dorpee.ui.ExtendRequest
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.CancelRequest
import com.droid.dorpee.ui.booking.BookingActivity
import com.droid.dorpee.ui.personaldashboard.adapter.UpcomingAdapter
import com.droid.dorpee.ui.personaldashboard.models.MDBooking
import com.droid.dorpee.ui.personaldashboard.personalItem.Maps
import com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class UpcomingBookingFragment : BaseFragment() {
    private lateinit var binding: FragmentUpcomingBookingBinding
    var viewModel: PersonalViewModel? = null
    var upComingBookings: ArrayList<MDBooking>? = ArrayList()
    private var index: Int = -1
    override fun bindData() {}
    private var searchCondition : String = ""

    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(PersonalViewModel())
        return ViewModelProvider(this, provider).get(PersonalViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUpcomingBookingBinding.inflate(layoutInflater)
        viewModel = setUpVM() as PersonalViewModel
//        upComingBookings = arguments?.getSerializable("data") as ArrayList<MDBooking>?
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        setUPUpcomingList()
    }


    fun loadData() {
        viewModel?.getBookings(RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token))
        viewModel?.apiBookingsResponse?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            it.data.forEach {
                if (compareDate(it.start_date) == 1 && it.status != "Cancelled") {
                    upComingBookings?.add(it)
                }
            }
            binding.recyclerUpcoming.adapter?.notifyDataSetChanged()
        })

        viewModel?.apiBookingChangeStatus?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            upComingBookings?.get(index)?.status = it.data.status
            binding.recyclerUpcoming.adapter?.notifyDataSetChanged()
        })

        viewModel?.isLoading?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            showProgress(it)
        })

        viewModel?.apiError?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            showProgress(false)
            showSnackBarCustom(
                it,
                requireActivity().findViewById(R.id.alertView),
                ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
        })

    }

    private fun setUPUpcomingList() {
        val layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerUpcoming.layoutManager = layoutManager
        binding.recyclerUpcoming.adapter = UpcomingAdapter(requireContext(), upComingBookings!!)
        (binding.recyclerUpcoming.adapter as UpcomingAdapter).itemClick = { type, booking, position ->
                index = position
                when {
                    type.equals("edit") -> {
                        // Edit
                        val validDate = formatDate(booking.end_date, booking.start_time, booking.end_time)
                        AppPreferences.getInstance(requireContext())?.setVenueName(booking.space?.venue?.name!!)
                        searchCondition =
                                "${booking.space?.venue?.address}+${validDate}+${booking.no_of_people}+${booking.no_of_booked_spaces}+${upComingBookings!![position].id}";
                        Log.e("The sorted","date is is : "+searchCondition)
                        requireContext().startActivity(
                                Intent(
                                        context,
                                        BookingActivity::class.java
                                ).apply {
                                    putExtra("space",  booking.space)
                                    putExtra("scondition", searchCondition)
                                    putExtra("isFromRebook",false)
                                    putExtra("isFromUpcomming",true)
                                })
                    }
                    type.equals("cancel") -> {
                        // build alert dialog
                        val dialogBuilder = AlertDialog.Builder(context)
                        // set message of alert dialog
                        dialogBuilder.setMessage("Are you sure you want to \n cancel this booking?")
                                // if the dialog is cancelable
                                .setCancelable(false)
                                // positive button text and action
                                .setPositiveButton("Yes", DialogInterface.OnClickListener {
                                    dialog, id -> finish(booking)
                                })
                                // negative button text and action
                                .setNegativeButton("No", DialogInterface.OnClickListener {
                                    dialog, id -> dialog.cancel()
                                })

                        // create dialog box
                        val alert = dialogBuilder.create()
                        // set title for alert dialog box
                        alert.setTitle("Alert")
                        // show alert dialog
                        alert.show()

                    }
                    type.equals("extend-stay") -> {
                        viewModel?.extendBooking(
                            RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                            ExtendRequest(booking.id)
                        )
                    }
                    type.equals("Rebook") -> {
                        val validDate = formatDate(booking.end_date, booking.start_time, booking.end_time)
                        AppPreferences.getInstance(requireContext())?.setVenueName(booking.space?.venue?.name!!)
                        searchCondition = "${booking.space?.venue?.address}+${validDate}";
                        Log.e("The sorted","date is is : "+searchCondition)
                        requireContext().startActivity(
                                Intent(
                                        context,
                                        BookingActivity::class.java
                                ).apply {
                                    putExtra("space",  booking.space)
                                    putExtra("scondition", searchCondition)
                                    putExtra("isFromRebook",true)
                                    putExtra("isFromUpcomming",false)
                                })
                    }
                    type.equals("Check-Out") -> {
                        // Check-Out
                        viewModel?.changeStatus(
                            RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                            ChangeStatusRequest(booking.id, "Checked-Out")
                        )
                    }
                    type.equals("Check-In") -> {
                        viewModel?.changeStatus(
                            RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                            ChangeStatusRequest(booking.id, "Checked-In")
                        )
                    }
                    type.equals("map") -> {
                        val intent = Intent(requireContext(), Maps::class.java)
                        val bundle = Bundle()
                        bundle.putSerializable("data", booking)
                        intent.putExtras(bundle)
                        startActivity(intent)
                    }
                }
            }
    }

    private fun finish(booking : MDBooking) {
        // Cancel
        viewModel?.cancelBooking(
                RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token),
                booking.id,
                CancelRequest("Cancelled", "PUT")
        )
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

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
            }
        }
    }
    fun formatDate(date: String?, startTime: String?, endTiem: String?): String {
        try {
            val timeFormat = SimpleDateFormat("hh:mm:ss");
            val endTimeFormat = SimpleDateFormat("hh:mm");
            val formattedStartTime = endTimeFormat.format(timeFormat.parse(startTime!!)!!)
            val formattedEndTime = endTimeFormat.format(timeFormat.parse(endTiem!!)!!)
            return String.format(
                    "%s+%s+%s",
                    date,
                    formattedStartTime,
                    formattedEndTime
            )
        } catch (e: ParseException) {
            e.printStackTrace()
        } catch (e: NullPointerException) {
            e.printStackTrace()
        }
        return ""
    }
}