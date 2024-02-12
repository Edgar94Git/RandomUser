package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.InfoModel
import com.google.gson.annotations.SerializedName

data class InfoDto(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val results: Int,
    @SerializedName("seed") val seed: String,
    @SerializedName("version") val version: String
)

fun InfoDto.toDomain(): InfoModel {
    return InfoModel(
        page,
        results,
        seed,
        version
    )
}