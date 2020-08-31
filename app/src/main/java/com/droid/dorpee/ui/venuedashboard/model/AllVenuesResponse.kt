package com.droid.dorpee.ui.venuedashboard.model


import com.droid.dorpee.ui.venue.venueresponse.Data
import com.google.gson.annotations.SerializedName

data class AllVenuesResponse(
    @SerializedName("data")
    val `data`: List<Data>? = null
)