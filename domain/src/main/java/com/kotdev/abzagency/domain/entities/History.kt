package com.kotdev.abzagency.domain.entities


data class History(
    val id: Int = 0,
    val createdAt: Long,
    val service: String,
    val request: String,
    val website: String?
)
