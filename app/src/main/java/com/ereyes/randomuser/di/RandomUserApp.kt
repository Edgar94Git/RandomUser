package com.ereyes.randomuser.di

import com.ereyes.randomuser.data.network.RandomUserRepositoryImpl
import com.ereyes.randomuser.data.network.services.RandomUserService
import com.ereyes.randomuser.domain.repository.RandomUserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/****
 * Project: RandomUser
 * From: com.ereyes.randomuser.di
 * Created by Edgar Reyes Gonzalez on 2/11/2024 at 5:43 PM
 * All rights reserved 2024.
 ****/

@Module
@InstallIn(SingletonComponent::class)
object RandomUserApp {

    @Provides
    @Singleton
    fun provideRandomUserRepository(service: RandomUserService): RandomUserRepository {
        return RandomUserRepositoryImpl(service)
    }

}