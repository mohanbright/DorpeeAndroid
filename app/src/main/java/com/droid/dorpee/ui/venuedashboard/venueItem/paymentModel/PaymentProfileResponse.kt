package com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel


import com.droid.dorpee.ui.auth.model.User
import com.google.gson.annotations.SerializedName

data class PaymentProfileResponse(
    @SerializedName("data")
    val `data`: User?
)