package com.droid.dorpee.ui.personaldashboard.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\'\u001a\u00020(J\u0016\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u001e\u0010-\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020.2\u0006\u0010/\u001a\u00020+J\u001e\u00100\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020+R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001f\u0010\t\u00a8\u00064"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/viewmodel/TeamsViewModel;", "Lcom/droid/dorpee/utils/BaseViewModel;", "()V", "apiContactResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/droid/dorpee/ui/personaldashboard/models/MDContact;", "getApiContactResponse", "()Landroidx/lifecycle/MutableLiveData;", "setApiContactResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "apiCreateTeamResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/MDTeam;", "getApiCreateTeamResponse", "setApiCreateTeamResponse", "apiDeleteResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/MDResponse;", "getApiDeleteResponse", "setApiDeleteResponse", "apiError", "", "getApiError", "setApiError", "apiTeamsResponse", "Lcom/droid/dorpee/ui/personaldashboard/models/MDTeamList;", "getApiTeamsResponse", "setApiTeamsResponse", "apiUpdateTeamResponse", "getApiUpdateTeamResponse", "setApiUpdateTeamResponse", "isLoading", "", "setLoading", "createContact", "", "header", "Lcom/droid/dorpee/ui/RequestWithHeader;", "contact", "Lcom/droid/dorpee/ui/CreateContact;", "createTeam", "createTeamRequest", "Lcom/droid/dorpee/ui/CreateTeamRequest;", "deleteTeam", "id", "", "getTeams", "updateContact", "Lcom/droid/dorpee/ui/UpdateContact;", "contactId", "updateTeam", "updateTeamRequest", "Lcom/droid/dorpee/ui/UpdateTeamRequest;", "teamId", "app_liveDebug"})
public final class TeamsViewModel extends com.droid.dorpee.utils.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> apiError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDTeam> apiCreateTeamResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDTeam> apiUpdateTeamResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDTeamList> apiTeamsResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDContact> apiContactResponse;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDResponse> apiDeleteResponse;
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
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDTeam> getApiCreateTeamResponse() {
        return null;
    }
    
    public final void setApiCreateTeamResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDTeam> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDTeam> getApiUpdateTeamResponse() {
        return null;
    }
    
    public final void setApiUpdateTeamResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDTeam> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDTeamList> getApiTeamsResponse() {
        return null;
    }
    
    public final void setApiTeamsResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDTeamList> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDContact> getApiContactResponse() {
        return null;
    }
    
    public final void setApiContactResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDContact> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDResponse> getApiDeleteResponse() {
        return null;
    }
    
    public final void setApiDeleteResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.droid.dorpee.ui.personaldashboard.models.MDResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void createTeam(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.CreateTeamRequest createTeamRequest) {
    }
    
    public final void getTeams(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header) {
    }
    
    public final void createContact(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.CreateContact contact) {
    }
    
    public final void updateContact(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.UpdateContact contact, int contactId) {
    }
    
    public final void deleteTeam(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, int id) {
    }
    
    public final void updateTeam(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.RequestWithHeader header, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.UpdateTeamRequest updateTeamRequest, int teamId) {
    }
    
    public TeamsViewModel() {
        super();
    }
}