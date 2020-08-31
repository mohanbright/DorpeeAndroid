package com.droid.dorpee.ui.personaldashboard.models

import java.io.Serializable

data class MDTeamX(
    val contact_count: Int,
    val contacts: List<Any>,
    val created_at: String,
    val customer_id: Int,
    val id: Int,
    val name: String,
    val updated_at: String,
    var isClicked: Boolean

) : Serializable