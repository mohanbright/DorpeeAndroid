package com.droid.dorpee.ui.auth.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Role(
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("pivot")
    val pivot: Pivot? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null
): Serializable