package com.kotdev.abzagency.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/kotdev/abzagency/database/SQLCipherHelperFactory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "passphrase", "", "([B)V", "factory", "Lnet/sqlcipher/database/SupportFactory;", "create", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "configuration", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "database_debug"})
public final class SQLCipherHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {
    @org.jetbrains.annotations.NotNull()
    private final net.sqlcipher.database.SupportFactory factory = null;
    
    public SQLCipherHelperFactory(@org.jetbrains.annotations.NotNull()
    byte[] passphrase) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.sqlite.db.SupportSQLiteOpenHelper create(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
        return null;
    }
}