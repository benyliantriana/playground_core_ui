package com.example.playground.core_ui.atom

import android.content.Context
import android.view.View

class DividerAV(context: Context) : View(context) {

    private val dividerView = View(context).apply {
        minimumHeight = 20
    }

    fun getView(): View = dividerView
}