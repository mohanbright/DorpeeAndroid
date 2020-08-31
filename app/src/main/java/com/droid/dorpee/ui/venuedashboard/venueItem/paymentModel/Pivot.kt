package com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel


import com.google.gson.annotations.SerializedName

data class Pivot(
    @SerializedName("role_id")
    val roleId: Int?,
    @SerializedName("user_id")
    val userId: Int?
)