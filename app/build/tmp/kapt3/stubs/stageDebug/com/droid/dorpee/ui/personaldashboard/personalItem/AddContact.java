package com.droid.dorpee.ui.personaldashboard.personalItem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u0017\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0017H\u0016J\b\u0010 \u001a\u00020!H\u0002J\u0012\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0017\u0010*\u001a\u00020\u00172\b\u0010+\u001a\u0004\u0018\u00010!H\u0002\u00a2\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/personalItem/AddContact;", "Lcom/droid/dorpee/ui/baseClasses/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/droid/dorpee/databinding/ActivityAddContactBinding;", "contact", "Lcom/droid/dorpee/ui/personaldashboard/models/MDContact;", "selectedTeamId", "", "teams", "Ljava/util/ArrayList;", "teamsList", "Lcom/droid/dorpee/ui/personaldashboard/models/MDTeamX;", "teamsViewModel", "Lcom/droid/dorpee/ui/personaldashboard/viewmodel/TeamsViewModel;", "getTeamsViewModel", "()Lcom/droid/dorpee/ui/personaldashboard/viewmodel/TeamsViewModel;", "setTeamsViewModel", "(Lcom/droid/dorpee/ui/personaldashboard/viewmodel/TeamsViewModel;)V", "user", "Lcom/droid/dorpee/ui/auth/model/User;", "attachObservers", "", "bind", "bindData", "createContact", "getTeamId", "", "id", "(Ljava/lang/Integer;)I", "initListeners", "isValid", "", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "(Ljava/lang/Boolean;)V", "updateContact", "app_stageDebug"})
public final class AddContact extends com.droid.dorpee.ui.baseClasses.BaseActivity implements android.view.View.OnClickListener {
    private com.droid.dorpee.databinding.ActivityAddContactBinding binding;
    private java.util.ArrayList<java.lang.String> teams;
    private java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDTeamX> teamsList;
    private com.droid.dorpee.ui.personaldashboard.models.MDContact contact;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel teamsViewModel;
    private com.droid.dorpee.ui.auth.model.User user;
    private java.lang.String selectedTeamId = "";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel getTeamsViewModel() {
        return null;
    }
    
    public final void setTeamsViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void bindData() {
    }
    
    @java.lang.Override()
    public void initListeners() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.lifecycle.ViewModel setUpVM() {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    private final void bind() {
    }
    
    private final void updateContact() {
    }
    
    private final void attachObservers() {
    }
    
    private final int getTeamId(java.lang.Integer id) {
        return 0;
    }
    
    private final void createContact() {
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    private final boolean isValid() {
        return false;
    }
    
    public AddContact() {
        super();
    }
}