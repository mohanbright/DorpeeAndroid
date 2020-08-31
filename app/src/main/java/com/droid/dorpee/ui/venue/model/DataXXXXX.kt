package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName

data class DataXXXXX(
    @SerializedName("assets")
    val assets: List<Asset>? = null,
    @SerializedName("availability")
    val availability: List<AvailabilityX>? = null,
    @SerializedName("capacity")
    val capacity: Int? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("deleted_at")
    val deletedAt: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("environments")
    val environments: List<Environment>? = null,
    @SerializedName("free_space")
    val freeSpace: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("images")
    val images: List<String>? = null,
    @SerializedName("images_link")
    val imagesLink: String? = null,
    @SerializedName("max_booking_hours")
    val maxBookingHours: Int? = null,
    @SerializedName("media")
    val media: List<Media>? = null,
    @SerializedName("min_booking_hours")
    val minBookingHours: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("photos")
    val photos: List<Any>? = null,
    @SerializedName("price")
    val price: String? = null,
    @SerializedName("quantity")
    val quantity: String? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("types")
    val types: List<Type>? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("uploaded_images")
    val uploadedImages: List<UploadedImage>? = null,
    @SerializedName("venue_id")
    val venueId: Int? = null
)