package com.droid.dorpee.ui.venue.venueresponse

import java.io.Serializable

data class PlanX(
    val created_at: String,
    val credits: Int,
    val deleted_at: Any,
    val description: String,
    val free_space: String,
    val id: Int,
    val name: String,
    val price: String,
    val type: String,
    val updated_at: String,
    val checked: Boolean
):Serializable
