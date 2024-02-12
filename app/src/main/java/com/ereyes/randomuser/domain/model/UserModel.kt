package com.ereyes.randomuser.domain.model

data class UserModel(
    val cell: String,
    val dob: DobModel,
    val email: String,
    val gender: String,
    val id: IdModel,
    val location: LocationModel,
    val login: LoginModel,
    val name: NameModel,
    val nat: String,
    val phone: String,
    val picture: PictureModel,
    val registered: RegisteredModel
)