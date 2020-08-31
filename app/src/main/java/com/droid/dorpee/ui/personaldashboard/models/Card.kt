package com.droid.dorpee.ui.personaldashboard.models

import java.io.Serializable

data class Card(
    val brand: String,
    val created_at: String,
    val exp_month: String,
    val exp_year: String,
    val id: Int,
    val is_default: Int,
    val last4: String,
    val name: String,
    val updated_at: String,
    val user_id: Int
) : Serializable