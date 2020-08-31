package org.mach15group.paanivaale.networkOperator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0006\u00a8\u0006("}, d2 = {"Lorg/mach15group/paanivaale/networkOperator/ResponseCodes;", "", "()V", "ACCESS_TOKEN_EXPIRED", "", "getACCESS_TOKEN_EXPIRED", "()I", "Accepted", "getAccepted", "BAD_REQUEST", "getBAD_REQUEST", "GATEWAY_ERROR", "getGATEWAY_ERROR", "INTERNET_NOT_AVAILABLE", "getINTERNET_NOT_AVAILABLE", "MODEL_TYPE_CAST_EXCEPTION", "getMODEL_TYPE_CAST_EXCEPTION", "NOT_ALLOWED", "getNOT_ALLOWED", "REFRESH_TOKEN_EXPIRED", "getREFRESH_TOKEN_EXPIRED", "REQUEST_CANCEL", "getREQUEST_CANCEL", "RESPONSE_JSON_NOT_VALID", "getRESPONSE_JSON_NOT_VALID", "SOCKET_TIME_OUT", "getSOCKET_TIME_OUT", "Success", "getSuccess", "UNKNOWN_ERROR", "getUNKNOWN_ERROR", "URL_CONNECTION_ERROR", "getURL_CONNECTION_ERROR", "WRONG_METHOD_NAME", "getWRONG_METHOD_NAME", "WRONG_URL", "getWRONG_URL", "logErrorMessage", "", "code", "app_stageDebug"})
public final class ResponseCodes {
    
    /**
     * The Constant Success.
     */
    private static final int Success = 200;
    
    /**
     * The Constant Success.
     */
    private static final int Accepted = 201;
    
    /**
     * The Constant AccessToken expired.
     */
    private static final int ACCESS_TOKEN_EXPIRED = 401;
    
    /**
     * The Constant RefreshToken expired.
     */
    private static final int REFRESH_TOKEN_EXPIRED = 400;
    
    /**
     * The Constant InvalidUseridPassword
     */
    private static final int BAD_REQUEST = 400;
    private static final int REQUEST_CANCEL = -1;
    private static final int RESPONSE_JSON_NOT_VALID = 1;
    private static final int MODEL_TYPE_CAST_EXCEPTION = 2;
    private static final int INTERNET_NOT_AVAILABLE = 3;
    private static final int WRONG_URL = 4;
    private static final int WRONG_METHOD_NAME = 5;
    private static final int URL_CONNECTION_ERROR = 6;
    private static final int SOCKET_TIME_OUT = 12;
    private static final int UNKNOWN_ERROR = 10;
    private static final int GATEWAY_ERROR = 502;
    private static final int NOT_ALLOWED = 403;
    public static final org.mach15group.paanivaale.networkOperator.ResponseCodes INSTANCE = null;
    
    public final int getSuccess() {
        return 0;
    }
    
    public final int getAccepted() {
        return 0;
    }
    
    public final int getACCESS_TOKEN_EXPIRED() {
        return 0;
    }
    
    public final int getREFRESH_TOKEN_EXPIRED() {
        return 0;
    }
    
    public final int getBAD_REQUEST() {
        return 0;
    }
    
    public final int getREQUEST_CANCEL() {
        return 0;
    }
    
    public final int getRESPONSE_JSON_NOT_VALID() {
        return 0;
    }
    
    public final int getMODEL_TYPE_CAST_EXCEPTION() {
        return 0;
    }
    
    public final int getINTERNET_NOT_AVAILABLE() {
        return 0;
    }
    
    public final int getWRONG_URL() {
        return 0;
    }
    
    public final int getWRONG_METHOD_NAME() {
        return 0;
    }
    
    public final int getURL_CONNECTION_ERROR() {
        return 0;
    }
    
    public final int getSOCKET_TIME_OUT() {
        return 0;
    }
    
    public final int getUNKNOWN_ERROR() {
        return 0;
    }
    
    public final int getGATEWAY_ERROR() {
        return 0;
    }
    
    public final int getNOT_ALLOWED() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String logErrorMessage(int code) {
        return null;
    }
    
    private ResponseCodes() {
        super();
    }
}