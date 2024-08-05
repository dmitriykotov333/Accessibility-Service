package com.kotdev.abzagency.presentation.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kotdev.abzagency.core.extensions.formatNumber
import com.kotdev.abzagency.core_ui.theme.Poppins
import com.kotdev.abzagency.core_ui.theme.Theme
import com.kotdev.abzagency.core_ui.theme.modifiers.DottedShape
import com.kotdev.abzagency.core_ui.theme.modifiers.bounceClick
import com.kotdev.abzagency.core_ui.theme.modifiers.noRippleClickable
import com.kotdev.abzagency.presentation.viewmodel.model.RequestItem
import com.kotdev.abzagency.presentation.viewmodel.HistoryEvent

@Composable
internal fun ColumnScope.Header(item: RequestItem, eventHandler: (HistoryEvent) -> Unit) {
    Spacer(modifier = Modifier.height(10.dp))
    Row(
        Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            text = item.date,
            style = TextStyle(
                color = Theme.colors.black,
                lineHeight = 24.sp,
                fontSize = 16.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Light
            ),
        )
        if (item.duplicate.isNotEmpty()) {
            Box(
                modifier = Modifier
                    .bounceClick(from = 0.97f)
                    .background(if (item.duplicateOpen) Theme.colors.blue else Theme.colors.white, CircleShape)
                    .size(40.dp)
                    .noRippleClickable {
                        eventHandler.invoke(HistoryEvent.DuplicateClick(item.id))
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = item.duplicateSize.formatNumber(),
                    style = TextStyle(
                        textAlign = TextAlign.Center,
                        color = if (item.duplicateOpen) Color.White else Theme.colors.black,
                        lineHeight = 24.sp,
                        fontSize = 16.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
        }
        Box(
            modifier = Modifier
                .background(Theme.colors.white, CircleShape)
                .size(40.dp)
        ) {
            Image(
                modifier = Modifier.padding(10.dp),
                painter = painterResource(item.service),
                contentDescription = "${item.service}",
                contentScale = ContentScale.Inside
            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Box(
            modifier = Modifier
                .bounceClick()
                .background(Theme.colors.white, CircleShape)
                .size(40.dp)
                .noRippleClickable {
                    eventHandler.invoke(HistoryEvent.RemoveItem(item))
                },
            contentAlignment = Alignment.Center
        ) {
            androidx.compose.material3.Icon(
                tint = Theme.colors.black,
                imageVector = Icons.Filled.Delete,
                contentDescription = null
            )
        }
    }
}