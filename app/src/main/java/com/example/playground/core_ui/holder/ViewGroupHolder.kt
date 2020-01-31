package com.example.playground.core_ui.holder

import android.view.View
import android.widget.FrameLayout
import com.example.playground.R
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem

open class ViewGroupHolder : AbstractItem<ViewGroupHolder, ViewGroupHolder.ViewHolder>() {

    private var itemView: View? = null

    override fun getType(): Int {
        return -1 // ini aku gk tau harus diisi apa
    }

    override fun getViewHolder(v: View): ViewHolder =
        ViewHolder(v)

    override fun getLayoutRes(): Int {
        return R.layout.view_group
    }

    class ViewHolder(view: View) : FastAdapter.ViewHolder<ViewGroupHolder>(view) {
        private val frameLayout by lazy {
            view.findViewById<FrameLayout>(R.id.frame_layout)
        }

        override fun unbindView(item: ViewGroupHolder) {
            frameLayout.removeAllViews()
        }

        override fun bindView(item: ViewGroupHolder, payloads: MutableList<Any>) {
            frameLayout.addView(item.itemView)
        }

    }

    fun addView(view: View): ViewGroupHolder {
        this.itemView = view
        return this
    }

}