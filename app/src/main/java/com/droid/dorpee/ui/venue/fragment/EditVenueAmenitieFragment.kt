package com.droid.dorpee.ui.venue.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentVenueAmenitieBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.venue.EditVenueActivity
import com.droid.dorpee.ui.venue.EditVenueActivity.Companion.venueData
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.listOfAmenitie
import com.droid.dorpee.ui.venue.adapter.AmenitieAdapter
import com.droid.dorpee.ui.venue.venueresponse.Data
import com.droid.dorpee.ui.venue.viewmodel.VenueViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom


/**
 * A simple [Fragment] subclass.
 */
class EditVenueAmenitieFragment : BaseFragment() {

    private lateinit var binding: FragmentVenueAmenitieBinding
    var viewModel: VenueViewModel? = null

    override fun bindData() {
        val listOfTab = arrayListOf(false, true, false, false)
                venueData?.let {
                    setUpEditAmenitie(it)
                }
        (context as EditVenueActivity).setUpTabline(listOfTab)
    }

    override fun initListeners() {
        binding.amenitiesBtn.setOnClickListener {
            if (listOfAmenitie.isNullOrEmpty()) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.select_atleast_1))
            } else {
                val frag = EditVenueWorkingHoursFragment()
                (context as EditVenueActivity).loadFragment(frag)
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
        binding = FragmentVenueAmenitieBinding.inflate(layoutInflater)
        viewModel = setUpVM() as VenueViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        attachObserver()
    }

    private fun setUpEditAmenitie(data: Data) {
        val list = AppPreferences.getInstance(requireContext())?.services
        val layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        layoutManager.isItemPrefetchEnabled = true
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.setHasFixedSize(true)
        list?.let {
            binding.recyclerView.adapter = AmenitieAdapter(requireContext(), it,data.services)
        }
    }

    private fun attachObserver() {
        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark)
            )
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
