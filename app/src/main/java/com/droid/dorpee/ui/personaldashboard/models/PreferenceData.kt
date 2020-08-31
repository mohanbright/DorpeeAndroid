package com.droid.dorpee.ui.personaldashboard.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PreferenceData(
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("user_id")
        val user_id: Int? = null,
        @SerializedName("types")
        val types: List<String>? = null,
        @SerializedName("interests")
        val interests: List<String>? = null,
        @SerializedName("environments")
        val environments: List<String>? = null,
        @SerializedName("services")
        val services: List<String>? = null,
        @SerializedName("created_at")
        val created_at: String? = null,
        @SerializedName("updated_at")
        val updated_at: String? = null,
        @SerializedName("assets")
        val assets: String? = null,
        @SerializedName("typesText")
        val typesText: List<String>? = null,
        @SerializedName("interestsText")
        val interestsText: List<String>? = null,
        @SerializedName("servicesText")
        val servicesText: List<String>? = null,
        @SerializedName("environmentsText")
        val environmentsText: List<String>? = null
): Serializable