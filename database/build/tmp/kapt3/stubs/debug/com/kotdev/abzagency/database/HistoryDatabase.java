package com.kotdev.abzagency.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/kotdev/abzagency/database/HistoryDatabase;", "", "database", "Lcom/kotdev/abzagency/database/HistoryRoomDatabase;", "(Lcom/kotdev/abzagency/database/HistoryRoomDatabase;)V", "duplicateDao", "Lcom/kotdev/abzagency/database/dao/DuplicateDao;", "getDuplicateDao", "()Lcom/kotdev/abzagency/database/dao/DuplicateDao;", "historyDao", "Lcom/kotdev/abzagency/database/dao/HistoryDao;", "getHistoryDao", "()Lcom/kotdev/abzagency/database/dao/HistoryDao;", "database_debug"})
public final class HistoryDatabase {
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.database.HistoryRoomDatabase database = null;
    
    public HistoryDatabase(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.database.HistoryRoomDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.database.dao.HistoryDao getHistoryDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.database.dao.DuplicateDao getDuplicateDao() {
        return null;
    }
}