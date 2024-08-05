package com.kotdev.abzagency.service;

/**
 * Сan say the class defines the contract of basic functions
 * that must be implemented in all classes inheriting from ServiceContract
 *
 * In web applications we can enter a request in two places and the processing logic is different
 *
 * There is an input field url and a search bar input field.
 *
 * @request - url field
 * @requestSearch - search bar
 * @searchArea - a boolean value that shows where we enter the query
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0004J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0004J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0004J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH$J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH$R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2 = {"Lcom/kotdev/abzagency/service/ServiceContract;", "", "()V", "request", "", "getRequest", "()Ljava/lang/String;", "setRequest", "(Ljava/lang/String;)V", "requestSearch", "getRequestSearch", "setRequestSearch", "searchArea", "", "getSearchArea", "()Z", "setSearchArea", "(Z)V", "contract", "value", "findLine1", "", "resName", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "getChild", "searchField", "event", "Landroid/view/accessibility/AccessibilityEvent;", "service", "urlField", "Companion", "service_debug"})
public abstract class ServiceContract {
    private boolean searchArea = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String request = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String requestSearch = "";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONTRACT = "google.com";
    @org.jetbrains.annotations.NotNull()
    public static final com.kotdev.abzagency.service.ServiceContract.Companion Companion = null;
    
    public ServiceContract() {
        super();
    }
    
    public final boolean getSearchArea() {
        return false;
    }
    
    public final void setSearchArea(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRequest() {
        return null;
    }
    
    public final void setRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRequestSearch() {
        return null;
    }
    
    public final void setRequestSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public abstract void service(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityEvent event);
    
    /**
     * urlField - function processes url field
     */
    protected abstract void urlField(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityEvent event);
    
    /**
     * urlField - function processes search bar
     */
    protected abstract void searchField(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityEvent event);
    
    /**
     * the function describes what cases we save the request in the database
     */
    protected final boolean contract(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return false;
    }
    
    /**
     * function shows tree viewIdResourceName
     */
    protected final void getChild(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityNodeInfo info) {
    }
    
    protected final void findLine1(@org.jetbrains.annotations.NotNull()
    java.lang.String resName, @org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityNodeInfo info) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/kotdev/abzagency/service/ServiceContract$Companion;", "", "()V", "CONTRACT", "", "service_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}