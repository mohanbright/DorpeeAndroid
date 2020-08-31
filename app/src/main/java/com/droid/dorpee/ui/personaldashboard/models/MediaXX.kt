package com.droid.dorpee.ui.personaldashboard.models

import java.io.Serializable

data class MediaXX(
    val collection_name: String,
    val created_at: String,
    val custom_properties: List<Any>,
    val disk: String,
    val file_name: String,
    val id: Int,
    val manipulations: List<Any>,
    val mime_type: String,
    val model_id: Int,
    val model_type: String,
    val name: String,
    val order_column: Int,
    val responsive_images: List<Any>,
    val size: Int,
    val updated_at: String
) : Serializable