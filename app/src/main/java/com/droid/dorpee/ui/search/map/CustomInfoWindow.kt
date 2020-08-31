package com.droid.dorpee.ui.search.map

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.droid.dorpee.R
import com.droid.dorpee.databinding.MarkerInfoWindowBinding
import com.droid.dorpee.ui.search.model.Data
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
import com.google.android.gms.maps.model.Marker
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import org.jetbrains.anko.dimen
import kotlin.math.ceil


class CustomInfoWindow(val context: Context) : InfoWindowAdapter {
    private var inflater: LayoutInflater? = null
    lateinit var binding: MarkerInfoWindowBinding
    private var popup: View? = null
    private var lastMarker: Marker? = null
    private var iconWidth = -1
    private var iconHeight = -1
    init {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getInfoWindow(marker: Marker): View? {
        if (popup == null) {
            binding = MarkerInfoWindowBinding.inflate(inflater!!)
            popup = binding.root
        }

        if (lastMarker == null
                || !lastMarker?.id.equals(marker.id)) {
            lastMarker=marker;
            iconWidth =context.dimen(R.dimen._200sdp)
            iconHeight =context.dimen(R.dimen._140sdp)
            val data = marker.tag as Data
            binding.textViewCity.text = data.suburb ?: ""
            binding.textViewVenueName.text = data.name ?: ""
            binding.textViewVenueName.text = data.name ?: ""
            val creditPerHour = if (data.lowestPrice.isNullOrEmpty()) 0 else ceil(
                    data.lowestPrice.toDouble().div(0.3)
            ).toInt()
            binding.textViewCreidt.text = creditPerHour.toString()
            if (data.images.isNullOrEmpty()) {
                Picasso.get().load(R.drawable.placeholder).into(binding.imageViewVenue)
            }else{//.resize(iconWidth,iconHeight)
                Picasso.get().load(data.images[0]).noFade().into(binding
                        .imageViewVenue, MarkerCallback(marker,context))
            }
        }

        return popup
    }

    override fun getInfoContents(marker: Marker?): View? {
        return null
    }

    internal class MarkerCallback(marker: Marker?,val context: Context) : Callback {
        var marker: Marker? = null

        override fun onSuccess() {
            if (marker != null && marker?.isInfoWindowShown == true) {
                marker?.hideInfoWindow()
                marker?.showInfoWindow()
            }
        }

        override fun onError(e: Exception?) {
            Log.e(javaClass.simpleName, "Error loading thumbnail!")
            Toast.makeText(context, e?.localizedMessage?:"Error loading thumbnail!", Toast.LENGTH_SHORT).show()
        }

        init {
            this.marker = marker
        }



    }

}