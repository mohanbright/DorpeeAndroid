package com.droid.dorpee.ui.auth.model

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id") val id: Int? = null,
    @SerializedName("interest")
    val interest: String? = null,
    var checked :Boolean =false
)