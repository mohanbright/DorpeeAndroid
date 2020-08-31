package com.droid.dorpee.ui.venuedashboard.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Media(
    @SerializedName("collection_name")
    val collectionName: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("custom_properties")
    val customProperties: List<Any>? = null,
    @SerializedName("disk")
    val disk: String? = null,
    @SerializedName("file_name")
    val fileName: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("manipulations")
    val manipulations: List<Any>? = null,
    @SerializedName("mime_type")
    val mimeType: String? = null,
    @SerializedName("model_id")
    val modelId: Int? = null,
    @SerializedName("model_type")
    val modelType: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("order_column")
    val orderColumn: Int? = null,
    @SerializedName("responsive_images")
    val responsiveImages: List<Any>? = null,
    @SerializedName("size")
    val size: Int? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null
): Serializable