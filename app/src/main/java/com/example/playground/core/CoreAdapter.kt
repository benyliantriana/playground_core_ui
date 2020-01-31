package com.example.playground.core

import com.example.playground.core_ui.atom.Atom
import com.example.playground.core_ui.holder.ViewGroupHolder
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter

class CoreAdapter<T: Atom>(
    var data: ArrayList<Any>
) : FastAdapter<ViewGroupHolder<T>>() {


    fun setData() {
        val itemAdapter: ItemAdapter<ViewGroupHolder<T>> = ItemAdapter.items()
        data.map{
            itemAdapter.add(ViewGroupHolder<T>().withData(it)) //.add(ViewGroupHolder<T>().withData(it))
        }
        addAdapter( 0, itemAdapter)
    }


   /* fun setNewData(data: ArrayList<Any>) {
        data.mapIndexed { index, view ->
            itemAdapter.set(index, ViewGroupHolder())
        }
    }*/
}