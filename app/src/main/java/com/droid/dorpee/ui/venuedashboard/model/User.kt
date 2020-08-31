package com.droid.dorpee.ui.venuedashboard.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class User(
    @SerializedName("abn")
    val abn: String? = null,
    @SerializedName("account_name")
    val accountName: String? = null,
    @SerializedName("account_number")
    val accountNumber: String? = null,
    @SerializedName("avatar")
    val avatar: String? = null,
    @SerializedName("bsb")
    val bsb: String? = null,
    @SerializedName("card_brand")
    val cardBrand: String? = null,
    @SerializedName("card_last_four")
    val cardLastFour: String? = null,
    @SerializedName("card_status")
    val cardStatus: Boolean? = null,
    @SerializedName("cards")
    val cards: List<Card>? = null,
    @SerializedName("company_legal_name")
    val companyLegalName: String? = null,
    @SerializedName("company_name")
    val companyName: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("credit")
    val credit: Int? = null,
    @SerializedName("current_subscription")
    val currentSubscription: CurrentSubscription? = null,
    @SerializedName("days_left_for_expiry")
    val daysLeftForExpiry: Int? = null,
    @SerializedName("device_id")
    val deviceId: Any? = null,
    @SerializedName("device_type")
    val deviceType: Any? = null,
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("email_verified_at")
    val emailVerifiedAt: String? = null,
    @SerializedName("employer_credits")
    val employerCredits: Int? = null,
    @SerializedName("first_name")
    val firstName: String? = null,
    @SerializedName("free_plan_expiry_date")
    val freePlanExpiryDate: Any? = null,
    @SerializedName("free_plan_status")
    val freePlanStatus: String? = null,
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
/*    @SerializedName("media")
    val media: List<Media>? = null,*/
    @SerializedName("ohs_only")
    val ohsOnly: String? = null,
    @SerializedName("phone_number")
    val phoneNumber: String? = null,
    @SerializedName("photo")
    val photo: Photo? = null,
    @SerializedName("photo_link")
    val photoLink: String? = null,
    @SerializedName("plan_expiry")
    val planExpiry: String? = null,
    @SerializedName("plan_id")
    val planId: Int? = null,
    @SerializedName("privacy_interests")
    val privacyInterests: String? = null,
    @SerializedName("privacy_linkedin")
    val privacyLinkedin: String? = null,
    @SerializedName("privacy_name")
    val privacyName: String? = null,
    @SerializedName("purchased_credits")
    val purchasedCredits: Int? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("stripe_customer_id")
    val stripeCustomerId: Any? = null,
    @SerializedName("stripe_id")
    val stripeId: String? = null,
    @SerializedName("subscriptions")
    val subscriptions: List<Subscription>? = null,
    @SerializedName("total_credits")
    val totalCredits: Int? = null,
    @SerializedName("trial_ends_at")
    val trialEndsAt: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null
):Serializable