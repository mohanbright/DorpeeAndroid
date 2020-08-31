package com.droid.dorpee.utils.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b.\u0018\u0000 \u00ab\u00012\u00020\u0001:\u0002\u00ab\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010x\u001a\u00020,J\u000e\u0010y\u001a\u00020,2\u0006\u0010z\u001a\u00020\u0006J\u0006\u0010{\u001a\u00020\u0006J\u0006\u0010|\u001a\u00020\u0006J\u0006\u0010}\u001a\u00020~J\u0006\u0010\u007f\u001a\u00020~J\u0007\u0010\u0080\u0001\u001a\u00020\u0006J\u0007\u0010\u0081\u0001\u001a\u00020IJ\u0007\u0010\u0082\u0001\u001a\u00020IJ\u0007\u0010\u0083\u0001\u001a\u00020IJ\u0007\u0010\u0084\u0001\u001a\u00020IJ\u0007\u0010\u0085\u0001\u001a\u00020\u0006J\u0007\u0010\u0086\u0001\u001a\u00020~J\u0007\u0010\u0087\u0001\u001a\u00020\u0006J\u0007\u0010\u0088\u0001\u001a\u00020~J\u0007\u0010\u0089\u0001\u001a\u00020\u0006J\u0007\u0010\u008a\u0001\u001a\u00020~J\u0007\u0010\u008b\u0001\u001a\u00020\u0006J\u0007\u0010\u008c\u0001\u001a\u00020~J\u0007\u0010\u008d\u0001\u001a\u00020\u0006J\u0007\u0010\u008e\u0001\u001a\u00020\u0006J\u0007\u0010\u008f\u0001\u001a\u00020\u0006J\u0007\u0010\u0090\u0001\u001a\u00020~J\u0010\u0010\u0091\u0001\u001a\u00020,2\u0007\u0010\u0092\u0001\u001a\u00020\u0006J\u0010\u0010\u0093\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020~J\u0010\u0010\u0095\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020~J\u0010\u0010\u0096\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020\u0006J\u0010\u0010\u0097\u0001\u001a\u00020,2\u0007\u0010\u0098\u0001\u001a\u00020IJ\u0010\u0010\u0099\u0001\u001a\u00020,2\u0007\u0010\u009a\u0001\u001a\u00020IJ\u0010\u0010\u009b\u0001\u001a\u00020,2\u0007\u0010\u0098\u0001\u001a\u00020IJ\u0010\u0010\u009c\u0001\u001a\u00020,2\u0007\u0010\u0098\u0001\u001a\u00020IJ\u0010\u0010\u009d\u0001\u001a\u00020,2\u0007\u0010\u009e\u0001\u001a\u00020\u0006J\u0010\u0010\u009f\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020~J\u0010\u0010\u00a0\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020\u0006J\u0010\u0010\u00a1\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020~J\u0010\u0010\u00a2\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020~J\u0010\u0010\u00a3\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020\u0006J\u0010\u0010\u00a4\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020\u0006J\u0010\u0010\u00a5\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020~J\u0010\u0010\u00a6\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020\u0006J\u0010\u0010\u00a7\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020\u0006J\u0010\u0010\u00a8\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020\u0006J\u0010\u0010\u00a9\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020~J\u0010\u0010\u00aa\u0001\u001a\u00020,2\u0007\u0010\u0094\u0001\u001a\u00020\u0006R(\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010RL\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00142\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010\"\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b0\u0010.R\u0011\u00101\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b2\u0010.R\u000e\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u00105\u001a\u0004\u0018\u00010\u00062\b\u00105\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010\b\"\u0004\b7\u0010\nR(\u00108\u001a\u0004\u0018\u0001092\b\u00108\u001a\u0004\u0018\u0001098F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010>\u001a\u0004\u0018\u00010\u00062\b\u0010>\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b?\u0010\b\"\u0004\b@\u0010\nR(\u0010C\u001a\u0004\u0018\u00010B2\b\u0010A\u001a\u0004\u0018\u00010B8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010J\u001a\u00020I2\u0006\u0010H\u001a\u00020I8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010N\u001a\u0004\u0018\u00010\u00062\b\u0010N\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bO\u0010\b\"\u0004\bP\u0010\nR(\u0010Q\u001a\u0004\u0018\u00010\u00062\b\u0010Q\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bR\u0010\b\"\u0004\bS\u0010\nR\u000e\u0010T\u001a\u00020UX\u0082\u0004\u00a2\u0006\u0002\n\u0000RL\u0010#\u001a\u0016\u0012\u0004\u0012\u00020V\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020V\u0018\u0001`\u00142\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020V\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020V\u0018\u0001`\u00148F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bW\u0010\u0016\"\u0004\bX\u0010\u0018R\u0016\u0010Y\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010A\u001a\u0004\u0018\u00010Z2\b\u0010A\u001a\u0004\u0018\u00010Z8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010_\u001a\u0004\u0018\u00010`2\b\u0010_\u001a\u0004\u0018\u00010`8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR(\u0010f\u001a\u0004\u0018\u00010\u00062\b\u0010e\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bg\u0010\b\"\u0004\bh\u0010\nR(\u0010i\u001a\u0004\u0018\u00010\u00062\b\u0010i\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bj\u0010\b\"\u0004\bk\u0010\nR(\u0010l\u001a\u0004\u0018\u00010m2\b\u0010l\u001a\u0004\u0018\u00010m8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR(\u0010s\u001a\u0004\u0018\u00010r2\b\u0010A\u001a\u0004\u0018\u00010r8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010w\u00a8\u0006\u00ac\u0001"}, d2 = {"Lcom/droid/dorpee/utils/preference/AppPreferences;", "Lcom/droid/dorpee/utils/preference/PreferenceAttribute;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "allVenueResponse", "Lcom/droid/dorpee/ui/venuedashboard/model/AllVenuesResponse;", "getAllVenueResponse", "()Lcom/droid/dorpee/ui/venuedashboard/model/AllVenuesResponse;", "setAllVenueResponse", "(Lcom/droid/dorpee/ui/venuedashboard/model/AllVenuesResponse;)V", "assets", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/venue/adapter/Asset;", "Lkotlin/collections/ArrayList;", "getAssets", "()Ljava/util/ArrayList;", "setAssets", "(Ljava/util/ArrayList;)V", "assettype", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "blockInOutResponse", "Lcom/droid/dorpee/ui/venuedashboard/model/BlockInOutResponse;", "getBlockInOutResponse", "()Lcom/droid/dorpee/ui/venuedashboard/model/BlockInOutResponse;", "setBlockInOutResponse", "(Lcom/droid/dorpee/ui/venuedashboard/model/BlockInOutResponse;)V", "card", "services", "", "Lcom/droid/dorpee/ui/auth/model/MDCard;", "cards", "getCards", "()Ljava/util/List;", "setCards", "(Ljava/util/List;)V", "clearEnvironment", "", "getClearEnvironment", "()Lkotlin/Unit;", "clearServices", "getClearServices", "clearTypes", "getClearTypes", "editor", "Landroid/content/SharedPreferences$Editor;", "emailAddress", "getEmailAddress", "setEmailAddress", "environment", "Lcom/droid/dorpee/ui/venue/model/EnvironmentResponse;", "getEnvironment", "()Lcom/droid/dorpee/ui/venue/model/EnvironmentResponse;", "setEnvironment", "(Lcom/droid/dorpee/ui/venue/model/EnvironmentResponse;)V", "firstName", "getFirstName", "setFirstName", "types", "Lcom/droid/dorpee/ui/auth/model/InterestResponse;", "interests", "getInterests", "()Lcom/droid/dorpee/ui/auth/model/InterestResponse;", "setInterests", "(Lcom/droid/dorpee/ui/auth/model/InterestResponse;)V", "isLogin", "", "isUserLogin", "()Z", "setUserLogin", "(Z)V", "lastName", "getLastName", "setLastName", "mobileNumber", "getMobileNumber", "setMobileNumber", "preference", "Landroid/content/SharedPreferences;", "Lcom/droid/dorpee/ui/venue/adapter/Amenitie;", "getServices", "setServices", "type", "Lcom/droid/dorpee/ui/venue/model/TypesResponse;", "getTypes", "()Lcom/droid/dorpee/ui/venue/model/TypesResponse;", "setTypes", "(Lcom/droid/dorpee/ui/venue/model/TypesResponse;)V", "user", "Lcom/droid/dorpee/ui/auth/model/LoginResponse;", "getUser", "()Lcom/droid/dorpee/ui/auth/model/LoginResponse;", "setUser", "(Lcom/droid/dorpee/ui/auth/model/LoginResponse;)V", "userType", "userId", "getUserId", "setUserId", "userName", "getUserName", "setUserName", "venueResponse", "Lcom/droid/dorpee/ui/venue/venueresponse/VenueResponse;", "getVenueResponse", "()Lcom/droid/dorpee/ui/venue/venueresponse/VenueResponse;", "setVenueResponse", "(Lcom/droid/dorpee/ui/venue/venueresponse/VenueResponse;)V", "Lcom/droid/dorpee/ui/venue/model/VenueTypeResponse;", "venueTypes", "getVenueTypes", "()Lcom/droid/dorpee/ui/venue/model/VenueTypeResponse;", "setVenueTypes", "(Lcom/droid/dorpee/ui/venue/model/VenueTypeResponse;)V", "clearPreferenceData", "clearPreferenceKey", "key", "getCardBrand", "getClosingDate", "getEmpCredits", "", "getEmpId", "getEmployeeCompany", "getISCardActive", "getIsActivePlan", "getIsAddress", "getIsCompanyEmployee", "getLastFour", "getNumberPeople", "getOpeningDate", "getPlanCredits", "getPlanExpiry", "getPlanId", "getPlanName", "getRemainingCredit", "getSelectedDate", "getTokenId", "getVenueName", "getWorkSpaces", "setCardBrand", "brand", "setEmpCredits", "planId", "setEmpId", "setEmployeeCompany", "setIsActivePlan", "isActivePlan", "setIsAddress", "isAddress", "setIsCardActive", "setIsCompanyEmployee", "setLastFour", "lastFour", "setNumberPeople", "setOpeningDate", "setPlanCredits", "setPlanId", "setPlanName", "setPlaneExpiry", "setRemainingCredit", "setSelectedDate", "setTokenId", "setVenueName", "setWorkSpaces", "setclosingDate", "Companion", "app_stageDebug"})
public final class AppPreferences implements com.droid.dorpee.utils.preference.PreferenceAttribute {
    private final android.content.SharedPreferences preference = null;
    private final android.content.SharedPreferences.Editor editor = null;
    private final java.lang.reflect.Type card = null;
    private final java.lang.reflect.Type type = null;
    private final java.lang.reflect.Type assettype = null;
    private static com.droid.dorpee.utils.preference.AppPreferences instance;
    public static final com.droid.dorpee.utils.preference.AppPreferences.Companion Companion = null;
    
