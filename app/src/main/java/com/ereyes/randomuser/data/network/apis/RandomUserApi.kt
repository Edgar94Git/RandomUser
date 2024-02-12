package com.ereyes.randomuser.data.network.apis

import com.ereyes.randomuser.data.dto.RandomUserDto
import retrofit2.http.GET

/****
 * Project: RandomUser
 * From: com.ereyes.randomuser.data.network.apis
 * Created by Edgar Reyes Gonzalez on 2/11/2024 at 4:41 PM
 * All rights reserved 2024.
 ****/
interface RandomUserApi {

    @GET("api/")
    suspend fun getRandomUser(): RandomUserDto
}