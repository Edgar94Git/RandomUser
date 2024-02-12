package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.CoordinatesModel
import com.google.gson.annotations.SerializedName

data class CoordinatesDto(
    @SerializedName("latitude") val latitude: String,
    @SerializedName("longitude") val longitude: String
)

fun CoordinatesDto.toDomain(): CoordinatesModel{
    return CoordinatesModel(
        longitude,
        longitude
    )
}