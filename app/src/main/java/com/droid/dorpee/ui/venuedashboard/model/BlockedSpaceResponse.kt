package com.droid.dorpee.ui.venuedashboard.model


import com.google.gson.annotations.SerializedName

data class BlockedSpaceResponse(
    @SerializedName("data")
    val `data`: DataBlocked?
)