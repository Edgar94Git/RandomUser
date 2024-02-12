package com.ereyes.randomuser.domain.model

data class RandomUserModel(
    val info: InfoModel,
    val results: List<UserModel>
)