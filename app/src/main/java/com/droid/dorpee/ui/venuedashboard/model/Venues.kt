package com.droid.dorpee.ui.venuedashboard.model


import com.google.gson.annotations.SerializedName

data class Venues(
        @SerializedName("active_booking")
    val activeBooking: List<ActiveBooking>? = null,
        @SerializedName("active_spaces")
    val activeSpaces: Int? = null,
        @SerializedName("active_venues")
    val activeVenues: Int? = null,
        @SerializedName("all_bookings")
    val allBookings: List<VenueBooking>? = null,
        @SerializedName("past_bookings")
    val pastBookings: List<VenueBooking>? = null
)