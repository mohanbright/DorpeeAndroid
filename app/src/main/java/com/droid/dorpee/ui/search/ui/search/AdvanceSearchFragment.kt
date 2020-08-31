package com.droid.dorpee.ui.search.ui.search

import `in`.madapps.placesautocomplete.listener.OnPlacesDetailsListener
import `in`.madapps.placesautocomplete.model.Place
import `in`.madapps.placesautocomplete.model.PlaceDetails
import android.Manifest
import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.SeekBar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.FragmentAdvanceSearchBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.baseClasses.BaseFragment
import com.droid.dorpee.ui.search.DashboardActivity
import com.droid.dorpee.ui.search.adapter.AmenitiDashAdapter
import com.droid.dorpee.ui.search.adapter.EnvironmentDashAdapter
import com.droid.dorpee.ui.search.adapter.TypeDashAdapter
import com.droid.dorpee.ui.venue.AddWorkSpaceActivity.Companion.listOfAsset
import com.droid.dorpee.utils.NEAR_ME
import com.droid.dorpee.utils.log
import com.droid.dorpee.utils.place.CustomPlaceApi
import com.droid.dorpee.utils.place.CustomPlacesAdapter
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showLocationDialog
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.OnSuccessListener
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog
import com.wdullaer.materialdatetimepicker.time.TimePickerDialog
import okhttp3.RequestBody
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


class AdvanceSearchFragment : BaseFragment() {
    private val TAG = "AdvanceSearchFragment"
    private var place: Place? = null
    private var placeData: PlaceDetails? = null
    private lateinit var placesApi: CustomPlaceApi
    private var date: String = ""
    private lateinit var binding: FragmentAdvanceSearchBinding
    var viewModel: SearchViewModel? = null
    var openingTime: String = ""
    var closingTime: String = ""
    private var latitude: Double = 0.0
    private var longitude: Double = 0.0
    private var fusedLocationClient: FusedLocationProviderClient? = null
    private var searchCondition: String = ""

    companion object {
        var searchAddress: String? = null
    }

    override fun bindData() {
        binding.seekBar.max = 500
        binding.seekBar.progress = 500
        val offset =
                (binding.seekBar.width - binding.seekBar.paddingLeft - binding.seekBar.paddingRight) * binding.seekBar.progress / binding.seekBar.max
        binding.textView75.text = binding.seekBar.progress.toString()
        val below =
                binding.seekBar.x + binding.seekBar.paddingLeft + offset - binding.textView75.width / 2
        log(below)
        binding.textView75.x = below
        binding.fromTimeId.text = openingTime
        binding.toTimeId.text = closingTime

    }

