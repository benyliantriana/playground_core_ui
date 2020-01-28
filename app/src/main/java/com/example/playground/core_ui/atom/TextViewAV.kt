package com.example.playground.core_ui.atom

import android.content.Context
import android.view.Gravity
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.example.playground.R


class TextViewAV(context: Context) : AppCompatTextView(context) {

    private var color: Int = ContextCompat.getColor(context, R.color.colorAccent)


    var id: Int? = R.id.av_textview
    private val textId
        get() = id ?: R.id.av_textview

    init {
        id = textId
        textSize = 14f
        gravity = Gravity.CENTER_HORIZONTAL
        setTextColor(color)
    }

}