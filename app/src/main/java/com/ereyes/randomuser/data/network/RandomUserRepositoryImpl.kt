package com.ereyes.randomuser.data.network

import com.ereyes.randomuser.data.dto.toDomain
import com.ereyes.randomuser.data.network.services.RandomUserService
import com.ereyes.randomuser.domain.model.RandomUserModel
import com.ereyes.randomuser.domain.repository.RandomUserRepository
import javax.inject.Inject

/****
 * Project: RandomUser
 * From: com.ereyes.randomuser.data.network
 * Created by Edgar Reyes Gonzalez on 2/11/2024 at 4:29 PM
 * All rights reserved 2024.
 ****/
class RandomUserRepositoryImpl @Inject constructor(private val service: RandomUserService): RandomUserRepository {
    override suspend fun getRandomUser(): RandomUserModel {
        return service.getRandomUser().toDomain()
    }

}