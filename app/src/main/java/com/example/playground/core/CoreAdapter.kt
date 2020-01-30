package com.example.playground.core

import com.example.playground.core_ui.atom.Atom
import com.example.playground.core_ui.holder.ViewGroupHolder
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter

internal class CoreAdapter(
    data: ArrayList<Any>,
    val atom: Atom
) : FastAdapter<ViewGroupHolder>() {

    var itemAdapter: ItemAdapter<ViewGroupHolder> = ItemAdapter.items()

    init {

        data.map {
            itemAdapter.add(ViewGroupHolder(atom))
        }

        addAdapter(0, itemAdapter)
    }

    fun setNewData(data: ArrayList<Any>) {
        data.mapIndexed { index, view ->
            itemAdapter.set(index, ViewGroupHolder(atom))
        }
    }
}