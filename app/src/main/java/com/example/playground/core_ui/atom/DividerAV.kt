package com.example.playground.core_ui.atom

import android.content.Context
import android.view.View
import com.example.playground.R
import com.example.playground.utils.dp

class DividerAV(context: Context) : View(context) {

    var height: Int? = 4

    init {
        R.id.av_divider
        minimumHeight = height?.dp() ?: 4.dp()
    }
}