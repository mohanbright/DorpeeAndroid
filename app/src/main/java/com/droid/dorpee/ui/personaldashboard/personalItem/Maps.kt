package com.droid.dorpee.ui.personaldashboard.personalItem

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityMapsBinding
import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.personaldashboard.models.MDBooking
import com.droid.dorpee.ui.personaldashboard.viewmodel.PersonalViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Maps : BaseActivity(), View.OnClickListener, OnMapReadyCallback {

    private  var mTitle: String?=""
    private var venueDetailLatLng: LatLng? = null
    private lateinit var binding: ActivityMapsBinding
    private lateinit var mMap: GoogleMap
    private var user: User? = null
    var viewModel: PersonalViewModel? = null
    private var booking: MDBooking? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user = AppPreferences.getInstance(this)?.user?.user
        viewModel = setUpVM() as PersonalViewModel
        intent?.extras?.get("data")?.let {
            booking = it as MDBooking?
        }
        intent?.extras?.get("venueDetail")?.let {latlng->
            venueDetailLatLng = latlng as LatLng
            intent?.extras?.get("title")?.let {
                mTitle =  it as String
            }
        }
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

    }

    override fun bindData() {
        Glide
                .with(this)
                .load(user?.avatar)
                .dontAnimate()
                .centerInside()
                .circleCrop()
                .placeholder(R.drawable.profile_holder)
                .into(binding.imageViewProfilePic)
    }

    override fun initListeners() {
    }

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(PersonalViewModel())
        return ViewModelProvider(this, provider).get(PersonalViewModel::class.java)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        // Add a marker in Sydney and move the camera
        venueDetailLatLng?.let {latlng->
            mMap.addMarker(MarkerOptions().position(latlng).title(mTitle?:""))
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng, 14.0f))
            mMap.animateCamera(CameraUpdateFactory.zoomTo(14.0f), 2000, null);
        }
        booking?.let {
            val latlng = LatLng(booking?.space?.venue?.lat?.toDoubleOrNull()
                    ?: 0.0, booking?.space?.venue?.lng?.toDoubleOrNull() ?: 0.0)
            mMap.addMarker(MarkerOptions().position(latlng).title(it.space?.name?:""))//.title
            // ("Marker in
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng, 14.0f))
            mMap.animateCamera(CameraUpdateFactory.zoomTo(14.0f), 2000, null);
//            mMap.animateCamera(CameraUpdateFactory.zoomTo(10F), 2000, null);
        }

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id,binding.imageViewProfilePic.id -> onBackPressed()
        }
    }
}
