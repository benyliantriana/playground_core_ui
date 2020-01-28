package com.example.playground.core

import android.view.View
import com.example.playground.core_ui.holder.ViewGroupHolder
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter

internal class CoreAdapter(
    data: ArrayList<View>
) : FastAdapter<ViewGroupHolder>() {

    var itemAdapter: ItemAdapter<ViewGroupHolder> = ItemAdapter.items()

    init {
        data.map {
            itemAdapter.add(ViewGroupHolder().addView(it))
        }
        addAdapter(0, itemAdapter)
    }

    fun setNewData(data: ArrayList<View>) {
        data.mapIndexed { index, view ->
            itemAdapter.set(index, ViewGroupHolder().addView(view))
        }
    }

    fun addNewData(view: View) {
        itemAdapter.add(ViewGroupHolder().addView(view))
    }
}