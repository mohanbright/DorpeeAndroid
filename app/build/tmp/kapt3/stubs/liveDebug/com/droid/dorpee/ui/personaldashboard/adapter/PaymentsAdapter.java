package com.droid.dorpee.ui.personaldashboard.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\"\u001a\u00020\u0017H\u0016J\u0018\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0017H\u0016J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0017H\u0016J\u001e\u0010)\u001a\u00020\u001d2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bR*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0013\u0010\u0014Ra\u0010\u0015\u001aI\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0017\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006,"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/adapter/PaymentsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/droid/dorpee/ui/personaldashboard/adapter/PaymentsAdapter$ViewHolder;", "context", "Landroid/content/Context;", "cardList", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/auth/model/MDCard;", "Lkotlin/collections/ArrayList;", "isFromTopUp", "", "(Landroid/content/Context;Ljava/util/ArrayList;Z)V", "getCardList", "()Ljava/util/ArrayList;", "setCardList", "(Ljava/util/ArrayList;)V", "getContext$app_liveDebug", "()Landroid/content/Context;", "()Z", "setFromTopUp", "(Z)V", "itemClick", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "type", "card", "pos", "", "getItemClick", "()Lkotlin/jvm/functions/Function3;", "setItemClick", "(Lkotlin/jvm/functions/Function3;)V", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "p1", "setSelected", "list", "ViewHolder", "app_liveDebug"})
public final class PaymentsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.droid.dorpee.ui.personaldashboard.adapter.PaymentsAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super com.droid.dorpee.ui.auth.model.MDCard, ? super java.lang.Integer, kotlin.Unit> itemClick;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.droid.dorpee.ui.auth.model.MDCard> cardList;
    private boolean isFromTopUp;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.droid.dorpee.ui.personaldashboard.adapter.PaymentsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.adapter.PaymentsAdapter.ViewHolder holder, int pos) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<java.lang.Integer, com.droid.dorpee.ui.auth.model.MDCard, java.lang.Integer, kotlin.Unit> getItemClick() {
        return null;
    }
    
    public final void setItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super com.droid.dorpee.ui.auth.model.MDCard, ? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    public final void setSelected(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.auth.model.MDCard> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext$app_liveDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.droid.dorpee.ui.auth.model.MDCard> getCardList() {
        return null;
    }
    
    public final void setCardList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.auth.model.MDCard> p0) {
    }
    
    public final boolean isFromTopUp() {
        return false;
    }
    
    public final void setFromTopUp(boolean p0) {
    }
    
    public PaymentsAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.auth.model.MDCard> cardList, boolean isFromTopUp) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/adapter/PaymentsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/droid/dorpee/databinding/ItemPaymentBinding;", "(Lcom/droid/dorpee/databinding/ItemPaymentBinding;)V", "getBinding", "()Lcom/droid/dorpee/databinding/ItemPaymentBinding;", "setBinding", "app_liveDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.droid.dorpee.databinding.ItemPaymentBinding binding;
        
        @org.jetbrains.annotations.NotNull()
        public final com.droid.dorpee.databinding.ItemPaymentBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.droid.dorpee.databinding.ItemPaymentBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.droid.dorpee.databinding.ItemPaymentBinding binding) {
            super(null);
        }
    }
}