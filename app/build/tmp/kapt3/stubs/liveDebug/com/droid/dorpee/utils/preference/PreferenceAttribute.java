package com.droid.dorpee.utils.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/droid/dorpee/utils/preference/PreferenceAttribute;", "", "Companion", "app_liveDebug"})
public abstract interface PreferenceAttribute {
    public static final com.droid.dorpee.utils.preference.PreferenceAttribute.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCE_NAME = "FON_HOME_PREFERENCE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_USER_LOGIN = "isUserLogin";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER = "user";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CARD = "card";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_TYPE = "userType";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_NAME = "userName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIRST_NAME = "firstName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_NAME = "lastName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS = "address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_ADDRESS = "isAddress";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOBILE_NUMBER = "mobileNumber";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMAIL_ADDRESS = "emailAddress";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICES = "services";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPES = "types";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INTERESTS = "interests";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VENUE_TYPES = "venuetypes";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VENUE_RES = "venueresponse";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALL_VENUE_RES = "allVenueResponse";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BLOCK_OUT_RES = "blockInOutResponse";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ENVIRONMENT = "Environment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ASSETS = "Assets";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLANID = "plan_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLANCREDITS = "plan_credits";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REMAINCREDITS = "remain_credits";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXPIRYPLAN = "plan_expiry";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PLANNAME = "plan_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ISActivePlan = "active_plan";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CARDBRAND = "card_brand";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LASTFOUR = "last_four";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ISCARDACTIVE = "active_card";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORKSPACE = "workspace";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OPENINGDATE = "openingDate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECTDATE = "selectedDate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLOSINGDATE = "closingDate";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NUMBERPEOPLE = "numberPeople";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMPCOMPANY = "emp_company";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMPCREDITS = "emp_credits";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMPID = "emp_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IsEmployee = "isCompanyEmployee";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VenueName = "venueName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TokenId = "tokenID";
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/droid/dorpee/utils/preference/PreferenceAttribute$Companion;", "", "()V", "ADDRESS", "", "ALL_VENUE_RES", "ASSETS", "BLOCK_OUT_RES", "CARD", "CARDBRAND", "CLOSINGDATE", "EMAIL_ADDRESS", "EMPCOMPANY", "EMPCREDITS", "EMPID", "ENVIRONMENT", "EXPIRYPLAN", "FIRST_NAME", "INTERESTS", "ISActivePlan", "ISCARDACTIVE", "IS_ADDRESS", "IS_USER_LOGIN", "IsEmployee", "LASTFOUR", "LAST_NAME", "MOBILE_NUMBER", "NUMBERPEOPLE", "OPENINGDATE", "PLANCREDITS", "PLANID", "PLANNAME", "PREFERENCE_NAME", "REMAINCREDITS", "SELECTDATE", "SERVICES", "TYPES", "TokenId", "USER", "USER_NAME", "USER_TYPE", "VENUE_RES", "VENUE_TYPES", "VenueName", "WORKSPACE", "app_liveDebug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PREFERENCE_NAME = "FON_HOME_PREFERENCE";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_USER_LOGIN = "isUserLogin";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER = "user";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CARD = "card";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_TYPE = "userType";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String USER_NAME = "userName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FIRST_NAME = "firstName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LAST_NAME = "lastName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ADDRESS = "address";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IS_ADDRESS = "isAddress";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MOBILE_NUMBER = "mobileNumber";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EMAIL_ADDRESS = "emailAddress";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SERVICES = "services";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TYPES = "types";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String INTERESTS = "interests";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VENUE_TYPES = "venuetypes";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VENUE_RES = "venueresponse";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ALL_VENUE_RES = "allVenueResponse";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BLOCK_OUT_RES = "blockInOutResponse";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ENVIRONMENT = "Environment";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ASSETS = "Assets";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PLANID = "plan_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PLANCREDITS = "plan_credits";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REMAINCREDITS = "remain_credits";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EXPIRYPLAN = "plan_expiry";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PLANNAME = "plan_name";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ISActivePlan = "active_plan";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CARDBRAND = "card_brand";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LASTFOUR = "last_four";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ISCARDACTIVE = "active_card";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WORKSPACE = "workspace";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String OPENINGDATE = "openingDate";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SELECTDATE = "selectedDate";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CLOSINGDATE = "closingDate";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String NUMBERPEOPLE = "numberPeople";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EMPCOMPANY = "emp_company";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EMPCREDITS = "emp_credits";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String EMPID = "emp_id";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IsEmployee = "isCompanyEmployee";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String VenueName = "venueName";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TokenId = "tokenID";
        
        private Companion() {
            super();
        }
    }
}