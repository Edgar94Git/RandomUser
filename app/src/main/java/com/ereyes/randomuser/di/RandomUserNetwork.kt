package com.ereyes.randomuser.di

import com.ereyes.randomuser.core.Constants
import com.ereyes.randomuser.data.network.apis.RandomUserApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/****
 * Project: RandomUser
 * From: com.ereyes.randomuser.di
 * Created by Edgar Reyes Gonzalez on 2/11/2024 at 4:44 PM
 * All rights reserved 2024.
 ****/

@Module
@InstallIn(SingletonComponent::class)
object RandomUserNetwork {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit{
        return  Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideRandomUserApi(retrofit: Retrofit): RandomUserApi{
        return retrofit.create(RandomUserApi::class.java)
    }

}