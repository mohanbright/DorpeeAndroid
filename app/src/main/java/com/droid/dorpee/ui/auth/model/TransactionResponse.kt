package com.droid.dorpee.ui.auth.model

import com.google.gson.annotations.SerializedName

data class TransactionResponse (

        @SerializedName("data") val data : List<TransactionData>
)