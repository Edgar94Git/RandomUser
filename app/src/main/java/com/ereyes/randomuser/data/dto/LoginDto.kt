package com.ereyes.randomuser.data.dto

import com.ereyes.randomuser.domain.model.LoginModel
import com.google.gson.annotations.SerializedName

data class LoginDto(
    @SerializedName("md5") val md5: String,
    @SerializedName("password") val password: String,
    @SerializedName("salt") val salt: String,
    @SerializedName("sha1") val sha1: String,
    @SerializedName("sha256") val sha256: String,
    @SerializedName("username") val username: String,
    @SerializedName("uuid")  val uuid: String
)

fun LoginDto.toDomain(): LoginModel{
    return LoginModel(
        md5,
        password,
        salt,
        sha1,
        sha256,
        username,
        uuid
    )
}