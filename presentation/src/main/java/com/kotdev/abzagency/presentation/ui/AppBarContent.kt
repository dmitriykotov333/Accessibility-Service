package com.kotdev.abzagency.presentation.ui

import android.content.Context
import android.content.Intent
import android.provider.Settings
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.Spring.StiffnessLow
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kotdev.abzagency.core.extensions.isAccessibilityServiceEnabled
import com.kotdev.abzagency.core_ui.theme.Poppins
import com.kotdev.abzagency.core_ui.theme.Theme
import com.kotdev.abzagency.core_ui.theme.modifiers.noRippleClickable
import com.kotdev.abzagency.service.RequestService
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch


internal fun serviceEnabled(context: Context) = flow<Boolean> {
    while (true) {
        emit(context.isAccessibilityServiceEnabled(RequestService::class.java))
        delay(1000)
    }
}

@Composable
internal fun AppBarContent() {
    val context = LocalContext.current
    val serviceEnabled by serviceEnabled(context).collectAsState(false)
    val isServiceEnabled by remember {
        derivedStateOf { serviceEnabled }
    }

    Row(
        modifier = Modifier
            .statusBarsPadding()
            .padding(horizontal = 15.dp, vertical = 7.dp)
            .fillMaxWidth()
            .background(Theme.colors.white, RoundedCornerShape(24.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {

        var value by remember {
            mutableIntStateOf(1000)
        }
        LaunchedEffect(Unit) {
            delay(210)
            value = 0
        }
        val icon by animateIntAsState(
            targetValue = value,
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioLowBouncy,
                stiffness = StiffnessLow
            ),
            label = ""
        )
        Image(
            modifier = Modifier
                .height(30.dp)
                .offset {
                    IntOffset(x = icon, y = 0)
                },
            painter = painterResource(com.kotdev.abzagency.core_ui.R.drawable.abzagency),
            contentDescription = "icon",
            colorFilter = ColorFilter.tint(if (isServiceEnabled) Color.Black else Color.Red)
        )
        AnimatedVisibility(
            visible = value == 0
        ) {
            Text(
                modifier = Modifier.noRippleClickable {
                    if (!isServiceEnabled) {
                        context.startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
                    }
                },
                text = if (isServiceEnabled) stringResource(id = com.kotdev.abzagency.core_ui.R.string.app_name) else "Turn on the service",
                style = TextStyle(
                    color = Theme.colors.grey,
                    lineHeight = 24.sp,
                    fontSize = 16.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal
                ),
            )
        }
    }
}