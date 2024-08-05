package com.kotdev.abzagency.presentation.ui

import android.content.Intent
import android.net.Uri
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
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
import com.kotdev.abzagency.core_ui.theme.extensions.openUrl
import com.kotdev.abzagency.core_ui.theme.modifiers.DottedShape
import com.kotdev.abzagency.core_ui.theme.modifiers.bounceClick
import com.kotdev.abzagency.core_ui.theme.modifiers.noRippleClickable
import com.kotdev.abzagency.presentation.viewmodel.model.RequestItem
import com.kotdev.abzagency.presentation.viewmodel.HistoryEvent
import java.net.URL

@Composable
internal fun ColumnScope.WebsiteContent(
    item: RequestItem,
    eventHandler: (HistoryEvent) -> Unit
) {
    val openLink by rememberUpdatedState(item.linkOpen)
    val uri = LocalUriHandler.current
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .bounceClick(from = 0.97f)
                .noRippleClickable {
                    uri.openUrl(item.website)
                },
            text = if (openLink) "" else "Website",
            style = TextStyle(
                color = Theme.colors.link,
                lineHeight = 24.sp,
                fontSize = 16.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Normal
            ),
        )
        Text(
            modifier = Modifier
                .bounceClick(from = 0.97f)
                .background(Theme.colors.white, RoundedCornerShape(20.dp))
                .noRippleClickable {
                    eventHandler.invoke(HistoryEvent.LinkClick(id = item.id))
                }
                .padding(5.dp),
            text = if (openLink) "Hide link" else "Show link",
            style = TextStyle(
                color = Theme.colors.black,
                lineHeight = 15.sp,
                fontSize = 12.sp,
                fontFamily = Poppins,
                fontWeight = FontWeight.Light
            ),
        )
    }
    AnimatedVisibility(
        visible = openLink
    ) {
        Column {
            Spacer(modifier = Modifier.height(15.dp))
            Box(
                Modifier
                    .height(1.dp)
                    .fillMaxWidth()
                    .background(Color.Gray, shape = DottedShape(step = 10.dp))
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .bounceClick(from = 0.97f)
                    .noRippleClickable {
                        uri.openUrl(item.website)
                    },
                text = item.website,
                style = TextStyle(
                    color = Theme.colors.link,
                    lineHeight = 24.sp,
                    fontSize = 16.sp,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Normal
                ),
            )
        }

    }
}