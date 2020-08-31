package com.droid.dorpee.ui.personaldashboard.models

import java.io.Serializable

data class CurrentSubscription(
    val cancel_at: Any,
    val cancelled_at: Any,
    val created_at: String,
    val ends_at: Any,
    val id: Int,
    val name: String,
    val quantity: Int,
    val stripe_id: String,
    val stripe_plan: String,
    val trial_ends_at: Any,
    val updated_at: String,
    val user_id: Int
) : Serializable