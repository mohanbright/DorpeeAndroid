package com.droid.dorpee.ui.search.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PivotX(
    @SerializedName("environment_id")
    val environmentId: Int? = null,
    @SerializedName("space_id")
    val spaceId: Int? = null
): Serializable