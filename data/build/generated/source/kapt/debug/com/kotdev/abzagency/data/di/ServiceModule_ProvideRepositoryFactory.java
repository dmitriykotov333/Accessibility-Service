package com.kotdev.abzagency.data.di;

import com.kotdev.abzagency.database.HistoryDatabase;
import com.kotdev.abzagency.domain.repository.ServiceRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class ServiceModule_ProvideRepositoryFactory implements Factory<ServiceRepository> {
  private final Provider<HistoryDatabase> databaseProvider;

  public ServiceModule_ProvideRepositoryFactory(Provider<HistoryDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public ServiceRepository get() {
    return provideRepository(databaseProvider.get());
  }

  public static ServiceModule_ProvideRepositoryFactory create(
      Provider<HistoryDatabase> databaseProvider) {
    return new ServiceModule_ProvideRepositoryFactory(databaseProvider);
  }

  public static ServiceRepository provideRepository(HistoryDatabase database) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideRepository(database));
  }
}
