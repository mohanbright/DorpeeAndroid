package com.droid.dorpee.ui.personaldashboard.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\'\u001a\u00020\fH\u0016J\u0018\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\fH\u0016J\u001e\u0010.\u001a\u00020\u00162\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fRL\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00061"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/adapter/PlansAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/droid/dorpee/ui/personaldashboard/adapter/PlansAdapter$ViewHolder;", "context", "Landroid/content/Context;", "planList", "Ljava/util/ArrayList;", "Lcom/droid/dorpee/ui/venue/venueresponse/PlanX;", "Lkotlin/collections/ArrayList;", "user", "Lcom/droid/dorpee/ui/auth/model/User;", "planId", "", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/droid/dorpee/ui/auth/model/User;I)V", "getContext$app_stageDebug", "()Landroid/content/Context;", "itemClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "plan", "pos", "", "getItemClick", "()Lkotlin/jvm/functions/Function2;", "setItemClick", "(Lkotlin/jvm/functions/Function2;)V", "getPlanId", "()I", "setPlanId", "(I)V", "getPlanList", "()Ljava/util/ArrayList;", "setPlanList", "(Ljava/util/ArrayList;)V", "getUser", "()Lcom/droid/dorpee/ui/auth/model/User;", "setUser", "(Lcom/droid/dorpee/ui/auth/model/User;)V", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "p1", "setSelected", "list", "ViewHolder", "app_stageDebug"})
public final class PlansAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.droid.dorpee.ui.personaldashboard.adapter.PlansAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function2<? super com.droid.dorpee.ui.venue.venueresponse.PlanX, ? super java.lang.Integer, kotlin.Unit> itemClick;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.droid.dorpee.ui.venue.venueresponse.PlanX> planList;
    @org.jetbrains.annotations.NotNull()
    private com.droid.dorpee.ui.auth.model.User user;
    private int planId;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.droid.dorpee.ui.personaldashboard.adapter.PlansAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.personaldashboard.adapter.PlansAdapter.ViewHolder holder, int pos) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function2<com.droid.dorpee.ui.venue.venueresponse.PlanX, java.lang.Integer, kotlin.Unit> getItemClick() {
        return null;
    }
    
    public final void setItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super com.droid.dorpee.ui.venue.venueresponse.PlanX, ? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    public final void setSelected(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.venue.venueresponse.PlanX> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext$app_stageDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.droid.dorpee.ui.venue.venueresponse.PlanX> getPlanList() {
        return null;
    }
    
    public final void setPlanList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.venue.venueresponse.PlanX> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.auth.model.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.auth.model.User p0) {
    }
    
    public final int getPlanId() {
        return 0;
    }
    
    public final void setPlanId(int p0) {
    }
    
    public PlansAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.droid.dorpee.ui.venue.venueresponse.PlanX> planList, @org.jetbrains.annotations.NotNull()
    com.droid.dorpee.ui.auth.model.User user, int planId) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\b"}, d2 = {"Lcom/droid/dorpee/ui/personaldashboard/adapter/PlansAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/droid/dorpee/databinding/ItemPlanBinding;", "(Lcom/droid/dorpee/databinding/ItemPlanBinding;)V", "getBinding", "()Lcom/droid/dorpee/databinding/ItemPlanBinding;", "setBinding", "app_stageDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.droid.dorpee.databinding.ItemPlanBinding binding;
        
        @org.jetbrains.annotations.NotNull()
        public final com.droid.dorpee.databinding.ItemPlanBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.droid.dorpee.databinding.ItemPlanBinding p0) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.droid.dorpee.databinding.ItemPlanBinding binding) {
            super(null);
        }
    }
}