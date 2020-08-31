package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName

data class PivotX(
    @SerializedName("environment_id")
    val environmentId: Int? = null,
    @SerializedName("space_id")
    val spaceId: Int? = null
)