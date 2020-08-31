package com.droid.dorpee.ui.venuedashboard.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentBlockoutTimeBinding
import com.droid.dorpee.ui.RequestWithHeader
import com.droid.dorpee.ui.UnblockRequest
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.venuedashboard.adapter.BlockOutAdapter
import com.droid.dorpee.ui.venuedashboard.model.BlockData
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.ui.venuedashboard.venueItem.AvailabilityActivity
import com.droid.dorpee.ui.venuedashboard.venueItem.AvailabilityActivity.Companion.blockRes
import com.droid.dorpee.ui.venuedashboard.venueItem.BlockOutActivity
import com.droid.dorpee.ui.venuedashboard.viewmodel.VenueDashViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.google.android.material.dialog.MaterialAlertDialogBuilder


class BlockoutTimeFragment : BaseFragment() {
    private lateinit var binding: FragmentBlockoutTimeBinding
    var viewModel: VenueDashViewModel? = null
    private val TAG = "BlockoutTimeFragment"
    private var selectVenueId: Int = 0
    private var selectSpaceId: Int = 0
    lateinit var availActivity: AvailabilityActivity
    override fun bindData() {
        blockRes = {
            Log.e(TAG, "bindData: blockInOutResponse ")
            val list = it?.data?.filter { it.spaceId == selectSpaceId }
            setBlockList(list as ArrayList<BlockData>)
        }
    }

    override fun initListeners() {
        binding.addConstraintBlockOut.setOnClickListener {
            startActivity(Intent(requireContext(), BlockOutActivity::class.java))
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
        binding = FragmentBlockoutTimeBinding.inflate(layoutInflater)
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
                    if (list.isNotEmpty()) {
                        selectItemByIndex(0)
                        selectVenueId = allList[0].id!!
                        setSpinnerWorkSpace(allList[0].spaces)
                    }
                }
            }
        }

        AppPreferences.getInstance(requireContext())?.blockInOutResponse?.let {
            val list = it.data?.filter { it.spaceId == selectSpaceId }
            setBlockList(list as ArrayList<BlockData>)
//            setBlockList(it.data as ArrayList<BlockData>)
        }
        attachObserver()
    }

    private fun setBlockList(data: ArrayList<BlockData>?) {
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.blockOutRecycler.layoutManager = layoutManager
        binding.blockOutRecycler.adapter = BlockOutAdapter(requireContext(), data ?: ArrayList())
        (binding.blockOutRecycler.adapter as BlockOutAdapter).itemClick = { type, blockdata, pos ->
            when (type) {
                "unblock" -> {
                    confirmUnblockeDialog(blockdata)
                }
                else -> {
                }
            }
        }
    }

    private fun setSpinnerWorkSpace(spaces: List<Space>?) {
        spaces?.let { spaceList ->
            selectSpaceId = 0
            val list = spaceList.map { it.name ?: "" }
            binding.spinnerSpace.apply {
                setItems(list)
                lifecycleOwner = viewLifecycleOwner
                setOnSpinnerItemSelectedListener<String> { index, text ->
                    spaceList.map {
                        if (it.name == text) {
                            selectSpaceId = it.id!!
                        }
                    }
                    AppPreferences.getInstance(requireContext())?.blockInOutResponse?.let {
                        val newli = it.data?.filter { it.spaceId == selectSpaceId }
                        setBlockList(newli as ArrayList<BlockData>)
                    }
                }
                if (list.isNotEmpty()) {
                    selectItemByIndex(0)
                    selectSpaceId = spaceList[0].id!!
                }
                AppPreferences.getInstance(requireContext())?.blockInOutResponse?.let {
                    val newli = it.data?.filter { it.spaceId == selectSpaceId }
                    setBlockList(newli as ArrayList<BlockData>)
                }
            }
        }
    }

    private fun confirmUnblockeDialog(data: BlockData) {
        val dialogBuilder = MaterialAlertDialogBuilder(requireContext())
        dialogBuilder.setMessage(getString(R.string.unblock_text))
                .setCancelable(false)
                .setPositiveButton("YES") { dialog, _ ->
                    if (isNetworkAvailable()) {
                        val request = UnblockRequest(data.date, data.openingTime, data.spaceId)
                        viewModel?.unBlockAvailability(RequestWithHeader
                        (AppPreferences
                                .getInstance(requireContext())?.user?.token), request)
                    } else {
                        (requireActivity() as AvailabilityActivity).showUpSnackError(getString(R.string.network_unavailble))
                    }
                    dialog.cancel()
                }
                .setNegativeButton("No") { dialog, _ ->
                    dialog.cancel()
                }
        val alert = dialogBuilder.create()
        alert.setTitle(getString(R.string.delete_venue))
        alert.show()
    }

    private fun attachObserver() {
        this.viewModel?.apiUnBlockResponse?.observe(viewLifecycleOwner, androidx
                .lifecycle.Observer {
                    availActivity.showUpSnackError(it.success)
                    val auth = RequestWithHeader(AppPreferences.getInstance(requireContext())?.user?.token)
                    viewModel?.getAvailability(auth)
                })

        this.viewModel?.isLoading?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            availActivity.showProgress(it)
        })
        availActivity.viewModel?.isLoading?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            availActivity.showProgress(it)
        })
        this.viewModel?.apiBlockIntResponse?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
            AppPreferences.getInstance(requireContext())?.blockInOutResponse = it
            blockRes?.invoke(it)
        })
        this.viewModel?.apiError?.observe(viewLifecycleOwner, androidx.lifecycle.Observer {

            availActivity.showProgress(false)
            availActivity.showUpSnackError(it)
        })
    }
}