package com.example.playground.core_ui.holder

import android.view.View
import com.example.playground.R
import com.example.playground.core_ui.atom.Atom
import com.example.playground.core_ui.state.State
import com.example.playground.utils.AtomicHelper
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem


open class ViewGroupHolder : AbstractItem<ViewGroupHolder, ViewGroupHolder.ViewHolder>() {

    private var dataItem: State? = null
    private var classItemName: String = ""

    fun withData(data: State, classItem: String): ViewGroupHolder {
        this.dataItem = data
        this.classItemName = classItem
        return this
    }

    override fun getType(): Int {
        return AtomicHelper.getAtomType(classItemName) // ini aku gk tau harus diisi apa
    }

    override fun getViewHolder(v: View): ViewHolder {
        val atomView = AtomicHelper.generateInstanceAtom<State>(classItemName, v.context)
        return ViewHolder(atomView.getView(), atomView)
    }

    override fun getLayoutRes(): Int {
        return R.layout.view_group
    }

    inner class ViewHolder(val view: View, val atom: Atom<State>) : FastAdapter.ViewHolder<ViewGroupHolder>(view) {
        override fun unbindView(item: ViewGroupHolder) {
           atom.unBind()
        }

        override fun bindView(item: ViewGroupHolder, payloads: MutableList<Any>) {
            item.dataItem?.let {
                atom.render(it)
            }
        }

    }


}
