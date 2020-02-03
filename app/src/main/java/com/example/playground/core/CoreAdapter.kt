package com.example.playground.core

import com.example.playground.core_ui.atom.Atom
import com.example.playground.core_ui.holder.ViewGroupHolder
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter

class CoreAdapter(
    var data: ArrayList<Any>
) : FastAdapter<ViewGroupHolder>() {

    val itemAdapter: ItemAdapter<ViewGroupHolder> = ItemAdapter.items()

    fun setData(updateDataItem: Any, classItemName: String) {
//        data.add(updateDataItem)
        itemAdapter.add(ViewGroupHolder().withData(updateDataItem, classItemName)) //.add(ViewGroupHolder<T>().withData(it))
        addAdapter(0, itemAdapter)
    }


}