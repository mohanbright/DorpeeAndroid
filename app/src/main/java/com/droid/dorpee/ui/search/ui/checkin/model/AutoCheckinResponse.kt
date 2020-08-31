package com.droid.dorpee.ui.search.ui.checkin.model


import com.google.gson.annotations.SerializedName

data class AutoCheckinResponse(
    @SerializedName("data")
    val `data`: Data?
)