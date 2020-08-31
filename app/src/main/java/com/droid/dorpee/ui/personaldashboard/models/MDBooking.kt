package com.droid.dorpee.ui.personaldashboard.models

import com.droid.dorpee.ui.auth.model.User
import com.droid.dorpee.ui.venuedashboard.model.Space
import java.io.Serializable

data class MDBooking(
        val amount: String,
        val booking_as: String,
        val booking_number: String,
        var booking_status: String,
        val contacts: Any,
        val created_at: String,
        val credits: Int,
        val deleted_at: String,
        val duration: Int,
        val employer: Any,
        val employer_id: Any,
        var end_date: String,
        val end_time: String,
        val id: Int,
        val no_of_booked_spaces: Int,
        val no_of_people: Int,
        val notes: Any,
        val review_sent: Int,
        val space: Space?,
        val space_id: Int,
        val start_date: String,
        val start_time: String,
        var status: String,
        val teams: Any,
        val type: Any,
        val updated_at: String,
        val user: User,
        val user_id: Int,
        val venue_id: Int
) : Serializable