package com.droid.dorpee.ui.personaldashboard.fragments

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
import com.droid.dorpee.databinding.FragmentPastBookingBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.booking.BookingActivity
import com.droid.dorpee.ui.personaldashboard.adapter.PastAdapter
import com.droid.dorpee.ui.personaldashboard.models.MDBooking
import com.droid.dorpee.ui.personaldashboard.personalItem.Maps
import com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class PastBookingFragment : BaseFragment() {
    private var space: Space? = null
    private lateinit var binding: FragmentPastBookingBinding
    var viewModel: PersonalViewModel? = null
    var pastBookings: ArrayList<MDBooking>? = ArrayList()
    private var searchCondition : String = ""
    override fun bindData() {}
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
        binding = FragmentPastBookingBinding.inflate(layoutInflater)
        viewModel = setUpVM() as PersonalViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        setUPUpcomingList()
    }

    private fun setUPUpcomingList() {
        val layoutManager = LinearLayoutManager(requireContext())
        binding.pastBookingList.layoutManager = layoutManager
        binding.pastBookingList.adapter = PastAdapter(requireContext(), pastBookings!!)
        (binding.pastBookingList.adapter as PastAdapter).itemClick =
                { type, booking, position ->
                    if (type == 0) {
                        try {
                            if (pastBookings!=null) {
                                val intent = Intent(requireContext(), Maps::class.java)
                                val bundle = Bundle()
                                bundle.putSerializable("data", booking)
                                intent.putExtras(bundle)
                                startActivity(intent)
                            }
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
//                    val intent = Intent(requireContext(), Maps::class.java)
//                    val bundle = Bundle()
//                    bundle.putSerializable("data", booking)
//                    intent.putExtras(bundle)
//                    startActivity(intent)
                    } else if (type == 1) {
                        space = booking.space
                        val validDate = formatDate(booking.end_date, booking.start_time, booking.end_time)
                        AppPreferences.getInstance(requireContext())?.setVenueName(booking.space?.venue?.name!!)
                        searchCondition = "${booking.space?.venue?.address}+${validDate}";
                        Log.e("The sorted","date is is : "+searchCondition)
                        requireContext().startActivity(
                                Intent(
                                        requireContext(),
                                        BookingActivity::class.java
                                ).apply {
                                    putExtra("space", space)
                                    putExtra("scondition", searchCondition)
                                    putExtra("isFromRebook",true)
                                })
                        // Rebook
                    }
                }
    }


    fun loadData() {
        viewModel?.getBookings(RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token))
        viewModel?.apiBookingsResponse?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            it.data.forEach {
                if (compareDate(it.start_date) == 0 && it.status != "Cancelled") {
                    pastBookings?.add(it)
                }
            }
            binding.pastBookingList.adapter?.notifyDataSetChanged()
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
