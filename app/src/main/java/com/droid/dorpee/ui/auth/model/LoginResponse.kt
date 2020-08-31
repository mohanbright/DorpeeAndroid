package com.droid.dorpee.ui.auth.model


import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("expires_at")
    val expiresAt: String? = null,
    @SerializedName("token")
    val token: String? = null,
    @SerializedName("token_type")
    val tokenType: String? = null,
    @SerializedName("user")
    var user: User? = null
)