package com.droid.dorpee.ui.booking.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class Contact(
        @SerializedName("first_name")
        val first_name: String? = null,
        @SerializedName("last_name")
        val last_name: String? = null,
        @SerializedName("email")
        val email: String? = null,
        @SerializedName("team_id")
        val team_id: String? = null,
        @SerializedName("customer_id")
        val customer_id: Int? = null,
        @SerializedName("user_id")
        val user_id: Int? = null,
        @SerializedName("updated_at")
        val updated_at: String? = null,
        @SerializedName("created_at")
        val created_at: String? = null,
        @SerializedName("id")
        val id: String? = null,
        @SerializedName("full_name")
        val full_name: String? = null
): Serializable