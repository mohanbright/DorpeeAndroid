package com.droid.dorpee.ui.search.map

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.droid.dorpee.R
import com.droid.dorpee.databinding.ActivityMapsSearchBinding
import com.droid.dorpee.ui.baseClasses.AppVMProvider
import com.droid.dorpee.ui.baseClasses.BaseActivity
import com.droid.dorpee.ui.search.model.Data
import com.droid.dorpee.ui.search.model.SearchResponse
import com.droid.dorpee.ui.search.ui.search.SearchViewModel
import com.droid.dorpee.utils.preference.AppPreferences
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.maps.android.ui.IconGenerator
import org.jetbrains.anko.displayMetrics
import kotlin.math.ceil


class MapsActivity : BaseActivity(), OnMapReadyCallback, View.OnClickListener,
        GoogleMap.OnInfoWindowClickListener,
        GoogleMap.OnMarkerClickListener {
    private var lastMarker: Marker? = null
    private val TAG = "MapsActivity"
    private var data: SearchResponse? = null
    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsSearchBinding
    var viewModel: SearchViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapsSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        intent.getSerializableExtra("data")?.let {
            data = it as SearchResponse
        }
    }

    override fun bindData() {}

    override fun initListeners() {}

    override fun setUpVM(): ViewModel? {
        val provider = AppVMProvider()
        provider.createParams(SearchViewModel())
        return ViewModelProvider(this, provider).get(SearchViewModel::class.java)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        val iconFactory = IconGenerator(this)
        try {
            Log.e(TAG, "data?.data?.size ${data?.data?.size ?: 0}")
            val bound = LatLngBounds.builder()
            mMap.setOnMarkerClickListener(this)
            mMap.setOnInfoWindowClickListener(this)
            mMap.setInfoWindowAdapter(CustomInfoWindow(this))
            data?.data?.map {
                val creditPerHour = if (it.lowestPrice.isNullOrEmpty()) 0 else ceil(
                        it.lowestPrice.toDouble().div(0.3)
                ).toInt()
                val loc = LatLng(it.lat?.toDouble() ?: 0.0, it.lng?.toDouble() ?: 0.0)
                bound.include(loc)
//                Log.e(TAG, "creditPerHour: $creditPerHour credits / hour $loc")
                iconFactory.setTextAppearance(R.style.marker_text_style_black);
                iconFactory.setColor(ContextCompat.getColor(this, R.color.white))
                val markerOptions =
                        MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(iconFactory.makeIcon("$creditPerHour credits / hour")))
                                .position(loc).anchor(iconFactory.anchorU, iconFactory.anchorV)
                showVenue(creditPerHour, mMap, markerOptions, it)
            }
            val width = displayMetrics.widthPixels
            val height = displayMetrics.heightPixels
            val padding = width.times(0.4).toInt()
//            Log.e(TAG, "onMapReady: $padding")
            mMap.moveCamera(
                    CameraUpdateFactory.newLatLngBounds(
                            bound.build(),
                            width,
                            height,
                            padding
                    )
            )
        } catch (e: Exception) {
            Log.e(TAG, "onMapReady: ", e)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            binding.backbtn.id -> {
                onBackPressed()
            }
        }
    }


    override fun onInfoWindowClick(p0: Marker?) {
        val data = p0?.tag as Data
        Log.e(TAG, "onInfoWindowClick: ${data.name} ${data.id}")
        infoData = data
        onBackPressed()
    }

    override fun onMarkerClick(p0: Marker?): Boolean {
        val iconFactory = IconGenerator(this)
        lastMarker?.let {
            val data = it.tag as Data
            val creditPerHour = if (data.lowestPrice.isNullOrEmpty()) 0 else ceil(
                    data.lowestPrice.toDouble().div(0.3)
            ).toInt()
            iconFactory.setTextAppearance(R.style.marker_text_style_black);
            iconFactory.setColor(ContextCompat.getColor(this, R.color.white))
            it.setIcon(BitmapDescriptorFactory.fromBitmap(iconFactory.makeIcon("$creditPerHour credits / hour")))
        }
        lastMarker = p0
        val data = p0?.tag as Data
        val creditPerHour = if (data.lowestPrice.isNullOrEmpty()) 0 else ceil(
                data.lowestPrice.toDouble().div(0.3)
        ).toInt()
        iconFactory.setTextAppearance(R.style.marker_text_style_white);
        iconFactory.setColor(ContextCompat.getColor(this, R.color.black))
        p0.setIcon(BitmapDescriptorFactory.fromBitmap(iconFactory.makeIcon("$creditPerHour credits / hour")))
        p0.showInfoWindow()
        infoData = null
        return true
    }

    private fun showVenue(creditPerHour: Int, mMap: GoogleMap, markerOptions: MarkerOptions, data: Data) {
        val user = AppPreferences.getInstance(this)?.user?.user
        if (user != null) {
            if (user.plan?.free_space.equals("yes", true)) {
                mMap.addMarker(markerOptions).apply {
                    tag = data
                }
                Log.e(TAG, "creditPerHour: $creditPerHour credits / hour user ${user.plan?.free_space}")
            } else {
                if (creditPerHour > 0) {
                    mMap.addMarker(markerOptions).apply {
                        tag = data
                    }
                    Log.e(TAG, "creditPerHour: $creditPerHour credits / hour user else ${user.plan?.free_space}")
                }
            }
        } else {
            if (creditPerHour > 0) {
                mMap.addMarker(markerOptions).apply {
                    tag = data
                }
                Log.e(TAG, "creditPerHour: $creditPerHour credits / hour user null ")
            }
        }

    }

    companion object {
        var infoData: Data? = null
    }
}

