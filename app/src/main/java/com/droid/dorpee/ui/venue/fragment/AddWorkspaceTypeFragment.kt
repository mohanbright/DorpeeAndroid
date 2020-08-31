package com.droid.dorpee.ui.venue.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentAddWorkspaceTypeBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.venue.RegisterVenueActivity
import com.droid.dorpee.ui.venue.viewmodel.VenueViewModel
import com.droid.dorpee.utils.log

class AddWorkspaceTypeFragment : BaseFragment() {
    private lateinit var binding: FragmentAddWorkspaceTypeBinding
    var viewModel: VenueViewModel? = null
    var spcaceNo = 0
    override fun bindData() {
        val listOfTab = arrayListOf(false, false, false, false,true, false)
        (context as RegisterVenueActivity).setUpTabline(listOfTab)
    }

    override fun initListeners() {
        binding.addWorkSpaceNext.setOnClickListener {
            val noOfSpace = binding.editTextNoOfSpace.text.toString()
            val frag = SpecifyWorkspaceFragment()
            if (noOfSpace.isEmpty()) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.enter_no_of_space))
                return@setOnClickListener
            }
            val noSpace = noOfSpace.toInt()
            if (noSpace < 0) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.enter_no_one_space))
                return@setOnClickListener
            }
            frag.arguments = Bundle().apply {
                putInt("noofworkspace", noSpace)
            }
            log(noSpace)
            (context as RegisterVenueActivity).loadFragment(frag)
        }

        binding.imageViewUp.setOnClickListener {
            if (spcaceNo >= 0)
                spcaceNo += 1
            binding.editTextNoOfSpace.setText(spcaceNo.toString())
        }
        binding.imageViewDown.setOnClickListener {
            if (spcaceNo > 0)
                spcaceNo -= 1
            binding.editTextNoOfSpace.setText(spcaceNo.toString())
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
        binding = FragmentAddWorkspaceTypeBinding.inflate(layoutInflater)
        viewModel = setUpVM() as VenueViewModel
        return binding.root
    }

}
