package com.kotdev.abzagency.database;

/**
 * This class combines database tables using a one-to-many relationship
 * with Room library annotations.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/kotdev/abzagency/database/HistoryWithDuplicate;", "", "history", "Lcom/kotdev/abzagency/database/dbo/HistoryDBO;", "duplicate", "", "Lcom/kotdev/abzagency/database/dbo/DuplicateDBO;", "(Lcom/kotdev/abzagency/database/dbo/HistoryDBO;Ljava/util/List;)V", "getDuplicate", "()Ljava/util/List;", "getHistory", "()Lcom/kotdev/abzagency/database/dbo/HistoryDBO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "database_debug"})
public final class HistoryWithDuplicate {
    @androidx.room.Embedded()
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.database.dbo.HistoryDBO history = null;
    @androidx.room.Relation(parentColumn = "history_id", entityColumn = "history_id")
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.kotdev.abzagency.database.dbo.DuplicateDBO> duplicate = null;
    
    public HistoryWithDuplicate(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.database.dbo.HistoryDBO history, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kotdev.abzagency.database.dbo.DuplicateDBO> duplicate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.database.dbo.HistoryDBO getHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kotdev.abzagency.database.dbo.DuplicateDBO> getDuplicate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.database.dbo.HistoryDBO component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kotdev.abzagency.database.dbo.DuplicateDBO> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.database.HistoryWithDuplicate copy(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.database.dbo.HistoryDBO history, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kotdev.abzagency.database.dbo.DuplicateDBO> duplicate) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}