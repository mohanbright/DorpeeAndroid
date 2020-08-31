package com.droid.dorpee.ui.search.model


import com.droid.dorpee.ui.venuedashboard.model.Space
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Data(
        @SerializedName("address")
    val address: String? = null,
        @SerializedName("assessment")
    val assessment: Assessment? = null,
        @SerializedName("average_rating")
    val averageRating: Int? = null,
        @SerializedName("bonus_offer")
    val bonusOffer: String? = null,
        @SerializedName("capacity")
    val capacity: String? = null,
        @SerializedName("country")
    val country: String? = null,
        @SerializedName("created_at")
    val createdAt: String? = null,
        @SerializedName("deleted_at")
    val deletedAt: String? = null,
        @SerializedName("description")
    val description: String? = null,
        @SerializedName("distance_from_city")
    val distanceFromCity: String? = null,
        @SerializedName("distance_from_searched_suburb")
    val distanceFromSearchedSuburb: String? = null,
        @SerializedName("email")
    val email: String? = null,
        @SerializedName("featured")
    val featured: String? = null,
        @SerializedName("id")
    val id: Int? = null,
        @SerializedName("images")
    val images: List<String>? = null,
        @SerializedName("images_link")
    val imagesLink: String? = null,
        @SerializedName("lat")
    val lat: String? = null,
        @SerializedName("lng")
    val lng: String? = null,
        @SerializedName("lowest_price")
    val lowestPrice: String? = null,
        @SerializedName("media")
    val media: List<Media>? = null,
        @SerializedName("name")
    val name: String? = null,
        @SerializedName("phone_number")
    val phoneNumber: String? = null,
        @SerializedName("photos")
    val photos: List<String>? = null,
        @SerializedName("postcode")
    val postcode: String? = null,
        @SerializedName("price")
    val price: String? = null,
        @SerializedName("qr_code")
    val qrCode: String? = null,
        @SerializedName("qr_pdf")
    val qrPdf: String? = null,
        @SerializedName("services")
    val services: List<Service>? = null,
        @SerializedName("slug")
    val slug: String? = null,
        @SerializedName("spaces")
    val spaces: List<Space>? = null,
        @SerializedName("state")
    val state: String? = null,
        @SerializedName("status")
    val status: String? = null,
        @SerializedName("suburb")
    val suburb: String? = null,
        @SerializedName("total_available")
    val totalAvailable: Int? = null,
        @SerializedName("total_reviews")
    val totalReviews: Int? = null,
        @SerializedName("updated_at")
    val updatedAt: String? = null,
        @SerializedName("uploaded_images")
    val uploadedImages: List<UploadedImageX>? = null,
        @SerializedName("user_id")
    val userId: Int? = null,
        @SerializedName("venue_type")
    val venueType: VenueType? = null,
        @SerializedName("venue_type_id")
    val venueTypeId: Int? = null,
        @SerializedName("workspace_count")
    val workspaceCount: Int? = null
): Serializable