package com.droid.dorpee.ui.booking.bookingmodel

import com.google.gson.annotations.SerializedName


data class Venue (

		@SerializedName("id") val id : Int,
		@SerializedName("name") val name : String,
		@SerializedName("slug") val slug : String,
		@SerializedName("address") val address : String,
		@SerializedName("suburb") val suburb : String,
		@SerializedName("postcode") val postcode : Int,
		@SerializedName("state") val state : String,
		@SerializedName("country") val country : String,
		@SerializedName("price") val price : String,
		@SerializedName("capacity") val capacity : String,
		@SerializedName("description") val description : String,
		@SerializedName("created_at") val created_at : String,
		@SerializedName("updated_at") val updated_at : String,
		@SerializedName("deleted_at") val deleted_at : String,
		@SerializedName("user_id") val user_id : Int,
		@SerializedName("featured") val featured : Int,
		@SerializedName("phone_number") val phone_number : String,
		@SerializedName("email") val email : String,
		@SerializedName("lat") val lat : Double,
		@SerializedName("lng") val lng : Double,
		@SerializedName("bonus_offer") val bonus_offer : String,
		@SerializedName("distance_from_city") val distance_from_city : String,
		@SerializedName("status") val status : String,
		@SerializedName("venue_type_id") val venue_type_id : Int,
		@SerializedName("qr_pdf") val qr_pdf : String,
		@SerializedName("qr_code") val qr_code : String,
		@SerializedName("photos") val photos : List<String>,
		@SerializedName("images") val images : List<String>,
		@SerializedName("images_link") val images_link : String,
		@SerializedName("uploaded_images") val uploaded_images : List<Uploaded_images>,
		@SerializedName("lowest_price") val lowest_price : Double,
		@SerializedName("average_rating") val average_rating : Int,
		@SerializedName("workspace_count") val workspace_count : Int,
		@SerializedName("total_available") val total_available : Int,
		@SerializedName("total_reviews") val total_reviews : Int,
		@SerializedName("featured_venue") val featured_venue : String,
		@SerializedName("pdf_link") val pdf_link : String,
		@SerializedName("qrcode_link") val qrcode_link : String,
		@SerializedName("media") val media : List<Media>
)