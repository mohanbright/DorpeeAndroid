package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName

data class Type(
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("deleted_at")
    val deletedAt: Any? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("image_url")
    val imageUrl: Any? = null,
    @SerializedName("pivot")
    val pivot: PivotXX? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null
)