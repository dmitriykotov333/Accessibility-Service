package com.kotdev.abzagency.database.dao;

/**
 * This interface performs actions with the database.
 *
 * getHistories() - A suspend function that returns a list of data combined from two tables.
 *
 * historiesFlow() - flow function update the UI in real-time
 * if the application is in the onPause or onStop state.
 *
 * update() - If we add a duplicate to the table, update createdAt to sort it correctly.,
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\tH\'J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/kotdev/abzagency/database/dao/HistoryDao;", "", "clean", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHistories", "", "Lcom/kotdev/abzagency/database/HistoryWithDuplicate;", "historiesFlow", "Lkotlinx/coroutines/flow/Flow;", "insert", "", "history", "Lcom/kotdev/abzagency/database/dbo/HistoryDBO;", "(Lcom/kotdev/abzagency/database/dbo/HistoryDBO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeById", "", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "createdAt", "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "database_debug"})
@androidx.room.Dao()
public abstract interface HistoryDao {
    
    @androidx.room.Transaction()
    @androidx.room.Query(value = "SELECT * FROM history ORDER BY createdAt DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getHistories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.kotdev.abzagency.database.HistoryWithDuplicate>> $completion);
    
    @androidx.room.Transaction()
    @androidx.room.Query(value = "SELECT * FROM history ORDER BY createdAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.kotdev.abzagency.database.HistoryWithDuplicate>> historiesFlow();
    
    @androidx.room.Query(value = "DELETE FROM history WHERE history_id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.database.dbo.HistoryDBO history, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Query(value = "UPDATE history SET createdAt = :createdAt  WHERE history_id = :id")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(int id, long createdAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM history")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clean(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}