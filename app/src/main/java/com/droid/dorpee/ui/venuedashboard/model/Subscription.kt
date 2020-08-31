package com.droid.dorpee.ui.venuedashboard.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Subscription(
    @SerializedName("cancel_at")
    val cancelAt: String? = null,
    @SerializedName("cancelled_at")
    val cancelledAt: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("ends_at")
    val endsAt: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("quantity")
    val quantity: Int? = null,
    @SerializedName("stripe_id")
    val stripeId: String? = null,
    @SerializedName("stripe_plan")
    val stripePlan: String? = null,
    @SerializedName("trial_ends_at")
    val trialEndsAt: Any? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("user_id")
    val userId: Int? = null
): Serializable