package com.droid.dorpee.ui.venue.fragment

import `in`.madapps.placesautocomplete.listener.OnPlacesDetailsListener
import `in`.madapps.placesautocomplete.model.Address
import `in`.madapps.placesautocomplete.model.Place
import `in`.madapps.placesautocomplete.model.PlaceDetails
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentEditBasicVenueInfoBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.venue.EditVenueActivity
import com.droid.dorpee.ui.venue.EditVenueActivity.Companion.venueData
import com.droid.dorpee.ui.venue.PlaceAddress
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.mResults
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.placesAddress
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.request
import com.droid.dorpee.ui.venue.RequestVenue
import com.droid.dorpee.ui.venue.venueresponse.Data
import com.droid.dorpee.ui.venue.viewmodel.VenueViewModel
import com.droid.dorpee.utils.*
import com.droid.dorpee.utils.place.CustomPlaceApi
import com.droid.dorpee.utils.place.CustomPlacesAdapter
import com.droid.dorpee.utils.preference.AppPreferences
import com.squareup.picasso.Picasso
import com.squareup.picasso.Target
import com.zfdang.multiple_images_selector.ImagesSelectorActivity
import com.zfdang.multiple_images_selector.SelectorSettings
import org.jetbrains.anko.runOnUiThread
import java.io.File
import java.io.IOException


class EditBasicVenueInfoFragment : BaseFragment() {
    private var addedImage: Boolean? = null
    private var venueTypeId: Int = 0
    private lateinit var binding: FragmentEditBasicVenueInfoBinding
    var viewModel: VenueViewModel? = null
    private var place: Place? = null
    private var placeData: PlaceDetails? = null
    private lateinit var placesApi: CustomPlaceApi
    private val TAG = "EditBasicVenueInfoFrag"
    override fun bindData() {
        val listOfTab = arrayListOf(true, false, false, false)

        (context as EditVenueActivity).setUpTabline(listOfTab)
    }

    private fun setWorkSpaceImages() {

        mResults?.let {
            addedImage = true
            Picasso.get().load(R.drawable.placeholder).into(binding.imageViewAdd1)
            Picasso.get().load(R.drawable.placeholder).into(binding.imageViewAdd2)
            Picasso.get().load(R.drawable.placeholder).into(binding.imageViewAdd3)
            Picasso.get().load(R.drawable.placeholder).into(binding.imageViewAdd4)
            binding.firstRemoveImg.visibility = View.GONE
            binding.secondRemoveImg.visibility = View.GONE
            binding.thirdRemoveImg.visibility = View.GONE
            binding.fourthRemoveImg.visibility = View.GONE

            it.mapIndexed { index, s ->
                log("mResults", it)
                when (index) {
                    0 -> {
                        Picasso.get().load("file://$s").into(binding.imageViewAdd1)
                        binding.firstRemoveImg.visibility = View.VISIBLE

                    }
                    1 -> {
                        Picasso.get().load("file://$s").into(binding.imageViewAdd2)
                        binding.secondRemoveImg.visibility = View.VISIBLE

                    }
                    2 -> {
                        Picasso.get().load("file://$s").into(binding.imageViewAdd3)
                        binding.thirdRemoveImg.visibility = View.VISIBLE

                    }
                    3 -> {
                        Picasso.get().load("file://$s").into(binding.imageViewAdd4)
                        binding.fourthRemoveImg.visibility = View.VISIBLE

                    }
                    else -> {
                    }
                }
            }
        }
    }

