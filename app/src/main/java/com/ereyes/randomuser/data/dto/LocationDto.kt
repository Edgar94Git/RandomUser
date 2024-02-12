package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.LocationModel
import com.google.gson.annotations.SerializedName

data class LocationDto(
    @SerializedName("city") val city: String,
    @SerializedName("coordinates") val coordinates: CoordinatesDto,
    @SerializedName("country") val country: String,
    @SerializedName("postcode") val postcode: String,
    @SerializedName("state") val state: String,
    @SerializedName("street") val street: StreetDto,
    @SerializedName("timezone") val timezone: TimezoneDto
)

fun LocationDto.toDomain(): LocationModel {
    return LocationModel(
        city,
        coordinates.toDomain(),
        country,
        postcode,
        state,
        street.toDomain(),
        timezone.toDomain()
    )
}