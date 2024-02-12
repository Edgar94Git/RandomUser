package com.ereyes.randomuser.domain.caseUse

import com.ereyes.randomuser.domain.model.RandomUserModel
import com.ereyes.randomuser.domain.repository.RandomUserRepository
import javax.inject.Inject

/****
 * Project: RandomUser
 * From: com.ereyes.randomuser.domain.caseUse
 * Created by Edgar Reyes Gonzalez on 2/11/2024 at 5:25 PM
 * All rights reserved 2024.
 ****/
class GetRandomUserUseCase @Inject constructor(private val repository: RandomUserRepository) {

    suspend operator fun invoke(): RandomUserModel{
        return repository.getRandomUser()
    }
}