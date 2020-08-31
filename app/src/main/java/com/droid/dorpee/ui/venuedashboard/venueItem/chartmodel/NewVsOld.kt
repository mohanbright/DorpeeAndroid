package com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel


import com.google.gson.annotations.SerializedName

data class NewVsOld(
    @SerializedName("new")
    val new: Int?,
    @SerializedName("old")
    val old: Int?
)