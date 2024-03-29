package com.ereyes.randomuser.domain.model

data class LocationModel(
    val city: String,
    val coordinates: CoordinatesModel,
    val country: String,
    val postcode: String,
    val state: String,
    val street: StreetModel,
    val timezone: TimezoneModel
)