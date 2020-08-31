package com.droid.dorpee.ui.venue.venueresponse


import com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription
import com.droid.dorpee.ui.personaldashboard.models.Subscription
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class User(
    @SerializedName("abn")
    val abn: Any? = null,
    @SerializedName("account_name")
    val accountName: Any? = null,
    @SerializedName("account_number")
    val accountNumber: Any? = null,
    @SerializedName("avatar")
    val avatar: Any? = null,
    @SerializedName("bsb")
    val bsb: Any? = null,
    @SerializedName("card_brand")
    val cardBrand: Any? = null,
    @SerializedName("card_last_four")
    val cardLastFour: Any? = null,
    @SerializedName("card_status")
    val cardStatus: Boolean? = null,
    @SerializedName("cards")
    val cards: List<Any>? = null,
    @SerializedName("company_legal_name")
    val companyLegalName: Any? = null,
    @SerializedName("company_name")
    val companyName: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("credit")
    val credit: Any? = null,
    @SerializedName("current_subscription")
    val currentSubscription: CurrentSubscription? = null,
    @SerializedName("days_left_for_expiry")
    val daysLeftForExpiry: Int? = null,
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("email_verified_at")
    val emailVerifiedAt: Any? = null,
    @SerializedName("first_name")
    val firstName: String? = null,
    @SerializedName("free_plan_expiry_date")
    val freePlanExpiryDate: Any? = null,
    @SerializedName("free_plan_status")
    val freePlanStatus: Any? = null,
    @SerializedName("full_name")
    val fullName: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("is_subscribed")
    val isSubscribed: Boolean? = null,
    @SerializedName("last_name")
    val lastName: String? = null,
    @SerializedName("linkedin")
    val linkedin: String? = null,
//    @SerializedName("media")
//    val media: List<Any>? = null,
    @SerializedName("ohs_only")
    val ohsOnly: String? = null,
    @SerializedName("phone_number")
    val phoneNumber: String? = null,
    @SerializedName("photo")
    val photo: Any? = null,
    @SerializedName("photo_link")
    val photoLink: Any? = null,
    @SerializedName("plan_expiry")
    val planExpiry: Any? = null,
    @SerializedName("plan_id")
    val planId: Any? = null,
    @SerializedName("privacy_interests")
    val privacyInterests: Any? = null,
    @SerializedName("privacy_linkedin")
    val privacyLinkedin: String? = null,
    @SerializedName("privacy_name")
    val privacyName: String? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("stripe_customer_id")
    val stripeCustomerId: String? = null,
    @SerializedName("stripe_id")
    val stripeId: String? = null,
    @SerializedName("subscriptions")
    val subscriptions: List<Subscription>? = null,
    @SerializedName("trial_ends_at")
    val trialEndsAt: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null
):Serializable