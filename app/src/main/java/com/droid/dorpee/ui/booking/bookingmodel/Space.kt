package com.droid.dorpee.ui.booking.bookingmodel

import com.google.gson.annotations.SerializedName


data class Space (

		@SerializedName("id") val id : Int,
		@SerializedName("venue_id") val venue_id : Int,
		@SerializedName("name") val name : String,
		@SerializedName("price") val price : Double,
		@SerializedName("capacity") val capacity : Int,
		@SerializedName("description") val description : String,
		@SerializedName("created_at") val created_at : String,
		@SerializedName("updated_at") val updated_at : String,
		@SerializedName("deleted_at") val deleted_at : String,
		@SerializedName("free_space") val free_space : String,
		@SerializedName("quantity") val quantity : Int,
		@SerializedName("status") val status : String,
		@SerializedName("min_booking_hours") val min_booking_hours : Int,
		@SerializedName("max_booking_hours") val max_booking_hours : Int,
		@SerializedName("photos") val photos : List<String>,
		@SerializedName("images") val images : List<String>,
		@SerializedName("images_link") val images_link : String,
		@SerializedName("uploaded_images") val uploaded_images : List<Uploaded_images>,
		@SerializedName("media") val media : List<Media>,
		@SerializedName("venue") val venue : Venue
)