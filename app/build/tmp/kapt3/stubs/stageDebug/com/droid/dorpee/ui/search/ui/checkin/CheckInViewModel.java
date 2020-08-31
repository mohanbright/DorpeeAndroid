package com.droid.dorpee.ui.search.ui.checkin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001c\u0010\t\u00a8\u0006#"}, d2 = {"Lcom/droid/dorpee/ui/search/ui/checkin/CheckInViewModel;", "Lcom/droid/dorpee/utils/BaseViewModel;", "()V", "apiAutoCheckInResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/droid/dorpee/ui/search/ui/checkin/model/AutoCheckinResponse;", "getApiAutoCheckInResponse", "()Landroidx/lifecycle/MutableLiveData;", "setApiAutoCheckInResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "apiEnvironmentResponse", "Lcom/droid/dorpee/ui/venue/model/EnvironmentResponse;", "getApiEnvironmentResponse", "setApiEnvironmentResponse", "apiError", "", "getApiError", "setApiError", "apiVenueAvailibiltyResponse", "Lcom/droid/dorpee/ui/venue/model/VenueAvailibiltyResponse;", "getApiVenueAvailibiltyResponse", "setApiVenueAvailibiltyResponse", "apiWorkspaceResponse", "Lcom/droid/dorpee/ui/venue/model/WorkspaceResponse;", "getApiWorkspaceResponse", "setApiWorkspaceResponse", "isLoading", "", "setLoading", "autoCheckIn", "", "auth", "Lcom/droid/dorpee/ui/RequestWithHeader;", "venueId", "", "app_stageDebug"})
public final class CheckInViewModel extends com.droid.dorpee.utils.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.EnvironmentResponse> apiEnvironmentResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.search.ui.checkin.model.AutoCheckinResponse> apiAutoCheckInResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.WorkspaceResponse> apiWorkspaceResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueAvailibiltyResponse> apiVenueAvailibiltyResponse;
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
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.EnvironmentResponse> getApiEnvironmentResponse() {
        return null;
    }
    
    public final void setApiEnvironmentResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.EnvironmentResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.search.ui.checkin.model.AutoCheckinResponse> getApiAutoCheckInResponse() {
        return null;
    }
    
    public final void setApiAutoCheckInResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.search.ui.checkin.model.AutoCheckinResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.WorkspaceResponse> getApiWorkspaceResponse() {
        return null;
    }
    
    public final void setApiWorkspaceResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.WorkspaceResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueAvailibiltyResponse> getApiVenueAvailibiltyResponse() {
        return null;
    }
    
    public final void setApiVenueAvailibiltyResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.venue.model.VenueAvailibiltyResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void autoCheckIn(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader auth, int venueId) {
    }
    
    public CheckInViewModel() {
        super();
    }
}