    public final boolean isUserLogin() {
        return false;
    }
    
    public final void setUserLogin(boolean isLogin) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.auth.model.MDCard> getCards() {
        return null;
    }
    
    public final void setCards(@org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.auth.model.MDCard> services) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.auth.model.LoginResponse getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.auth.model.LoginResponse user) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.droid.dorpee.ui.venue.adapter.Amenitie> getServices() {
        return null;
    }
    
    public final void setServices(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.droid.dorpee.ui.venue.adapter.Amenitie> services) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.droid.dorpee.ui.venue.adapter.Asset> getAssets() {
        return null;
    }
    
    public final void setAssets(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.droid.dorpee.ui.venue.adapter.Asset> assets) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venue.model.TypesResponse getTypes() {
        return null;
    }
    
    public final void setTypes(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venue.model.TypesResponse types) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.auth.model.InterestResponse getInterests() {
        return null;
    }
    
    public final void setInterests(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.auth.model.InterestResponse types) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venue.model.VenueTypeResponse getVenueTypes() {
        return null;
    }
    
    public final void setVenueTypes(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venue.model.VenueTypeResponse types) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venue.venueresponse.VenueResponse getVenueResponse() {
        return null;
    }
    
    public final void setVenueResponse(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venue.venueresponse.VenueResponse venueResponse) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.model.AllVenuesResponse getAllVenueResponse() {
        return null;
    }
    
    public final void setAllVenueResponse(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.model.AllVenuesResponse allVenueResponse) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.model.BlockInOutResponse getBlockInOutResponse() {
        return null;
    }
    
    public final void setBlockInOutResponse(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.model.BlockInOutResponse blockInOutResponse) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venue.model.EnvironmentResponse getEnvironment() {
        return null;
    }
    
    public final void setEnvironment(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venue.model.EnvironmentResponse environment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Unit getClearEnvironment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Unit getClearServices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Unit getClearTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.Nullable()
    java.lang.String userType) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.Nullable()
    java.lang.String userName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.Nullable()
    java.lang.String firstName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.Nullable()
    java.lang.String lastName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String address) {
    }
    
    public final void setIsAddress(boolean isAddress) {
    }
    
    public final void setPlanId(int planId) {
    }
    
    public final int getPlanId() {
        return 0;
    }
    
    public final void setWorkSpaces(int planId) {
    }
    
    public final int getWorkSpaces() {
        return 0;
    }
    
    public final void setPlanCredits(int planId) {
    }
    
    public final int getPlanCredits() {
        return 0;
    }
    
    public final void setPlanName(@org.jetbrains.annotations.NotNull()
    java.lang.String planId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlanName() {
        return null;
    }
    
    public final void setNumberPeople(int planId) {
    }
    
    public final int getNumberPeople() {
        return 0;
    }
    
    public final void setEmpId(int planId) {
    }
    
    public final int getEmpId() {
        return 0;
    }
    
    public final void setEmpCredits(int planId) {
    }
    
    public final int getEmpCredits() {
        return 0;
    }
    
    public final void setPlaneExpiry(@org.jetbrains.annotations.NotNull()
    java.lang.String planId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClosingDate() {
        return null;
    }
    
    public final void setclosingDate(@org.jetbrains.annotations.NotNull()
    java.lang.String planId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpeningDate() {
        return null;
    }
    
    public final void setOpeningDate(@org.jetbrains.annotations.NotNull()
    java.lang.String planId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedDate() {
        return null;
    }
    
    public final void setSelectedDate(@org.jetbrains.annotations.NotNull()
    java.lang.String planId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTokenId() {
        return null;
    }
    
    public final void setTokenId(@org.jetbrains.annotations.NotNull()
    java.lang.String planId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlanExpiry() {
        return null;
    }
    
    public final void setEmployeeCompany(@org.jetbrains.annotations.NotNull()
    java.lang.String planId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmployeeCompany() {
        return null;
    }
    
    public final void setVenueName(@org.jetbrains.annotations.NotNull()
    java.lang.String planId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVenueName() {
        return null;
    }
    
    public final void setCardBrand(@org.jetbrains.annotations.NotNull()
    java.lang.String brand) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCardBrand() {
        return null;
    }
    
    public final void setLastFour(@org.jetbrains.annotations.NotNull()
    java.lang.String lastFour) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastFour() {
        return null;
    }
    
    public final void setRemainingCredit(int planId) {
    }
    
    public final int getRemainingCredit() {
        return 0;
    }
    
    public final void setIsActivePlan(boolean isActivePlan) {
    }
    
    public final boolean getIsActivePlan() {
        return false;
    }
    
    public final void setIsCompanyEmployee(boolean isActivePlan) {
    }
    
    public final boolean getIsCompanyEmployee() {
        return false;
    }
    
    public final void setIsCardActive(boolean isActivePlan) {
    }
    
    public final boolean getISCardActive() {
        return false;
    }
    
    public final boolean getIsAddress() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobileNumber() {
        return null;
    }
    
    public final void setMobileNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String mobileNumber) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmailAddress() {
        return null;
    }
    
    public final void setEmailAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String emailAddress) {
    }
    
    public final void clearPreferenceData() {
    }
    
    public final void clearPreferenceKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    private AppPreferences(android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/droid/dorpee/utils/preference/AppPreferences$Companion;", "", "()V", "instance", "Lcom/droid/dorpee/utils/preference/AppPreferences;", "getInstance", "context", "Landroid/content/Context;", "app_stageDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.droid.dorpee.utils.preference.AppPreferences getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}