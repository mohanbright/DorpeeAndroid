package com.droid.dorpee.networkOperator;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ<\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\u0019\b\u0001\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00100\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J<\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\u0019\b\u0001\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00100\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J2\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0019\b\u0001\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00100\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u001dH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ5\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u00172\b\b\u0001\u0010\u0007\u001a\u00020\"H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J+\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020&H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J+\u0010(\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020)H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J+\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020)H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J5\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020/2\b\b\u0001\u00100\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J+\u00102\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u00104\u001a\u000205H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J+\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u000209H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J+\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020=H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J+\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020AH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010BJ+\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020EH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010FJN\u0010G\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\u0010\b\u0001\u0010H\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010I2\u0019\b\u0001\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00100\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010KJN\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\u0010\b\u0001\u0010H\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010I2\u0019\b\u0001\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00100\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010KJ\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020%0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010OJ+\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010R\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J+\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010T\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J+\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010W\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J+\u0010X\u001a\b\u0012\u0004\u0012\u00020Q0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010Y\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J+\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J+\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010]\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J5\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020`H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010aJ5\u0010b\u001a\b\u0012\u0004\u0012\u00020_0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020cH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010dJ+\u0010e\u001a\b\u0012\u0004\u0012\u00020f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020gH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010hJH\u0010i\u001a\b\u0012\u0004\u0012\u00020j0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010k\u001a\u0004\u0018\u00010J2\u0019\b\u0001\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00100\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010lJ+\u0010m\u001a\b\u0012\u0004\u0012\u0002030\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010n\u001a\u00020oH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010pJ!\u0010q\u001a\b\u0012\u0004\u0012\u00020r0\u00032\b\b\u0001\u0010\u0007\u001a\u00020sH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010tJ+\u0010u\u001a\b\u0012\u0004\u0012\u00020v0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010w\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010xJ\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020z0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010OJ!\u0010{\u001a\b\u0012\u0004\u0012\u00020|0\u00032\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J!\u0010~\u001a\b\u0012\u0004\u0012\u00020\u007f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J-\u0010\u0080\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010]\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J#\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J#\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J,\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010Y\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J=\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\u0019\b\u0001\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00100\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J)\u0010\u0086\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00010I0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u0019\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010OJ\u0019\u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010OJ#\u0010\u008c\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u0019\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010OJ\"\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020V0\u00032\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J#\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010\u00032\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u0019\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010OJ,\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J7\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020v0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010w\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0097\u0001J,\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J-\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010]\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J$\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u009c\u00010\u00032\b\b\u0001\u00100\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u009d\u0001J#\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009f\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J#\u0010\u00a0\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a1\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u0019\u0010\u00a2\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a3\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010OJ#\u0010\u00a4\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a5\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u0019\u0010\u00a6\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a7\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010OJ#\u0010\u00a8\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a9\u00010\u00032\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J#\u0010\u00aa\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ab\u00010\u00032\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\"\u0010\u00ac\u0001\u001a\b\u0012\u0004\u0012\u00020f0\u00032\b\b\u0001\u0010\u0007\u001a\u00020sH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010tJ.\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\t\b\u0001\u0010\u0007\u001a\u00030\u00ae\u0001H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00af\u0001J.\u0010\u00b0\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\t\b\u0001\u0010\u0007\u001a\u00030\u00b1\u0001H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b2\u0001J@\u0010\u00b3\u0001\u001a\b\u0012\u0004\u0012\u00020f0\u00032\n\b\u0001\u0010k\u001a\u0004\u0018\u00010J2\u0019\b\u0001\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00100\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b4\u0001J/\u0010\u00b5\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b6\u00010\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\t\b\u0001\u0010\u0007\u001a\u00030\u00b7\u0001H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b8\u0001J/\u0010\u00b9\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\t\b\u0001\u0010\u0007\u001a\u00030\u00ba\u0001H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00bb\u0001J8\u0010\u00bc\u0001\u001a\b\u0012\u0004\u0012\u00020@0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\t\b\u0001\u0010\u0007\u001a\u00030\u00bd\u00012\b\b\u0001\u0010T\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00be\u0001J>\u0010\u00bf\u0001\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\u0019\b\u0001\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00100\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J0\u0010\u00c0\u0001\u001a\t\u0012\u0005\u0012\u00030\u00c1\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u00c2\u0001\u001a\u00030\u00c3\u0001H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00c4\u0001J8\u0010\u00c5\u0001\u001a\b\u0012\u0004\u0012\u00020D0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\t\b\u0001\u0010\u0007\u001a\u00030\u00c6\u00012\b\b\u0001\u0010Y\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00c7\u0001J\\\u0010\u00c8\u0001\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\u0010\b\u0001\u0010H\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010I2\u001b\b\u0001\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u0010\u0018\u00010\u000e2\b\b\u0001\u00100\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00c9\u0001JZ\u0010\u00ca\u0001\u001a\b\u0012\u0004\u0012\u00020M0\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\u0010\b\u0001\u0010H\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010I2\u0019\b\u0001\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00100\u000e2\b\b\u0001\u0010]\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00c9\u0001J4\u0010\u00cb\u0001\u001a\t\u0012\u0005\u0012\u00030\u00cc\u00010\u00032\u0019\b\u0001\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u000f\u00a2\u0006\u0002\b\u00100\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ/\u0010\u00cd\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ce\u00010\u00032\b\b\u0001\u0010\f\u001a\u00020\u00062\t\b\u0001\u0010\u0007\u001a\u00030\u00cf\u0001H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00d0\u0001\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00d1\u0001"}, d2 = {"Lcom/droid/dorpee/networkOperator/ApiService;", "", "addCard", "Lretrofit2/Response;", "Lcom/droid/dorpee/ui/personaldashboard/models/MDCards;", "authHeader", "", "request", "Lcom/droid/dorpee/ui/AddCardRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/AddCardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addContacts", "Lcom/droid/dorpee/ui/booking/model/ContactList;", "value", "partMap", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "advanceSearch", "Lcom/droid/dorpee/ui/search/model/SearchResponse;", "autoCheckIn", "Lcom/droid/dorpee/ui/search/ui/checkin/model/AutoCheckinResponse;", "venue_id", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "basicSearch", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blockAvailability", "Lcom/droid/dorpee/ui/BlockResponse;", "Lcom/droid/dorpee/ui/BlockAvailbilityRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/BlockAvailbilityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelBooking", "Lcom/droid/dorpee/ui/personaldashboard/models/MDBookingX;", "bookingId", "Lcom/droid/dorpee/ui/CancelRequest;", "(Ljava/lang/String;ILcom/droid/dorpee/ui/CancelRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePlan", "Lcom/droid/dorpee/ui/auth/model/PlanModel;", "Lcom/droid/dorpee/ui/ChangePlanRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/ChangePlanRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeStatus", "Lcom/droid/dorpee/ui/ChangeStatusRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/ChangeStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeVenueBookingStatus", "Lcom/droid/dorpee/ui/venuedashboard/model/VenueBooking;", "changeVenueStatus", "Lcom/droid/dorpee/ui/venue/venueresponse/VenueResponse;", "Lcom/droid/dorpee/ui/ChangeVenueStatusRequest;", "venueId", "(Ljava/lang/String;Lcom/droid/dorpee/ui/ChangeVenueStatusRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkIn", "Lokhttp3/ResponseBody;", "checkInReq", "Lcom/droid/dorpee/ui/CheckInRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/CheckInRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBookingEmployee", "Lcom/droid/dorpee/ui/booking/bookingmodel/BookingData;", "Lcom/droid/dorpee/ui/createBookingEmployeeRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/createBookingEmployeeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBookingPersonal", "Lcom/droid/dorpee/ui/venuedashboard/model/DataClass;", "Lcom/droid/dorpee/ui/createBookingPersonalRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/createBookingPersonalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createContact", "Lcom/droid/dorpee/ui/personaldashboard/models/MDContact;", "Lcom/droid/dorpee/ui/CreateContact;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/CreateContact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTeam", "Lcom/droid/dorpee/ui/personaldashboard/models/MDTeam;", "Lcom/droid/dorpee/ui/CreateTeamRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/CreateTeamRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createVenue", "imageList", "", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createWorkspace", "Lcom/droid/dorpee/ui/venue/model/EditSpaceRespnce;", "creditPrice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCard", "Lcom/droid/dorpee/ui/personaldashboard/models/MDResponse;", "cardId", "deleteContact", "contactId", "deletePreferencesItem", "Lcom/droid/dorpee/ui/personaldashboard/models/PreferencesResponse;", "id", "deleteTeam", "teamId", "deleteVenue", "Lcom/droid/dorpee/ui/DeleteResponse;", "deleteWorkspace", "spaceId", "editBookingEmployee", "Lcom/droid/dorpee/ui/auth/model/EditBooking;", "Lcom/droid/dorpee/ui/editBookingEmployeeRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/droid/dorpee/ui/editBookingEmployeeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editBookingPersonal", "Lcom/droid/dorpee/ui/editBookingPersonalRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/droid/dorpee/ui/editBookingPersonalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editProfileCustomer", "Lcom/droid/dorpee/ui/auth/model/LoginResponse;", "Lcom/droid/dorpee/ui/editPersonalProfile;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/editPersonalProfile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editProfileCustomers", "Lcom/droid/dorpee/ui/auth/model/EditProfileData;", "image", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extendBooking", "extendReq", "Lcom/droid/dorpee/ui/ExtendRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/ExtendRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forgetpassword", "Lcom/droid/dorpee/ui/ForgotResponse;", "Lcom/droid/dorpee/ui/LoginRequest;", "(Lcom/droid/dorpee/ui/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllVenueRevenue", "Lcom/droid/dorpee/ui/venuedashboard/model/VenueDurationResponse;", "filter", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAssets", "Lcom/droid/dorpee/ui/venue/model/AssetsResponse;", "getAvailability", "Lcom/droid/dorpee/ui/venuedashboard/model/BlockInOutResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBarChart", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/chartmodel/BarChartResponse;", "getBlockedSpaces", "Lcom/droid/dorpee/ui/venuedashboard/model/BlockedSpaceResponse;", "getBookings", "Lcom/droid/dorpee/ui/personaldashboard/models/MDBookingsList;", "getContacts", "Lcom/droid/dorpee/ui/personaldashboard/models/MDContactsList;", "getEmploeeList", "Lcom/droid/dorpee/ui/booking/model/EmployeeList;", "getEnvironment", "Lcom/droid/dorpee/ui/venue/model/EnvironmentResponse;", "getInterest", "Lcom/droid/dorpee/ui/auth/model/InterestResponse;", "getPieChart", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/chartmodel/PieChartResponse;", "getPlans", "Lcom/droid/dorpee/ui/personaldashboard/models/PlansList;", "getPreferences", "getProfile", "Lcom/droid/dorpee/ui/venuedashboard/venueItem/paymentModel/PaymentProfileResponse;", "getServices", "Lcom/droid/dorpee/ui/venue/model/ServicesResponse;", "getSingleVenue", "getSingleVenueRevenue", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSingleWithoutTokenVenue", "getSingleWorkSpaces", "Lcom/droid/dorpee/ui/venue/model/SingleSpaceRespnce;", "getSuggestedPrice", "Lcom/droid/dorpee/ui/venue/model/SuggestedPriceResponse;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTeams", "Lcom/droid/dorpee/ui/personaldashboard/models/MDTeamList;", "getTransactions", "Lcom/droid/dorpee/ui/auth/model/TransactionResponse;", "getTypes", "Lcom/droid/dorpee/ui/venue/model/TypesResponse;", "getVenueDashboard", "Lcom/droid/dorpee/ui/venuedashboard/model/VenueDashboardResponse;", "getVenueTypes", "Lcom/droid/dorpee/ui/venue/model/VenueTypeResponse;", "getVenues", "Lcom/droid/dorpee/ui/venuedashboard/model/AllVenuesResponse;", "getWorkSpaces", "Lcom/droid/dorpee/ui/venue/model/WorkspaceResponse;", "login", "purchaseCredits", "Lcom/droid/dorpee/ui/purchaseCreditRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/purchaseCreditRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "purchasePlan", "Lcom/droid/dorpee/ui/PurchasePlanRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/PurchasePlanRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUpApi", "(Lokhttp3/MultipartBody$Part;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unblockAvailabilty", "Lcom/droid/dorpee/ui/UnBlockResponse;", "Lcom/droid/dorpee/ui/UnblockRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/UnblockRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBlockedSpaces", "Lcom/droid/dorpee/ui/venuedashboard/model/DataBlocked;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/venuedashboard/model/DataBlocked;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateContact", "Lcom/droid/dorpee/ui/UpdateContact;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/UpdateContact;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentDetailsVenue", "updateSettings", "Lcom/droid/dorpee/ui/personaldashboard/models/MDUser;", "privacy", "Lcom/droid/dorpee/ui/PrivacySettings;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/PrivacySettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTeam", "Lcom/droid/dorpee/ui/UpdateTeamRequest;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/UpdateTeamRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateVenue", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateWorkspace", "validateBooking", "Lcom/droid/dorpee/ui/search/model/DataModel;", "venueAvailabilty", "Lcom/droid/dorpee/ui/venue/model/VenueAvailibiltyResponse;", "Lcom/droid/dorpee/ui/VenueAvailityReq;", "(Ljava/lang/String;Lcom/droid/dorpee/ui/VenueAvailityReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_liveDebug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/login")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.LoginRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.LoginResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/forgetpassword")
    public abstract java.lang.Object forgetpassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.LoginRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.ForgotResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/register")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object signUpApi(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.LoginResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/services")
    public abstract java.lang.Object getServices(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.model.ServicesResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/types")
    public abstract java.lang.Object getTypes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.model.TypesResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/interests")
    public abstract java.lang.Object getInterest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.InterestResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/venue_types")
    public abstract java.lang.Object getVenueTypes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.model.VenueTypeResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/environments")
    public abstract java.lang.Object getEnvironment(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.model.EnvironmentResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/assets")
    public abstract java.lang.Object getAssets(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.model.AssetsResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/spaces")
    public abstract java.lang.Object getWorkSpaces(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.model.WorkspaceResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/spaces/{spaceId}")
    public abstract java.lang.Object getSingleWorkSpaces(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @retrofit2.http.Path(value = "spaceId")
    int spaceId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.model.SingleSpaceRespnce>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "/app/v1/user/spaces/{spaceId}")
    public abstract java.lang.Object deleteWorkspace(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @retrofit2.http.Path(value = "spaceId")
    int spaceId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.DeleteResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/venues")
    public abstract java.lang.Object getVenues(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.model.AllVenuesResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/search/preferences")
    public abstract java.lang.Object getPreferences(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "/app/v1/user/search/preferences/{ID}")
    public abstract java.lang.Object deletePreferencesItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @retrofit2.http.Path(value = "ID")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.PreferencesResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/venues/{venueId}")
    public abstract java.lang.Object getSingleVenue(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @retrofit2.http.Path(value = "venueId")
    int venueId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.venueresponse.VenueResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/venues/{venueId}")
    public abstract java.lang.Object getSingleWithoutTokenVenue(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @retrofit2.http.Path(value = "venueId")
    int venueId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.venueresponse.VenueResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "/app/v1/user/venues/{venueId}")
    public abstract java.lang.Object deleteVenue(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @retrofit2.http.Path(value = "venueId")
    int venueId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.DeleteResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/venues")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object createVenue(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    java.util.List<okhttp3.MultipartBody.Part> imageList, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.venueresponse.VenueResponse>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/venues/{venueId}")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object updateVenue(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    java.util.List<okhttp3.MultipartBody.Part> imageList, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @retrofit2.http.Path(value = "venueId")
    int venueId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.venueresponse.VenueResponse>> p4);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/spaces")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object createWorkspace(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    java.util.List<okhttp3.MultipartBody.Part> imageList, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.model.EditSpaceRespnce>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/spaces/{spaceId}")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object updateWorkspace(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    java.util.List<okhttp3.MultipartBody.Part> imageList, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @retrofit2.http.Path(value = "spaceId")
    int spaceId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.model.EditSpaceRespnce>> p4);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/venue-availabilities")
    public abstract java.lang.Object venueAvailabilty(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.VenueAvailityReq request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.model.VenueAvailibiltyResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/availabilities")
    public abstract java.lang.Object blockAvailability(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.BlockAvailbilityRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.BlockResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/availabilities/unblock")
    public abstract java.lang.Object unblockAvailabilty(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.UnblockRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.UnBlockResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/availabilities")
    public abstract java.lang.Object getAvailability(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.model.BlockInOutResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/search/basic")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object basicSearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.search.model.SearchResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/search/advance")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object advanceSearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.search.model.SearchResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/bookings")
    public abstract java.lang.Object getBookings(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDBookingsList>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/plans")
    public abstract java.lang.Object getPlans(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.PlansList>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/change-plan")
    public abstract java.lang.Object changePlan(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.ChangePlanRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.PlanModel>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/purchase-plan")
    public abstract java.lang.Object purchasePlan(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.PurchasePlanRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.PlanModel>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/cards")
    public abstract java.lang.Object addCard(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.AddCardRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDCards>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/teams")
    public abstract java.lang.Object createTeam(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.CreateTeamRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDTeam>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/teams/{teamId}")
    public abstract java.lang.Object updateTeam(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.UpdateTeamRequest request, @retrofit2.http.Path(value = "teamId")
    int teamId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDTeam>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/teams")
    public abstract java.lang.Object getTeams(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDTeamList>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/contacts")
    public abstract java.lang.Object getContacts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDContactsList>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/credit-price")
    public abstract java.lang.Object creditPrice(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.PlanModel>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "/app/v1/user/teams/{teamId}")
    public abstract java.lang.Object deleteTeam(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @retrofit2.http.Path(value = "teamId")
    int teamId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "/app/v1/user/contacts/{contactId}")
    public abstract java.lang.Object deleteContact(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @retrofit2.http.Path(value = "contactId")
    int contactId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/contacts")
    public abstract java.lang.Object createContact(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.CreateContact request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDContact>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/contacts/{contactId}")
    public abstract java.lang.Object updateContact(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.UpdateContact request, @retrofit2.http.Path(value = "contactId")
    int contactId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDContact>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/bookings/change-status/{bookingId}")
    public abstract java.lang.Object cancelBooking(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @retrofit2.http.Path(value = "bookingId")
    int bookingId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.CancelRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDBookingX>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/bookings/changestatus")
    public abstract java.lang.Object changeStatus(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.ChangeStatusRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDBookingX>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/bookings/changestatus")
    public abstract java.lang.Object changeVenueBookingStatus(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.ChangeStatusRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.model.VenueBooking>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/venues/change-status/{venueId}")
    public abstract java.lang.Object changeVenueStatus(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.ChangeVenueStatusRequest request, @retrofit2.http.Path(value = "venueId")
    int venueId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.venueresponse.VenueResponse>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/bookings/extend")
    public abstract java.lang.Object extendBooking(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.ExtendRequest extendReq, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/booking-validate")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object validateBooking(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.search.model.DataModel>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/checkin")
    public abstract java.lang.Object checkIn(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.CheckInRequest checkInReq, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/profile")
    public abstract java.lang.Object updateSettings(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.PrivacySettings privacy, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDUser>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "app/v1/user/cards/{cardId}")
    public abstract java.lang.Object deleteCard(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @retrofit2.http.Path(value = "cardId")
    int cardId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.personaldashboard.models.MDResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/venue/dashboard")
    public abstract java.lang.Object getVenueDashboard(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.model.VenueDashboardResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/venue/bar-chart")
    public abstract java.lang.Object getBarChart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.BarChartResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/venue/pie-chart")
    public abstract java.lang.Object getPieChart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.venueItem.chartmodel.PieChartResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/venue/revenue-duration/stats")
    public abstract java.lang.Object getSingleVenueRevenue(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "filter")
    java.lang.String filter, @retrofit2.http.Query(value = "venue_id")
    int venue_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.model.VenueDurationResponse>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/venue/revenue-duration/stats")
    public abstract java.lang.Object getAllVenueRevenue(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "filter")
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.model.VenueDurationResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/suggestedprice/{venueId}")
    public abstract java.lang.Object getSuggestedPrice(@retrofit2.http.Path(value = "venueId")
    int venueId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venue.model.SuggestedPriceResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/checkin")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object autoCheckIn(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @retrofit2.http.Part(value = "venue_id")
    int venue_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.search.ui.checkin.model.AutoCheckinResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/contacts")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object addContacts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.booking.model.ContactList>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/contacts")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object getContacts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.booking.model.ContactList>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/contacts/{teamId}")
    public abstract java.lang.Object getContacts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @retrofit2.http.Path(value = "teamId")
    int teamId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.booking.model.ContactList>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/purchase-credits")
    public abstract java.lang.Object purchaseCredits(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.purchaseCreditRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.PlanModel>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/bookings")
    public abstract java.lang.Object createBookingEmployee(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.createBookingEmployeeRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.booking.bookingmodel.BookingData>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/bookings/{bookingId}")
    public abstract java.lang.Object editBookingPersonal(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "bookingId")
    java.lang.String bookingId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.editBookingPersonalRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.EditBooking>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/bookings/{bookingId}")
    public abstract java.lang.Object editBookingEmployee(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "bookingId")
    java.lang.String bookingId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.editBookingEmployeeRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.EditBooking>> p3);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/bookings")
    public abstract java.lang.Object createBookingPersonal(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.createBookingPersonalRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.model.DataClass>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/customer/my-employers")
    public abstract java.lang.Object getEmploeeList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.droid.dorpee.ui.booking.model.EmployeeList>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/transactions")
    public abstract java.lang.Object getTransactions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.TransactionResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/user/blocked-spaces/{spaceId}")
    public abstract java.lang.Object getBlockedSpaces(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @retrofit2.http.Path(value = "spaceId")
    int spaceId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.model.BlockedSpaceResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/user/blocked-spaces")
    public abstract java.lang.Object updateBlockedSpaces(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.venuedashboard.model.DataBlocked request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.model.BlockedSpaceResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/profile")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object updatePaymentDetailsVenue(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.PaymentProfileResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/app/v1/profile")
    public abstract java.lang.Object getProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.venuedashboard.venueItem.paymentModel.PaymentProfileResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/profile")
    public abstract java.lang.Object editProfileCustomer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.droid.dorpee.ui.editPersonalProfile request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.LoginResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "/app/v1/profile")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object editProfileCustomers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authHeader, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part image, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PartMap()
    java.util.Map<java.lang.String, okhttp3.RequestBody> partMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.droid.dorpee.ui.auth.model.EditProfileData>> p3);
}