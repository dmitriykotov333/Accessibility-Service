package com.kotdev.abzagency.presentation.viewmodel;

import com.kotdev.abzagency.domain.repository.MainRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class HistoryViewModel_Factory implements Factory<HistoryViewModel> {
  private final Provider<MainRepository> repositoryProvider;

  public HistoryViewModel_Factory(Provider<MainRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public HistoryViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static HistoryViewModel_Factory create(Provider<MainRepository> repositoryProvider) {
    return new HistoryViewModel_Factory(repositoryProvider);
  }

  public static HistoryViewModel newInstance(MainRepository repository) {
    return new HistoryViewModel(repository);
  }
}
