package com.droid.dorpee.networkOperator;

import java.lang.System;

/**
 * Created by parmil.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/droid/dorpee/networkOperator/ServiceListener;", "T", "", "getError", "", "error", "Lcom/droid/dorpee/networkOperator/ErrorModel;", "requestcode", "", "getServerResponse", "response", "(Ljava/lang/Object;I)V", "app_liveDebug"})
public abstract interface ServiceListener<T extends java.lang.Object> {
    
    public abstract void getServerResponse(T response, int requestcode);
    
    public abstract void getError(@org.jetbrains.annotations.NotNull()
    com.droid.dorpee.networkOperator.ErrorModel error, int requestcode);
}