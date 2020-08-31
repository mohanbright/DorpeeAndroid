package com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("abn")
    val abn: String?,
    @SerializedName("account_name")
    val accountName: String?,
    @SerializedName("account_number")
    val accountNumber: String?,
    @SerializedName("avatar")
    val avatar: Any?,
    @SerializedName("bookings")
    val bookings: List<Booking>?,
    @SerializedName("bookings_count")
    val bookingsCount: Int?,
    @SerializedName("bsb")
    val bsb: String?,
    @SerializedName("card_brand")
    val cardBrand: String?,
    @SerializedName("card_last_four")
    val cardLastFour: String?,
    @SerializedName("card_status")
    val cardStatus: Boolean?,
    @SerializedName("cards")
    val cards: List<Card>?,
    @SerializedName("company_legal_name")
    val companyLegalName: String?,
    @SerializedName("company_name")
    val companyName: Any?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("credit")
    val credit: Int?,
    @SerializedName("current_subscription")
    val currentSubscription: CurrentSubscription?,
    @SerializedName("days_left_for_expiry")
    val daysLeftForExpiry: Int?,
    @SerializedName("device_id")
    val deviceId: Any?,
    @SerializedName("device_type")
    val deviceType: String?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("email_verified_at")
    val emailVerifiedAt: String?,
    @SerializedName("employee_cost")
    val employeeCost: String?,
    @SerializedName("employer_credits")
    val employerCredits: Int?,
    @SerializedName("employer_plan_id")
    val employerPlanId: String?,
    @SerializedName("first_name")
    val firstName: String?,
    @SerializedName("free_plan_expiry_date")
    val freePlanExpiryDate: String?,
    @SerializedName("free_plan_status")
    val freePlanStatus: String?,
    @SerializedName("full_name")
    val fullName: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("interests")
    val interests: List<Any>?,
    @SerializedName("is_subscribed")
    val isSubscribed: Boolean?,
    @SerializedName("last_name")
    val lastName: String?,
    @SerializedName("linkedin")
    val linkedin: String?,
    @SerializedName("media")
    val media: List<Any>?,
    @SerializedName("ohs_only")
    val ohsOnly: String?,
    @SerializedName("phone_number")
    val phoneNumber: String?,
    @SerializedName("photo")
    val photo: Any?,
    @SerializedName("photo_link")
    val photoLink: Any?,
    @SerializedName("plan")
    val plan: Plan?,
    @SerializedName("plan_expiry")
    val planExpiry: String?,
    @SerializedName("plan_id")
    val planId: Int?,
    @SerializedName("privacy_interests")
    val privacyInterests: String?,
    @SerializedName("privacy_linkedin")
    val privacyLinkedin: String?,
    @SerializedName("privacy_name")
    val privacyName: String?,
    @SerializedName("purchased_credits")
    val purchasedCredits: Int?,
    @SerializedName("role")
    val role: List<Role>?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("stripe_customer_id")
    val stripeCustomerId: Any?,
    @SerializedName("stripe_id")
    val stripeId: String?,
    @SerializedName("subscriptions")
    val subscriptions: List<Subscription>?,
    @SerializedName("terms_accepted")
    val termsAccepted: Any?,
    @SerializedName("terms_accepted_date")
    val termsAcceptedDate: Any?,
    @SerializedName("total_credits")
    val totalCredits: Int?,
    @SerializedName("trial_ends_at")
    val trialEndsAt: Any?,
    @SerializedName("updated_at")
    val updatedAt: String?
)