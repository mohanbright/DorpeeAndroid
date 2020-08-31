package com.droid.dorpee.ui.personaldashboard.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eJ&\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0014\u0010\t\u00a8\u0006&"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/viewmodel/SettingsViewModel;", "Lcom/droid/dorpee/utils/BaseViewModel;", "()V", "apiError", "Landroidx/lifecycle/MutableLiveData;", "", "getApiError", "()Landroidx/lifecycle/MutableLiveData;", "setApiError", "(Landroidx/lifecycle/MutableLiveData;)V", "apiRemoveCardResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/MDResponse;", "getApiRemoveCardResponse", "setApiRemoveCardResponse", "apiResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/MDUser;", "getApiResponse", "setApiResponse", "isLoading", "", "setLoading", "removeCard", "", "auth", "Lcom/droid/dorpee/ui/RequestWithHeader;", "id", "", "arrayList", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/auth/model/MDCard;", "Lkotlin/collections/ArrayList;", "updateSettings", "privacy", "Lcom/droid/dorpee/ui/PrivacySettings;", "context", "Landroid/content/Context;", "privacyFragment", "Lcom/droid/dorpee/ui/personaldashboard/fragments/PrivacyFragment;", "app_stageDebug"})
public final class SettingsViewModel extends com.droid.dorpee.utils.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDUser> apiResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDResponse> apiRemoveCardResponse;
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
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDUser> getApiResponse() {
        return null;
    }
    
    public final void setApiResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDUser> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDResponse> getApiRemoveCardResponse() {
        return null;
    }
    
    public final void setApiRemoveCardResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void updateSettings(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.PrivacySettings privacy, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.fragments.PrivacyFragment privacyFragment) {
    }
    
    public final void removeCard(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, int id, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.auth.model.MDCard> arrayList) {
    }
    
    public SettingsViewModel() {
        super();
    }
}