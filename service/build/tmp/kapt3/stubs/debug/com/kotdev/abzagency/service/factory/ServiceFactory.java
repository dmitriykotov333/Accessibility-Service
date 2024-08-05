package com.kotdev.abzagency.service.factory;

/**
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/kotdev/abzagency/service/factory/ServiceFactory;", "Lcom/kotdev/abzagency/service/factory/WebServiceFactory;", "googleService", "Lcom/kotdev/abzagency/service/google/GoogleService;", "operaService", "Lcom/kotdev/abzagency/service/opera/OperaService;", "(Lcom/kotdev/abzagency/service/google/GoogleService;Lcom/kotdev/abzagency/service/opera/OperaService;)V", "getPackage", "Lcom/kotdev/abzagency/service/config/SupportedBrowser;", "event", "Landroid/view/accessibility/AccessibilityEvent;", "request", "", "service_debug"})
public final class ServiceFactory implements com.kotdev.abzagency.service.factory.WebServiceFactory {
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.service.google.GoogleService googleService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.service.opera.OperaService operaService = null;
    
    public ServiceFactory(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.service.google.GoogleService googleService, @org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.service.opera.OperaService operaService) {
        super();
    }
    
    @java.lang.Override()
    public void request(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityEvent event) {
    }
    
    /**
     * The function checks the application Package and Supported Browser
     *
     * for example : if package is not equals to SupportedBrowser.GOOGLE or SupportedBrowser.OPERA
     * we catch throw Exception("I don't know how to work with this service $packageName.")
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.kotdev.abzagency.service.config.SupportedBrowser getPackage(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityEvent event) {
        return null;
    }
}