package com.kotdev.abzagency.core.extensions

import android.accessibilityservice.AccessibilityService
import android.content.Context
import android.provider.Settings
import android.text.TextUtils


fun Context.isAccessibilityServiceEnabled(service: Class<out AccessibilityService>): Boolean {
    val serviceId = "${this.packageName}/${service.name}"
    val enabledServices = Settings.Secure.getString(this.contentResolver, Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES)
    if (!enabledServices.isNullOrEmpty()) {
        val colonSplitter = TextUtils.SimpleStringSplitter(':')
        colonSplitter.setString(enabledServices)
        while (colonSplitter.hasNext()) {
            val componentName = colonSplitter.next()
            if (componentName.equals(serviceId, ignoreCase = true)) {
                return true
            }
        }
    }
    return Settings.Secure.getInt(this.contentResolver, Settings.Secure.ACCESSIBILITY_ENABLED, 0) == 1
}