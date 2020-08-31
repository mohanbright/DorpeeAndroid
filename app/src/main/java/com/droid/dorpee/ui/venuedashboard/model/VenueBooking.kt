package com.droid.dorpee.ui.venuedashboard.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class VenueBooking(
    @SerializedName("amount")
    val amount: String? = null,
    @SerializedName("booking_as")
    val bookingAs: String? = null,
    @SerializedName("booking_number")
    val bookingNumber: String? = null,
    @SerializedName("contacts")
    val contacts: Any? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("credits")
    val credits: Int? = null,
    @SerializedName("deleted_at")
    val deletedAt: String? = null,
    @SerializedName("duration")
    val duration: Int? = null,
    @SerializedName("employer_id")
    val employerId: Any? = null,
    @SerializedName("end_date")
    val endDate: String? = null,
    @SerializedName("end_time")
    val endTime: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("no_of_booked_spaces")
    val noOfBookedSpaces: Int? = null,
    @SerializedName("no_of_people")
    val noOfPeople: Int? = null,
    @SerializedName("notes")
    val notes: String? = null,
    @SerializedName("review_sent")
    val reviewSent: Int? = null,
    @SerializedName("space")
    val space: Space? = null,
    @SerializedName("space_id")
    val spaceId: Int? = null,
    @SerializedName("start_date")
    val startDate: String? = null,
    @SerializedName("start_time")
    val startTime: String? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("teams")
    val teams: Any? = null,
    @SerializedName("type")
    val type: Any? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("user")
    val user: User? = null,
    @SerializedName("user_id")
    val userId: Int? = null,
    @SerializedName("venue_id")
    val venueId: Int? = null
):Serializable