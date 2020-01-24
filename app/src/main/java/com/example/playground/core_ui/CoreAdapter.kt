package com.example.playground.core_ui

import android.view.View
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter

internal class CoreAdapter(
    data: ArrayList<View>
) : FastAdapter<ViewGroupHolder>() {

    private var itemAdapter: ItemAdapter<ViewGroupHolder> = ItemAdapter.items()
    var adapter: FastAdapter<ViewGroupHolder>

    init {
        data.map {
            itemAdapter.add(ViewGroupHolder().addView(it))
        }
        adapter = with(itemAdapter)
    }
}