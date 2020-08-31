package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName

data class AvailabilityXX(
    @SerializedName("Friday")
    var friday: List<WorkingHours>? = null,
    @SerializedName("Monday")
    var monday: List<WorkingHours>? = null,
    @SerializedName("Saturday")
    var saturday: List<WorkingHours>? = null,
    @SerializedName("Sunday")
    var sunday: List<WorkingHours>? = null,
    @SerializedName("Thursday")
    var thursday: List<WorkingHours>? = null,
    @SerializedName("Tuesday")
    var tuesday: List<WorkingHours>? = null,
    @SerializedName("Wednesday")
    var wednesday: List<WorkingHours>? = null
)