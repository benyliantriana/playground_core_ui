package com.example.playground.core_ui

import android.view.View
import android.widget.LinearLayout
import com.example.playground.R
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem

open class ViewGroupHolder : AbstractItem<ViewGroupHolder, ViewGroupHolder.ViewHolder>() {

    val linear: ArrayList<View> = arrayListOf()

    override fun getType(): Int {
        return -1 // ini aku gk tau harus diisi apa
    }

    override fun getViewHolder(v: View): ViewHolder = ViewHolder(v)

    override fun getLayoutRes(): Int {
        return R.layout.view_group
    }

    class ViewHolder(view: View) : FastAdapter.ViewHolder<ViewGroupHolder>(view) {
        private val linearLayout by lazy {
            view.findViewById<LinearLayout>(R.id.linear_layout)
        }

        override fun unbindView(item: ViewGroupHolder) {
            linearLayout.removeAllViews()
        }

        override fun bindView(item: ViewGroupHolder, payloads: MutableList<Any>) {
            item.linear.map {
                linearLayout.addView(it)
            }
        }

    }

    fun addView(view: List<View>): ViewGroupHolder {
        this.linear.addAll(view)
        return this
    }

}