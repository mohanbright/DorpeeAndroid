package com.droid.dorpee.ui.search.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PivotXX(
    @SerializedName("space_id")
    val spaceId: Int? = null,
    @SerializedName("type_id")
    val typeId: Int? = null
):Serializable