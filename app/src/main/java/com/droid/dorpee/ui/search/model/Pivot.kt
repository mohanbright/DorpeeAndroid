package com.droid.dorpee.ui.search.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Pivot(
    @SerializedName("service_id")
    val serviceId: Int? = null,
    @SerializedName("venue_id")
    val venueId: Int? = null
): Serializable