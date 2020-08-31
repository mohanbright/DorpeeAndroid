package com.droid.dorpee.ui.venuedashboard.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.databinding.FragmentWorkspaceAvailbilityBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.venue.model.AvailabilityXX
import com.droid.dorpee.ui.venue.model.WorkingHours
import com.droid.dorpee.ui.venuedashboard.adapter.AvailabilityAdapter
import com.droid.dorpee.ui.venuedashboard.model.DataBlocked
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.ui.venuedashboard.venueItem.AvailabilityActivity
import com.droid.dorpee.ui.venuedashboard.venueItem.AvailabilityActivity.Companion.blockRes
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.toJson

class WorkspaceAvailbilityFragment : BaseFragment() {
    private var datalist: List<AvailabilityXX>? = null
    private lateinit var binding: FragmentWorkspaceAvailbilityBinding
    var viewModel: VenueDashViewModel? = null
    private var selectVenueId: Int = 0
    private var selectSpaceId: Int = 0
    private var selectSpaceQuantity: Int = 0
    private var selectDay: String = "Monday"
    lateinit var availActivity: AvailabilityActivity
    var ifupdate = false
    private val TAG = "WorkspaceAvailbilityFra"
    override fun bindData() {
        blockRes = {
            Log.e(TAG, "bindData: blockInOutResponse ")
            AppPreferences.getInstance(requireContext())?.blockInOutResponse?.let {
            }
        }
    }

    override fun initListeners() {
        binding.addConstraintBlockOut.setOnClickListener {
            val auth = RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token)
            val list = (binding.availibilityRecycler.adapter as AvailabilityAdapter).blockDataList
            if (list.isNullOrEmpty())
                return@setOnClickListener
            list.map {
                if (it.quantity.isNullOrEmpty()) {
                    return@setOnClickListener
                } else if (it.quantity?.toInt() ?: 0 > selectSpaceQuantity) {
                    return@setOnClickListener
                }
            }

            when (selectDay) {
                "Monday" -> datalist?.map { it.monday = list }
                "Tuesday" -> datalist?.map { it.tuesday = list }
                "Wednesday" -> datalist?.map { it.wednesday = list }
                "Thursday" -> datalist?.map { it.thursday = list }
                "Friday" -> datalist?.map { it.friday = list }
                "Saturday" -> datalist?.map { it.saturday = list }
                "Sunday" -> datalist?.map { it.sunday = list }
                else -> {
                }
            }
            ifupdate = true
            viewModel?.updateBlockedSpace(auth, DataBlocked(availability = datalist
                    ?: emptyList(), spaceId = selectSpaceId))
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
        binding = FragmentWorkspaceAvailbilityBinding.inflate(layoutInflater)
        viewModel = setUpVM() as VenueDashViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        availActivity = (requireActivity() as AvailabilityActivity)

        AppPreferences.getInstance(requireContext())?.allVenueResponse?.data?.let { allList ->
            if (!allList.isNullOrEmpty()) {
                val list = allList.map { it.name ?: "" }
                selectVenueId = 0
                binding.spinnerVenues.apply {
                    setItems(list)
                    lifecycleOwner = viewLifecycleOwner
                    setOnSpinnerItemSelectedListener<String> { index, text ->
                        allList.map {
                            if (it.name == text) {
                                selectVenueId = it.id!!
                                setSpinnerWorkSpace(it.spaces)
                            }
                        }
                    }
                    if (list.isNotEmpty())
                        selectItemByIndex(0)
//                        selectVenueId = allList[0].id!!
//                        setSpinnerWorkSpace(allList[0].spaces)
                }
            }
        }
        setSpinnerDay()
        attachObserver()
    }

