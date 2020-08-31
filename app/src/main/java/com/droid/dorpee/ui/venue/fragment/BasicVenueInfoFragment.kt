package com.droid.dorpee.ui.venue.fragment

import `in`.madapps.placesautocomplete.listener.OnPlacesDetailsListener
import `in`.madapps.placesautocomplete.model.Place
import `in`.madapps.placesautocomplete.model.PlaceDetails
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentBasicVenueInfoBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.venue.RegisterVenueActivity
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.IMAGE_REQUEST_CODE
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.mResults
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.placesAddress
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.request
import com.droid.dorpee.ui.venue.RequestVenue
import com.droid.dorpee.ui.venue.viewmodel.VenueViewModel
import com.droid.dorpee.utils.NEAR_ME
import com.droid.dorpee.utils.isValidEmail
import com.droid.dorpee.utils.log
import com.droid.dorpee.utils.place.CustomPlaceApi
import com.droid.dorpee.utils.place.CustomPlacesAdapter
import com.droid.dorpee.utils.preference.AppPreferences
import com.squareup.picasso.Picasso
import com.zfdang.multiple_images_selector.ImagesSelectorActivity
import com.zfdang.multiple_images_selector.SelectorSettings


class BasicVenueInfoFragment : BaseFragment() {
    private var venueTypeId: Int = 0
    private lateinit var binding: FragmentBasicVenueInfoBinding
    var viewModel: VenueViewModel? = null
    private var place: Place? = null
    private var placeData: PlaceDetails? = null
    private lateinit var placesApi: CustomPlaceApi
    private val TAG = "BasicVenueInfoFragment"
    override fun bindData() {
        val listOfTab = arrayListOf(true, false, false, false, false, false)
        (context as RegisterVenueActivity).setUpTabline(listOfTab)
    }