    private val imagesResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
//            if (resultCode == Activity.RESULT_OK) {
            mResults = result.data?.getStringArrayListExtra(SelectorSettings
                    .SELECTOR_RESULTS)
            Log.e("imResult", "imagesResult: ${mResults?.toJson()}")
            setWorkSpaceImages()
//            if (!image.isNullOrEmpty() && mResults != null)
//                mResults?.add(image[mResults?.size?.minus(1)?:0])
            assert(mResults != null)
//            }
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mResults = ArrayList(4)
        venueData?.let {
            binding.venueName.setText(it.name ?: "")
            binding.description.setText(it.description ?: "")
            binding.email.setText(it.email ?: "")
            it.images?.mapIndexed { index, s ->
                addedImage = true
                Log.e("mResults", "bindData: $s")
                when (index) {
                    0 -> saveImageFromUrl(s, binding.imageViewAdd1, index, binding.firstRemoveImg)
                    1 -> saveImageFromUrl(s, binding.imageViewAdd2, index, binding.secondRemoveImg)
                    2 -> saveImageFromUrl(s, binding.imageViewAdd3, index, binding.thirdRemoveImg)
                    3 -> saveImageFromUrl(s, binding.imageViewAdd4, index, binding.fourthRemoveImg)
                    else -> {
                    }
                }
            }
            setEditVenueType(it)
            placesAddress = PlaceAddress(it.address ?: "", "", it.suburb ?: "", it.state ?: "",
                    it.postcode ?: "",
                    it.country ?: "")
            val address = Address(longName = "", shortName = "", type = arrayListOf(""))
            placeData = PlaceDetails(lat = it.lat?.toDouble() ?: 0.0, lng = it.lng?.toDouble()
                    ?: 0.0, id = "", url = "", name = "", globalPlusCode = "", address = arrayListOf(address), placeId = "", vicinity = "", compoundPlusCode = "", utcOffset = 1)
        }
    }

    private fun setUploadImage() {
        val intent = Intent(context, ImagesSelectorActivity::class.java)
        intent.putExtra(SelectorSettings.SELECTOR_MAX_IMAGE_NUMBER, mResults?.size?.plus(1))
        intent.putExtra(SelectorSettings.SELECTOR_SHOW_CAMERA, true)
        intent.putStringArrayListExtra(
                SelectorSettings.SELECTOR_INITIAL_SELECTED_LIST,
                mResults
        )
        imagesResult.launch(intent)
    }

    override fun initListeners() {
        binding.basicInfo.setOnClickListener {
            var imag = false
            imag = if (addedImage == null) {
                false
            } else {
                addedImage == true
            }
            if (venueTypeId == 0) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.select_venue_type))
            } else if (binding.venueName.text.isNullOrEmpty()) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.enter_venue_name))
            } else if (binding.address.text.isNullOrEmpty()) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.enter_address))
            } else if (placesAddress == null || binding.address.text.isNullOrEmpty()) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.enter_address))
            } else if (placesAddress?.state?.isEmpty()!!) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.enter_state))
            } else if (placesAddress?.city?.isEmpty()!!) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.city))
            } else if (placesAddress?.address1?.isEmpty()!!) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.enter_streat_address))
            } else if (placesAddress?.zipcode?.isEmpty()!!) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.please_enter_zip_code))
            } else if (binding.description.text?.isEmpty()!!) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.enter_description))
            } else if (binding.email.text.isNullOrEmpty() || binding.email.text?.toString()?.isValidEmail() == false) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.enter_valid_email))
            } else if (!imag) {
                (context as EditVenueActivity).showUpSnackError(getString(R.string.upload_atleast_one_image))
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
                (context as EditVenueActivity).loadFragment(EditVenueAmenitieFragment())
            }
        }


        placesApi = CustomPlaceApi.Builder().apiKey(getString(R.string.maps_key)).build(requireActivity())

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

        binding.imageViewAdd1.setOnClickListener {
            setUploadImage()
//                startActivityForResult(intent, IMAGE_WORK_REQUEST_CODE)
        }
        binding.imageViewAdd2.setOnClickListener {
            setUploadImage()
//                startActivityForResult(intent, IMAGE_WORK_REQUEST_CODE)
        }
        binding.imageViewAdd3.setOnClickListener {
            setUploadImage()
//                startActivityForResult(intent, IMAGE_WORK_REQUEST_CODE)
        }
        binding.imageViewAdd4.setOnClickListener {
            setUploadImage()
//                startActivityForResult(intent, IMAGE_WORK_REQUEST_CODE)
        }
        binding.firstRemoveImg.setOnClickListener {
            mResults?.removeAt(0)
            setWorkSpaceImages()

        }
        binding.secondRemoveImg.setOnClickListener {
            mResults?.removeAt(1)
            setWorkSpaceImages()

        }
        binding.thirdRemoveImg.setOnClickListener {
            mResults?.removeAt(2)
            setWorkSpaceImages()

        }
        binding.fourthRemoveImg.setOnClickListener {
            mResults?.removeAt(3)
            setWorkSpaceImages()

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
                (context as EditVenueActivity).showUpSnackError("No suburb found.")
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
        binding = FragmentEditBasicVenueInfoBinding.inflate(layoutInflater)
        viewModel = setUpVM() as VenueViewModel
        return binding.root
    }

    private fun setEditVenueType(data: Data) {
        val venTypes = AppPreferences.getInstance(requireContext())?.venueTypes
        venueTypeId = data.venueTypeId ?: 0
        var selectedId = 0
        if (!venTypes?.data.isNullOrEmpty()) {
            val list: ArrayList<String>? = venTypes?.data?.mapIndexed { index, it ->
                if (venueTypeId == it.id) {
                    selectedId = index
                }
                it.type ?: ""
            } as ArrayList<String>?
            list?.let {
                list.add(0, getString(R.string.select_venue_type))
                binding.spinnerVenueType.apply {
                    setItems(list)
                    selectItemByIndex(selectedId + 1)
                    lifecycleOwner = viewLifecycleOwner
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
        (activity as EditVenueActivity).venueTypes = {
            val venueTypes = AppPreferences.getInstance(requireContext())?.venueTypes
            if (!venueTypes?.data.isNullOrEmpty()) {
                val list: ArrayList<String>? = venueTypes?.data?.map {
                    it.type ?: ""
                } as ArrayList<String>?
                list?.let {
                    list.add(0, getString(R.string.select_venue_type))
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


    }

    private fun saveImageFromUrl(url: String, imageView: ImageView, index: Int, removeImge: ImageView) {
        Picasso.get().load(url).into(object : Target {
            override fun onPrepareLoad(placeHolderDrawable: Drawable?) {}

            override fun onBitmapFailed(e: java.lang.Exception?, errorDrawable: Drawable?) {
            }

            override fun onBitmapLoaded(bitmap: Bitmap?, from: Picasso.LoadedFrom?) {
                Log.e(TAG, "onBitmapLoaded: loaded")
                Thread(Runnable {
                    val file = File(requireContext().externalCacheDir, url.fileNameWithoutExtn()
                            ?: "image$index")
                    try {
                        Log.e(TAG, "file.exists() : ${file.exists()} ${url.fileNameWithoutExtn()}")

                        if (!file.exists())
                            file.createNewFile()
                        Log.e(TAG, "externalCacheDir: ${file.exists()} ${file.path}")
                        file.writeBitmap(bitmap!!, Bitmap.CompressFormat.JPEG, 100)
                        mResults?.add(file.path)
                        requireContext().runOnUiThread {
                            Picasso.get().load("file://${file.path}").into(imageView)
                            removeImge.visibility = View.VISIBLE
                        }
                        Log.e(TAG, "file.path: ${file.path}")
                    } catch (e: IOException) {
                        Log.e("IOException", e.localizedMessage ?: "")
                    }
                }).start()
            }
        })
    }

    private fun File.writeBitmap(bitmap: Bitmap, format: Bitmap.CompressFormat, quality: Int) {
        outputStream().use { out ->
            bitmap.compress(format, quality, out)
            out.flush()
            out.close()
        }
    }


}
