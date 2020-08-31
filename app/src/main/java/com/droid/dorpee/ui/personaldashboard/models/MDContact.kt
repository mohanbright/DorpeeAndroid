package com.droid.dorpee.ui.personaldashboard.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class MDContact (

	@SerializedName("id") val id : Int,
	@SerializedName("first_name") val first_name : String,
	@SerializedName("last_name") val last_name : String,
	@SerializedName("email") val email : String,
	@SerializedName("user_id") val user_id : String,
	@SerializedName("customer_id") val customer_id : Int,
	@SerializedName("team_id") val team_id : Int,
	@SerializedName("created_at") val created_at : String,
	@SerializedName("updated_at") val updated_at : String,
	@SerializedName("deleted_at") val deleted_at : String,
	@SerializedName("full_name") val full_name : String,
//	@SerializedName("user") val user : String,
	@SerializedName("customer") val customer : User,
	@SerializedName("team") val team : MDTeamX,
	@SerializedName("isChecked") var isChecked : Boolean

) : Serializable