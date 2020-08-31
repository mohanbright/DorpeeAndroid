package com.droid.dorpee.ui.personaldashboard.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0016\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0011H\u0014J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0016\u0010%\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\n\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0002J\u0017\u0010+\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010-H\u0002\u00a2\u0006\u0002\u0010.J\u001e\u0010/\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u00061"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/fragments/TeamsFragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "binding", "Lcom/droid/dorpee/databinding/FragmentTeamsBinding;", "index", "", "teamsList", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/personaldashboard/models/MDTeamX;", "viewModel", "Lcom/droid/dorpee/ui/personaldashboard/viewmodel/TeamsViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/personaldashboard/viewmodel/TeamsViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/personaldashboard/viewmodel/TeamsViewModel;)V", "attachObserver", "", "bindData", "confirmDialog", "team", "createTeam", "nameET", "Lcom/google/android/material/textfield/TextInputEditText;", "dialog", "Landroid/app/Dialog;", "initListeners", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setUPUpcomingList", "data", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showDialog", "type", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "updateTeam", "teamId", "app_liveDebug"})
public final class TeamsFragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private com.droid.dorpee.databinding.FragmentTeamsBinding binding;
    private java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDTeamX> teamsList;
    private int index = -1;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.personaldashboard.viewmodel.TeamsViewModel p0) {
    }
    
    @java.lang.Override()
    protected void bindData() {
    }
    
    @java.lang.Override()
    protected void initListeners() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.lifecycle.ViewModel setUpVM() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void attachObserver() {
    }
    
    private final void setUPUpcomingList(java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDTeamX> data) {
    }
    
    private final void confirmDialog(com.droid.dorpee.ui.personaldashboard.models.MDTeamX team) {
    }
    
    private final void showDialog(int type, com.droid.dorpee.ui.personaldashboard.models.MDTeamX team) {
    }
    
    public final void createTeam(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText nameET, @org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog) {
    }
    
    public final void updateTeam(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputEditText nameET, @org.jetbrains.annotations.NotNull()
    android.app.Dialog dialog, int teamId) {
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    public TeamsFragment() {
        super();
    }
}