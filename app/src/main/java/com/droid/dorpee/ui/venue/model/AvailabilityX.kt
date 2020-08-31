package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName

data class AvailabilityX(
    @SerializedName("availability")
    val availability: List<AvailabilityXX>? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("space_id")
    val spaceId: Int? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null
)