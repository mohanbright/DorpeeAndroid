package com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0003\b\u0083\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u00cf\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\'\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010/\u001a\u0004\u0018\u000100\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u000b\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\b\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\b\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010@\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010CJ\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010SJ\u0012\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\bH\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010SJ\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u00c6\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00a3\u0001\u001a\u0004\u0018\u000100H\u00c6\u0003J\f\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\u0012\u0010\u00ab\u0001\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00ac\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u00af\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u00c6\u0003J\u0012\u0010\u00b0\u0001\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\f\u0010\u00b5\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\f\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00c8\u0005\u0010\u00ba\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u00107\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00bb\u0001J\u0015\u0010\u00bc\u0001\u001a\u00020\u00102\t\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00be\u0001\u001a\u00020\u000bH\u00d6\u0001J\n\u0010\u00bf\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010ER\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010ER\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010ER\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010ER\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010ER\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010T\u001a\u0004\bR\u0010SR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010KR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010ER\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010IR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010ER\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bY\u0010MR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\b\\\u0010MR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010IR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010ER\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010ER\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010ER\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010ER\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bb\u0010MR\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010ER\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010ER\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010ER\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010ER\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010ER\u001a\u0010%\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bh\u0010MR\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010KR\u001a\u0010\'\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010T\u001a\u0004\b\'\u0010SR\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010ER\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010ER\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010KR\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010ER\u0018\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010ER\u0018\u0010-\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010IR\u0018\u0010.\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010IR\u0018\u0010/\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0018\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010ER\u001a\u00102\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bt\u0010MR\u0018\u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010ER\u0018\u00104\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010ER\u0018\u00105\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010ER\u001a\u00106\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bx\u0010MR\u001e\u00107\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010KR\u0018\u00109\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010ER\u0018\u0010:\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010IR\u0018\u0010;\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010ER\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010KR\u0018\u0010>\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010IR\u0018\u0010?\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010IR\u001b\u0010@\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010N\u001a\u0005\b\u0080\u0001\u0010MR\u0019\u0010A\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010IR\u0019\u0010B\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010E\u00a8\u0006\u00c0\u0001"}, d2 = {"Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/Data;", "", "abn", "", "accountName", "accountNumber", "avatar", "bookings", "", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/Booking;", "bookingsCount", "", "bsb", "cardBrand", "cardLastFour", "cardStatus", "", "cards", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/Card;", "companyLegalName", "companyName", "createdAt", "credit", "currentSubscription", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/CurrentSubscription;", "daysLeftForExpiry", "deviceId", "deviceType", "email", "emailVerifiedAt", "employeeCost", "employerCredits", "employerPlanId", "firstName", "freePlanExpiryDate", "freePlanStatus", "fullName", "id", "interests", "isSubscribed", "lastName", "linkedin", "media", "ohsOnly", "phoneNumber", "photo", "photoLink", "plan", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/Plan;", "planExpiry", "planId", "privacyInterests", "privacyLinkedin", "privacyName", "purchasedCredits", "role", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/Role;", "status", "stripeCustomerId", "stripeId", "subscriptions", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/Subscription;", "termsAccepted", "termsAcceptedDate", "totalCredits", "trialEndsAt", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/CurrentSubscription;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/Plan;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;)V", "getAbn", "()Ljava/lang/String;", "getAccountName", "getAccountNumber", "getAvatar", "()Ljava/lang/Object;", "getBookings", "()Ljava/util/List;", "getBookingsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBsb", "getCardBrand", "getCardLastFour", "getCardStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCards", "getCompanyLegalName", "getCompanyName", "getCreatedAt", "getCredit", "getCurrentSubscription", "()Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/CurrentSubscription;", "getDaysLeftForExpiry", "getDeviceId", "getDeviceType", "getEmail", "getEmailVerifiedAt", "getEmployeeCost", "getEmployerCredits", "getEmployerPlanId", "getFirstName", "getFreePlanExpiryDate", "getFreePlanStatus", "getFullName", "getId", "getInterests", "getLastName", "getLinkedin", "getMedia", "getOhsOnly", "getPhoneNumber", "getPhoto", "getPhotoLink", "getPlan", "()Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/Plan;", "getPlanExpiry", "getPlanId", "getPrivacyInterests", "getPrivacyLinkedin", "getPrivacyName", "getPurchasedCredits", "getRole", "getStatus", "getStripeCustomerId", "getStripeId", "getSubscriptions", "getTermsAccepted", "getTermsAcceptedDate", "getTotalCredits", "getTrialEndsAt", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/CurrentSubscription;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/Plan;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;)Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/Data;", "equals", "other", "hashCode", "toString", "app_liveDebug"})
public final class Data {
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
    private final java.lang.Object avatar = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "bookings")
    private final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Booking> bookings = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "bookings_count")
    private final java.lang.Integer bookingsCount = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "bsb")
    private final java.lang.String bsb = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "card_brand")
    private final java.lang.String cardBrand = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "card_last_four")
    private final java.lang.String cardLastFour = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "card_status")
    private final java.lang.Boolean cardStatus = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "cards")
    private final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Card> cards = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "company_legal_name")
    private final java.lang.String companyLegalName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "company_name")
    private final java.lang.Object companyName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "credit")
    private final java.lang.Integer credit = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "current_subscription")
    private final com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.CurrentSubscription currentSubscription = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "days_left_for_expiry")
    private final java.lang.Integer daysLeftForExpiry = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "device_id")
    private final java.lang.Object deviceId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "device_type")
    private final java.lang.String deviceType = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "email")
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "email_verified_at")
    private final java.lang.String emailVerifiedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "employee_cost")
    private final java.lang.String employeeCost = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "employer_credits")
    private final java.lang.Integer employerCredits = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "employer_plan_id")
    private final java.lang.String employerPlanId = null;
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
    @com.google.gson.annotations.SerializedName(value = "interests")
    private final java.util.List<java.lang.Object> interests = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "is_subscribed")
    private final java.lang.Boolean isSubscribed = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "last_name")
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "linkedin")
    private final java.lang.String linkedin = null;
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
    private final com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Plan plan = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "plan_expiry")
    private final java.lang.String planExpiry = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "plan_id")
    private final java.lang.Integer planId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "privacy_interests")
    private final java.lang.String privacyInterests = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "privacy_linkedin")
    private final java.lang.String privacyLinkedin = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "privacy_name")
    private final java.lang.String privacyName = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "purchased_credits")
    private final java.lang.Integer purchasedCredits = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "role")
    private final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Role> role = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "stripe_customer_id")
    private final java.lang.Object stripeCustomerId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "stripe_id")
    private final java.lang.String stripeId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "subscriptions")
    private final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Subscription> subscriptions = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "terms_accepted")
    private final java.lang.Object termsAccepted = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "terms_accepted_date")
    private final java.lang.Object termsAcceptedDate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_credits")
    private final java.lang.Integer totalCredits = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "trial_ends_at")
    private final java.lang.Object trialEndsAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private final java.lang.String updatedAt = null;
    
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
    public final java.lang.Object getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Booking> getBookings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBookingsCount() {
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
    public final java.lang.String getCardLastFour() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCardStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Card> getCards() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompanyLegalName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCompanyName() {
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
    public final com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.CurrentSubscription getCurrentSubscription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDaysLeftForExpiry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDeviceId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeviceType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmailVerifiedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmployeeCost() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEmployerCredits() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmployerPlanId() {
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
    public final java.util.List<java.lang.Object> getInterests() {
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
    public final java.lang.String getLinkedin() {
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
    public final com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Plan getPlan() {
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrivacyInterests() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrivacyLinkedin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrivacyName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPurchasedCredits() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Role> getRole() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getStripeCustomerId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStripeId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Subscription> getSubscriptions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTermsAccepted() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTermsAcceptedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalCredits() {
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
    
    public Data(@org.jetbrains.annotations.Nullable()
    java.lang.String abn, @org.jetbrains.annotations.Nullable()
    java.lang.String accountName, @org.jetbrains.annotations.Nullable()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object avatar, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Booking> bookings, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bookingsCount, @org.jetbrains.annotations.Nullable()
    java.lang.String bsb, @org.jetbrains.annotations.Nullable()
    java.lang.String cardBrand, @org.jetbrains.annotations.Nullable()
    java.lang.String cardLastFour, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cardStatus, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Card> cards, @org.jetbrains.annotations.Nullable()
    java.lang.String companyLegalName, @org.jetbrains.annotations.Nullable()
    java.lang.Object companyName, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer credit, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.CurrentSubscription currentSubscription, @org.jetbrains.annotations.Nullable()
    java.lang.Integer daysLeftForExpiry, @org.jetbrains.annotations.Nullable()
    java.lang.Object deviceId, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceType, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String emailVerifiedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String employeeCost, @org.jetbrains.annotations.Nullable()
    java.lang.Integer employerCredits, @org.jetbrains.annotations.Nullable()
    java.lang.String employerPlanId, @org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.String freePlanExpiryDate, @org.jetbrains.annotations.Nullable()
    java.lang.String freePlanStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> interests, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSubscribed, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    java.lang.String linkedin, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> media, @org.jetbrains.annotations.Nullable()
    java.lang.String ohsOnly, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object photo, @org.jetbrains.annotations.Nullable()
    java.lang.Object photoLink, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Plan plan, @org.jetbrains.annotations.Nullable()
    java.lang.String planExpiry, @org.jetbrains.annotations.Nullable()
    java.lang.Integer planId, @org.jetbrains.annotations.Nullable()
    java.lang.String privacyInterests, @org.jetbrains.annotations.Nullable()
    java.lang.String privacyLinkedin, @org.jetbrains.annotations.Nullable()
    java.lang.String privacyName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer purchasedCredits, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Role> role, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Object stripeCustomerId, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Subscription> subscriptions, @org.jetbrains.annotations.Nullable()
    java.lang.Object termsAccepted, @org.jetbrains.annotations.Nullable()
    java.lang.Object termsAcceptedDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalCredits, @org.jetbrains.annotations.Nullable()
    java.lang.Object trialEndsAt, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt) {
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
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Booking> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Card> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.CurrentSubscription component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component18() {
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
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component26() {
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
    public final java.lang.Integer component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.Object> component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Plan component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Role> component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Subscription> component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component51() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component52() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component53() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component54() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component55() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Data copy(@org.jetbrains.annotations.Nullable()
    java.lang.String abn, @org.jetbrains.annotations.Nullable()
    java.lang.String accountName, @org.jetbrains.annotations.Nullable()
    java.lang.String accountNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object avatar, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Booking> bookings, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bookingsCount, @org.jetbrains.annotations.Nullable()
    java.lang.String bsb, @org.jetbrains.annotations.Nullable()
    java.lang.String cardBrand, @org.jetbrains.annotations.Nullable()
    java.lang.String cardLastFour, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean cardStatus, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Card> cards, @org.jetbrains.annotations.Nullable()
    java.lang.String companyLegalName, @org.jetbrains.annotations.Nullable()
    java.lang.Object companyName, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.Integer credit, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.CurrentSubscription currentSubscription, @org.jetbrains.annotations.Nullable()
    java.lang.Integer daysLeftForExpiry, @org.jetbrains.annotations.Nullable()
    java.lang.Object deviceId, @org.jetbrains.annotations.Nullable()
    java.lang.String deviceType, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String emailVerifiedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String employeeCost, @org.jetbrains.annotations.Nullable()
    java.lang.Integer employerCredits, @org.jetbrains.annotations.Nullable()
    java.lang.String employerPlanId, @org.jetbrains.annotations.Nullable()
    java.lang.String firstName, @org.jetbrains.annotations.Nullable()
    java.lang.String freePlanExpiryDate, @org.jetbrains.annotations.Nullable()
    java.lang.String freePlanStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> interests, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isSubscribed, @org.jetbrains.annotations.Nullable()
    java.lang.String lastName, @org.jetbrains.annotations.Nullable()
    java.lang.String linkedin, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> media, @org.jetbrains.annotations.Nullable()
    java.lang.String ohsOnly, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    java.lang.Object photo, @org.jetbrains.annotations.Nullable()
    java.lang.Object photoLink, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Plan plan, @org.jetbrains.annotations.Nullable()
    java.lang.String planExpiry, @org.jetbrains.annotations.Nullable()
    java.lang.Integer planId, @org.jetbrains.annotations.Nullable()
    java.lang.String privacyInterests, @org.jetbrains.annotations.Nullable()
    java.lang.String privacyLinkedin, @org.jetbrains.annotations.Nullable()
    java.lang.String privacyName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer purchasedCredits, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Role> role, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.Object stripeCustomerId, @org.jetbrains.annotations.Nullable()
    java.lang.String stripeId, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.Subscription> subscriptions, @org.jetbrains.annotations.Nullable()
    java.lang.Object termsAccepted, @org.jetbrains.annotations.Nullable()
    java.lang.Object termsAcceptedDate, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalCredits, @org.jetbrains.annotations.Nullable()
    java.lang.Object trialEndsAt, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt) {
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