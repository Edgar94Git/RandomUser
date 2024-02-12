package com.ereyes.randomuser.domain.model

data class InfoModel(
    val page: Int,
    val results: Int,
    val seed: String,
    val version: String
)