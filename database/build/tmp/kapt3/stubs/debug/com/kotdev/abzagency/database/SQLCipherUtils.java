package com.kotdev.abzagency.database;

/**
 * This decision i am copy from repository
 * @see <a href="https://github.com/commonsguy/cwac-saferoom/blob/master/saferoom/src/main/java/com/commonsware/cwac/saferoom/SQLCipherUtils.java">SQLCipherUtils.java</a>
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b\u00a8\u0006\u000f"}, d2 = {"Lcom/kotdev/abzagency/database/SQLCipherUtils;", "", "()V", "encrypt", "", "ctxt", "Landroid/content/Context;", "originalFile", "Ljava/io/File;", "passphrase", "", "getDatabaseState", "Lcom/kotdev/abzagency/database/SQLCipherUtils$State;", "dbPath", "State", "database_debug"})
public final class SQLCipherUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.kotdev.abzagency.database.SQLCipherUtils INSTANCE = null;
    
    private SQLCipherUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.database.SQLCipherUtils.State getDatabaseState(@org.jetbrains.annotations.NotNull()
    java.io.File dbPath) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public final void encrypt(@org.jetbrains.annotations.NotNull()
    android.content.Context ctxt, @org.jetbrains.annotations.NotNull()
    java.io.File originalFile, @org.jetbrains.annotations.Nullable()
    byte[] passphrase) throws java.io.IOException {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/kotdev/abzagency/database/SQLCipherUtils$State;", "", "(Ljava/lang/String;I)V", "DOES_NOT_EXIST", "UNENCRYPTED", "ENCRYPTED", "database_debug"})
    public static enum State {
        /*public static final*/ DOES_NOT_EXIST /* = new DOES_NOT_EXIST() */,
        /*public static final*/ UNENCRYPTED /* = new UNENCRYPTED() */,
        /*public static final*/ ENCRYPTED /* = new ENCRYPTED() */;
        
        State() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.kotdev.abzagency.database.SQLCipherUtils.State> getEntries() {
            return null;
        }
    }
}