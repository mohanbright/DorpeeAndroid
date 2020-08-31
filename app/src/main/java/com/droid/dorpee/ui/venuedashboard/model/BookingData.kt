package com.droid.dorpee.ui.venuedashboard.model

import com.google.gson.annotations.SerializedName


data class BookingData (

        @SerializedName("booking_as") val booking_as : String,
        @SerializedName("credits") val credits : Int,
        @SerializedName("end_date") val end_date : String,
        @SerializedName("end_time") val end_time : String,
        @SerializedName("no_of_booked_spaces") val no_of_booked_spaces : Int,
        @SerializedName("no_of_people") val no_of_people : Int,
        @SerializedName("space_id") val space_id : Int,
        @SerializedName("start_date") val start_date : String,
        @SerializedName("start_time") val start_time : String,
        @SerializedName("user_id") val user_id : Int,
        @SerializedName("booking_number") val booking_number : String,
        @SerializedName("amount") val amount : Int,
        @SerializedName("updated_at") val updated_at : String,
        @SerializedName("created_at") val created_at : String,
        @SerializedName("id") val id : Int,
        @SerializedName("duration") val duration : Int,
        @SerializedName("employer") val employer : String,
        @SerializedName("space") val space : Space
)