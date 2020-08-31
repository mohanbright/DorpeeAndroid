package com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel


import com.google.gson.annotations.SerializedName

data class Booking(
    @SerializedName("amount")
    val amount: String?,
    @SerializedName("booking_as")
    val bookingAs: String?,
    @SerializedName("booking_number")
    val bookingNumber: String?,
    @SerializedName("contacts")
    val contacts: Any?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("credits")
    val credits: Int?,
    @SerializedName("deleted_at")
    val deletedAt: Any?,
    @SerializedName("duration")
    val duration: Int?,
    @SerializedName("employer_id")
    val employerId: Any?,
    @SerializedName("end_date")
    val endDate: String?,
    @SerializedName("end_time")
    val endTime: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("no_of_booked_spaces")
    val noOfBookedSpaces: Int?,
    @SerializedName("no_of_people")
    val noOfPeople: Int?,
    @SerializedName("notes")
    val notes: Any?,
    @SerializedName("review_sent")
    val reviewSent: Int?,
    @SerializedName("space_id")
    val spaceId: Int?,
    @SerializedName("start_date")
    val startDate: String?,
    @SerializedName("start_time")
    val startTime: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("teams")
    val teams: Any?,
    @SerializedName("type")
    val type: Any?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    @SerializedName("user_id")
    val userId: Int?,
    @SerializedName("venue_id")
    val venueId: Any?
)