package com.example.playground.core_ui.holder

import android.view.View
import com.example.playground.R
import com.example.playground.core_ui.atom.Atom
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem

open class ViewGroupHolder(val atom: Atom) : AbstractItem<ViewGroupHolder, ViewGroupHolder.ViewHolder>() {

    private var itemView: View? = null

    private var data: Any? = null

    override fun getType(): Int {
        return -1 // ini aku gk tau harus diisi apa
    }

    override fun getViewHolder(v: View): ViewHolder {
        return ViewHolder(atom.getView())
    }

    override fun getLayoutRes(): Int {
        return R.layout.view_group
    }

    inner class ViewHolder(view: View) : FastAdapter.ViewHolder<ViewGroupHolder>(view) {

        override fun unbindView(item: ViewGroupHolder) {
           atom.unBind()
        }

        override fun bindView(item: ViewGroupHolder, payloads: MutableList<Any>) {
            //linearLayout.addView(item.itemView)
            data?.let {
                atom.render(it)
            }
        }

    }

    fun addView(view: View): ViewGroupHolder {
        this.itemView = view
        return this
    }

}