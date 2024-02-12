package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.RandomUserModel
import com.google.gson.annotations.SerializedName

data class RandomUserDto(
    @SerializedName("info") val info: InfoDto,
    @SerializedName("results") val results: List<UserDto>
)

fun RandomUserDto.toDomain(): RandomUserModel{
    return RandomUserModel(
        info.toDomain(),
        results.map { it.toDomain() }
    )
}