package com.example.playground.core_ui.atom

import android.content.Context
import android.view.View
import com.example.playground.utils.dp

class DividerAV(context: Context) : Atom() {

    lateinit var divider: View
    init {
        divider = View(context).apply {
            minimumHeight = 4.dp()
        }
    }

    override fun getView(): View = divider

    override fun unBind() {
    }

    override fun render(data: Any) {
    }
}