package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.PictureModel
import com.google.gson.annotations.SerializedName

data class PictureDto(
    @SerializedName("large") val large: String,
    @SerializedName("medium") val medium: String,
    @SerializedName("thumbnail") val thumbnail: String
)

fun PictureDto.toDomain(): PictureModel{
    return PictureModel(
        large,
        medium,
        thumbnail
    )
}