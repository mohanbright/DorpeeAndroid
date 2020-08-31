package com.droid.dorpee.ui.booking.model

import com.google.gson.annotations.SerializedName

data class Pivot (
        @SerializedName("customer_id") val customer_id : Int,
        @SerializedName("employer_id") val employer_id : Int
)