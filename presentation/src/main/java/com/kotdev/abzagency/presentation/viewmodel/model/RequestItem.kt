package com.kotdev.abzagency.presentation.viewmodel.model

import androidx.compose.runtime.Immutable

@Immutable
data class RequestItem(
    val id: Int,
    val date: String,
    val request: String,
    val website: String,
    val service: Int,
    val duplicate: List<String>,
    val duplicateSize: Int,
    val linkOpen: Boolean = false,
    val duplicateOpen: Boolean = false
)