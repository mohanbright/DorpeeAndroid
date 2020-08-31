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
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentSearchBinding
import com.droid.dorpee.ui.auth.ChooseCustomerTypeActivity
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment


class SearchFragment : BaseFragment() {

    private lateinit var binding: FragmentSearchBinding
    var viewModel: SearchViewModel? = null

    override fun bindData() {}

    override fun initListeners() {
        val navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)

        binding.buttonSignIn.setOnClickListener {
            navController.navigate(R.id.navigation_login)
//            requireContext().startActivity(Intent(requireContext(),LoginActivity::class.java))
        }
        binding.buttonJoin.setOnClickListener {
            requireContext().startActivity(Intent(requireContext(),ChooseCustomerTypeActivity::class.java))
        }
        binding.searchId.setOnClickListener {
            navController.navigate(R.id.action_advance_search)
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
        binding = FragmentSearchBinding.inflate(layoutInflater)
        viewModel = setUpVM() as SearchViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        attachObserver()
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
