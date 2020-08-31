package com.droid.dorpee.ui.venuedashboard.model


import com.google.gson.annotations.SerializedName

data class BlockData(
    @SerializedName("closing_time")
    val closingTime: String?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("opening_time")
    val openingTime: String?,
    @SerializedName("quantity")
    val quantity: Int?,
    @SerializedName("space_id")
    val spaceId: Int?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("space")
    val spaces: Space?
)