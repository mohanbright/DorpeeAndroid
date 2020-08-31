package com.droid.dorpee.ui.venue.model


import com.google.gson.annotations.SerializedName

data class Pivot(
    @SerializedName("asset_id")
    val assetId: Int? = null,
    @SerializedName("space_id")
    val spaceId: Int? = null
)