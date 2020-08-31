package com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel


import com.google.gson.annotations.SerializedName

data class Card(
    @SerializedName("brand")
    val brand: String?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("exp_month")
    val expMonth: String?,
    @SerializedName("exp_year")
    val expYear: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("is_default")
    val isDefault: Int?,
    @SerializedName("last4")
    val last4: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("user_id")
    val userId: Int?
)