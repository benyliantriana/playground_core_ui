package com.example.playground.core

import com.example.playground.core_ui.holder.ViewGroupHolder
import com.example.playground.core_ui.state.Empty
import com.example.playground.core_ui.state.State
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter

class CoreAdapter(
    var data: ArrayList<State>
) : FastAdapter<ViewGroupHolder>() {

   private val itemAdapter: ItemAdapter<ViewGroupHolder> = ItemAdapter.items()

    init {

        data.map {
            itemAdapter.add(ViewGroupHolder().withData(Empty))
        }
        addAdapter(0, itemAdapter)
    }

    fun dispatch(newData: ArrayList<State>) {
        this.data = newData
        data.map {
            itemAdapter.add(ViewGroupHolder().withData(it))
        }
    }

    fun dispatch(state: State) {
        itemAdapter.add(ViewGroupHolder().withData(state))
    }

    fun dispatch(index: Int, state: State) {
        data.mapIndexed { index, view ->
            itemAdapter.set(index, ViewGroupHolder().withData(state))
        }
    }
}