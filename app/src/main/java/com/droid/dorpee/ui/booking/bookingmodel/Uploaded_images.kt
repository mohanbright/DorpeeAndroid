package com.droid.dorpee.ui.booking.bookingmodel

import com.google.gson.annotations.SerializedName

data class Uploaded_images (

		@SerializedName("id") val id : Int,
		@SerializedName("model_type") val model_type : String,
		@SerializedName("model_id") val model_id : Int,
		@SerializedName("collection_name") val collection_name : String,
		@SerializedName("name") val name : Int,
		@SerializedName("file_name") val file_name : String,
		@SerializedName("mime_type") val mime_type : String,
		@SerializedName("disk") val disk : String,
		@SerializedName("size") val size : Int,
		@SerializedName("manipulations") val manipulations : List<String>,
		@SerializedName("custom_properties") val custom_properties : List<String>,
		@SerializedName("responsive_images") val responsive_images : List<String>,
		@SerializedName("order_column") val order_column : Int,
		@SerializedName("created_at") val created_at : String,
		@SerializedName("updated_at") val updated_at : String
)