package com.droid.dorpee.ui.auth.model

import com.google.gson.annotations.SerializedName

data class TransactionData (

        @SerializedName("id") val id : Int,
        @SerializedName("customer_id") val customer_id : Int,
        @SerializedName("type") val type : String,
        @SerializedName("amount") val amount : Double,
        @SerializedName("xero_reciept") val xero_reciept : String,
        @SerializedName("created_at") val created_at : String,
        @SerializedName("updated_at") val updated_at : String,
        @SerializedName("customer") val customer : Customer
)
