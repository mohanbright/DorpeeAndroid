package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName

data class ServicesResponse(
    @SerializedName("data")
    val `data`: List<Data>? = null
)