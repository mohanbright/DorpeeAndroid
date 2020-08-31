package com.droid.dorpee.ui.venue.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentSpecifyWorkspaceBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.venue.RegisterVenueActivity
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.venueRes
import com.droid.dorpee.ui.venue.SuccessWorksapceActivity
import com.droid.dorpee.ui.venue.adapter.AddAdapter
import com.droid.dorpee.ui.venue.viewmodel.VenueViewModel
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.log
import com.droid.dorpee.utils.preference.AppPreferences

class SpecifyWorkspaceFragment : BaseFragment() {

    private lateinit var binding: FragmentSpecifyWorkspaceBinding
    var viewModel: VenueViewModel? = null
    var workspaceList: ArrayList<Space>? = ArrayList()

    override fun bindData() {
        val listOfTab = arrayListOf(false, false, false, false, false, true)
        (context as RegisterVenueActivity).setUpTabline(listOfTab)
    }

    override fun initListeners() {
        binding.nextBtn.setOnClickListener {
            startActivity(Intent(requireContext(), SuccessWorksapceActivity::class.java).apply {
                putExtra("venueId",venueRes?.data?.id?:0)
                putExtra("venueName",venueRes?.data?.name?:"")
                putExtra("from","signup")
            })
        }
        binding.addMore.setOnClickListener {
            val adapter = binding.recyclerView.adapter
            if (adapter == null) {
                setUpAddWorkspace(arrayListOf(""))
            } else {
                val list = (binding.recyclerView.adapter as AddAdapter).list
                if (list.isNullOrEmpty()) {
                    setUpAddWorkspace(arrayListOf(""))
                } else {
                    list.add("")
                    (binding.recyclerView.adapter as AddAdapter).list = list
                    (binding.recyclerView.adapter as AddAdapter).notifyDataSetChanged()
                }
            }
        }

    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueViewModel())
        return ViewModelProvider(this, provider).get(VenueViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSpecifyWorkspaceBinding.inflate(layoutInflater)
        viewModel = setUpVM() as VenueViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        attachObserver()
        arguments?.let {
            val no = it.getInt("noofworkspace")
            log(no)
            val list = ArrayList<String>(no)
            repeat(no) { list.add("") }
            setUpAddWorkspace(list)
        }
    }

    private fun setUpAddWorkspace(list: ArrayList<String>) {
        val layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        layoutManager.isItemPrefetchEnabled = true
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = AddAdapter(requireContext(), list)
    }

    private fun attachObserver() {
        this.viewModel?.apiWorkspaceResponse?.observe(viewLifecycleOwner, Observer {
            log(it)
        })
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
                binding.nextBtn.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.nextBtn.visibility = View.VISIBLE
            }
        }
    }

    override fun onResume() {
        super.onResume()
        val user = AppPreferences.getInstance(requireContext())?.user
        if (isNetworkAvailable()) {
            viewModel?.getWorkSpaces("Bearer " + user?.token)
        } else {
            (context as RegisterVenueActivity).showUpSnackError(getString(R.string.network_unavailble))
        }
    }
}
