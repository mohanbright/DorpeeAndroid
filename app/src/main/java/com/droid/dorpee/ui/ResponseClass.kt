package com.droid.dorpee.ui

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ErrorResponse(var error: String = "")

data class DeleteResponse(var success: String = "")

data class UnBlockResponse(var success: String = "")

data class BlockResponse(@SerializedName("data") var data:Any?)

data class ForgotResponse(@Expose @SerializedName("success")  var success : Boolean=false,
                          @Expose @SerializedName("message") var message:String?)