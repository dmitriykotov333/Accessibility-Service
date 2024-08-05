package com.kotdev.abzagency.data.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/kotdev/abzagency/data/di/ServiceModule;", "", "()V", "provideMainRepository", "Lcom/kotdev/abzagency/domain/repository/MainRepository;", "database", "Lcom/kotdev/abzagency/database/HistoryDatabase;", "provideRepository", "Lcom/kotdev/abzagency/domain/repository/ServiceRepository;", "data_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ServiceModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.kotdev.abzagency.data.di.ServiceModule INSTANCE = null;
    
    private ServiceModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.domain.repository.ServiceRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.database.HistoryDatabase database) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.kotdev.abzagency.domain.repository.MainRepository provideMainRepository(@org.jetbrains.annotations.NotNull()
    com.kotdev.abzagency.database.HistoryDatabase database) {
        return null;
    }
}