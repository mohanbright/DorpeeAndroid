package com.droid.dorpee.ui.search.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Assessment(
    @SerializedName("completed_date")
    val completedDate: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("result")
    val result: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("user_id")
    val userId: Int? = null,
    @SerializedName("venue_id")
    val venueId: Int? = null
): Serializable