package com.kotdev.abzagency.service.factory;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/kotdev/abzagency/service/factory/WebServiceFactory;", "", "getPackage", "Lcom/kotdev/abzagency/service/config/SupportedBrowser;", "event", "Landroid/view/accessibility/AccessibilityEvent;", "request", "", "service_debug"})
public abstract interface WebServiceFactory {
    
    public abstract void request(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityEvent event);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kotdev.abzagency.service.config.SupportedBrowser getPackage(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityEvent event);
}