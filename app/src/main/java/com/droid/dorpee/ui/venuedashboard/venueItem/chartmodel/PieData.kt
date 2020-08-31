package com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel


import com.google.gson.annotations.SerializedName

data class PieData(
    @SerializedName("newVsOld")
    val newVsOld: NewVsOld?,
    @SerializedName("no_of_people")
    val noOfPeople: NoOfPeople?,
    @SerializedName("total_duration")
    val totalDuration: TotalDuration?
)