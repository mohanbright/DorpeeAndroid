package com.droid.dorpee.ui.venue.venueresponse


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class VenueResponse(
    @SerializedName("data")
    val `data`: Data? = null
): Serializable