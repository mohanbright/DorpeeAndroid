package com.droid.dorpee.ui.personaldashboard.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ6\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u000bJ\u000e\u0010(\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$J?\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020*2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010&2\b\u0010,\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010-J9\u0010.\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010,\u001a\u0004\u0018\u00010\u000b2\b\u0010+\u001a\u0004\u0018\u00010&2\b\u0010/\u001a\u0004\u0018\u00010&\u00a2\u0006\u0002\u00100R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0018\u0010\t\u00a8\u00061"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/viewmodel/PlansViewModel;", "Lcom/droid/dorpee/utils/BaseViewModel;", "()V", "apiAddCardResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/droid/dorpee/ui/personaldashboard/models/MDCards;", "getApiAddCardResponse", "()Landroidx/lifecycle/MutableLiveData;", "setApiAddCardResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "apiError", "", "getApiError", "setApiError", "apiPlansResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/PlansList;", "getApiPlansResponse", "setApiPlansResponse", "apiPurchasePlanRequest", "Lcom/droid/dorpee/ui/auth/model/PlanModel;", "getApiPurchasePlanRequest", "setApiPurchasePlanRequest", "isLoading", "", "setLoading", "addCard", "", "header", "Lcom/droid/dorpee/ui/RequestWithHeader;", "addCardRequest", "Lcom/droid/dorpee/ui/AddCardRequest;", "changePlan", "Lcom/droid/dorpee/ui/ChangePlanRequest;", "context", "Landroid/content/Context;", "activity", "Lcom/droid/dorpee/ui/personaldashboard/personalItem/DorpeePlanActivity;", "credits", "", "name", "getPlans", "purchasePlan", "Lcom/droid/dorpee/ui/PurchasePlanRequest;", "planCredits", "planName", "(Lcom/droid/dorpee/ui/RequestWithHeader;Lcom/droid/dorpee/ui/PurchasePlanRequest;Landroid/content/Context;Lcom/droid/dorpee/ui/personaldashboard/personalItem/DorpeePlanActivity;Ljava/lang/Integer;Ljava/lang/String;)V", "updateData", "planId", "(Landroid/content/Context;Lcom/droid/dorpee/ui/personaldashboard/personalItem/DorpeePlanActivity;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "app_liveDebug"})
public final class PlansViewModel extends com.droid.dorpee.utils.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PlansList> apiPlansResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDCards> apiAddCardResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.PlanModel> apiPurchasePlanRequest;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getApiError() {
        return null;
    }
    
    public final void setApiError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PlansList> getApiPlansResponse() {
        return null;
    }
    
    public final void setApiPlansResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.PlansList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDCards> getApiAddCardResponse() {
        return null;
    }
    
    public final void setApiAddCardResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDCards> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.PlanModel> getApiPurchasePlanRequest() {
        return null;
    }
    
    public final void setApiPurchasePlanRequest(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.auth.model.PlanModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void getPlans(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.personalItem.DorpeePlanActivity activity) {
    }
    
    public final void changePlan(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.ChangePlanRequest changePlan, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.personalItem.DorpeePlanActivity activity, int credits, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void addCard(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.AddCardRequest addCardRequest) {
    }
    
    public final void purchasePlan(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.PurchasePlanRequest changePlan, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.personalItem.DorpeePlanActivity activity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer planCredits, @org.jetbrains.annotations.Nullable()
    java.lang.String planName) {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.personalItem.DorpeePlanActivity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String planName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer planCredits, @org.jetbrains.annotations.Nullable()
    java.lang.Integer planId) {
    }
    
    public PlansViewModel() {
        super();
    }
}