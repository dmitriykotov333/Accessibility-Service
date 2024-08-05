package com.kotdev.abzagency.data.paging

interface Paging<Key, Value> {
    suspend fun load()
    fun reset()
}


class CommonPaging<Key, Value>(
    private val initialPage: Key,
    private inline val onLoad: (Boolean) -> Unit,
    private inline val onRequest: suspend (nextKey: Key) -> Result<List<Value>>,
    private inline val onNextPage: suspend (List<Value>) -> Key,
    private inline val onError: suspend (Throwable?) -> Unit,
    private inline val onSuccess: suspend (items: List<Value>, newKey: Key) -> Unit
) : Paging<Key, Value> {

    private var page = initialPage

    private var isLoad = false

    override suspend fun load() {
        if(isLoad) {
            return
        }
        isLoad = true
        onLoad(true)
        val result = onRequest(page)
        isLoad = false
        val items = result.getOrElse {
            onError(it)
            onLoad(false)
            return
        }
        page = onNextPage(items)
        onSuccess(items, page)
        onLoad(false)
    }

    override fun reset() {
        page = initialPage
    }
}