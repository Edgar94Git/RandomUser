package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.TimezoneModel
import com.google.gson.annotations.SerializedName

data class TimezoneDto(
    @SerializedName("description") val description: String,
    @SerializedName("offset") val offset: String
)

fun TimezoneDto.toDomain(): TimezoneModel {
    return TimezoneModel(
        description,
        offset
    )
}