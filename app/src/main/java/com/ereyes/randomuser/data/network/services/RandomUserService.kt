package com.ereyes.randomuser.data.network.services

import com.ereyes.randomuser.data.dto.RandomUserDto
import com.ereyes.randomuser.data.network.apis.RandomUserApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/****
 * Project: RandomUser
 * From: com.ereyes.randomuser.data.network.services
 * Created by Edgar Reyes Gonzalez on 2/11/2024 at 4:42 PM
 * All rights reserved 2024.
 ****/
class RandomUserService @Inject constructor( private val api: RandomUserApi) {

    suspend fun getRandomUser(): RandomUserDto{
        return withContext(Dispatchers.IO){
            api.getRandomUser()
        }
    }

}