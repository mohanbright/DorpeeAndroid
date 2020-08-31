package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName

data class WorkingHours(
    @SerializedName("close")
    val close: String? = null,
    @SerializedName("quantity")
    var quantity: String? = null,
    @SerializedName("time")
    val time: String? = null
)