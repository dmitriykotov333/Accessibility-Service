package com.kotdev.abzagency.core_ui.theme.extensions

import androidx.compose.ui.platform.UriHandler


fun UriHandler.openUrl(url: String) {
    this.openUri(
        if (url.contains("http://")) {
            url
        } else {
            "http://$url"
        }
    )
}