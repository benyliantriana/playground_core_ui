package com.example.playground.core_ui.atom

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.example.playground.R


class TextViewAV(context: Context) : AppCompatTextView(context) {

    private var color: Int = ContextCompat.getColor(context, R.color.colorAccent)

    init {
        textSize = 14f
        gravity = Gravity.CENTER_HORIZONTAL
        setTextColor(color)
    }

}