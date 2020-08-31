package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName

data class Environment(
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("deleted_at")
    val deletedAt: Any? = null,
    @SerializedName("environment")
    val environment: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("pivot")
    val pivot: PivotX? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null
)