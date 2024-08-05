package com.kotdev.abzagency.service.config

interface SupportedBrowserData {
    var packageName: String
    var addressId: String
}

enum class SupportedBrowser(
    override var packageName: String,
    override var addressId: String
) : SupportedBrowserData {
    GOOGLE(
        "com.android.chrome",
        "com.android.chrome:id/url_bar"
    ),
    OPERA(
        "com.opera.browser",
        "com.opera.browser:id/url_field"
    ),
    ERROR("", "")
}