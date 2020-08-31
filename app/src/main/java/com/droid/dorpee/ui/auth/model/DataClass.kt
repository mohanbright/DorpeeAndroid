package com.droid.dorpee.ui.auth.model

import com.google.gson.annotations.SerializedName

data class DataClass(
		@SerializedName("id") val id : Int,
		@SerializedName("user_id") val user_id : Int,
		@SerializedName("name") val name : String,
		@SerializedName("stripe_id") val stripe_id : String,
		@SerializedName("stripe_plan") val stripe_plan : String,
		@SerializedName("quantity") val quantity : Int,
		@SerializedName("trial_ends_at") val trial_ends_at : String,
		@SerializedName("ends_at") val ends_at : String,
		@SerializedName("created_at") val created_at : String,
		@SerializedName("updated_at") val updated_at : String,
		@SerializedName("cancelled_at") val cancelled_at : String,
		@SerializedName("cancel_at") val cancel_at : String,
		@SerializedName("user") val user : User,
		@SerializedName("credit_price") val credit_price : Double,
		@SerializedName("total_credits") val total_credits : Int,
		@SerializedName("plan_expiry") val plan_expiry : String

)