    private fun setSpinnerWorkSpace(spaces: List<Space>?) {
        if (spaces.isNullOrEmpty()) {
            selectSpaceId = 0
            binding.spinnerSpace.apply {
                setItems(listOf("No Space"))
                lifecycleOwner = viewLifecycleOwner
                selectItemByIndex(0)
                setBlockList(null,selectSpaceQuantity)
            }
        } else {
            spaces.let { spaceList ->
                selectSpaceId = 0
                val list = spaceList.map { it.name ?: "" }
                binding.spinnerSpace.apply {
                    setItems(list)
                    lifecycleOwner = viewLifecycleOwner
                    setOnSpinnerItemSelectedListener<String> { index, text ->
                        spaceList.map {
                            if (it.name == text) {
                                selectSpaceId = it.id!!
                                selectSpaceQuantity = it.quantity?.toInt() ?: 0
                                val auth = RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token)
                                ifupdate = false
                                viewModel?.getBlockedSpace(auth, selectSpaceId)
                            }
                        }
                    }
                    if (list.isNotEmpty())
                        selectItemByIndex(0)
                }
            }
        }
    }

    private fun setSpinnerDay() {
        val list = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday")
        binding.spinnerDays.apply {
            setItems(list)
            lifecycleOwner = viewLifecycleOwner
            selectItemByIndex(0)
            selectDay = "Monday"
            setOnSpinnerItemSelectedListener<String> { index, text ->

                selectDay = text
//                val obj = JSONObject(datalist?.toJson()?:"")
                    when (selectDay) {
                        "Monday" -> {
                            if (datalist?.size ?: 0 >= 1) {
                                setBlockList(datalist!![0].monday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Tuesday" -> {
                            if (datalist?.size ?: 0 >= 2) {
                                setBlockList(datalist!![1].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Wednesday" -> {
                            if (datalist?.size ?: 0 >= 3) {
                                setBlockList(datalist!![2].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Thursday" -> {
                            if (datalist?.size ?: 0 >= 4) {
                                setBlockList(datalist!![3].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Friday" -> {
                            if (datalist?.size ?: 0 >= 5) {
                                setBlockList(datalist!![4].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Saturday" -> {
                            if (datalist?.size ?: 0 >= 6) {
                                setBlockList(datalist!![5].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Sunday" -> {
                            if (datalist?.size ?: 0 >= 7) {
                                setBlockList(datalist!![6].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        else -> {
                            if (datalist?.size ?: 0 >= 1) {
                                setBlockList(datalist!![0].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                    }
                }

        }
    }

    private fun attachObserver() {
        this.viewModel?.apiBlockedSpaceResponse?.observe(viewLifecycleOwner, androidx
                .lifecycle.Observer {
                    if (ifupdate)
                        availActivity.showUpSnackError("Space's availability successfully set.")
                    ifupdate = false
                    datalist = it.data?.availability
                    when (selectDay) {
                        "Monday" -> {
                            if (datalist?.size ?: 0 >= 1) {
                                setBlockList(datalist!![0].monday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Tuesday" -> {
                            if (datalist?.size ?: 0 >= 2) {
                                setBlockList(datalist!![1].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Wednesday" -> {
                            if (datalist?.size ?: 0 >= 3) {
                                setBlockList(datalist!![2].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Thursday" -> {
                            if (datalist?.size ?: 0 >= 4) {
                                setBlockList(datalist!![3].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Friday" -> {
                            if (datalist?.size ?: 0 >= 5) {
                                setBlockList(datalist!![4].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Saturday" -> {
                            if (datalist?.size ?: 0 >= 6) {
                                setBlockList(datalist!![5].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        "Sunday" -> {
                            if (datalist?.size ?: 0 >= 7) {
                                setBlockList(datalist!![6].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                        else -> {
                            if (datalist?.size ?: 0 >= 1) {
                                setBlockList(datalist!![0].tuesday, selectSpaceQuantity)
                            }else{
                                setBlockList(null, selectSpaceQuantity)
                            }
                        }
                    }
                })

        this.viewModel?.isLoading?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            if (ifupdate)
                showProgress(it)
            else
                availActivity.showProgress(it)

            if (it==false){
                showProgress(it)
                availActivity.showProgress(it)
            }
        })
        this.viewModel?.apiError?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            showProgress(false)
            availActivity.showProgress(false)
            availActivity.showUpSnackError(it)
        })
    }

    private fun setBlockList(data: List<WorkingHours>?, selectSpaceQuantity: Int) {
        Log.e(TAG, "setBlockList: ${data?.toJson()} ")
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.availibilityRecycler.layoutManager = layoutManager
        binding.availibilityRecycler.adapter = AvailabilityAdapter(requireContext(), data
                ?: ArrayList(), selectSpaceQuantity)
        (binding.availibilityRecycler.adapter as AvailabilityAdapter).notifyDataSetChanged()
        val list = (binding.availibilityRecycler.adapter as AvailabilityAdapter).blockDataList
        if (list.isNullOrEmpty()) {
            binding.textViewMsg.visibility = View.VISIBLE
        } else {
            binding.textViewMsg.visibility = View.GONE
        }
        /*      (binding.availibilityRecycler.adapter as AvailabilityAdapter).itemClick = { type, blockdata, pos ->
                  when (type) {
                      "unblock" -> {
                      }
                      else -> {
                      }
                  }
              }*/
    }

    fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
                binding.addConstraintBlockOut.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.addConstraintBlockOut.visibility = View.VISIBLE
            }
        }
    }
}
