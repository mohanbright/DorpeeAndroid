package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataX(
    @SerializedName("availability")
    val availability: List<Availability>? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("venue_id")
    val venueId: Int? = null
):Serializable