package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName

data class TypesResponse(
    @SerializedName("data")
    val `data`: List<DataXX>? = null
)