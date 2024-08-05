package com.kotdev.abzagency.service.di;

import com.kotdev.abzagency.domain.repository.ServiceRepository;
import com.kotdev.abzagency.service.opera.OperaService;
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
public final class ServiceModule_ProvideOperaServiceFactory implements Factory<OperaService> {
  private final Provider<ServiceRepository> serviceRepositoryProvider;

  public ServiceModule_ProvideOperaServiceFactory(
      Provider<ServiceRepository> serviceRepositoryProvider) {
    this.serviceRepositoryProvider = serviceRepositoryProvider;
  }

  @Override
  public OperaService get() {
    return provideOperaService(serviceRepositoryProvider.get());
  }

  public static ServiceModule_ProvideOperaServiceFactory create(
      Provider<ServiceRepository> serviceRepositoryProvider) {
    return new ServiceModule_ProvideOperaServiceFactory(serviceRepositoryProvider);
  }

  public static OperaService provideOperaService(ServiceRepository serviceRepository) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideOperaService(serviceRepository));
  }
}
