package com.droid.dorpee.ui.auth.model


import com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription
import com.droid.dorpee.ui.personaldashboard.models.Subscription
import com.droid.dorpee.ui.venue.venueresponse.PlanX
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
    val cardLastFour: Any? = null,
    @SerializedName("card_status")
    val cardStatus: Boolean? = null,
    @SerializedName("cards")
    var cards: List<MDCard>? = null,
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
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("email_verified_at")
    val emailVerifiedAt: Any? = null,
    @SerializedName("first_name")
    val firstName: String? = null,
    @SerializedName("free_plan_expiry_date")
    val freePlanExpiryDate: String? = null,
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
    val linkedin: Any? = null,
    @SerializedName("media")
    val media: List<Any>? = null,
    @SerializedName("ohs_only")
    val ohsOnly: String? = null,
    @SerializedName("phone_number")
    val phoneNumber: String? = null,
    @SerializedName("photo")
    val photo: Any? = null,
    @SerializedName("photo_link")
    val photoLink: Any? = null,
    @SerializedName("plan")
    val plan: PlanX? = null,
    @SerializedName("plan_expiry")
    val planExpiry: String? = null,
    @SerializedName("plan_id")
    var planId: Int? = null,
    @SerializedName("privacy_interests")
    val privacyInterests: Any? = null,
    @SerializedName("privacy_linkedin")
    val privacyLinkedin: Any? = null,
    @SerializedName("privacy_name")
    val privacyName: Any? = null,
    @SerializedName("role")
    var role: List<Role>? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("stripe_customer_id")
    val stripeCustomerId: String? = null,
    @SerializedName("stripe_id")
    val stripeId: String? = null,
    @SerializedName("subscriptions")
    val subscriptions: List<Subscription>? = null,
    @SerializedName("trial_ends_at")
    val trialEndsAt: Any? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null,
    @SerializedName("total_credits")
    val totalCredits: Int? = null
): Serializable