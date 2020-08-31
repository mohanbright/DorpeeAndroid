package com.droid.dorpee.ui.search.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b^\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0014\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0014\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0014\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u00104J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010i\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010p\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010s\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010x\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0011\u0010{\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0014H\u00c6\u0003J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\f\u0010\u0084\u0001\u001a\u0004\u0018\u000101H\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00a0\u0004\u0010\u008d\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00142\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00142\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00142\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00142\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u0001012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0003\u0010\u008e\u0001J\u0017\u0010\u008f\u0001\u001a\u00030\u0090\u00012\n\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001H\u00d6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0007H\u00d6\u0001J\n\u0010\u0094\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\b9\u0010:R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00106R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00106R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00106R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00106R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00106R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00106R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\bF\u0010:R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00106R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00106R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00106R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010HR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00106R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00106R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010HR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00106R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00106R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00106R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00106R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010HR\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00106R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010HR\u0018\u0010\'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00106R\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00106R\u0018\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00106R\u001a\u0010*\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\b[\u0010:R\u001a\u0010+\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\b\\\u0010:R\u0018\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u00106R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010HR\u001a\u0010/\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\b_\u0010:R\u0018\u00100\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u001a\u00102\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\bb\u0010:R\u001a\u00103\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\bc\u0010:\u00a8\u0006\u0095\u0001"}, d2 = {"Lcom/droid/dorpee/ui/search/model/Data;", "Ljava/io/Serializable;", "address", "", "assessment", "Lcom/droid/dorpee/ui/search/model/Assessment;", "averageRating", "", "bonusOffer", "capacity", "country", "createdAt", "deletedAt", "description", "distanceFromCity", "distanceFromSearchedSuburb", "email", "featured", "id", "images", "", "imagesLink", "lat", "lng", "lowestPrice", "media", "Lcom/droid/dorpee/ui/search/model/Media;", "name", "phoneNumber", "photos", "postcode", "price", "qrCode", "qrPdf", "services", "Lcom/droid/dorpee/ui/search/model/Service;", "slug", "spaces", "Lcom/droid/dorpee/ui/venuedashboard/model/Space;", "state", "status", "suburb", "totalAvailable", "totalReviews", "updatedAt", "uploadedImages", "Lcom/droid/dorpee/ui/search/model/UploadedImageX;", "userId", "venueType", "Lcom/droid/dorpee/ui/search/model/VenueType;", "venueTypeId", "workspaceCount", "(Ljava/lang/String;Lcom/droid/dorpee/ui/search/model/Assessment;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lcom/droid/dorpee/ui/search/model/VenueType;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAddress", "()Ljava/lang/String;", "getAssessment", "()Lcom/droid/dorpee/ui/search/model/Assessment;", "getAverageRating", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBonusOffer", "getCapacity", "getCountry", "getCreatedAt", "getDeletedAt", "getDescription", "getDistanceFromCity", "getDistanceFromSearchedSuburb", "getEmail", "getFeatured", "getId", "getImages", "()Ljava/util/List;", "getImagesLink", "getLat", "getLng", "getLowestPrice", "getMedia", "getName", "getPhoneNumber", "getPhotos", "getPostcode", "getPrice", "getQrCode", "getQrPdf", "getServices", "getSlug", "getSpaces", "getState", "getStatus", "getSuburb", "getTotalAvailable", "getTotalReviews", "getUpdatedAt", "getUploadedImages", "getUserId", "getVenueType", "()Lcom/droid/dorpee/ui/search/model/VenueType;", "getVenueTypeId", "getWorkspaceCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/droid/dorpee/ui/search/model/Assessment;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lcom/droid/dorpee/ui/search/model/VenueType;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/droid/dorpee/ui/search/model/Data;", "equals", "", "other", "", "hashCode", "toString", "app_stageDebug"})
public final class Data implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "address")
    private final java.lang.String address = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "assessment")
    private final com.droid.dorpee.ui.search.model.Assessment assessment = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "average_rating")
    private final java.lang.Integer averageRating = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "bonus_offer")
    private final java.lang.String bonusOffer = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "capacity")
    private final java.lang.String capacity = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "country")
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "created_at")
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "deleted_at")
    private final java.lang.String deletedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "distance_from_city")
    private final java.lang.String distanceFromCity = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "distance_from_searched_suburb")
    private final java.lang.String distanceFromSearchedSuburb = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "email")
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "featured")
    private final java.lang.String featured = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id")
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "images")
    private final java.util.List<java.lang.String> images = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "images_link")
    private final java.lang.String imagesLink = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "lat")
    private final java.lang.String lat = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "lng")
    private final java.lang.String lng = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "lowest_price")
    private final java.lang.String lowestPrice = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "media")
    private final java.util.List<com.droid.dorpee.ui.search.model.Media> media = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "phone_number")
    private final java.lang.String phoneNumber = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "photos")
    private final java.util.List<java.lang.String> photos = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "postcode")
    private final java.lang.String postcode = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "price")
    private final java.lang.String price = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "qr_code")
    private final java.lang.String qrCode = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "qr_pdf")
    private final java.lang.String qrPdf = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "services")
    private final java.util.List<com.droid.dorpee.ui.search.model.Service> services = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "slug")
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "spaces")
    private final java.util.List<com.droid.dorpee.ui.venuedashboard.model.Space> spaces = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "state")
    private final java.lang.String state = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "suburb")
    private final java.lang.String suburb = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_available")
    private final java.lang.Integer totalAvailable = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "total_reviews")
    private final java.lang.Integer totalReviews = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "updated_at")
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "uploaded_images")
    private final java.util.List<com.droid.dorpee.ui.search.model.UploadedImageX> uploadedImages = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "user_id")
    private final java.lang.Integer userId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "venue_type")
    private final com.droid.dorpee.ui.search.model.VenueType venueType = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "venue_type_id")
    private final java.lang.Integer venueTypeId = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "workspace_count")
    private final java.lang.Integer workspaceCount = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.search.model.Assessment getAssessment() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAverageRating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBonusOffer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCapacity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDeletedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDistanceFromCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDistanceFromSearchedSuburb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFeatured() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImagesLink() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLng() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLowestPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.search.model.Media> getMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPostcode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQrCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQrPdf() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.search.model.Service> getServices() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venuedashboard.model.Space> getSpaces() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSuburb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTotalReviews() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.search.model.UploadedImageX> getUploadedImages() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.search.model.VenueType getVenueType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVenueTypeId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWorkspaceCount() {
        return null;
    }
    
    public Data(@org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.search.model.Assessment assessment, @org.jetbrains.annotations.Nullable()
    java.lang.Integer averageRating, @org.jetbrains.annotations.Nullable()
    java.lang.String bonusOffer, @org.jetbrains.annotations.Nullable()
    java.lang.String capacity, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String deletedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String distanceFromCity, @org.jetbrains.annotations.Nullable()
    java.lang.String distanceFromSearchedSuburb, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String featured, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.Nullable()
    java.lang.String imagesLink, @org.jetbrains.annotations.Nullable()
    java.lang.String lat, @org.jetbrains.annotations.Nullable()
    java.lang.String lng, @org.jetbrains.annotations.Nullable()
    java.lang.String lowestPrice, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.search.model.Media> media, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> photos, @org.jetbrains.annotations.Nullable()
    java.lang.String postcode, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.String qrCode, @org.jetbrains.annotations.Nullable()
    java.lang.String qrPdf, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.search.model.Service> services, @org.jetbrains.annotations.Nullable()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venuedashboard.model.Space> spaces, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String suburb, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalReviews, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.search.model.UploadedImageX> uploadedImages, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userId, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.search.model.VenueType venueType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer venueTypeId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer workspaceCount) {
        super();
    }
    
    public Data() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.search.model.Assessment component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
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
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
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
    public final java.util.List<com.droid.dorpee.ui.search.model.Media> component20() {
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
    public final java.util.List<java.lang.String> component23() {
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
    public final java.util.List<com.droid.dorpee.ui.search.model.Service> component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.venuedashboard.model.Space> component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component31() {
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
    public final java.lang.Integer component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.droid.dorpee.ui.search.model.UploadedImageX> component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.droid.dorpee.ui.search.model.VenueType component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component41() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.droid.dorpee.ui.search.model.Data copy(@org.jetbrains.annotations.Nullable()
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.search.model.Assessment assessment, @org.jetbrains.annotations.Nullable()
    java.lang.Integer averageRating, @org.jetbrains.annotations.Nullable()
    java.lang.String bonusOffer, @org.jetbrains.annotations.Nullable()
    java.lang.String capacity, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    java.lang.String deletedAt, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.lang.String distanceFromCity, @org.jetbrains.annotations.Nullable()
    java.lang.String distanceFromSearchedSuburb, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String featured, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> images, @org.jetbrains.annotations.Nullable()
    java.lang.String imagesLink, @org.jetbrains.annotations.Nullable()
    java.lang.String lat, @org.jetbrains.annotations.Nullable()
    java.lang.String lng, @org.jetbrains.annotations.Nullable()
    java.lang.String lowestPrice, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.search.model.Media> media, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> photos, @org.jetbrains.annotations.Nullable()
    java.lang.String postcode, @org.jetbrains.annotations.Nullable()
    java.lang.String price, @org.jetbrains.annotations.Nullable()
    java.lang.String qrCode, @org.jetbrains.annotations.Nullable()
    java.lang.String qrPdf, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.search.model.Service> services, @org.jetbrains.annotations.Nullable()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.venuedashboard.model.Space> spaces, @org.jetbrains.annotations.Nullable()
    java.lang.String state, @org.jetbrains.annotations.Nullable()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.lang.String suburb, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalAvailable, @org.jetbrains.annotations.Nullable()
    java.lang.Integer totalReviews, @org.jetbrains.annotations.Nullable()
    java.lang.String updatedAt, @org.jetbrains.annotations.Nullable()
    java.util.List<com.droid.dorpee.ui.search.model.UploadedImageX> uploadedImages, @org.jetbrains.annotations.Nullable()
    java.lang.Integer userId, @org.jetbrains.annotations.Nullable()
    com.droid.dorpee.ui.search.model.VenueType venueType, @org.jetbrains.annotations.Nullable()
    java.lang.Integer venueTypeId, @org.jetbrains.annotations.Nullable()
    java.lang.Integer workspaceCount) {
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