package com.droid.dorpee.ui.venuedashboard.model


import com.google.gson.annotations.SerializedName

data class VenuesX(
    @SerializedName("total_bookings_hours")
    val totalBookingsHours: Int?,
    @SerializedName("total_bookings_revenue")
    val totalBookingsRevenue: Int?
)