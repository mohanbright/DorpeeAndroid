package com.droid.dorpee.ui.search.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Type(
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("deleted_at")
    val deletedAt: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("image_url")
    val imageUrl: String? = null,
    @SerializedName("pivot")
    val pivot: PivotXX? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null
):Serializable