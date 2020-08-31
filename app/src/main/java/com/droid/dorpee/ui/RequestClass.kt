package com.droid.dorpee.ui

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.stripe.android.ApiResultCallback
import com.stripe.android.model.Token


data class LoginRequest(
        @Expose @SerializedName("email") var email: String,
        @Expose @SerializedName("password") var password: String
)

data class RegisterRequest(
        @Expose @SerializedName("first_name") var first_name: String,
        @Expose @SerializedName("last_name") var last_name: String,
        @Expose @SerializedName("email") var email: String,
        @Expose @SerializedName("password") var password: String,
        @Expose @SerializedName("user_type") var user_type: String,
        @Expose @SerializedName("interests") var interests: String = ""
)

data class VenueAvailityReq(
        @SerializedName("availability")
        var availability: List<Availability>? = null,
        @SerializedName("venue_id")
        var venueId: Int? = null
)

data class CreateContact(
        @Expose @SerializedName("first_name") var first_name: String,
        @Expose @SerializedName("last_name") var last_name: String,
        @Expose @SerializedName("email") var email: String,
        @Expose @SerializedName("team_id") var teamId: String
)


data class UpdateContact(
        @Expose @SerializedName("first_name") var first_name: String,
        @Expose @SerializedName("last_name") var last_name: String,
        @Expose @SerializedName("email") var email: String,
        @Expose @SerializedName("team_id") var teamId: String,
        @Expose @SerializedName("_method") var method: String
)


data class CancelRequest(
        @Expose @SerializedName("status") var status: String,
        @Expose @SerializedName("_method") var method: String
)

data class ChangeStatusRequest(
        @Expose @SerializedName("booking_id") var id: Int,
        @Expose @SerializedName("status") var status: String
)

data class CheckInRequest(@Expose @SerializedName("venue_id") var venueId: Int)

data class ExtendRequest(@Expose @SerializedName("booking_id") var bookingId: Int)


class RequestWithHeader(auth: String?) {
    var authentication: String = "Bearer $auth"
}


data class Availability(
        @SerializedName("day")
        var day: String? = null,
        @SerializedName("openingTime")
        var openingTime: String? = null,
        @SerializedName("closingTime")
        var closingTime: String? = null,
        var checked :Boolean = false
)

data class PrivacySettings(
        @SerializedName("linkedin")
        var linkedin: String? = null,
        @SerializedName("privacy_linkedin")
        var privacy_linkedin: String? = null,
        @SerializedName("privacy_name")
        var privacy_name: String? = null,
        @SerializedName("privacy_interests")
        var privacy_interests: String? = null
)

data class CreateTeamRequest(
        @Expose @SerializedName("name") var name: String
)


data class ChangePlanRequest(
        @Expose @SerializedName("plan_id") var planId: Int?

)

data class purchaseCreditRequest(
        @Expose @SerializedName("credits") var credits: Int?
)

data class createBookingEmployeeRequest(
        @Expose @SerializedName("space_id") var spaceId: Int?,
        @Expose @SerializedName("start_date") var startDate: String?,
        @Expose @SerializedName("end_date") var endDate: String?,
        @Expose @SerializedName("start_time") var startTime: String?,
        @Expose @SerializedName("end_time") var endTime: String?,
        @Expose @SerializedName("booking_as") var bookingAs: String?,
//        @Expose @SerializedName("teams[0]") var team0: Int?,
//        @Expose @SerializedName("teams[1]") var team1: Int?,
//        @Expose @SerializedName("contacts[0]") var contact0: Int?,
//        @Expose @SerializedName("contacts[1]") var contact1: Int?,
//        @Expose @SerializedName("contacts[2]") var contact2: Int?,
        @Expose @SerializedName("employer_id") var employeeId: Int?,
        @Expose @SerializedName("credits") var credits: Int?,
        @Expose @SerializedName("no_of_booked_spaces") var numberBooking: Int?,
        @Expose @SerializedName("no_of_people") var numberofPeople: Int?
)


