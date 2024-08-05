package com.kotdev.abzagency.service.opera;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/kotdev/abzagency/service/opera/OperaService;", "Lcom/kotdev/abzagency/service/ServiceContract;", "serviceRepository", "Lcom/kotdev/abzagency/domain/repository/ServiceRepository;", "(Lcom/kotdev/abzagency/domain/repository/ServiceRepository;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "captureUrl", "", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "config", "Lcom/kotdev/abzagency/service/config/SupportedBrowser;", "checkSearchField", "", "node", "searchField", "event", "Landroid/view/accessibility/AccessibilityEvent;", "service", "urlField", "service_debug"})
public final class OperaService extends com.kotdev.abzagency.service.ServiceContract {
    @org.jetbrains.annotations.NotNull()
    private final com.kotdev.abzagency.domain.repository.ServiceRepository serviceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public OperaService(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.domain.repository.ServiceRepository serviceRepository) {
        super();
    }
    
    @java.lang.Override()
    public void service(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityEvent event) {
    }
    
    @java.lang.Override()
    protected void urlField(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityEvent event) {
    }
    
    @java.lang.Override()
    protected void searchField(@org.jetbrains.annotations.NotNull()
    android.view.accessibility.AccessibilityEvent event) {
    }
    
    private final java.lang.String captureUrl(android.view.accessibility.AccessibilityNodeInfo info, com.kotdev.abzagency.service.config.SupportedBrowser config) {
        return null;
    }
    
    private final void checkSearchField(android.view.accessibility.AccessibilityNodeInfo node) {
    }
}