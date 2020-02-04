package com.example.playground.core_ui.atom

import android.content.Context
import com.example.playground.R

class TextViewMenuAV(context: Context) : TextViewAV(context) {
    override var state = State().apply {
        textSize = 12f
        color = R.color.colorGrey
    }
}