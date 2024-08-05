package com.kotdev.abzagency.data.paging;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u00fe\u0001\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012=\u0010\t\u001a9\b\u0001\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n\u0012(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n\u0012$\u0010\u0013\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n\u0012L\u0010\u0015\u001aH\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0016\u00a2\u0006\u0002\u0010\u0019J\u000e\u0010\u001f\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\bH\u0016R\u0010\u0010\u0004\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010\u0013\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001cR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001cRG\u0010\t\u001a9\b\u0001\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001cRV\u0010\u0015\u001aH\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00010\u0010\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0016X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001dR\u0010\u0010\u001e\u001a\u00028\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001a\u00a8\u0006\""}, d2 = {"Lcom/kotdev/abzagency/data/paging/CommonPaging;", "Key", "Value", "Lcom/kotdev/abzagency/data/paging/Paging;", "initialPage", "onLoad", "Lkotlin/Function1;", "", "", "onRequest", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "nextKey", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "", "", "onNextPage", "onError", "", "onSuccess", "Lkotlin/Function3;", "items", "newKey", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "Ljava/lang/Object;", "isLoad", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function3;", "page", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "data_debug"})
public final class CommonPaging<Key extends java.lang.Object, Value extends java.lang.Object> implements com.kotdev.abzagency.data.paging.Paging<Key, Value> {
    private final Key initialPage = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onLoad = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<Key, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends Value>>>, java.lang.Object> onRequest = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<java.util.List<? extends Value>, kotlin.coroutines.Continuation<? super Key>, java.lang.Object> onNextPage = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onError = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function3<java.util.List<? extends Value>, Key, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> onSuccess = null;
    private Key page;
    private boolean isLoad = false;
    
    public CommonPaging(Key initialPage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onLoad, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super Key, ? super kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends Value>>>, ? extends java.lang.Object> onRequest, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.util.List<? extends Value>, ? super kotlin.coroutines.Continuation<? super Key>, ? extends java.lang.Object> onNextPage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Throwable, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super java.util.List<? extends Value>, ? super Key, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onSuccess) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object load(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public void reset() {
    }
}