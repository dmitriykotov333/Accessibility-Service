package com.kotdev.abzagency.core.extensions


fun Int.formatNumber(): String {
    return when {
        this >= 1_000_000 -> {
            "${this / 1_000_000}M"
        }

        this >= 1_000 -> {
            "${this / 1_000}k"
        }

        else -> {
            "$this"
        }
    }
}

