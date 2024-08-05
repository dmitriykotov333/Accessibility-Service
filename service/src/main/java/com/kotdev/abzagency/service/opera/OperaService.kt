package com.kotdev.abzagency.service.opera

import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK
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
class OperaService(
    private val serviceRepository: ServiceRepository
) : ServiceContract() {

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    override fun service(event: AccessibilityEvent) {
        searchField(event)
        urlField(event)
    }


    override fun urlField(event: AccessibilityEvent) {
        val parentNodeInfo = event.source ?: return
        val url =
            captureUrl(parentNodeInfo, SupportedBrowser.OPERA)
        parentNodeInfo.recycle()

        if (event?.source?.actionList?.get(0).toString().contains("ACTION_SELECT")) {
            if (event.contentChangeTypes == 1) {
                if (contract(url)) {
                    scope.launch {
                        serviceRepository.addHistory(
                            History(
                                request = request,
                                service = SupportedBrowser.OPERA.name,
                                website = url,
                                createdAt = System.currentTimeMillis()
                            )
                        )
                        Log.d("OperaService", "request = $request")
                        Log.d("OperaService", "website = $url")
                    }
                }
            }
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
            request = inputText
            Log.d("OperaService", "text = $requestSearch")
        }
    }

}