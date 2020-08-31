package com.droid.dorpee.ui.venuedashboard.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("venues")
    val venues: Venues? = null
)