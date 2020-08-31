package com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel


import com.google.gson.annotations.SerializedName

data class PieChartResponse(
    @SerializedName("data")
    val `data`: PieData?
)