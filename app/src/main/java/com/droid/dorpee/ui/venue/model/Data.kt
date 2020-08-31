package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("category")
    val category: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("deleted_at")
    val deletedAt: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("service")
    val service: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    var checked: Boolean = false
)