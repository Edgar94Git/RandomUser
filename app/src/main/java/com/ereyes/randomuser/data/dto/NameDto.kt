package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.NameModel
import com.google.gson.annotations.SerializedName

data class NameDto(
    @SerializedName("first") val first: String,
    @SerializedName("last") val last: String,
    @SerializedName("title") val title: String
){
    fun toDomain(): NameModel {
        return NameModel(
            first,
            last,
            title
        )
    }
}