    override fun initListeners() {
        binding.cancelId.setOnClickListener {
            val navController =
                    Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
            navController.navigate(R.id.navigation_search)
        }
        binding.textViewClearSearch.setOnClickListener {
            (activity as DashboardActivity).clearFragment()
        }
        binding.advanceSearchId.setOnClickListener {
            val vis = binding.advanceLayout.visibility
            if (vis == View.VISIBLE) {
                binding.advanceLayout.visibility = View.GONE
                binding.advanceSearchId.text = getString(R.string.advanced_search)
            } else {
                binding.advanceLayout.visibility = View.VISIBLE
                binding.advanceSearchId.text = getString(R.string.basic_search)
            }
        }
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val offset =
                        (seekBar?.width!! - seekBar.paddingLeft - seekBar.paddingRight) * progress / seekBar.max
                binding.textView75.text = progress.toString()
                val below = seekBar.x + seekBar.paddingLeft + offset - binding.textView75.width / 2
                binding.textView75.x = below
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
        binding.seekBar.progress = 400
        binding.seekBar.progress = 500
        binding.fromLayout.setOnClickListener {
            val dpd = TimePickerDialog.newInstance({ view, hourOfDay, minute, second ->
                openingTime = String.format("%02d:%02d", hourOfDay, minute)
                binding.fromTimeId.setText(openingTime)
            }, 12, 0, 0, false)
            AppPreferences.getInstance(requireContext())!!.setOpeningDate(openingTime)
            dpd.show(childFragmentManager, "DatepickerFromdialog")
        }
        binding.toLayout.setOnClickListener {
            val dpd = TimePickerDialog.newInstance({ view, hourOfDay, minute, second ->
                closingTime = String.format("%02d:%02d", hourOfDay, minute)
                binding.toTimeId.setText(closingTime)
            }, 12, 0, 0, false)
            AppPreferences.getInstance(requireContext())!!.setclosingDate(closingTime)
            dpd.show(childFragmentManager, "DatepickerTodialog")
        }
        val now = Calendar.getInstance()

        date =
                "${now.get(Calendar.DAY_OF_MONTH)}/${now.get(Calendar.MONTH) + 1}/${now.get(Calendar.YEAR)}"
        binding.dateId.text = date
        binding.dateLayout.setOnClickListener {
            val dpd = DatePickerDialog.newInstance { view, year, monthOfYear, dayOfMonth ->
                date = "$dayOfMonth/${monthOfYear + 1}/$year"
                binding.dateId.text = date
                AppPreferences.getInstance(requireContext())!!.setSelectedDate(date)
            }
            dpd.locale = Locale.getDefault()
            dpd.locale = Locale.getDefault()
            val calender = Calendar.getInstance()
            val today = calender.timeInMillis
            val previousDays = Date(today - 1000)
            dpd.minDate = (toCalendar(previousDays))
            dpd.show(childFragmentManager, "Datepdialog")
        }

        binding.buttonsearch.setOnClickListener {
            val user = AppPreferences.getInstance(requireContext())?.user
            val visible = binding.advanceSearchId.visibility
//            if (user != null) {
            if (binding.advanceSearchId.text == getString(R.string.basic_search)) {
                advanceSearch()
            } else {
                basicSearch()
            }
            /* } else {
                 basicSearch()
             }*/
        }

        binding.imageViewProfilePic.setOnClickListener {
            val user = AppPreferences.getInstance(requireContext())?.user?.user
            val navController =
                    Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
                if (user != null) {
                    if (user.role != null && user.role!!.isNotEmpty()) {
                        val roleList = user.role?.map { it.id!! }
                        if (!roleList.isNullOrEmpty() && roleList.contains(2) && roleList.contains(3)) {
                            navController.navigate(R.id.action_navigation_advance_search_to_venueDashFragment)
                        } else {
                            navController.navigate(R.id.action_navigation_advance_search_to_personalDashFragment)
                        }
                    }
                }
            }
        }


    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(SearchViewModel())
        return ViewModelProvider(this, provider).get(SearchViewModel::class.java)
    }

    fun toCalendar(date: Date?): Calendar? {
        val cal = Calendar.getInstance()
        cal.time = date!!
        return cal
    }


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAdvanceSearchBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = setUpVM() as SearchViewModel
        viewModel?.apiSearchResponse?.value = null
        val user = AppPreferences.getInstance(requireContext())?.user
        if (user != null) {
            binding.cancelId.visibility = View.GONE
            binding.imageViewProfilePic.visibility = View.VISIBLE
//            binding.advanceSearchId.visibility = View.VISIBLE
            Glide
                    .with(this)
                    .load(user.user?.avatar ?: "")
                    .dontAnimate()
                    .centerCrop()
                    .circleCrop()
                    .placeholder(R.drawable.profile_holder)
                    .into(binding.imageViewProfilePic)

        } else {
            binding.cancelId.visibility = View.VISIBLE
            binding.imageViewProfilePic.visibility = View.GONE
//            binding.advanceSearchId.visibility = View.INVISIBLE
        }

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(requireContext())

        listOfAsset = ArrayList()
        val scale = this.resources.displayMetrics.density;
        binding.checkboxId.setPadding(
                binding.checkboxId.paddingLeft + (10.0f * scale + 0.5f).toInt(),
                binding.checkboxId.paddingTop,
                binding.checkboxId.paddingRight,
                binding.checkboxId.paddingBottom
        )

        placesApi =
                CustomPlaceApi.Builder().apiKey(getString(R.string.maps_key)).build(requireActivity())

        binding.locationId.setAdapter(CustomPlacesAdapter(requireContext(), placesApi))
        binding.locationId.onItemClickListener = AdapterView.OnItemClickListener { parent, _, position, _ ->
            hideKeyboard(requireContext())
            place = parent.getItemAtPosition(position) as Place
            city = ""
            binding.locationId.setText(place?.description)
            binding.locationId.performCompletion()
            placeData = null
            emptyAdress()
            if (place?.id == NEAR_ME) {
                binding.locationId.setText("")
                onLocationPermission()
            } else {
                binding.locationId.setText(place?.description)
                getPlaceDetails(place?.id!!)
            }
        }
        binding.locationId.setOnClickListener {
            val txt = binding.locationId.text
            if (txt.trim().isEmpty())
                binding.locationId.setText("         ")
        }
        binding.locationId.setOnFocusChangeListener { v, hasFocus ->
            val txt = binding.locationId.text
            if (hasFocus) {
                if (txt.trim().isEmpty())
                    binding.locationId.setText("         ")
            } else {
                if (txt.trim().isEmpty())
                    binding.locationId.setText("")
            }
        }
        setUpEnvironment()
        setUpAmenitie()
        setUpSpaceTypes()
        attachObserver()

    }

    private fun getPlaceDetails(placeId: String) {
        placesApi.fetchPlaceDetails(placeId, object : OnPlacesDetailsListener {
            override fun onError(errorMessage: String) {
                (context as DashboardActivity).showUpSnackError("No suburb found.")
            }

            override fun onPlaceDetailsFetched(placeDetails: PlaceDetails) {
                placeData = placeDetails
                parseAddress(placeDetails.address)
//                binding.locationId.setText(city)
//                binding.locationId.performCompletion()
            }
        })
    }

    private fun basicSearch() {
        if (isNetworkAvailable()) {
            val location = binding.locationId.text.toString()
            val noOfPepole = binding.noOfPeopleId.text.toString()
            val environMentList =
                    if (binding.environmentRecycler.adapter != null)
                        (binding.environmentRecycler.adapter as EnvironmentDashAdapter).environmentList
                    else null
            val typesList = if (binding.spaceRecycler.adapter != null)
                (binding.spaceRecycler.adapter as TypeDashAdapter).typeList
            else null
//            val amenitiList = (binding.amenitiRecycler.adapter as AmenitiDashAdapter).amenitieList
            /*  else if (noOfPepole.isEmpty()) {
                  (context as DashboardActivity).showUpSnackError("enter max number of pepoles")
              }*/
            if (location.isEmpty()) {
                (context as DashboardActivity).showUpSnackError(getString(R.string.select_location))
            } else {
                val assets = listOfAsset?.map { it.id }
                val types = typesList?.map { it.id }
                val environments = environMentList?.map { it.id }
                val mapList = HashMap<String, RequestBody>()
                if (!noOfPepole.isEmpty())
                    mapList["no_of_people"] = createPartFromString(noOfPepole)

                mapList["types"] =
                        createPartFromString(types.toString().removePrefix("[").removeSuffix("]"))
                mapList["start_time"] = createPartFromString(openingTime)
                mapList["end_time"] = createPartFromString(closingTime)
                mapList["date"] = createPartFromString(date)
                mapList["suburb"] = createPartFromString(city)
                searchAddress = city
                mapList["only_ohs"] =
                        if (binding.checkboxId.isChecked) createPartFromString("yes") else createPartFromString(
                                "no"
                        )
                if (place?.id == NEAR_ME && placeData == null) {
                    mapList["lat"] = createPartFromString(latitude.toString())
                    mapList["lng"] = createPartFromString(longitude.toString())
                } else {
                    placeData?.let {
                        mapList["lat"] = createPartFromString(it.lat.toString())
                        mapList["lng"] = createPartFromString(it.lng.toString())
                    }
                }
                searchCondition = "${location}+${date}+${openingTime}+${closingTime}"
                viewModel?.basicSearch(mapList)
            }
        } else {
            (context as DashboardActivity).showUpSnackError(getString(R.string.network_unavailble))
        }
    }


    private fun advanceSearch() {
        if (isNetworkAvailable()) {
            val location = binding.locationId.text.toString()
            val noOfPepole = binding.noOfPeopleId.text.toString()
            val environMentList =
                    if (binding.environmentRecycler.adapter != null)
                        (binding.environmentRecycler.adapter as EnvironmentDashAdapter).environmentList
                    else null
            val typesList = if (binding.spaceRecycler.adapter != null)
                (binding.spaceRecycler.adapter as TypeDashAdapter).typeList
            else null
            val amenitiList = (binding.amenitiRecycler.adapter as AmenitiDashAdapter).amenitieList
            /*  else if (noOfPepole.isEmpty()) {
                  (context as DashboardActivity).showUpSnackError("enter max number of pepoles")
              }*/
            if (location.isEmpty()) {
                (context as DashboardActivity).showUpSnackError(getString(R.string.select_location))
            } else {
                val assets = listOfAsset?.map { it.id }
                val types = typesList?.map { it.id }
                val environments = environMentList?.map { it.id }
                val mapList = HashMap<String, RequestBody>()
                if (!noOfPepole.isEmpty())
                    mapList["no_of_people"] = createPartFromString(noOfPepole)

                mapList["types"] =
                        createPartFromString(types.toString().removePrefix("[").removeSuffix("]"))
                mapList["environments"] =
                        createPartFromString(
                                environments.toString().removePrefix("[").removeSuffix("]")
                        )
                mapList["services"] =
                        createPartFromString(assets.toString().removePrefix("[").removeSuffix("]"))
                mapList["start_time"] = createPartFromString(openingTime)
                mapList["end_time"] = createPartFromString(closingTime)
                mapList["date"] = createPartFromString(date)
                if (place?.id == NEAR_ME && placeData == null) {
                    mapList["lat"] = createPartFromString(latitude.toString())
                    mapList["lng"] = createPartFromString(longitude.toString())
                } else {
                    placeData?.let {
                        mapList["lat"] = createPartFromString(it.lat.toString())
                        mapList["lng"] = createPartFromString(it.lng.toString())
                    }
                }
                mapList["suburb"] = createPartFromString(city)
                searchAddress = city
                val credit = binding.seekBar.progress
                mapList["credits"] = createPartFromString(credit.toString())
                val save_prefrenece = if (binding.switch3.isChecked) "1" else "0"
                mapList["save_search_preferences"] = createPartFromString(save_prefrenece)
                mapList["only_ohs"] =
                        if (binding.checkboxId.isChecked) createPartFromString("yes") else createPartFromString(
                                "no"
                        )
                searchCondition = "${location},${date},${openingTime},${closingTime}"
                val user = AppPreferences.getInstance(requireContext())?.user

                viewModel?.advanceSearch("Bearer " + user?.token ?: "", mapList)
            }
        } else {
            (context as DashboardActivity).showUpSnackError(getString(R.string.network_unavailble))
        }
    }

    override fun onResume() {
        super.onResume()
        /*   if (RegisterVenueActivity.placesAddress != null) {
               binding.locationId.setText(RegisterVenueActivity.placesAddress?.city ?: "")
           }*/
    }

    private fun attachObserver() {
        viewModel?.apiSearchResponse?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            log(it ?: "")
            if (it != null)
                if (!it.data.isNullOrEmpty())
                    Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
                            .navigate(AdvanceSearchFragmentDirections.actionSearchResult(it, searchCondition))
                else
                    (context as DashboardActivity).showUpSnackError("No Result found, search again")
        })
        viewModel?.apiError?.observe(viewLifecycleOwner, Observer {
            showProgress(false)
            (context as DashboardActivity).showUpSnackError(it)
        })
        viewModel?.isLoading?.observe(viewLifecycleOwner, Observer {
            showProgress(it)
        })
    }

    private fun setUpEnvironment() {
        val environment = AppPreferences.getInstance(requireContext())?.environment
        val layoutManager = GridLayoutManager(requireContext(), 2)
        layoutManager.isItemPrefetchEnabled = true
        binding.environmentRecycler.layoutManager = layoutManager
        binding.environmentRecycler.setHasFixedSize(true)
        environment?.let {
            if (!environment.data.isNullOrEmpty())
                binding.environmentRecycler.adapter =
                        EnvironmentDashAdapter(
                                requireContext(),
                                environment.data
                        )

            (binding.environmentRecycler.adapter as EnvironmentDashAdapter).itemClick = {
                (binding.environmentRecycler.adapter as EnvironmentDashAdapter).environmentList?.mapIndexed { pos, week ->
                    val checked =
                            (binding.environmentRecycler.adapter as EnvironmentDashAdapter).environmentList!![pos].checked
                    if (pos == it && !checked) {
                        (binding.environmentRecycler.adapter as EnvironmentDashAdapter).environmentList!![pos].checked =
                                true
                    } else if (pos == it && checked) {
                        (binding.environmentRecycler.adapter as EnvironmentDashAdapter).environmentList!![pos].checked =
                                false
                    } else {
                        (binding.environmentRecycler.adapter as EnvironmentDashAdapter).environmentList!![pos].checked = checked
                    }
                }
                (binding.environmentRecycler.adapter as EnvironmentDashAdapter).notifyDataSetChanged()
            }
            (binding.environmentRecycler.adapter as EnvironmentDashAdapter).notifyDataSetChanged()
        }
    }

    private fun setUpAmenitie() {
        val list = AppPreferences.getInstance(requireContext())?.services
        val layoutManager = LinearLayoutManager(requireContext())
        layoutManager.isItemPrefetchEnabled = true
        binding.amenitiRecycler.layoutManager = layoutManager
        binding.amenitiRecycler.setHasFixedSize(true)
        list?.let {
            binding.amenitiRecycler.adapter =
                    AmenitiDashAdapter(requireContext(), it)
        }
    }

    private fun setUpSpaceTypes() {
        val type = AppPreferences.getInstance(requireContext())?.types
        val layoutManager = GridLayoutManager(requireContext(), 2)
        layoutManager.isItemPrefetchEnabled = true
        binding.spaceRecycler.layoutManager = layoutManager
        binding.spaceRecycler.setHasFixedSize(true)
        type?.let {
            if (!type.data.isNullOrEmpty())
                binding.spaceRecycler.adapter =
                        TypeDashAdapter(requireContext(), type.data)

            (binding.spaceRecycler.adapter as TypeDashAdapter).itemClick = {
                (binding.spaceRecycler.adapter as TypeDashAdapter).typeList?.mapIndexed { pos, week ->
                    val checked =
                            (binding.spaceRecycler.adapter as TypeDashAdapter).typeList!![pos].checked
                    if (pos == it && !checked) {
                        (binding.spaceRecycler.adapter as TypeDashAdapter).typeList!![pos].checked =
                                true
                    } else if (pos == it && checked) {
                        (binding.spaceRecycler.adapter as TypeDashAdapter).typeList!![pos].checked =
                                false
                    } else {
                        (binding.spaceRecycler.adapter as TypeDashAdapter).typeList!![pos].checked =
                                checked
                    }
                }
                (binding.spaceRecycler.adapter as TypeDashAdapter).notifyDataSetChanged()
            }
            (binding.spaceRecycler.adapter as TypeDashAdapter).notifyDataSetChanged()
        }
    }

    private fun showProgress(it: Boolean?) {
        it?.let {
            if (it) {
                binding.loginLoader.visibility = View.VISIBLE
                binding.buttonsearch.visibility = View.INVISIBLE
            } else {
                binding.loginLoader.visibility = View.INVISIBLE
                binding.buttonsearch.visibility = View.VISIBLE
            }
        }
    }

    private fun onLocationPermission() {
        Dexter.withActivity((context as DashboardActivity))
                .withPermissions(
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                )
                .withListener(object : MultiplePermissionsListener {
                    override fun onPermissionsChecked(report: MultiplePermissionsReport) {
                        if (report.areAllPermissionsGranted()) {
                            (activity as BaseActivity).showLocationDialog()
                            focusOnCurrentLocation()
                        } else {
                            (context as DashboardActivity).showUpSnackError(
                                    "You need to allow location permission for getting new orders"
                            )
                        }
                    }

                    override fun onPermissionRationaleShouldBeShown(
                            permissions: List<PermissionRequest>,
                            token: PermissionToken
                    ) {
                        token.continuePermissionRequest()
                    }
                }).check()
    }

    @SuppressLint("MissingPermission")
    private fun focusOnCurrentLocation() {
        fusedLocationClient?.lastLocation?.addOnSuccessListener(
                (context as DashboardActivity),
                OnSuccessListener { location ->
                    if (location == null) {
                        Log.w("focusOnCurrentLocation", "onSuccess:null")
                        return@OnSuccessListener
                    }

                    latitude = location.latitude
                    longitude = location.longitude
                    binding.locationId.setText(place?.description)
                    binding.locationId.performCompletion()
                })?.addOnFailureListener((context as DashboardActivity)) { e ->
            Log.w(
                    "search",
                    "getLastLocation:onFailure",
                    e
            )
        }
    }
}
