package com.droid.dorpee.ui.venue.venueresponse


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Service(
    @SerializedName("category")
    val category: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("deleted_at")
    val deletedAt: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("pivot")
    val pivot: Pivot? = null,
    @SerializedName("service")
    val service: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null
): Serializable