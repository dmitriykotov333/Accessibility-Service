package com.kotdev.abzagency.service.factory

import android.view.accessibility.AccessibilityEvent
import com.kotdev.abzagency.service.config.SupportedBrowser

interface WebServiceFactory {
    fun request(event: AccessibilityEvent)
    fun getPackage(event: AccessibilityEvent): SupportedBrowser
}