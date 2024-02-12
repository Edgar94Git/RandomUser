package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.IdModel
import com.google.gson.annotations.SerializedName

data class IdDto(
    @SerializedName("name") val name: String,
    @SerializedName("value") val value: String
)

fun IdDto.toDomain(): IdModel {
    return IdModel(name, value)
}