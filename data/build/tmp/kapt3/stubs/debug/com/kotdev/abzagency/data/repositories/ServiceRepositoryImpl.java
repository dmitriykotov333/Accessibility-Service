package com.kotdev.abzagency.data.repositories;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/kotdev/abzagency/data/repositories/ServiceRepositoryImpl;", "Lcom/kotdev/abzagency/domain/repository/ServiceRepository;", "database", "Lcom/kotdev/abzagency/database/HistoryDatabase;", "(Lcom/kotdev/abzagency/database/HistoryDatabase;)V", "duplicateDao", "Lcom/kotdev/abzagency/database/dao/DuplicateDao;", "historyDao", "Lcom/kotdev/abzagency/database/dao/HistoryDao;", "addHistory", "", "history", "Lcom/kotdev/abzagency/domain/entities/History;", "(Lcom/kotdev/abzagency/domain/entities/History;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkDuplicate", "Lcom/kotdev/abzagency/domain/entities/Duplicate;", "data_debug"})
public final class ServiceRepositoryImpl implements com.kotdev.abzagency.domain.repository.ServiceRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.database.HistoryDatabase database = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.database.dao.HistoryDao historyDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.database.dao.DuplicateDao duplicateDao = null;
    
    @javax.inject.Inject()
    public ServiceRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.database.HistoryDatabase database) {
        super();
    }
    
    /**
     * We check if there is already such a request in the database
     */
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object checkDuplicate(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.domain.entities.History history, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kotdev.abzagency.domain.entities.Duplicate> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addHistory(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.domain.entities.History history, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}