package com.droid.dorpee.ui.auth.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bp\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u000e\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u000e\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u00108J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010v\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\u000b\u0010w\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\u000b\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0012\u0010\u0084\u0001\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010(H\u00c6\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0012\u0010\u0090\u0001\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u000eH\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u0095\u0001\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u000eH\u00c6\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0011\u0010\u009c\u0001\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010CJ\u0012\u0010\u009d\u0001\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u00c6\u0003J\u00b8\u0004\u0010\u009e\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u000e2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u000e2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0003\u0010\u009f\u0001J\u0015\u0010\u00a0\u0001\u001a\u00020\f2\t\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u0014H\u00d6\u0001J\n\u0010\u00a3\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010:R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010:R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010D\u001a\u0004\bB\u0010CR&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010:R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010:R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010:R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bQ\u0010MR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010:R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010AR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010:R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010:R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010:R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010:R\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bX\u0010MR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010D\u001a\u0004\b\u001f\u0010CR\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010:R\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010AR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010FR\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010:R\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010:R\u0018\u0010%\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010AR\u0018\u0010&\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010AR\u0018\u0010\'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010:R\"\u0010*\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010N\u001a\u0004\bc\u0010M\"\u0004\bd\u0010eR\u0018\u0010+\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010AR\u0018\u0010,\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010AR\u0018\u0010-\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010AR&\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010F\"\u0004\bj\u0010HR\u0018\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010:R\u0018\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010:R\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010:R\u001e\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010FR\u001a\u00107\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bo\u0010MR\u0018\u00105\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010AR\u0018\u00106\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010:\u00a8\u0006\u00a4\u0001"}, d2 = {"Lcom/droid/dorpee/ui/auth/model/User;", "Ljava/io/Serializable;", "abn", "", "accountName", "accountNumber", "avatar", "bsb", "cardBrand", "cardLastFour", "", "cardStatus", "", "cards", "", "Lcom/droid/dorpee/ui/auth/model/MDCard;", "companyLegalName", "companyName", "createdAt", "credit", "", "currentSubscription", "Lcom/droid/dorpee/ui/personaldashboard/models/CurrentSubscription;", "daysLeftForExpiry", "email", "emailVerifiedAt", "firstName", "freePlanExpiryDate", "freePlanStatus", "fullName", "id", "isSubscribed", "lastName", "linkedin", "media", "ohsOnly", "phoneNumber", "photo", "photoLink", "plan", "Lcom/droid/dorpee/ui/venue/venueresponse/PlanX;", "planExpiry", "planId", "privacyInterests", "privacyLinkedin", "privacyName", "role", "Lcom/droid/dorpee/ui/auth/model/Role;", "status", "stripeCustomerId", "stripeId", "subscriptions", "Lcom/droid/dorpee/ui/personaldashboard/models/Subscription;", "trialEndsAt", "updatedAt", "totalCredits", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/droid/dorpee/ui/personaldashboard/models/CurrentSubscription;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/droid/dorpee/ui/venue/venueresponse/PlanX;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)V", "getAbn", "()Ljava/lang/String;", "getAccountName", "getAccountNumber", "getAvatar", "getBsb", "getCardBrand", "getCardLastFour", "()Ljava/lang/Object;", "getCardStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCards", "()Ljava/util/List;", "setCards", "(Ljava/util/List;)V", "getCompanyLegalName", "getCompanyName", "getCreatedAt", "getCredit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrentSubscription", "()Lcom/droid/dorpee/ui/personaldashboard/models/CurrentSubscription;", "getDaysLeftForExpiry", "getEmail", "getEmailVerifiedAt", "getFirstName", "getFreePlanExpiryDate", "getFreePlanStatus", "getFullName", "getId", "getLastName", "getLinkedin", "getMedia", "getOhsOnly", "getPhoneNumber", "getPhoto", "getPhotoLink", "getPlan", "()Lcom/droid/dorpee/ui/venue/venueresponse/PlanX;", "getPlanExpiry", "getPlanId", "setPlanId", "(Ljava/lang/Integer;)V", "getPrivacyInterests", "getPrivacyLinkedin", "getPrivacyName", "getRole", "setRole", "getStatus", "getStripeCustomerId", "getStripeId", "getSubscriptions", "getTotalCredits", "getTrialEndsAt", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/droid/dorpee/ui/personaldashboard/models/CurrentSubscription;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/droid/dorpee/ui/venue/venueresponse/PlanX;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)Lcom/droid/dorpee/ui/auth/model/User;", "equals", "other", "hashCode", "toString", "app_liveDebug"})
public final class User implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "abn")
    private final java.lang.String abn = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "account_name")
    private final java.lang.String accountName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "account_number")
    private final java.lang.String accountNumber = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "avatar")
    private final java.lang.String avatar = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "bsb")
    private final java.lang.String bsb = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "card_brand")
    private final java.lang.String cardBrand = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "card_last_four")
    private final java.lang.Object cardLastFour = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "card_status")
    private final java.lang.Boolean cardStatus = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "cards")
    private java.util.List<com.droid.dorpee.ui.auth.model.MDCard> cards;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "company_legal_name")
    private final java.lang.String companyLegalName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "company_name")
    private final java.lang.String companyName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "credit")
    private final java.lang.Integer credit = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "current_subscription")
    private final com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription currentSubscription = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "days_left_for_expiry")
    private final java.lang.Integer daysLeftForExpiry = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "email")
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "email_verified_at")
    private final java.lang.Object emailVerifiedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "first_name")
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "free_plan_expiry_date")
    private final java.lang.String freePlanExpiryDate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "free_plan_status")
    private final java.lang.String freePlanStatus = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "full_name")
    private final java.lang.String fullName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "is_subscribed")
    private final java.lang.Boolean isSubscribed = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "last_name")
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "linkedin")
    private final java.lang.Object linkedin = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "media")
    private final java.util.List<java.lang.Object> media = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ohs_only")
    private final java.lang.String ohsOnly = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "phone_number")
    private final java.lang.String phoneNumber = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "photo")
    private final java.lang.Object photo = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "photo_link")
    private final java.lang.Object photoLink = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "plan")
    private final com.droid.dorpee.ui.venue.venueresponse.PlanX plan = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "plan_expiry")
    private final java.lang.String planExpiry = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "plan_id")
    private java.lang.Integer planId;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "privacy_interests")
    private final java.lang.Object privacyInterests = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "privacy_linkedin")
    private final java.lang.Object privacyLinkedin = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "privacy_name")
    private final java.lang.Object privacyName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "role")
    private java.util.List<com.droid.dorpee.ui.auth.model.Role> role;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "stripe_customer_id")
    private final java.lang.String stripeCustomerId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "stripe_id")
    private final java.lang.String stripeId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "subscriptions")
    private final java.util.List<com.droid.dorpee.ui.personaldashboard.models.Subscription> subscriptions = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "trial_ends_at")
    private final java.lang.Object trialEndsAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_credits")
    private final java.lang.Integer totalCredits = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAbn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccountName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccountNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBsb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCardBrand() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCardLastFour() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCardStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.auth.model.MDCard> getCards() {
        return null;
    }
    
    public final void setCards(@org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.auth.model.MDCard> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompanyLegalName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompanyName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCredit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription getCurrentSubscription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDaysLeftForExpiry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getEmailVerifiedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFreePlanExpiryDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFreePlanStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFullName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isSubscribed() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLinkedin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOhsOnly() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPhoto() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPhotoLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venue.venueresponse.PlanX getPlan() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlanExpiry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPlanId() {
        return null;
    }
    
    public final void setPlanId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPrivacyInterests() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPrivacyLinkedin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPrivacyName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.auth.model.Role> getRole() {
        return null;
    }
    
    public final void setRole(@org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.auth.model.Role> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStripeCustomerId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStripeId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.Subscription> getSubscriptions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTrialEndsAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalCredits() {
        return null;
    }
    
    public User(@org.jetbrains.annotations.Nullable()
    java.lang.String abn, @org.jetbrains.annotations.Nullable()
    java.lang.String accountName, @org.jetbrains.annotations.Nullable()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar, @org.jetbrains.annotations.Nullable()
    java.lang.String bsb, @org.jetbrains.annotations.Nullable()
    java.lang.String cardBrand, @org.jetbrains.annotations.Nullable()
    java.lang.Object cardLastFour, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cardStatus, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.auth.model.MDCard> cards, @org.jetbrains.annotations.Nullable()
    java.lang.String companyLegalName, @org.jetbrains.annotations.Nullable()
    java.lang.String companyName, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer credit, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription currentSubscription, @org.jetbrains.annotations.Nullable()
    java.lang.Integer daysLeftForExpiry, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.Object emailVerifiedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.String freePlanExpiryDate, @org.jetbrains.annotations.Nullable()
    java.lang.String freePlanStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSubscribed, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    java.lang.Object linkedin, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> media, @org.jetbrains.annotations.Nullable()
    java.lang.String ohsOnly, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object photo, @org.jetbrains.annotations.Nullable()
    java.lang.Object photoLink, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venue.venueresponse.PlanX plan, @org.jetbrains.annotations.Nullable()
    java.lang.String planExpiry, @org.jetbrains.annotations.Nullable()
    java.lang.Integer planId, @org.jetbrains.annotations.Nullable()
    java.lang.Object privacyInterests, @org.jetbrains.annotations.Nullable()
    java.lang.Object privacyLinkedin, @org.jetbrains.annotations.Nullable()
    java.lang.Object privacyName, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.auth.model.Role> role, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeCustomerId, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.Subscription> subscriptions, @org.jetbrains.annotations.Nullable()
    java.lang.Object trialEndsAt, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalCredits) {
        super();
    }
    
    public User() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.auth.model.MDCard> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venue.venueresponse.PlanX component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.auth.model.Role> component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.personaldashboard.models.Subscription> component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component44() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.auth.model.User copy(@org.jetbrains.annotations.Nullable()
    java.lang.String abn, @org.jetbrains.annotations.Nullable()
    java.lang.String accountName, @org.jetbrains.annotations.Nullable()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar, @org.jetbrains.annotations.Nullable()
    java.lang.String bsb, @org.jetbrains.annotations.Nullable()
    java.lang.String cardBrand, @org.jetbrains.annotations.Nullable()
    java.lang.Object cardLastFour, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cardStatus, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.auth.model.MDCard> cards, @org.jetbrains.annotations.Nullable()
    java.lang.String companyLegalName, @org.jetbrains.annotations.Nullable()
    java.lang.String companyName, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer credit, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.personaldashboard.models.CurrentSubscription currentSubscription, @org.jetbrains.annotations.Nullable()
    java.lang.Integer daysLeftForExpiry, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.Object emailVerifiedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.String freePlanExpiryDate, @org.jetbrains.annotations.Nullable()
    java.lang.String freePlanStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSubscribed, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    java.lang.Object linkedin, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> media, @org.jetbrains.annotations.Nullable()
    java.lang.String ohsOnly, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object photo, @org.jetbrains.annotations.Nullable()
    java.lang.Object photoLink, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venue.venueresponse.PlanX plan, @org.jetbrains.annotations.Nullable()
    java.lang.String planExpiry, @org.jetbrains.annotations.Nullable()
    java.lang.Integer planId, @org.jetbrains.annotations.Nullable()
    java.lang.Object privacyInterests, @org.jetbrains.annotations.Nullable()
    java.lang.Object privacyLinkedin, @org.jetbrains.annotations.Nullable()
    java.lang.Object privacyName, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.auth.model.Role> role, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeCustomerId, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.personaldashboard.models.Subscription> subscriptions, @org.jetbrains.annotations.Nullable()
    java.lang.Object trialEndsAt, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalCredits) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}