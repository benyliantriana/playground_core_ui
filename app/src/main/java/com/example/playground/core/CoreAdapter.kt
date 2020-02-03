package com.example.playground.core

import com.example.playground.core_ui.holder.ViewGroupHolder
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter

internal class CoreAdapter(
    private var data: ArrayList<Atom<*>>
) : FastAdapter<ViewGroupHolder>() {

    private var itemAdapter: ItemAdapter<ViewGroupHolder> = ItemAdapter.items()

    init {
        data.map {
            itemAdapter.add(ViewGroupHolder().addView(it.getView()))
        }
        addAdapter(0, itemAdapter)
    }

    fun setNewData(newData: ArrayList<Atom<*>>) {
        newData.mapIndexed { index, it ->
            if (it.getAtomState() != data[index].getAtomState()) {
                itemAdapter.set(index, ViewGroupHolder().addView(it.getView()))
            }
        }
    }
}