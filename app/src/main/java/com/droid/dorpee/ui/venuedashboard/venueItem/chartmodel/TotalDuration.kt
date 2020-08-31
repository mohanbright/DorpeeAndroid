package com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel


import com.google.gson.annotations.SerializedName

data class TotalDuration(
    @SerializedName("duration_btw_one_to_two")
    val durationBtwOneToTwo: Double?,
    @SerializedName("duration_btw_three_to_six")
    val durationBtwThreeToSix: Double?,
    @SerializedName("duration_gt_eight")
    val durationGtEight: Double?
)