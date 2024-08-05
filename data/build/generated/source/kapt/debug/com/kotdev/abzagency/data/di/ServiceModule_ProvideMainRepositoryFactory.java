package com.kotdev.abzagency.data.di;

import com.kotdev.abzagency.database.HistoryDatabase;
import com.kotdev.abzagency.domain.repository.MainRepository;
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
public final class ServiceModule_ProvideMainRepositoryFactory implements Factory<MainRepository> {
  private final Provider<HistoryDatabase> databaseProvider;

  public ServiceModule_ProvideMainRepositoryFactory(Provider<HistoryDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public MainRepository get() {
    return provideMainRepository(databaseProvider.get());
  }

  public static ServiceModule_ProvideMainRepositoryFactory create(
      Provider<HistoryDatabase> databaseProvider) {
    return new ServiceModule_ProvideMainRepositoryFactory(databaseProvider);
  }

  public static MainRepository provideMainRepository(HistoryDatabase database) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideMainRepository(database));
  }
}
