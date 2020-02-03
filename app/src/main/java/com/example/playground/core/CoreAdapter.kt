package com.example.playground.core

import com.example.playground.core_ui.holder.ViewGroupHolder
import com.example.playground.core_ui.state.State
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter

class CoreAdapter : FastAdapter<ViewGroupHolder>() {

    val itemAdapter: ItemAdapter<ViewGroupHolder> = ItemAdapter.items()

    fun setData(updateDataItem: State, classItemName: String) {
        itemAdapter.add(ViewGroupHolder().withData(updateDataItem, classItemName)) //.add(ViewGroupHolder<T>().withData(it))
    }

    fun reload() {
        addAdapter(0, itemAdapter)
    }


}