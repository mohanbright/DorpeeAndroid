package com.droid.dorpee.ui.auth.model


import com.google.gson.annotations.SerializedName

data class InterestResponse(
    @SerializedName("data")
    val `data`: List<Data>? = null
)