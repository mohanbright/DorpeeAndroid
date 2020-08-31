package com.droid.dorpee.ui.personaldashboard.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\'B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u001e\u001a\u00020\u000eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000eH\u0016J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000eH\u0016J\u001e\u0010%\u001a\u00020\u00152\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bRa\u0010\f\u001aI\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006("}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/adapter/TransactionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/droid/dorpee/ui/personaldashboard/adapter/TransactionAdapter$ViewHolder;", "context", "Landroid/content/Context;", "transactionList", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/auth/model/TransactionData;", "Lkotlin/collections/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "getContext$app_liveDebug", "()Landroid/content/Context;", "itemClick", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "type", "Lcom/droid/dorpee/ui/auth/model/MDCard;", "card", "pos", "", "getItemClick", "()Lkotlin/jvm/functions/Function3;", "setItemClick", "(Lkotlin/jvm/functions/Function3;)V", "getTransactionList", "()Ljava/util/ArrayList;", "setTransactionList", "(Ljava/util/ArrayList;)V", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "p1", "setSelected", "list", "ViewHolder", "app_liveDebug"})
public final class TransactionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.droid.dorpee.ui.personaldashboard.adapter.TransactionAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super com.droid.dorpee.ui.auth.model.MDCard, ? super java.lang.Integer, kotlin.Unit> itemClick;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.droid.dorpee.ui.auth.model.TransactionData> transactionList;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.droid.dorpee.ui.personaldashboard.adapter.TransactionAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.adapter.TransactionAdapter.ViewHolder holder, int pos) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<java.lang.Integer, com.droid.dorpee.ui.auth.model.MDCard, java.lang.Integer, kotlin.Unit> getItemClick() {
        return null;
    }
    
    public final void setItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super com.droid.dorpee.ui.auth.model.MDCard, ? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    public final void setSelected(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.auth.model.TransactionData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext$app_liveDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.droid.dorpee.ui.auth.model.TransactionData> getTransactionList() {
        return null;
    }
    
    public final void setTransactionList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.auth.model.TransactionData> p0) {
    }
    
    public TransactionAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.auth.model.TransactionData> transactionList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/adapter/TransactionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/droid/dorpee/databinding/ItemTableLayoutBinding;", "(Lcom/droid/dorpee/databinding/ItemTableLayoutBinding;)V", "getBinding", "()Lcom/droid/dorpee/databinding/ItemTableLayoutBinding;", "setBinding", "app_liveDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.droid.dorpee.databinding.ItemTableLayoutBinding binding;
        
        @org.jetbrains.annotations.NotNull()
        public final com.droid.dorpee.databinding.ItemTableLayoutBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.droid.dorpee.databinding.ItemTableLayoutBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.droid.dorpee.databinding.ItemTableLayoutBinding binding) {
            super(null);
        }
    }
}