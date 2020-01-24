package com.example.playground.core_ui

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import com.example.playground.R


class TextViewAV(context: Context) : View(context) {

    private var color: Int = context.resources.getColor(R.color.colorAccent)

    val textViewAV = AppCompatTextView(context).apply {
        textSize = 14f
        gravity = Gravity.CENTER_HORIZONTAL
        setTextColor(color)
    }

    fun getView() : View = textViewAV
}