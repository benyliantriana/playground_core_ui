package com.example.playground.core

import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.core_ui.holder.ViewGroupHolder
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter

internal class CoreAdapter(
    data: ArrayList<Any>
) : FastAdapter<ViewGroupHolder<TextViewAV>>() {

    var itemAdapter: ItemAdapter<ViewGroupHolder<TextViewAV>> = ItemAdapter.items()

    init {

        data.map {
            itemAdapter.add(ViewGroupHolder<TextViewAV>().withData(it))
        }

        addAdapter(0, itemAdapter)
    }

    fun setNewData(data: ArrayList<Any>) {
        data.mapIndexed { index, view ->
            itemAdapter.set(index, ViewGroupHolder())
        }
    }
}