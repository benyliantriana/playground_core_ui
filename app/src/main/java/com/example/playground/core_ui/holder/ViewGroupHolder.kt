package com.example.playground.core_ui.holder

import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout
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
        private val constraint by lazy {
            view.findViewById<ConstraintLayout>(R.id.constraint_layout)
        }

        override fun unbindView(item: ViewGroupHolder) {
            constraint.removeAllViews()
        }

        override fun bindView(item: ViewGroupHolder, payloads: MutableList<Any>) {
            constraint.addView(item.itemView)
        }

    }

    fun addView(view: View): ViewGroupHolder {
        this.itemView = view.apply {
            layoutParams = FrameLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
        }
        return this
    }

}