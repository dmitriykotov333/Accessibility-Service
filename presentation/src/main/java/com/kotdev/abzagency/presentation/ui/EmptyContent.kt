package com.kotdev.abzagency.presentation.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.layout.ContentScale
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.kotdev.abzagency.presentation.R

@Composable
internal fun EmptyContent() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(com.kotdev.abzagency.core_ui.R.raw.empty))
    LottieAnimation(
        composition,
        iterations = LottieConstants.IterateForever,
        contentScale = ContentScale.Inside,
    )
}