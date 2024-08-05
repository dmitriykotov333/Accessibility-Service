package com.kotdev.abzagency.data.di

import android.content.Context
import com.kotdev.abzagency.data.repositories.MainRepositoryImpl
import com.kotdev.abzagency.data.repositories.ServiceRepositoryImpl
import com.kotdev.abzagency.database.HistoryDatabase
import com.kotdev.abzagency.domain.repository.MainRepository
import com.kotdev.abzagency.domain.repository.ServiceRepository
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
    fun provideRepository(
        database: HistoryDatabase
    ): ServiceRepository {
        return ServiceRepositoryImpl(database)
    }

    @Provides
    @Singleton
    fun provideMainRepository(
        database: HistoryDatabase
    ): MainRepository {
        return MainRepositoryImpl(database)
    }
}