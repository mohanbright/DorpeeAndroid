package com.droid.dorpee.ui.venue.venueresponse

import java.io.Serializable

data class Assessment(
    val completed_date: String? = null,
    val created_at: String? = null,
    val id: Int? = null,
    val result: String? = null,
    val updated_at: String? = null,
    val user_id: Int? = null,
    val venue_id: Int? = null
): Serializable