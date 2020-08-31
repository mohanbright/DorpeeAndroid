package com.droid.dorpee.ui.venue.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentBonusBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.venue.EditVenueActivity
import com.droid.dorpee.ui.venue.EditVenueActivity.Companion.venueData
import com.droid.dorpee.ui.venue.RegisterVenueActivity
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.availityReq
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.venueRes
import com.droid.dorpee.ui.venue.viewmodel.VenueViewModel
import com.droid.dorpee.ui.venuedashboard.model.Space
import com.droid.dorpee.utils.preference.AppPreferences
import okhttp3.MultipartBody
import okhttp3.RequestBody

class EditBonusFragment : BaseFragment() {

    private var venue_id: Int =0
    private lateinit var binding: FragmentBonusBinding
    var viewModel: VenueViewModel? = null
    var workspaceList: ArrayList<Space>? = ArrayList()

    override fun bindData() {
        val listOfTab = arrayListOf(false, false, false, true)
        binding.bounsId.setText(venueData?.bonusOffer)
        venueData?.let {
            venue_id = it.id?:0
        }
        (context as EditVenueActivity).setUpTabline(listOfTab)
        binding.textView7.text = getString(R.string.submit)

    }

    override fun initListeners() {
        binding.nextBtn.setOnClickListener {
            val user = AppPreferences.getInstance(requireContext())?.user
            val map = HashMap<String, RequestBody>()
            map["name"] = createPartFromString(RegisterVenueActivity.request?.name!!)
            map["description"] = createPartFromString(RegisterVenueActivity.request?.description!!)
            map["address"] = createPartFromString(RegisterVenueActivity.request?.address!!)
            map["suburb"] = createPartFromString(RegisterVenueActivity.request?.suburb!!)
            map["postcode"] = createPartFromString(RegisterVenueActivity.request?.postcode!!)
            map["state"] = createPartFromString(RegisterVenueActivity.request?.state!!)
            map["country"] = createPartFromString(RegisterVenueActivity.request?.country!!)
            map["venue_type_id"] = createPartFromString(RegisterVenueActivity.request?.venueTypeId?.toString() ?: "")
            map["lat"] = createPartFromString(RegisterVenueActivity.request?.lat ?: "")
            map["lng"] = createPartFromString(RegisterVenueActivity.request?.lng ?: "")
            map["bonus_offer"] = createPartFromString(binding.bounsId.text.toString() ?: "")
            map["email"] = createPartFromString(RegisterVenueActivity.request?.email ?: "")
            map["_method"] = createPartFromString("PUT")
            val list = RegisterVenueActivity.listOfAmenitie?.map { it.id }
            Log.e("list.toString()", list.toString().removePrefix("[").removeSuffix("]"))
            map["services"] =
                    createPartFromString(list.toString().removePrefix("[").removeSuffix("]"))
            showProgress(true)
            val addImagesPart = ArrayList<MultipartBody.Part>()
            RegisterVenueActivity.request?.images?.mapIndexed { ind, s ->
                val imagesPart = requestUploadImage(s, "images[$ind]")
                addImagesPart.add(imagesPart!!)
            }
            if (isNetworkAvailable()) {
                if (addImagesPart.isNullOrEmpty())
                    viewModel?.venueUpdate(map, "Bearer " + user?.token, null,venue_id)
                else
                    viewModel?.venueUpdate(map, "Bearer " + user?.token, addImagesPart,venue_id)
            } else {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.network_unavailble))
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
        binding = FragmentBonusBinding.inflate(layoutInflater)
        viewModel = setUpVM() as VenueViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        attachObserver()

    }


    private fun attachObserver() {
        this.viewModel?.apiVenueResponse?.observe(viewLifecycleOwner, Observer {
            showProgress(true)
            venueRes = it
            val user = AppPreferences.getInstance(requireContext())?.user
            if (isNetworkAvailable()) {
                availityReq?.let {
                    it.venueId = venueRes?.data?.id
                    viewModel?.addvenueAvailabilty("Bearer " + user?.token, it)
                }
            } else {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.network_unavailble))
            }
        })
        this.viewModel?.apiVenueAvailibiltyResponse?.observe(viewLifecycleOwner, Observer {
            (context as EditVenueActivity).showUpSnackError("venue updated")
            showProgress(false)
            (context as EditVenueActivity).onBackPressed()
        })
        this.viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            (context as EditVenueActivity).showUpSnackError(it)
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

}
