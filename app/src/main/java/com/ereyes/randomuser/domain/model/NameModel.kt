package com.ereyes.randomuser.domain.model

data class NameModel(
    val first: String,
    val last: String,
    val title: String
){
    fun getNameComplete(): String {
        return "$title $first $last"
    }
}