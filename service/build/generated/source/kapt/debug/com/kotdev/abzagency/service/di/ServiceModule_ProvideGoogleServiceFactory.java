package com.kotdev.abzagency.service.di;

import com.kotdev.abzagency.domain.repository.ServiceRepository;
import com.kotdev.abzagency.service.google.GoogleService;
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
public final class ServiceModule_ProvideGoogleServiceFactory implements Factory<GoogleService> {
  private final Provider<ServiceRepository> serviceRepositoryProvider;

  public ServiceModule_ProvideGoogleServiceFactory(
      Provider<ServiceRepository> serviceRepositoryProvider) {
    this.serviceRepositoryProvider = serviceRepositoryProvider;
  }

  @Override
  public GoogleService get() {
    return provideGoogleService(serviceRepositoryProvider.get());
  }

  public static ServiceModule_ProvideGoogleServiceFactory create(
      Provider<ServiceRepository> serviceRepositoryProvider) {
    return new ServiceModule_ProvideGoogleServiceFactory(serviceRepositoryProvider);
  }

  public static GoogleService provideGoogleService(ServiceRepository serviceRepository) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideGoogleService(serviceRepository));
  }
}
