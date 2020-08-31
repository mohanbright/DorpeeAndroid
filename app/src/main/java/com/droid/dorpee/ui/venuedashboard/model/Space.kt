package com.droid.dorpee.ui.venuedashboard.model


import com.droid.dorpee.ui.search.model.Environment
import com.droid.dorpee.ui.search.model.Type
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Space(
        @SerializedName("capacity")
        val capacity: Int? = null,
        @SerializedName("created_at")
        val createdAt: String? = null,
        @SerializedName("deleted_at")
        val deletedAt: String? = null,
        @SerializedName("description")
        val description: String? = null,
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
//    @SerializedName("media")
////    val media: List<Media>? = null,
        @SerializedName("min_booking_hours")
        val minBookingHours: Int? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("photos")
        val photos: List<String>? = null,
        @SerializedName("price")
        val price: String? = null,
        @SerializedName("quantity")
        val quantity: String? = null,
        @SerializedName("status")
        val status: String? = null,
        @SerializedName("updated_at")
        val updatedAt: String? = null,
        @SerializedName("venue")
        val venue: Venue? = null,
        @SerializedName("venue_id")
        val venueId: Int? = null,
        @SerializedName("types")
        val types: List<Type>? = null,
        @SerializedName("environments")
        val environments: List<Environment>? = null,
        var isSpace: Boolean = true
) : Serializable