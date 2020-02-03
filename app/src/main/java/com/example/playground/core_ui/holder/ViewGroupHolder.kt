package com.example.playground.core_ui.holder

import android.util.Log
import android.view.View
import com.example.playground.R
import com.example.playground.core_ui.atom.Atom
import com.example.playground.utils.AtomicHelper
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem




open class ViewGroupHolder : AbstractItem<ViewGroupHolder, ViewGroupHolder.ViewHolder>() {

    private var dataItem: Any? = null
    private lateinit var classItemName: String

    fun withData(data: Any, classItem: String): ViewGroupHolder {
        this.dataItem = data
        this.classItemName = classItem
        return this
    }

    lateinit var atom: Atom

    override fun getType(): Int {
        return -1 // ini aku gk tau harus diisi apa
    }

    override fun getViewHolder(v: View): ViewHolder {
        atom = AtomicHelper.generateInstanceAtom(classItemName, v.context)
        return ViewHolder(atom.getView())
    }

    override fun getLayoutRes(): Int {
        return R.layout.view_group
    }

    inner class ViewHolder(val view: View) : FastAdapter.ViewHolder<ViewGroupHolder>(view) {

        override fun unbindView(item: ViewGroupHolder) {
           atom.unBind()
        }

        override fun bindView(item: ViewGroupHolder, payloads: MutableList<Any>) {
            Log.d("AF", "payload ${item.dataItem.toString()}")
            item.dataItem?.let {
                atom.render(it)
            }
        }

    }


}
