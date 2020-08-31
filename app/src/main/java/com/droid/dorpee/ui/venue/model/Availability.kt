package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Availability(
    @SerializedName("closingTime")
    val closingTime: String? = null,
    @SerializedName("day")
    val day: String? = null,
    @SerializedName("openingTime")
    val openingTime: String? = null
): Serializable