    override fun initListeners() {
        binding.basicInfo.setOnClickListener {
            if (venueTypeId == 0) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.select_venue_type))
            } else if (binding.venueName.text.isNullOrEmpty()) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.enter_venue_name))
            } else if (binding.address.text.isNullOrEmpty()) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.enter_address))
            } else if (placesAddress == null || binding.address.text.isNullOrEmpty()) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.enter_address))
            } else if (placesAddress?.state?.isEmpty()!!) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.enter_state))
            } else if (placesAddress?.city?.isEmpty()!!) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.city))
            } else if (placesAddress?.address1?.isEmpty()!!) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.enter_streat_address))
            } else if (placesAddress?.zipcode?.isEmpty()!!) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.please_enter_zip_code))
            } else if (binding.description.text?.isEmpty()!!) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.enter_description))
            } else if (binding.email.text.isNullOrEmpty() || binding.email.text?.toString()?.isValidEmail() == false) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.enter_valid_email))
            } else if (mResults == null || mResults?.isEmpty()!!) {
                (context as RegisterVenueActivity).showUpSnackError(getString(R.string.upload_atleast_one_image))
            } else {
                request = null
                request = RequestVenue()
                request?.name = binding.venueName.text.toString()
                request?.description = binding.description.text.toString()
                request?.address = "${placesAddress?.address1},${placesAddress?.address2}"
                request?.suburb = placesAddress?.city
                request?.country = placesAddress?.country
                request?.state = placesAddress?.state
                request?.postcode = placesAddress?.zipcode
                request?.images = mResults
                request?.venueTypeId = venueTypeId
                request?.email = binding.email.text.toString()

                placeData?.let {
                    request?.lat = it.lat.toString()
                    request?.lng = it.lng.toString()
                }
                (context as RegisterVenueActivity).loadFragment(VenueAmenitieFragment())
            }
        }

        binding.buttonUpload.setOnClickListener {
            val intent = Intent(context, ImagesSelectorActivity::class.java)
            intent.putExtra(SelectorSettings.SELECTOR_MAX_IMAGE_NUMBER, 4)
            intent.putExtra(SelectorSettings.SELECTOR_SHOW_CAMERA, true)
            intent.putStringArrayListExtra(
                    SelectorSettings.SELECTOR_INITIAL_SELECTED_LIST,
                    mResults
            )
            (context as RegisterVenueActivity).startActivityForResult(intent, IMAGE_REQUEST_CODE)
        }

        placesApi =
                CustomPlaceApi.Builder().apiKey(getString(R.string.maps_key)).build(requireActivity())

        binding.address.setAdapter(CustomPlacesAdapter(requireContext(), placesApi, false))
        binding.address.onItemClickListener =
                AdapterView.OnItemClickListener { parent, _, position, _ ->
                    hideKeyboard(requireContext())
                    place = parent.getItemAtPosition(position) as Place
                    city = ""
                    binding.address.setText(place?.description)
                    binding.address.performCompletion()
                    placeData = null
                    emptyAdress()
                    if (place?.id == NEAR_ME) {
                        binding.address.setText("")
//                        onLocationPermission()
                    } else {
                        binding.address.setText(place?.description)
                        getPlaceDetails(place?.id!!)
                    }
                }
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(VenueViewModel())
        return ViewModelProvider(this, provider).get(VenueViewModel::class.java)
    }

    private fun getPlaceDetails(placeId: String) {
        placesApi.fetchPlaceDetails(placeId, object : OnPlacesDetailsListener {
            override fun onError(errorMessage: String) {
                (context as RegisterVenueActivity).showUpSnackError("No suburb found.")
            }

            override fun onPlaceDetailsFetched(placeDetails: PlaceDetails) {
                placeData = placeDetails
                parseAddress(placeDetails.address)
            }
        })
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBasicVenueInfoBinding.inflate(layoutInflater)
        viewModel = setUpVM() as VenueViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val venTypes = AppPreferences.getInstance(requireContext())?.venueTypes
        if (!venTypes?.data.isNullOrEmpty()) {
            val list: ArrayList<String>? = venTypes?.data?.map {
                it.type ?: ""
            } as ArrayList<String>?
            list?.let {
                list.add(0, getString(R.string.select_venue_type))
//                      adapter.setItems(list)
                binding.spinnerVenueType.apply {
                    setItems(list)
                    selectItemByIndex(0)
                    lifecycleOwner = viewLifecycleOwner
//                          selectItemByIndex(0)
                    setOnSpinnerItemSelectedListener<String> { index, text ->
                        if (index != 0) {
                            venTypes?.data?.map {
                                if (it.type == text) {
                                    venueTypeId = it.id!!
                                }
                            }
                        } else {
                            venueTypeId = 0
                        }
                    }
                }
            }
        }

        (activity as RegisterVenueActivity).venueTypes = {
            val venueTypes = AppPreferences.getInstance(requireContext())?.venueTypes
            if (!venueTypes?.data.isNullOrEmpty()) {
                val list: ArrayList<String>? = venueTypes?.data?.map {
                    it.type ?: ""
                } as ArrayList<String>?
                list?.let {
                    list.add(0, getString(R.string.select_venue_type))
//                      adapter.setItems(list)
                    binding.spinnerVenueType.apply {
                        setItems(list)
                        selectItemByIndex(0)
                        lifecycleOwner = viewLifecycleOwner
//                          selectItemByIndex(0)
                        setOnSpinnerItemSelectedListener<String> { index, text ->
                            if (index != 0) {
                                venueTypes?.data?.map {
                                    if (it.type == text) {
                                        venueTypeId = it.id!!
                                    }
                                }
                            } else {
                                venueTypeId = 0
                            }
                        }
                    }
                }
            }
        }

        val user = AppPreferences.getInstance(requireContext())?.user?.user
        if (user != null) {
            binding.email.setText(user.email ?: "")
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onResume() {
        super.onResume()
        if (placesAddress != null) {
            binding.address.setText("${placesAddress?.address1!!},${placesAddress?.state!!} ,${placesAddress?.city!!},${placesAddress?.zipcode!!}")
        }
        mResults?.let {
            it.mapIndexed { index, s ->
                log("mResults", it)
                when (index) {
                    0 -> Picasso.get().load("file://$s").into(binding.imageView4)
                    1 -> Picasso.get().load("file://$s").into(binding.imageView6)
                    2 -> Picasso.get().load("file://$s").into(binding.imageView7)
                    3 -> Picasso.get().load("file://$s").into(binding.imageView8)
                    else -> {
                    }
                }
            }
        }
    }


}
