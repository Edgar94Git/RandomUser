package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.RegisteredModel
import com.google.gson.annotations.SerializedName

data class RegisteredDto(
    @SerializedName("age") val age: Int,
    @SerializedName("date") val date: String
)

fun RegisteredDto.toDomain(): RegisteredModel {
    return RegisteredModel(
        age,
        date
    )
}