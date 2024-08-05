package com.kotdev.abzagency.service.di

import android.content.Context
import com.kotdev.abzagency.database.HistoryDatabase
import com.kotdev.abzagency.domain.repository.ServiceRepository
import com.kotdev.abzagency.service.factory.ServiceFactory
import com.kotdev.abzagency.service.factory.WebServiceFactory
import com.kotdev.abzagency.service.google.GoogleService
import com.kotdev.abzagency.service.opera.OperaService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    @Provides
    @Singleton
    fun provideGoogleService(
        serviceRepository: ServiceRepository
    ): GoogleService {
        return GoogleService(serviceRepository)
    }

    @Provides
    @Singleton
    fun provideOperaService(
        serviceRepository: ServiceRepository
    ): OperaService {
        return OperaService(serviceRepository)
    }

    @Provides
    @Singleton
    fun provideFactory(
        googleService: GoogleService,
        operaService: OperaService
    ): WebServiceFactory {
        return ServiceFactory(googleService, operaService)
    }
}