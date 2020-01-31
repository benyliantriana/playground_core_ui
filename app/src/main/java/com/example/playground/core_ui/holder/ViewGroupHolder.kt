package com.example.playground.core_ui.holder

import android.view.View
import com.example.playground.R
import com.example.playground.core_ui.atom.Atom
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.utils.AtomicHelper
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem


open class ViewGroupHolder<T : Atom> : AbstractItem<ViewGroupHolder<T>, ViewGroupHolder<T>.ViewHolder<T>>() {

    private var dataItem: Any? = null

    fun withData(data: Any): ViewGroupHolder<T> {
        this.dataItem = data
        return this
    }

    lateinit var atom: Atom

    override fun getType(): Int {
        return -1 // ini aku gk tau harus diisi apa
    }

    override fun getViewHolder(v: View): ViewHolder<T> {
        // belum ketemu cara instance object dari generic type
        atom = AtomicHelper.generateInstanceAtom(T::class.java, v.context)
        return ViewHolder(atom.getView())
    }

    override fun getLayoutRes(): Int {
        return R.layout.view_group
    }

    inner class ViewHolder<VH : Atom>(val view: View) : FastAdapter.ViewHolder<ViewGroupHolder<VH>>(view) {

        override fun unbindView(item: ViewGroupHolder<VH>) {
           atom.unBind()
        }

        override fun bindView(item: ViewGroupHolder<VH>, payloads: MutableList<Any>) {
            dataItem?.let {
                atom.render(it)
            }
        }

    }


}