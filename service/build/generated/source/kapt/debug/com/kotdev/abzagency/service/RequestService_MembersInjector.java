package com.kotdev.abzagency.service;

import com.kotdev.abzagency.service.factory.WebServiceFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class RequestService_MembersInjector implements MembersInjector<RequestService> {
  private final Provider<WebServiceFactory> serviceFactoryProvider;

  public RequestService_MembersInjector(Provider<WebServiceFactory> serviceFactoryProvider) {
    this.serviceFactoryProvider = serviceFactoryProvider;
  }

  public static MembersInjector<RequestService> create(
      Provider<WebServiceFactory> serviceFactoryProvider) {
    return new RequestService_MembersInjector(serviceFactoryProvider);
  }

  @Override
  public void injectMembers(RequestService instance) {
    injectServiceFactory(instance, serviceFactoryProvider.get());
  }

  @InjectedFieldSignature("com.kotdev.abzagency.service.RequestService.serviceFactory")
  public static void injectServiceFactory(RequestService instance,
      WebServiceFactory serviceFactory) {
    instance.serviceFactory = serviceFactory;
  }
}
