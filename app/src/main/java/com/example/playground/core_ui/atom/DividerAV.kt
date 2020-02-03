package com.example.playground.core_ui.atom

import android.content.Context
import android.view.View
import com.example.playground.core_ui.state.State
import com.example.playground.utils.dp

class DividerAV<T: State>(context: Context) : Atom<T>() {

    private var divider: View = View(context).apply {
        minimumHeight = 4.dp()
    }

    override fun getView(): View = divider

    override fun unBind() {
    }

    override fun render(data: T) {
    }
}