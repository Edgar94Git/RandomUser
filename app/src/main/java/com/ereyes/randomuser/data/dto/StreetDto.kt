package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.StreetModel
import com.google.gson.annotations.SerializedName

data class StreetDto(
    @SerializedName("name") val name: String,
    @SerializedName("number") val number: Int
)

fun StreetDto.toDomain(): StreetModel {
    return StreetModel(
        name,
        number
    )
}