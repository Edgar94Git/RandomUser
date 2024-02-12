package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.UserModel
import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("cell") val cell: String,
    @SerializedName("dob") val dob: DobDto,
    @SerializedName("email") val email: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("id") val id: IdDto,
    @SerializedName("location") val location: LocationDto,
    @SerializedName("login") val login: LoginDto,
    @SerializedName("name") val name: NameDto,
    @SerializedName("nat") val nat: String,
    @SerializedName("phone") val phone: String,
    @SerializedName("picture") val picture: PictureDto,
    @SerializedName("registered") val registered: RegisteredDto
)

fun UserDto.toDomain(): UserModel{
    return UserModel(
        cell,
        dob.toDomain(),
        email,
        gender,
        id.toDomain(),
        location.toDomain(),
        login.toDomain(),
        name.toDomain(),
        nat,
        phone,
        picture.toDomain(),
        registered.toDomain()
    )
}