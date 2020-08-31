package com.droid.dorpee.ui.search

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityDashboardBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.search.viewmodel.DashboardViewModel
import com.droid.dorpee.ui.venue.PlaceAddress
import com.droid.dorpee.ui.venue.RegisterVenueActivity
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.AUTOCOMPLETE_REQUEST_CODE
import com.droid.dorpee.ui.venue.adapter.Amenitie
import com.droid.dorpee.ui.venue.adapter.Asset
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.droid.dorpee.utils.toJson
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.AutocompleteActivity
import com.zfdang.multiple_images_selector.SelectorSettings
import java.util.*


class DashboardActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivityDashboardBinding
    var viewModel: DashboardViewModel? = null
    var address1 = ""
    var address2 = ""
    var city = ""
    var state = ""
    var zipcode = ""
    var country = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = setUpVM() as DashboardViewModel
        val navController = findNavController(R.id.nav_host_fragment)
        val user = AppPreferences.getInstance(this)?.user?.user
        binding.navView.itemIconTintList = null
        binding.navView.setupWithNavController(navController)
        if (user != null) {
            navController.navigate(R.id.navigation_advance_search)
        } else {
            navController.navigate(R.id.navigation_search)
        }
        binding.navView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_search -> {
                    val user1 = AppPreferences.getInstance(this)?.user?.user
                    if (user1 != null) {
                        navController.navigate(R.id.navigation_advance_search)
                    } else {
                        navController.navigate(R.id.navigation_search)
                    }
                }
                R.id.navigation_booking -> {
                    val user1 = AppPreferences.getInstance(this)?.user?.user

                    if (user1 != null) {
                        val roleList = user1.role?.map { it.id!! }
                        if (!roleList.isNullOrEmpty() && roleList.contains(2) && roleList.contains(3)) {
                            navController.navigate(R.id.navigation_bookingVenue)
                        } else {
                            navController.navigate(R.id.navigation_booking)
                        }
                    } else {
                        navController.navigate(R.id.navigation_login)
                    }
                }
                R.id.navigation_check_in -> {
                    val user1 = AppPreferences.getInstance(this)?.user?.user
                    if (user1 != null) {
                        if (user1.role?.size != 0) {
                            navController.navigate(R.id.navigation_check_in)
                        } else {
                            navController.navigate(R.id.navigation_login)
                        }
                    } else {
                        navController.navigate(R.id.navigation_login)
                    }
                }
            }
            true
        }

        if (isNetworkAvailable()) {
            viewModel?.getServices()
            viewModel?.getTypes()
            viewModel?.getEnvironment()
            viewModel?.getAssets()
            viewModel?.getInterests()
            viewModel?.getVenueTypes()

        }
        attachObserver()
    }

    override fun bindData() {}

    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(DashboardViewModel())
        return ViewModelProvider(this, provider).get(DashboardViewModel::class.java)
    }

    private fun attachObserver() {
        this.viewModel?.apiServicesResponse?.observe(this, Observer {
            val ss = HashSet<String>()
            val list = it.data
            list?.map {
                it.category?.let {
                    ss.add(it)
                }
            }
            val newList = ArrayList<Amenitie>()
            ss.map { s ->
                val amList = list?.filter { s == it.category }
                newList.add(Amenitie(s, amList))
            }
            AppPreferences.getInstance(this)?.services = newList
        })
        this.viewModel?.apiAssetsResponse?.observe(this, Observer {
            val ss = HashSet<String>()
            val list = it.data
            list?.map {
                it.category?.let {
                    ss.add(it)
                }
            }
            val newList = ArrayList<Asset>()
            ss.map { s ->
                val amList = list?.filter { s == it.category }
                newList.add(Asset(s, amList))
            }
            AppPreferences.getInstance(this)?.assets = newList
        })
        this.viewModel?.apiTypesResponse?.observe(this, Observer {
            AppPreferences.getInstance(this)?.types = it
        })
        this.viewModel?.apiInterestResponse?.observe(this, Observer {
            AppPreferences.getInstance(this)?.interests = it
        })
        this.viewModel?.apiVeneueTypes?.observe(this, Observer {
            AppPreferences.getInstance(this)?.venueTypes = it
        })
        this.viewModel?.apiEnvironmentResponse?.observe(this, Observer {
            AppPreferences.getInstance(this)?.environment = it
        })
        this.viewModel?.apiError?.observe(this, Observer {
//            showProgress(false)
            /* showSnackBarCustom(
                 it,
                 binding.alertView,
                 ContextCompat.getColor(this, R.color.colorPrimaryDark)
             )*/
        })
        this.viewModel?.isLoading?.observe(this, Observer {
//            showProgress(it)
        })

    }

    override fun onClick(v: View?) {
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == AUTOCOMPLETE_REQUEST_CODE) {
            when (resultCode) {
                Activity.RESULT_OK -> {
                    val place = Autocomplete.getPlaceFromIntent(data!!)
                    Log.i(
                            "SearchPlacesActivity",
                            "Place: " + place.name + ", " + place.addressComponents!!.toJson() + ", " + place.address
                    )
                    val location = place.latLng
                    val addressInfo = jsonobjectToClassObject(place.addressComponents!!.toJson())
                    for (i in 0 until addressInfo.zza?.size!!) {
                        when {
                            addressInfo.zza?.get(i)?.zzc == "street_number" -> address1 =
                                    addressInfo.zza?.get(i)?.zza!!
                            addressInfo.zza?.get(i)?.zzc == "route" -> {
                                val pre = address1
                                val curr = pre + " " + addressInfo.zza?.get(i)?.zza!!
                                address1 = curr.trim()
                            }
                            addressInfo.zza?.get(i)?.zzc == "locality" -> city =
                                    addressInfo.zza?.get(i)?.zza!!
                            addressInfo.zza?.get(i)?.zzc == "administrative_area_level_2" -> address2 =
                                    addressInfo.zza?.get(i)?.zza!!
                            addressInfo.zza?.get(i)?.zzc == "administrative_area_level_1" -> state =
                                    addressInfo.zza?.get(i)?.zza!!
                            addressInfo.zza?.get(i)?.zzc == "country" -> country =
                                    addressInfo.zza?.get(i)?.zza!!
                            addressInfo.zza?.get(i)?.zzc == "postal_code" -> zipcode =
                                    addressInfo.zza?.get(i)?.zza!!
                        }
                    }
                    Log.e("addressInfo", addressInfo.toJson())
                    RegisterVenueActivity.placesAddress =
                            PlaceAddress(address1, address2, city, state, zipcode, country)
                }
                AutocompleteActivity.RESULT_ERROR -> {
                    val status = Autocomplete.getStatusFromIntent(data!!)
                    showSnackBarCustom(
                            "Error: " + status.statusMessage,
                            binding.alertView, ContextCompat.getColor(this, R.color.colorError)
                    )
                    Log.e("SearchPlacesActivity", status.statusMessage!!)
                }
                Activity.RESULT_CANCELED -> {
                }
            }
        } else if (requestCode == RegisterVenueActivity.IMAGE_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                RegisterVenueActivity.mResults =
                        data?.getStringArrayListExtra(SelectorSettings.SELECTOR_RESULTS)
                assert(RegisterVenueActivity.mResults != null)
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }

    fun setBottomNavUnchecked() {
        binding.navView.apply {
            menu.setGroupCheckable(0, true, false)
            for (i in 0 until menu.size()) {
                menu.getItem(i).isChecked = false
            }
            menu.setGroupCheckable(0, true, true)
        }
    }

    fun clearFragment() {
        val navController = findNavController(R.id.nav_host_fragment)
        navController.navigate(R.id.navigation_advance_search)
    }

    fun afterLogin() {
        val navController = findNavController(R.id.nav_host_fragment)
        navController.navigateUp()
        navController.navigate(R.id.navigation_advance_search)
    }
}
