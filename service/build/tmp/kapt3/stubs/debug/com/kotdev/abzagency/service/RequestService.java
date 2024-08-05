package com.kotdev.abzagency.service;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/kotdev/abzagency/service/RequestService;", "Landroid/accessibilityservice/AccessibilityService;", "()V", "serviceFactory", "Lcom/kotdev/abzagency/service/factory/WebServiceFactory;", "getServiceFactory", "()Lcom/kotdev/abzagency/service/factory/WebServiceFactory;", "setServiceFactory", "(Lcom/kotdev/abzagency/service/factory/WebServiceFactory;)V", "onAccessibilityEvent", "", "event", "Landroid/view/accessibility/AccessibilityEvent;", "onInterrupt", "onServiceConnected", "service_debug"})
public final class RequestService extends android.accessibilityservice.AccessibilityService {
    @javax.inject.Inject()
    public com.kotdev.abzagency.service.factory.WebServiceFactory serviceFactory;
    
    public RequestService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.service.factory.WebServiceFactory getServiceFactory() {
        return null;
    }
    
    public final void setServiceFactory(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.service.factory.WebServiceFactory p0) {
    }
    
    @java.lang.Override()
    public void onAccessibilityEvent(@org.jetbrains.annotations.Nullable()
    android.view.accessibility.AccessibilityEvent event) {
    }
    
    @java.lang.Override()
    public void onInterrupt() {
    }
    
    @java.lang.Override()
    protected void onServiceConnected() {
    }
}