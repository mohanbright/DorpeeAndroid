package com.droid.dorpee.ui.venue.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentVenueWorkingHoursBinding
import com.droid.dorpee.ui.Availability
import com.droid.dorpee.ui.VenueAvailityReq
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.venue.RegisterVenueActivity
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.availityReq
import com.droid.dorpee.ui.venue.adapter.WeekAdapter
import com.droid.dorpee.ui.venue.viewmodel.VenueViewModel
import com.droid.dorpee.utils.log
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog

class VenueWorkingHoursFragment : BaseFragment() {
    private lateinit var binding: FragmentVenueWorkingHoursBinding
    var viewModel: VenueViewModel? = null
    var openingTime: String = ""
    var closingTime: String = ""
    override fun bindData() {
        val listOfTab = arrayListOf(false, false, true, false, false, false)
        (context as RegisterVenueActivity).setUpTabline(listOfTab)
    }

    override fun initListeners() {
        binding.amenitiesBtn.setOnClickListener {
            availityReq = VenueAvailityReq()
            val list = ArrayList<Availability>()
            (binding.weekGrid.adapter as WeekAdapter).weekList.map {
                if (it.checked) {
                    if (it.openingTime?.trim().isNullOrEmpty() || it.closingTime?.trim().isNullOrEmpty()) {
                        (context as RegisterVenueActivity).showUpSnackError("Invalid time")
                        return@setOnClickListener
                    } else {
                        list.add(Availability(it.day, it.openingTime, it.closingTime))
                    }
                }
            }
            availityReq?.availability = list
            log(availityReq)
            if (availityReq?.availability.isNullOrEmpty()) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.workingday))
            } else {
                val frag = BonusFragment()
                (context as RegisterVenueActivity).loadFragment(frag)
            }
        }

        binding.switchAll.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                (binding.weekGrid.adapter as WeekAdapter).weekList.map {
                    it.checked = true
                    it.openingTime = openingTime
                    it.closingTime = closingTime
                }
                binding.weekGrid.adapter?.notifyDataSetChanged()
            } else {
                (binding.weekGrid.adapter as WeekAdapter).weekList.map {
                    it.checked = false
                    it.openingTime = ""
                    it.closingTime = ""
                }
                binding.weekGrid.adapter?.notifyDataSetChanged()
            }
        }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueViewModel())
        return ViewModelProvider(this, provider).get(VenueViewModel::class.java)
    }

    private fun setUPweekList() {
        val listOfWeek = arrayListOf<Availability>()
        listOfWeek.add(Availability("Monday", " ", " "))
        listOfWeek.add(Availability("Tuesday", " ", " "))
        listOfWeek.add(Availability("Wednesday", " ", " "))
        listOfWeek.add(Availability("Thursday", " ", " "))
        listOfWeek.add(Availability("Friday", " ", " "))
        listOfWeek.add(Availability("Saturday", " ", " "))
        listOfWeek.add(Availability("Sunday", " ", " "))
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.weekGrid.layoutManager = layoutManager
        binding.weekGrid.adapter = WeekAdapter(requireContext(), listOfWeek)
        (binding.weekGrid.adapter as WeekAdapter).itemClick = { type, pos ->
            val week = (binding.weekGrid.adapter as WeekAdapter).weekList[pos]
            when (type) {
                "day" -> {
                    if (week.checked){
                        (binding.weekGrid.adapter as WeekAdapter).weekList[pos].checked = !week.checked
                        (binding.weekGrid.adapter as WeekAdapter).weekList[pos].openingTime =""
                        (binding.weekGrid.adapter as WeekAdapter).weekList[pos].closingTime =""
                        (binding.weekGrid.adapter as WeekAdapter).notifyItemChanged(pos)
                    }else{
                        (binding.weekGrid.adapter as WeekAdapter).weekList[pos].checked = !week.checked
                        (binding.weekGrid.adapter as WeekAdapter).weekList[pos].openingTime =openingTime
                        (binding.weekGrid.adapter as WeekAdapter).weekList[pos].closingTime =closingTime
                        (binding.weekGrid.adapter as WeekAdapter).notifyItemChanged(pos)
                    }

                }
                "from" -> {
                    val dpd = TimePickerDialog.newInstance({ view, hourOfDay, minute, second ->
                        openingTime = String.format("%02d:%02d", hourOfDay, minute)
                        (binding.weekGrid.adapter as WeekAdapter).weekList[pos].openingTime = openingTime
                        (binding.weekGrid.adapter as WeekAdapter).notifyItemChanged(pos)
                    }, 9, 0, 0, true)
                    dpd.show(childFragmentManager, "DatepickerFromdialog")
                }
                "to" -> {
                    val dpd = TimePickerDialog.newInstance({ view, hourOfDay, minute, second ->
                        closingTime = String.format("%02d:%02d", hourOfDay, minute)
                        (binding.weekGrid.adapter as WeekAdapter).weekList[pos].closingTime = closingTime
                        (binding.weekGrid.adapter as WeekAdapter).notifyItemChanged(pos)
                    }, 20, 0, 0, true)
                    dpd.show(childFragmentManager, "DatepickerTodialog")

                }
            }
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVenueWorkingHoursBinding.inflate(layoutInflater)
        viewModel = setUpVM() as VenueViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUPweekList()
//        attachObserver()
    }

    private fun attachObserver() {
        /*  this.viewModel?.apiVenueAvailibiltyResponse?.observe(viewLifecycleOwner, Observer {
              val frag = BonusFragment()
              (context as RegisterVenueActivity).loadFragment(frag)
          })*/
        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            (context as RegisterVenueActivity).showUpSnackError(it)
        })
        this.viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
            showProgress(it)
        })

    }

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
                binding.amenitiesBtn.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.amenitiesBtn.visibility = View.VISIBLE
            }
        }
    }
}
