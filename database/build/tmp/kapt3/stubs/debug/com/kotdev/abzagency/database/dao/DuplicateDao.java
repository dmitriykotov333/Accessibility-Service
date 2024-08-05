package com.kotdev.abzagency.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/kotdev/abzagency/database/dao/DuplicateDao;", "", "clean", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDuplicates", "", "Lcom/kotdev/abzagency/database/dbo/DuplicateDBO;", "insert", "", "duplicate", "(Lcom/kotdev/abzagency/database/dbo/DuplicateDBO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "database_debug"})
@androidx.room.Dao()
public abstract interface DuplicateDao {
    
    @androidx.room.Query(value = "SELECT * FROM duplicate ORDER BY createdAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.kotdev.abzagency.database.dbo.DuplicateDBO> getDuplicates();
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.database.dbo.DuplicateDBO duplicate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Query(value = "DELETE FROM duplicate")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clean(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}