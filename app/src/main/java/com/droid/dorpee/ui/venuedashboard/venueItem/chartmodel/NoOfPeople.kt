package com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel


import com.google.gson.annotations.SerializedName

data class NoOfPeople(
    @SerializedName("eqone")
    val eqone: Double?,
    @SerializedName("gtfifteen")
    val gtfifteen: Int?,
    @SerializedName("gtfive")
    val gtfive: Int?
)