package com.droid.dorpee.ui.auth.model

import com.droid.dorpee.ui.booking.bookingmodel.Employer
import com.google.gson.annotations.SerializedName


data class EditbookingData (

		@SerializedName("id") val id : Int,
		@SerializedName("end_date") val end_date : String,
		@SerializedName("start_time") val start_time : String,
		@SerializedName("end_time") val end_time : String,
		@SerializedName("credits") val credits : Int,
		@SerializedName("type") val type : String,
		@SerializedName("notes") val notes : String,
		@SerializedName("created_at") val created_at : String,
		@SerializedName("updated_at") val updated_at : String,
		@SerializedName("deleted_at") val deleted_at : String,
		@SerializedName("user_id") val user_id : Int,
		@SerializedName("space_id") val space_id : Int,
		@SerializedName("venue_id") val venue_id : String,
		@SerializedName("start_date") val start_date : String,
		@SerializedName("no_of_people") val no_of_people : Int,
		@SerializedName("booking_as") val booking_as : String,
		@SerializedName("booking_number") val booking_number : String,
		@SerializedName("amount") val amount : Int,
		@SerializedName("employer_id") val employer_id : Int,
		@SerializedName("review_sent") val review_sent : Int,
		@SerializedName("status") val status : String,
		@SerializedName("no_of_booked_spaces") val no_of_booked_spaces : Int,
		@SerializedName("teams") val teams : List<Int>,
		@SerializedName("contacts") val contacts : List<Int>,
		@SerializedName("duration") val duration : Int,
		@SerializedName("employer") val employer : Employer
)