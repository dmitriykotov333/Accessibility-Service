package com.kotdev.abzagency.service.di;

import com.kotdev.abzagency.service.factory.WebServiceFactory;
import com.kotdev.abzagency.service.google.GoogleService;
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
public final class ServiceModule_ProvideFactoryFactory implements Factory<WebServiceFactory> {
  private final Provider<GoogleService> googleServiceProvider;

  private final Provider<OperaService> operaServiceProvider;

  public ServiceModule_ProvideFactoryFactory(Provider<GoogleService> googleServiceProvider,
      Provider<OperaService> operaServiceProvider) {
    this.googleServiceProvider = googleServiceProvider;
    this.operaServiceProvider = operaServiceProvider;
  }

  @Override
  public WebServiceFactory get() {
    return provideFactory(googleServiceProvider.get(), operaServiceProvider.get());
  }

  public static ServiceModule_ProvideFactoryFactory create(
      Provider<GoogleService> googleServiceProvider, Provider<OperaService> operaServiceProvider) {
    return new ServiceModule_ProvideFactoryFactory(googleServiceProvider, operaServiceProvider);
  }

  public static WebServiceFactory provideFactory(GoogleService googleService,
      OperaService operaService) {
    return Preconditions.checkNotNullFromProvides(ServiceModule.INSTANCE.provideFactory(googleService, operaService));
  }
}