data class editBookingEmployeeRequest(
        @Expose @SerializedName("space_id") var spaceId: Int?,
        @Expose @SerializedName("start_date") var startDate: String?,
        @Expose @SerializedName("end_date") var endDate: String?,
        @Expose @SerializedName("start_time") var startTime: String?,
        @Expose @SerializedName("end_time") var endTime: String?,
        @Expose @SerializedName("booking_as") var bookingAs: String?,
//        @Expose @SerializedName("teams[0]") var team0: Int?,
//        @Expose @SerializedName("teams[1]") var team1: Int?,
//        @Expose @SerializedName("contacts[0]") var contact0: Int?,
//        @Expose @SerializedName("contacts[1]") var contact1: Int?,
//        @Expose @SerializedName("contacts[2]") var contact2: Int?,
        @Expose @SerializedName("employer_id") var employeeId: Int?,
        @Expose @SerializedName("_method") var _method: String?,
        @Expose @SerializedName("credits") var credits: Int?,
        @Expose @SerializedName("no_of_booked_spaces") var numberBooking: Int?,
        @Expose @SerializedName("no_of_people") var numberofPeople: Int?
)

data class editBookingPersonalRequest(
        @Expose @SerializedName("space_id") var spaceId: Int?,
        @Expose @SerializedName("start_date") var startDate: String?,
        @Expose @SerializedName("end_date") var endDate: String?,
        @Expose @SerializedName("start_time") var startTime: String?,
        @Expose @SerializedName("end_time") var endTime: String?,
        @Expose @SerializedName("booking_as") var bookingAs: String?,
//        @Expose @SerializedName("teams[0]") var team0: Int?,
//        @Expose @SerializedName("teams[1]") var team1: Int?,
//        @Expose @SerializedName("contacts[0]") var contact0: Int?,
//        @Expose @SerializedName("contacts[1]") var contact1: Int?,
//        @Expose @SerializedName("contacts[2]") var contact2: Int?,
        @Expose @SerializedName("employer_id") var employeeId: Int?,
        @Expose @SerializedName("_method") var _method: String?,
        @Expose @SerializedName("credits") var credits: Int?,
        @Expose @SerializedName("no_of_booked_spaces") var numberBooking: Int?,
        @Expose @SerializedName("no_of_people") var numberofPeople: Int?
)

data class editPersonalProfile(
        @Expose @SerializedName("first_name") var first_name: String?,
        @Expose @SerializedName("last_name") var last_name: String?,
        @Expose @SerializedName("email") var email: String?
)


data class createBookingPersonalRequest(
        @Expose @SerializedName("space_id") var spaceId: Int?,
        @Expose @SerializedName("start_date") var startDate: String?,
        @Expose @SerializedName("end_date") var endDate: String?,
        @Expose @SerializedName("start_time") var startTime: String?,
        @Expose @SerializedName("end_time") var endTime: String?,
        @Expose @SerializedName("booking_as") var bookingAs: String?,
        @Expose @SerializedName("credits") var credits: Int?,
        @Expose @SerializedName("no_of_booked_spaces") var numberBooking: Int?,
        @Expose @SerializedName("no_of_people") var numberofPeople: Int?
)

data class PurchasePlanRequest(
        @Expose @SerializedName("plan_id") var planId: Int?,
        @Expose @SerializedName("stripe_token") var token: String?
)

data class AddCardRequest(
        @Expose @SerializedName("stripe_token") var token: String,
        @Expose @SerializedName("name") var name: String
)


data class UpdateTeamRequest(
        @Expose @SerializedName("name") var name: String,
        @Expose @SerializedName("_method") var method: String
)


data class ChangeVenueStatusRequest(
        @Expose @SerializedName("_method") var method: String="PUT",
        @Expose @SerializedName("status") var status: String
)

data class BlockAvailbilityRequest(
        @SerializedName("closing_time")
        val closingTime: String?,
        @SerializedName("date")
        val date: String?,
        @SerializedName("opening_time")
        val openingTime: String?,
        @SerializedName("quantity")
        val quantity: Int?,
        @SerializedName("repeat")
        val repeat: String?,
        @SerializedName("spaces")
        val spaces: List<Int>?,
        @SerializedName("repeat_type")
        var repeatType: String?=null,
        @SerializedName("timeframe")
        var timeframe: String?=null
)



data class UnblockRequest(
        @SerializedName("date")
        val date: String?,
        @SerializedName("opening_time")
        val openingTime: String?,
        @SerializedName("space_id")
        val spaceId: Int?
)