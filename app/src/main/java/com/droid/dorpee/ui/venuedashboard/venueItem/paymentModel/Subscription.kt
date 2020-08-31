package com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel


import com.google.gson.annotations.SerializedName

data class Subscription(
    @SerializedName("cancel_at")
    val cancelAt: Any?,
    @SerializedName("cancelled_at")
    val cancelledAt: Any?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("ends_at")
    val endsAt: Any?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("quantity")
    val quantity: Int?,
    @SerializedName("stripe_id")
    val stripeId: String?,
    @SerializedName("stripe_plan")
    val stripePlan: String?,
    @SerializedName("trial_ends_at")
    val trialEndsAt: Any?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("user_id")
    val userId: Int?
)