package com.kotdev.abzagency.service.google

import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_FOCUS
import com.kotdev.abzagency.domain.entities.History
import com.kotdev.abzagency.domain.repository.ServiceRepository
import com.kotdev.abzagency.service.ServiceContract
import com.kotdev.abzagency.service.config.SupportedBrowser
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Singleton

@Singleton
class GoogleService(
    private val serviceRepository: ServiceRepository
) : ServiceContract() {

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    override fun service(event: AccessibilityEvent) {
        searchField(event)
        urlField(event)
    }


    override fun urlField(event: AccessibilityEvent) {
        val parentNodeInfo = event.source ?: return
        if (!parentNodeInfo.actionList.contains(ACTION_CLICK)) {
            if (!searchArea) {
                request = ""
            }
        }
        findLine1("com.android.chrome:id/line_1", parentNodeInfo)
        val url =
            captureUrl(parentNodeInfo, SupportedBrowser.GOOGLE)
        parentNodeInfo.recycle()


        if (event?.source?.actionList?.get(0).toString().contains("ACTION_FOCUS")) {
            if (event.contentChangeTypes == 2) {
                if (searchArea) {
                    if (contract(url)) {
                        save(requestSearch, url)
                    }
                }
            }
            if (event.contentChangeTypes == 0 ||
                event.contentChangeTypes == 1
            ) {
                if (contract(url)) {
                    save(request, url)
                }
            }
        } else if (event?.source?.actionList?.get(0).toString().contains("ACTION_SELECT")) {
            if (event.contentChangeTypes == 3) {
                if (searchArea) {
                    if (contract(url)) {
                        save(requestSearch, url)
                    }
                }
            }
        }
    }

    private fun save(request: String, url: String?) {
        scope.launch {
            serviceRepository.addHistory(
                History(
                    request = request,
                    service = SupportedBrowser.GOOGLE.name,
                    website = url,
                    createdAt = System.currentTimeMillis()
                )
            )
            Log.d("GoogleService", "request = $request")
            Log.d("GoogleService", "website = $url")
            searchArea = false
        }
    }

    override fun searchField(event: AccessibilityEvent) {
        if (event.eventType == AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED) {
            val source: AccessibilityNodeInfo? = event.source
            if (source != null) {
                checkSearchField(source)
            }
        }

    }

    private fun captureUrl(info: AccessibilityNodeInfo, config: SupportedBrowser): String? {
        val nodes = info.findAccessibilityNodeInfosByViewId(config.addressId)
        val addressBarNodeInfo = nodes[0]
        var url: String? = null
        if (addressBarNodeInfo.text != null) {
            url = addressBarNodeInfo.text.toString()
        }
        addressBarNodeInfo.recycle()
        return url
    }

    private fun checkSearchField(node: AccessibilityNodeInfo) {
        if (node.className == "android.widget.EditText" || node.className.contains(
                "UrlBar",
                ignoreCase = true
            )
        ) {
            val inputText = node.text?.toString() ?: ""
            searchArea = true
            requestSearch = inputText
            Log.d("GoogleService", "text = $requestSearch")
        }
    }

}