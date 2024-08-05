package com.kotdev.abzagency.data.repositories;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J2\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0011\u0010\u000fJ\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0013H\u0016J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0019"}, d2 = {"Lcom/kotdev/abzagency/data/repositories/MainRepositoryImpl;", "Lcom/kotdev/abzagency/domain/repository/MainRepository;", "database", "Lcom/kotdev/abzagency/database/HistoryDatabase;", "(Lcom/kotdev/abzagency/database/HistoryDatabase;)V", "historyDao", "Lcom/kotdev/abzagency/database/dao/HistoryDao;", "getAllPagingSource", "Lkotlin/Result;", "", "Lcom/kotdev/abzagency/database/HistoryWithDuplicate;", "page", "", "pageSize", "getAllPagingSource-0E7RQCE", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getItems", "getItems-0E7RQCE", "historiesFlow", "Lkotlinx/coroutines/flow/Flow;", "observeAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeItem", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class MainRepositoryImpl implements com.kotdev.abzagency.domain.repository.MainRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.database.HistoryDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.database.dao.HistoryDao historyDao = null;
    
    @javax.inject.Inject()
    public MainRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.database.HistoryDatabase database) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object observeAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.kotdev.abzagency.database.HistoryWithDuplicate>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.kotdev.abzagency.database.HistoryWithDuplicate>> historiesFlow() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object removeItem(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
}