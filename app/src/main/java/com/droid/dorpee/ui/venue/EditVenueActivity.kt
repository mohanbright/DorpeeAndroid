package com.droid.dorpee.ui.venue

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.Nullable
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityRegisterVenueBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.listOfAmenitie
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.mResults
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.placesAddress
import com.droid.dorpee.ui.venue.RegisterVenueActivity.Companion.request
import com.droid.dorpee.ui.venue.adapter.Amenitie
import com.droid.dorpee.ui.venue.adapter.Asset
import com.droid.dorpee.ui.venue.adapter.TabLineAdapter
import com.droid.dorpee.ui.venue.fragment.EditBasicVenueInfoFragment
import com.droid.dorpee.ui.venue.venueresponse.Data
import com.droid.dorpee.ui.venue.viewmodel.VenueViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.droid.dorpee.utils.showSnackBarCustom
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.AutocompleteActivity


class EditVenueActivity : BaseActivity(), View.OnClickListener {

    private lateinit var binding: ActivityRegisterVenueBinding
    lateinit var viewModel: VenueViewModel

    companion object {
        var venueData: Data? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterVenueBinding.inflate(layoutInflater)
        setContentView(binding.root)
        placesAddress =null
        viewModel = setUpVM() as VenueViewModel
        listOfAmenitie = ArrayList()
        request = RequestVenue()
        mResults = ArrayList(4)

        venueData = intent.getSerializableExtra("venue") as Data
        val listOfTab = arrayListOf(true, false, false, false)
        setUpTabLineHere(listOfTab)

        loadFragment(EditBasicVenueInfoFragment())
        if (isNetworkAvailable()) {
            viewModel.getServices()
            viewModel.getTypes()
            viewModel.getEnvironment()
            viewModel.getAssets()
            viewModel.getVenueTypes()
        } else {
            showUpSnackError(getString(R.string.network_unavailble))
        }

        attachObserver()
    }

    private fun setUpTabLineHere(listOfTab: ArrayList<Boolean>) {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerTabId.layoutManager = layoutManager
        binding.recyclerTabId.adapter = TabLineAdapter(this, listOfTab)
    }

    fun setUpTabline(listOfTab: ArrayList<Boolean>) {
        (binding.recyclerTabId.adapter as TabLineAdapter).setTabList(listOfTab)
    }

    override fun bindData() {}

    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(
                VenueViewModel()
        )
        return ViewModelProvider(this, provider).get(VenueViewModel::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> {
                onBackPressed()
            }
        }
    }

    fun loadFragment(fragment: Fragment?) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragContainer.id, fragment!!)
        fragmentTransaction.commitAllowingStateLoss()
    }

    private fun attachObserver() {
        this.viewModel.apiServicesResponse.observe(this, Observer {
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
        this.viewModel.apiVeneueTypes.observe(this, Observer {
            AppPreferences.getInstance(this)?.venueTypes = it
        })

        this.viewModel.apiAssetsResponse.observe(this, Observer {
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
        this.viewModel.apiTypesResponse.observe(this, Observer {
            AppPreferences.getInstance(this)?.types = it
        })
        this.viewModel.apiEnvironmentResponse.observe(this, Observer {
            AppPreferences.getInstance(this)?.environment = it
        })
        this.viewModel.apiError.observe(this, Observer {
//            showProgress(false)
            showSnackBarCustom(
                    it,
                    binding.alertView,
                    ContextCompat.getColor(this, R.color.colorPrimaryDark)
            )
        })
        this.viewModel.isLoading.observe(this, Observer {
//            showProgress(it)
        })

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, @Nullable data: Intent?) {
        if (requestCode == RegisterVenueActivity.AUTOCOMPLETE_REQUEST_CODE) {
            when (resultCode) {
                Activity.RESULT_OK -> {
                }
                AutocompleteActivity.RESULT_ERROR -> {
                    val status = Autocomplete.getStatusFromIntent(data!!)
                    showSnackBarCustom(
                            "Error: " + status.statusMessage,
                            binding.alertView, ContextCompat.getColor(this, R.color.colorError)
                    )
                    Log.e("SearchPlacesActivity", status.statusMessage ?: "")
                }
                Activity.RESULT_CANCELED -> {
                }
            }
        } else if (requestCode == RegisterVenueActivity.IMAGE_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
               /* mResults = data?.getStringArrayListExtra(SelectorSettings.SELECTOR_RESULTS)
                if (BuildConfig.DEBUG && mResults == null) {
                    error("Assertion failed")
                }*/
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onDestroy() {
        super.onDestroy()
        placesAddress = null
        mResults = null
    }

    fun showUpSnackError(msg: String) {
        showSnackBarCustom(
                msg,
                binding.alertView, ContextCompat.getColor(this, R.color.colorError)
        )
    }

    var venueTypes: (() -> Unit)? = null
}

data class PlaceAddress(
        var address1: String = "",
        var address2: String = "",
        var city: String = "",
        var state: String = "",
        var zipcode: String = "",
        var country: String = ""
)