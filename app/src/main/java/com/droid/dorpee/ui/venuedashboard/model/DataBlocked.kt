package com.droid.dorpee.ui.venuedashboard.model


import com.droid.dorpee.ui.venue.model.AvailabilityXX
import com.google.gson.annotations.SerializedName

data class DataBlocked(
        @SerializedName("created_at")
        val createdAt: String?=null,
        @SerializedName("id")
        val id: Int?=null,
        @SerializedName("space_id")
        val spaceId: Int?=null,
        @SerializedName("updated_at")
        val updatedAt: String?=null,
        @SerializedName("availability")
        var availability: List<AvailabilityXX>? = null
)