package com.droid.dorpee.ui.auth.model

import com.droid.dorpee.ui.personaldashboard.models.Card
import com.droid.dorpee.ui.personaldashboard.models.Media
import com.droid.dorpee.ui.personaldashboard.models.Photo
import com.droid.dorpee.ui.personaldashboard.models.Subscription
import com.google.gson.annotations.SerializedName


data class ProfileData (

		@SerializedName("id") val id : Int,
		@SerializedName("first_name") val first_name : String,
		@SerializedName("email") val email : String,
		@SerializedName("email_verified_at") val email_verified_at : String,
		@SerializedName("created_at") val created_at : String,
		@SerializedName("updated_at") val updated_at : String,
		@SerializedName("last_name") val last_name : String,
		@SerializedName("phone_number") val phone_number : Int,
		@SerializedName("photo") val photo : Photo,
		@SerializedName("plan_expiry") val plan_expiry : String,
		@SerializedName("credit") val credit : Int,
		@SerializedName("linkedin") val linkedin : String,
		@SerializedName("privacy_linkedin") val privacy_linkedin : String,
		@SerializedName("privacy_name") val privacy_name : String,
		@SerializedName("privacy_interests") val privacy_interests : String,
		@SerializedName("plan_id") val plan_id : Int,
		@SerializedName("company_name") val company_name : String,
		@SerializedName("stripe_customer_id") val stripe_customer_id : String,
		@SerializedName("stripe_id") val stripe_id : String,
		@SerializedName("card_brand") val card_brand : String,
		@SerializedName("card_last_four") val card_last_four : String,
		@SerializedName("trial_ends_at") val trial_ends_at : String,
		@SerializedName("status") val status : String,
		@SerializedName("bsb") val bsb : Int,
		@SerializedName("account_number") val account_number : Int,
		@SerializedName("account_name") val account_name : String,
		@SerializedName("abn") val abn : Int,
		@SerializedName("company_legal_name") val company_legal_name : String,
		@SerializedName("ohs_only") val ohs_only : Boolean,
		@SerializedName("free_plan_status") val free_plan_status : String,
		@SerializedName("free_plan_expiry_date") val free_plan_expiry_date : String,
		@SerializedName("purchased_credits") val purchased_credits : Int,
		@SerializedName("employer_credits") val employer_credits : Int,
		@SerializedName("device_type") val device_type : String,
		@SerializedName("device_id") val device_id : String,
		@SerializedName("terms_accepted") val terms_accepted : String,
		@SerializedName("terms_accepted_date") val terms_accepted_date : String,
		@SerializedName("employer_plan_id") val employer_plan_id : String,
		@SerializedName("employee_cost") val employee_cost : String,
		@SerializedName("photo_link") val photo_link : String,
		@SerializedName("full_name") val full_name : String,
		@SerializedName("avatar") val avatar : String,
		@SerializedName("is_subscribed") val is_subscribed : Boolean,
		@SerializedName("current_subscription") val current_subscription : Current_subscription,
		@SerializedName("days_left_for_expiry") val days_left_for_expiry : Int,
		@SerializedName("card_status") val card_status : Boolean,
		@SerializedName("total_credits") val total_credits : Int,
		@SerializedName("media") val media : List<Media>,
		@SerializedName("interests") val interests : List<InterestResponse>,
		@SerializedName("subscriptions") val subscriptions : List<Subscription>,
		@SerializedName("cards") val cards : List<Card>
)