package com.ereyes.randomuser.domain.repository

import com.ereyes.randomuser.domain.model.RandomUserModel

/****
 * Project: RandomUser
 * From: com.ereyes.randomuser.domain.repository
 * Created by Edgar Reyes Gonzalez on 2/11/2024 at 4:54 PM
 * All rights reserved 2024.
 ****/
interface RandomUserRepository {

    suspend fun getRandomUser(): RandomUserModel

}