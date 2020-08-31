package com.droid.dorpee.ui.search.ui.search

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentSearchResultBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.personaldashboard.personalItem.DorpeePlanActivity
import com.droid.dorpee.ui.search.adapter.SearchResultAdapter
import com.droid.dorpee.ui.search.map.MapsActivity
import com.droid.dorpee.ui.search.model.SearchResponse

class SearchResultFragment : BaseFragment() {

    private var sdata: SearchResponse? = null
    private lateinit var binding: FragmentSearchResultBinding
    var viewModel: SearchViewModel? = null
    var scondition: String? = null

    override fun bindData() {
        AdvanceSearchFragment.searchAddress?.let {
            binding.searchID.text = it
        }
    }

    override fun initListeners() {
        binding.backbtn.setOnClickListener {
            val navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
            navController.popBackStack()
        }
        binding.imageViewMap.setOnClickListener {
            startActivity(Intent(requireContext(), MapsActivity::class.java).apply {
                if (sdata != null)
                    putExtra("data", sdata)
            })
        }
        binding.searchId.setOnClickListener {
            val navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
            navController.popBackStack()
        }
    }


    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(SearchViewModel())
        return ViewModelProvider(this, provider).get(SearchViewModel::class.java)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchResultBinding.inflate(layoutInflater)
        viewModel = setUpVM() as SearchViewModel
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        MapsActivity.infoData?.let {
            findNavController().navigate(
                    SearchResultFragmentDirections.actionVenueDetail(
                            it
                    )
            )
            MapsActivity.infoData = null
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        attachObserver()
        val layoutManager = LinearLayoutManager(requireContext())
        layoutManager.isItemPrefetchEnabled = true
        binding.searchRecycler.layoutManager = layoutManager
        binding.searchRecycler.setHasFixedSize(true)
        val navController =
                Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
        arguments?.let {
            sdata = SearchResultFragmentArgs.fromBundle(it).searchData
            scondition = SearchResultFragmentArgs.fromBundle(it).searchCondition
            sdata?.data?.let {
                binding.searchRecycler.adapter = SearchResultAdapter(requireContext(), it)
                binding.searchRecycler.adapter?.notifyDataSetChanged()
                (binding.searchRecycler.adapter as SearchResultAdapter).itemClick = { to, pos ->
                    when (to) {
                        "venue" -> {
                            val data =
                                    (binding.searchRecycler.adapter as SearchResultAdapter).searchList!![pos]
                            findNavController().navigate(
                                    SearchResultFragmentDirections.actionVenueDetail(
                                            data, scondition!!
                                    )
                            )
                        }
                        "login" -> {
                            navController.navigate(R.id.navigation_login)
//                            startActivity(Intent(requireContext(), LoginActivity::class.java))
                        }
                        "plan" -> {
                            startActivity(Intent(requireContext(), DorpeePlanActivity::class.java))
                        }
                        else -> {
                        }
                    }

                }
            }
        }
    }

    private fun attachObserver() {
        this.viewModel?.apiWorkspaceResponse?.observe(viewLifecycleOwner, Observer {
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

}
