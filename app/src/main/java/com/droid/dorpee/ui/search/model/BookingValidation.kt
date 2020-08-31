package com.droid.dorpee.ui.search.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class BookingValidation(
        @SerializedName("availability") var availability: String? = null,
        @SerializedName("max_available") var max_available: Int? = null,
        @SerializedName("message") var message: String? = null
)