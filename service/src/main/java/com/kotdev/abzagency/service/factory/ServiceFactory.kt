package com.kotdev.abzagency.service.factory

import android.view.accessibility.AccessibilityEvent
import com.kotdev.abzagency.service.config.SupportedBrowser
import com.kotdev.abzagency.service.google.GoogleService
import com.kotdev.abzagency.service.opera.OperaService
import javax.inject.Singleton

/**
 *
 */
@Singleton
class ServiceFactory(
    private val googleService: GoogleService,
    private val operaService: OperaService
) : WebServiceFactory {

    override fun request(event: AccessibilityEvent) {
        when (val packageName = getPackage(event)) {
            SupportedBrowser.GOOGLE -> {
                googleService.service(event)
            }

            SupportedBrowser.OPERA -> {
                operaService.service(event)
            }

            SupportedBrowser.ERROR -> {
                throw Exception("I don't know how to work with this service $packageName.")
            }
        }
    }


    /**
     * The function checks the application Package and Supported Browser
     *
     * for example : if package is not equals to SupportedBrowser.GOOGLE or SupportedBrowser.OPERA
     * we catch throw Exception("I don't know how to work with this service $packageName.")
     */
    override fun getPackage(event: AccessibilityEvent): SupportedBrowser {
        var result = SupportedBrowser.ERROR
        if (event.packageName != null) {
            result = listOf(
                SupportedBrowser.GOOGLE,
                SupportedBrowser.OPERA
            ).firstOrNull { it.packageName == event.packageName.toString() }
                ?: SupportedBrowser.ERROR
        }
        return result
    }
}