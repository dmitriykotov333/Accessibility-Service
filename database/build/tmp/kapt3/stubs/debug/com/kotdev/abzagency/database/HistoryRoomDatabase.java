package com.kotdev.abzagency.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/kotdev/abzagency/database/HistoryRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "duplicateDao", "Lcom/kotdev/abzagency/database/dao/DuplicateDao;", "historyDao", "Lcom/kotdev/abzagency/database/dao/HistoryDao;", "database_debug"})
@androidx.room.Database(entities = {com.kotdev.abzagency.database.dbo.HistoryDBO.class, com.kotdev.abzagency.database.dbo.DuplicateDBO.class}, version = 1)
public abstract class HistoryRoomDatabase extends androidx.room.RoomDatabase {
    
    public HistoryRoomDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kotdev.abzagency.database.dao.HistoryDao historyDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kotdev.abzagency.database.dao.DuplicateDao duplicateDao();
}