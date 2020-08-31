package com.droid.dorpee.ui.auth.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Pivot(
    @SerializedName("role_id")
    val roleId: Int? = null,
    @SerializedName("user_id")
    val userId: Int? = null
): Serializable