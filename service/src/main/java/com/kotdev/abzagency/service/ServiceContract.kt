package com.kotdev.abzagency.service


import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo


/**
 *  Сan say the class defines the contract of basic functions
 *  that must be implemented in all classes inheriting from ServiceContract
 *
 *  In web applications we can enter a request in two places and the processing logic is different
 *
 *  There is an input field url and a search bar input field.
 *
 *  @request - url field
 *  @requestSearch - search bar
 *  @searchArea - a boolean value that shows where we enter the query
 */
abstract class ServiceContract {

    var searchArea = false
    var request = ""
    var requestSearch = ""

    abstract fun service(event: AccessibilityEvent)

    /**
     * urlField - function processes url field
     */
    protected abstract fun urlField(event: AccessibilityEvent)

    /**
     * urlField - function processes search bar
     */
    protected abstract fun searchField(event: AccessibilityEvent)

    /**
     * the function describes what cases we save the request in the database
     */
    protected fun contract(value: String?) = value?.contains(CONTRACT)?:false

    /**
     * function shows tree viewIdResourceName
     */
    protected fun getChild(info: AccessibilityNodeInfo) {
        val i = info.childCount
        for (p in 0 until i) {
            val n = info.getChild(p)
            if (n != null) {
                val resName = n.viewIdResourceName
                if (n.text != null) {
                    Log.d("ServiceContract", "getChild: $n")
                    Log.d("ServiceContract", "viewIdResourceName: $resName")
                    n.text.toString()
                }
                getChild(n)
            }
        }
    }


    protected fun findLine1(resName: String, info: AccessibilityNodeInfo) {
        val i = info.childCount
        for (p in 0 until i) {
            val n = info.getChild(p)
            if (n != null) {
                if (n.text != null) {
                    if (resName == n.viewIdResourceName) {
                        searchArea = false
                        if (request.isEmpty()) {
                            request = n.text.toString()
                        }
                    }
                }
                findLine1(resName, n)
            }
        }
    }

    companion object {
        const val CONTRACT = "google.com"
    }
}







