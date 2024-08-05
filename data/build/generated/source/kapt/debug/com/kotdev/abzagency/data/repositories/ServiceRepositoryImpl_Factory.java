package com.kotdev.abzagency.data.repositories;

import com.kotdev.abzagency.database.HistoryDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ServiceRepositoryImpl_Factory implements Factory<ServiceRepositoryImpl> {
  private final Provider<HistoryDatabase> databaseProvider;

  public ServiceRepositoryImpl_Factory(Provider<HistoryDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public ServiceRepositoryImpl get() {
    return newInstance(databaseProvider.get());
  }

  public static ServiceRepositoryImpl_Factory create(Provider<HistoryDatabase> databaseProvider) {
    return new ServiceRepositoryImpl_Factory(databaseProvider);
  }

  public static ServiceRepositoryImpl newInstance(HistoryDatabase database) {
    return new ServiceRepositoryImpl(database);
  }
}
