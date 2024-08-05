package com.kotdev.abzagency.service.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/kotdev/abzagency/service/di/ServiceModule;", "", "()V", "provideFactory", "Lcom/kotdev/abzagency/service/factory/WebServiceFactory;", "googleService", "Lcom/kotdev/abzagency/service/google/GoogleService;", "operaService", "Lcom/kotdev/abzagency/service/opera/OperaService;", "provideGoogleService", "serviceRepository", "Lcom/kotdev/abzagency/domain/repository/ServiceRepository;", "provideOperaService", "service_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ServiceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.kotdev.abzagency.service.di.ServiceModule INSTANCE = null;
    
    private ServiceModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.service.google.GoogleService provideGoogleService(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.domain.repository.ServiceRepository serviceRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.service.opera.OperaService provideOperaService(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.domain.repository.ServiceRepository serviceRepository) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.service.factory.WebServiceFactory provideFactory(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.service.google.GoogleService googleService, @org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.service.opera.OperaService operaService) {
        return null;
    }
}