package com.droid.dorpee.ui.venue


import com.google.gson.annotations.SerializedName

data class RequestVenue(
    @SerializedName("address")
    var address: String? = null,
    @SerializedName("bonus_offer")
    var bonusOffer: String? = null,
    @SerializedName("country")
    var country: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("featured")
    var featured: String? = null,
    @SerializedName("images[]")
    var images: List<String>? = null,
    @SerializedName("lat")
    var lat: String? = null,
    @SerializedName("lng")
    var lng: String? = null,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("phone_number")
    var phoneNumber: String? = null,
    @SerializedName("postcode")
    var postcode: String? = null,
    @SerializedName("services")
    var services: String? = null,
    @SerializedName("state")
    var state: String? = null,
    @SerializedName("suburb")
    var suburb: String? = null,
    @SerializedName("venue_type_id")
    var venueTypeId: Int? = null
)