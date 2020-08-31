package com.droid.dorpee.ui.personaldashboard.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0014J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007J \u0010#\u001a\u00020\u00112\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`%H\u0002J\n\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0017\u0010(\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010*H\u0002\u00a2\u0006\u0002\u0010+R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006,"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/fragments/ContactsFragment;", "Lcom/droid/dorpee/ui/baseClasses/BaseFragment;", "()V", "binding", "Lcom/droid/dorpee/databinding/FragmentContactsBinding;", "contactList", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/personaldashboard/models/MDContact;", "index", "", "viewModel", "Lcom/droid/dorpee/ui/personaldashboard/viewmodel/ContactsViewModel;", "getViewModel", "()Lcom/droid/dorpee/ui/personaldashboard/viewmodel/ContactsViewModel;", "setViewModel", "(Lcom/droid/dorpee/ui/personaldashboard/viewmodel/ContactsViewModel;)V", "attachObserver", "", "bindData", "confirmDialog", "contact", "initListeners", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "openContact", "type", "setUPUpcomingList", "data", "Lkotlin/collections/ArrayList;", "setUpVM", "Landroidx/lifecycle/ViewModel;", "showProgress", "it", "", "(Ljava/lang/Boolean;)V", "app_stageDebug"})
public final class ContactsFragment extends com.droid.dorpee.ui.baseClasses.BaseFragment {
    private com.droid.dorpee.databinding.FragmentContactsBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.droid.dorpee.ui.personaldashboard.viewmodel.ContactsViewModel viewModel;
    private java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDContact> contactList;
    private int index = -1;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.personaldashboard.viewmodel.ContactsViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.personaldashboard.viewmodel.ContactsViewModel p0) {
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
    
    public final void openContact(int type, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.personaldashboard.models.MDContact contact) {
    }
    
    private final void confirmDialog(com.droid.dorpee.ui.personaldashboard.models.MDContact contact) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void setUPUpcomingList(java.util.ArrayList<com.droid.dorpee.ui.personaldashboard.models.MDContact> data) {
    }
    
    private final void showProgress(java.lang.Boolean it) {
    }
    
    public ContactsFragment() {
        super();
    }
}