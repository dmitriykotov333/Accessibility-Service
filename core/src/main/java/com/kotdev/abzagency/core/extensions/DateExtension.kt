package com.kotdev.abzagency.core.extensions

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun Long.longToDateFormat(): String {
    val dateFormat = SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault())
    val date = Date(this)
    return dateFormat.format(date)
}

fun Long.longToDateFullFormat(): String {
    val dateFormat = SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.getDefault())
    val date = Date(this)
    return dateFormat.format(date)
}

