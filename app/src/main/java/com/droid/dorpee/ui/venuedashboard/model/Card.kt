package com.droid.dorpee.ui.venuedashboard.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Card(
    @SerializedName("brand")
    val brand: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("exp_month")
    val expMonth: String? = null,
    @SerializedName("exp_year")
    val expYear: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("is_default")
    val isDefault: Int? = null,
    @SerializedName("last4")
    val last4: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("user_id")
    val userId: Int? = null
): Serializable