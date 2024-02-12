package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.DobModel
import com.google.gson.annotations.SerializedName

data class DobDto(
    @SerializedName("age") val age: Int,
    @SerializedName("date") val date: String
)

fun DobDto.toDomain(): DobModel{
    return DobModel(
        age,
        date
    )
}