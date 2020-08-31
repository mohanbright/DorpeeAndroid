package com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel


import com.google.gson.annotations.SerializedName

data class Plan(
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("credits")
    val credits: Int?,
    @SerializedName("deleted_at")
    val deletedAt: Any?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("free_space")
    val freeSpace: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("price")
    val price: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("updated_at")
    val updatedAt: String?
)