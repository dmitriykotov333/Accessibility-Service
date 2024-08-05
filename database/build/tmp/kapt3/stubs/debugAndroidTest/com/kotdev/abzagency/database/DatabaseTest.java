package com.kotdev.abzagency.database;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@org.junit.runner.RunWith(value = androidx.test.ext.junit.runners.AndroidJUnit4.class)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\u000e\u0010\r\u001a\u00020\nH\u0082@\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\nH\u0007J\b\u0010\u0010\u001a\u00020\nH\u0007J\b\u0010\u0011\u001a\u00020\nH\u0007J\b\u0010\u0012\u001a\u00020\nH\u0007J\b\u0010\u0013\u001a\u00020\nH\u0007J\b\u0010\u0014\u001a\u00020\nH\u0007J\b\u0010\u0015\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/kotdev/abzagency/database/DatabaseTest;", "", "()V", "database", "Lcom/kotdev/abzagency/database/HistoryRoomDatabase;", "duplicateDao", "Lcom/kotdev/abzagency/database/dao/DuplicateDao;", "historyDao", "Lcom/kotdev/abzagency/database/dao/HistoryDao;", "addHistoryIfDuplicate", "", "addHistoryIfNotDuplicate", "checkDuplicate", "cleanAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeDatabase", "getHistoryListWithDuplicate", "insertSuccessfully", "removeHistoryItemById", "selectFailure", "setupDatabase", "testInsertFailure", "database_debugAndroidTest"})
public final class DatabaseTest {
    private com.kotdev.abzagency.database.HistoryRoomDatabase database;
    private com.kotdev.abzagency.database.dao.HistoryDao historyDao;
    private com.kotdev.abzagency.database.dao.DuplicateDao duplicateDao;
    
    public DatabaseTest() {
        super();
    }
    
    @org.junit.Before()
    public final void setupDatabase() {
    }
    
    @org.junit.After()
    public final void closeDatabase() {
    }
    
    private final java.lang.Object cleanAll(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.junit.Test()
    public final void insertSuccessfully() {
    }
    
    @org.junit.Test()
    public final void testInsertFailure() {
    }
    
    @org.junit.Test()
    public final void getHistoryListWithDuplicate() {
    }
    
    @org.junit.Test()
    public final void removeHistoryItemById() {
    }
    
    @org.junit.Test()
    public final void selectFailure() {
    }
    
    @org.junit.Test()
    public final void checkDuplicate() {
    }
    
    @org.junit.Test()
    public final void addHistoryIfDuplicate() {
    }
    
    @org.junit.Test()
    public final void addHistoryIfNotDuplicate() {
    }
}