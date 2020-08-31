package com.droid.dorpee.ui.personaldashboard.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bf\b\u0086\b\u0018\u00002\u00020\u0001B\u00f1\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\f\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000e\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010&\u001a\u00020\'\u0012\u0006\u0010(\u001a\u00020\u0007\u0012\u0006\u0010)\u001a\u00020\u0007\u0012\u0006\u0010*\u001a\u00020\u0014\u0012\u0006\u0010+\u001a\u00020\u0007\u0012\u0006\u0010,\u001a\u00020\u0007\u0012\u0006\u0010-\u001a\u00020\u0007\u0012\u0006\u0010.\u001a\u00020\u0014\u0012\u0006\u0010/\u001a\u00020\u0007\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0007\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002030\u000e\u0012\u0006\u00104\u001a\u00020\u0014\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0007\u00a2\u0006\u0002\u00107J\t\u0010i\u001a\u00020\u0003H\u00c6\u0003J\t\u0010j\u001a\u00020\u0003H\u00c6\u0003J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\t\u0010l\u001a\u00020\u0007H\u00c6\u0003J\t\u0010m\u001a\u00020\u0014H\u00c6\u0003J\t\u0010n\u001a\u00020\u0016H\u00c6\u0003J\t\u0010o\u001a\u00020\u0014H\u00c6\u0003J\t\u0010p\u001a\u00020\u0007H\u00c6\u0003J\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010r\u001a\u00020\u0007H\u00c6\u0003J\t\u0010s\u001a\u00020\u0003H\u00c6\u0003J\t\u0010t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010u\u001a\u00020\u0007H\u00c6\u0003J\t\u0010v\u001a\u00020\u0007H\u00c6\u0003J\t\u0010w\u001a\u00020\u0014H\u00c6\u0003J\t\u0010x\u001a\u00020\fH\u00c6\u0003J\t\u0010y\u001a\u00020\u0007H\u00c6\u0003J\t\u0010z\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010{\u001a\b\u0012\u0004\u0012\u00020#0\u000eH\u00c6\u0003J\t\u0010|\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010~\u001a\u00020\'H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0014H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0014H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u0002030\u000eH\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u0014H\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0007H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\fH\u00c6\u0003J\u0010\u0010\u0093\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003J\u00cc\u0003\u0010\u0094\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00032\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000e2\b\b\u0002\u0010$\u001a\u00020\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010&\u001a\u00020\'2\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010)\u001a\u00020\u00072\b\b\u0002\u0010*\u001a\u00020\u00142\b\b\u0002\u0010+\u001a\u00020\u00072\b\b\u0002\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020\u00142\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00072\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u0002030\u000e2\b\b\u0002\u00104\u001a\u00020\u00142\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u0007H\u00c6\u0001J\u0015\u0010\u0095\u0001\u001a\u00020\f2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0014H\u00d6\u0001J\n\u0010\u0098\u0001\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00109R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010=R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00109R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00109R\u0011\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010=R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010IR\u0011\u0010\u0018\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010=R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00109R\u0011\u0010\u001a\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010=R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00109R\u0011\u0010\u001c\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010=R\u0011\u0010\u001d\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010=R\u0011\u0010\u001e\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010IR\u0011\u0010\u001f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010BR\u0011\u0010 \u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010=R\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00109R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010DR\u0011\u0010$\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010=R\u0013\u0010%\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010=R\u0011\u0010&\u001a\u00020\'\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0011\u0010(\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010=R\u0011\u0010)\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010=R\u0011\u0010*\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010IR\u0011\u0010+\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010=R\u0011\u0010,\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010=R\u0011\u0010-\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010=R\u0011\u0010.\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010IR\u0011\u0010/\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010=R\u0011\u00100\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u00109R\u0011\u00101\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010=R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010DR\u0011\u00104\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010IR\u0011\u00105\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u00109R\u0011\u00106\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010=\u00a8\u0006\u0099\u0001"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/models/User;", "Ljava/io/Serializable;", "abn", "", "account_name", "account_number", "avatar", "", "bsb", "card_brand", "card_last_four", "card_status", "", "cards", "", "Lcom/droid/dorpee/ui/personaldashboard/models/Card;", "company_legal_name", "company_name", "created_at", "credit", "", "current_subscription", "Lcom/droid/dorpee/ui/personaldashboard/models/CurrentSubscription;", "days_left_for_expiry", "email", "email_verified_at", "first_name", "free_plan_expiry_date", "free_plan_status", "full_name", "id", "is_subscribed", "last_name", "linkedin", "media", "Lcom/droid/dorpee/ui/personaldashboard/models/MediaXX;", "ohs_only", "phone_number", "photo", "Lcom/droid/dorpee/ui/personaldashboard/models/Photo;", "photo_link", "plan_expiry", "plan_id", "privacy_interests", "privacy_linkedin", "privacy_name", "purchased_credits", "status", "stripe_customer_id", "stripe_id", "subscriptions", "Lcom/droid/dorpee/ui/personaldashboard/models/Subscription;", "total_credits", "trial_ends_at", "updated_at", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;ILcom/droid/dorpee/ui/personaldashboard/models/CurrentSubscription;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/droid/dorpee/ui/personaldashboard/models/Photo;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;Ljava/lang/String;)V", "getAbn", "()Ljava/lang/Object;", "getAccount_name", "getAccount_number", "getAvatar", "()Ljava/lang/String;", "getBsb", "getCard_brand", "getCard_last_four", "getCard_status", "()Z", "getCards", "()Ljava/util/List;", "getCompany_legal_name", "getCompany_name", "getCreated_at", "getCredit", "()I", "getCurrent_subscription", "()Lcom/droid/dorpee/ui/personaldashboard/models/CurrentSubscription;", "getDays_left_for_expiry", "getEmail", "getEmail_verified_at", "getFirst_name", "getFree_plan_expiry_date", "getFree_plan_status", "getFull_name", "getId", "getLast_name", "getLinkedin", "getMedia", "getOhs_only", "getPhone_number", "getPhoto", "()Lcom/droid/dorpee/ui/personaldashboard/models/Photo;", "getPhoto_link", "getPlan_expiry", "getPlan_id", "getPrivacy_interests", "getPrivacy_linkedin", "getPrivacy_name", "getPurchased_credits", "getStatus", "getStripe_customer_id", "getStripe_id", "getSubscriptions", "getTotal_credits", "getTrial_ends_at", "getUpdated_at", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_liveDebug"})
public final class User implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object abn = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object account_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object account_number = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String avatar = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object bsb = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String card_brand = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String card_last_four = null;
    private final boolean card_status = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.droid.dorpee.ui.personaldashboard.models.Card> cards = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object company_legal_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object company_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created_at = null;
    private final int credit = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription current_subscription = null;
    private final int days_left_for_expiry = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object email_verified_at = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String first_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object free_plan_expiry_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String free_plan_status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String full_name = null;
    private final int id = 0;
    private final boolean is_subscribed = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String last_name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object linkedin = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.droid.dorpee.ui.personaldashboard.models.MediaXX> media = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ohs_only = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String phone_number = null;
    @org.jetbrains.annotations.NotNull()
    private final com.droid.dorpee.ui.personaldashboard.models.Photo photo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String photo_link = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String plan_expiry = null;
    private final int plan_id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String privacy_interests = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String privacy_linkedin = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String privacy_name = null;
    private final int purchased_credits = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object stripe_customer_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String stripe_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.droid.dorpee.ui.personaldashboard.models.Subscription> subscriptions = null;
    private final int total_credits = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object trial_ends_at = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updated_at = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAbn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAccount_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAccount_number() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBsb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCard_brand() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCard_last_four() {
        return null;
    }
    
    public final boolean getCard_status() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.Card> getCards() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCompany_legal_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCompany_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    public final int getCredit() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription getCurrent_subscription() {
        return null;
    }
    
    public final int getDays_left_for_expiry() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmail_verified_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirst_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFree_plan_expiry_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFree_plan_status() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFull_name() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final boolean is_subscribed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLast_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getLinkedin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.MediaXX> getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOhs_only() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhone_number() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.personaldashboard.models.Photo getPhoto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoto_link() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlan_expiry() {
        return null;
    }
    
    public final int getPlan_id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrivacy_interests() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrivacy_linkedin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrivacy_name() {
        return null;
    }
    
    public final int getPurchased_credits() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getStripe_customer_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStripe_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.Subscription> getSubscriptions() {
        return null;
    }
    
    public final int getTotal_credits() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTrial_ends_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    public User(@org.jetbrains.annotations.NotNull()
    java.lang.Object abn, @org.jetbrains.annotations.NotNull()
    java.lang.Object account_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object account_number, @org.jetbrains.annotations.NotNull()
    java.lang.String avatar, @org.jetbrains.annotations.NotNull()
    java.lang.Object bsb, @org.jetbrains.annotations.NotNull()
    java.lang.String card_brand, @org.jetbrains.annotations.NotNull()
    java.lang.String card_last_four, boolean card_status, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.Card> cards, @org.jetbrains.annotations.NotNull()
    java.lang.Object company_legal_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object company_name, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, int credit, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription current_subscription, int days_left_for_expiry, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.Object email_verified_at, @org.jetbrains.annotations.NotNull()
    java.lang.String first_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object free_plan_expiry_date, @org.jetbrains.annotations.NotNull()
    java.lang.String free_plan_status, @org.jetbrains.annotations.NotNull()
    java.lang.String full_name, int id, boolean is_subscribed, @org.jetbrains.annotations.NotNull()
    java.lang.String last_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object linkedin, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.MediaXX> media, @org.jetbrains.annotations.NotNull()
    java.lang.String ohs_only, @org.jetbrains.annotations.Nullable()
    java.lang.String phone_number, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.models.Photo photo, @org.jetbrains.annotations.NotNull()
    java.lang.String photo_link, @org.jetbrains.annotations.NotNull()
    java.lang.String plan_expiry, int plan_id, @org.jetbrains.annotations.NotNull()
    java.lang.String privacy_interests, @org.jetbrains.annotations.NotNull()
    java.lang.String privacy_linkedin, @org.jetbrains.annotations.NotNull()
    java.lang.String privacy_name, int purchased_credits, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.Object stripe_customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String stripe_id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.Subscription> subscriptions, int total_credits, @org.jetbrains.annotations.NotNull()
    java.lang.Object trial_ends_at, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.Card> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription component14() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final boolean component23() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.MediaXX> component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.personaldashboard.models.Photo component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component31() {
        return null;
    }
    
    public final int component32() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component35() {
        return null;
    }
    
    public final int component36() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.Subscription> component40() {
        return null;
    }
    
    public final int component41() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.personaldashboard.models.User copy(@org.jetbrains.annotations.NotNull()
    java.lang.Object abn, @org.jetbrains.annotations.NotNull()
    java.lang.Object account_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object account_number, @org.jetbrains.annotations.NotNull()
    java.lang.String avatar, @org.jetbrains.annotations.NotNull()
    java.lang.Object bsb, @org.jetbrains.annotations.NotNull()
    java.lang.String card_brand, @org.jetbrains.annotations.NotNull()
    java.lang.String card_last_four, boolean card_status, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.Card> cards, @org.jetbrains.annotations.NotNull()
    java.lang.Object company_legal_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object company_name, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, int credit, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription current_subscription, int days_left_for_expiry, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.Object email_verified_at, @org.jetbrains.annotations.NotNull()
    java.lang.String first_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object free_plan_expiry_date, @org.jetbrains.annotations.NotNull()
    java.lang.String free_plan_status, @org.jetbrains.annotations.NotNull()
    java.lang.String full_name, int id, boolean is_subscribed, @org.jetbrains.annotations.NotNull()
    java.lang.String last_name, @org.jetbrains.annotations.NotNull()
    java.lang.Object linkedin, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.MediaXX> media, @org.jetbrains.annotations.NotNull()
    java.lang.String ohs_only, @org.jetbrains.annotations.Nullable()
    java.lang.String phone_number, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.models.Photo photo, @org.jetbrains.annotations.NotNull()
    java.lang.String photo_link, @org.jetbrains.annotations.NotNull()
    java.lang.String plan_expiry, int plan_id, @org.jetbrains.annotations.NotNull()
    java.lang.String privacy_interests, @org.jetbrains.annotations.NotNull()
    java.lang.String privacy_linkedin, @org.jetbrains.annotations.NotNull()
    java.lang.String privacy_name, int purchased_credits, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.Object stripe_customer_id, @org.jetbrains.annotations.NotNull()
    java.lang.String stripe_id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.Subscription> subscriptions, int total_credits, @org.jetbrains.annotations.NotNull()
    java.lang.Object trial_ends_at, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}