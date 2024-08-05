package com.kotdev.abzagency.core_ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)
val PairColor = Color(0xFF6C6C6C)
val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
val Background = Color(0xFF323234)
val Grey = Color(0xFF9D9D9D)
val Green = Color(0xFF40A71C)

data class AppColors(
    val background: Color,
    val card: Color,
    val white: Color,
    val blue: Color,
    val black: Color,
    val link: Color,
    val grey: Color,
    val duplicate: Color,
)

val palette = AppColors(
    background = Color(0xFFeaf1fb),
    card = Color(0xFFf2f5fc),
    white = Color(0xFFFFFFFF),
    blue = Color(0xFF3F51B5),
    black = Color(0xFF000000),
    link = Color(0xFF2196F3),
    grey = Color(0x80000000),
    duplicate = Color(0xFFebe5d9),
)

val paletteDark = AppColors(
    background = Color(0xFF4A5057),
    card = Color(0xFF545A6E),
    white =  Color(0xFF444444),
    blue = Color(0xFF3F51B5),
    black = Color(0xFFFFFFFF),
    link = Color(0xFF2196F3),
    grey = Color(0x80FFFFFF),
    duplicate = Color(0xFF6E685C),
)

val LocalColorProvider = staticCompositionLocalOf<AppColors> { error("No default implementation") }