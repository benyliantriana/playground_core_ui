package com.example.playground.core_ui.atom

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import com.example.playground.R


class TextViewAV(context: Context) : AppCompatTextView(context) {

    var text: String? = null

    var id: Int? = R.id.av_textview
    private val textId
        get() = id ?: R.id.av_textview

    private val textInput
        get() = text

    private var color: Int = context.resources.getColor(R.color.colorWhite)

    private val textViewAV = AppCompatTextView(context).apply {
        id = id
        textSize = 14f
        gravity = Gravity.CENTER_HORIZONTAL
        setTextColor(color)
    }

    fun getView(): View = textViewAV.apply {
        id = textId
        text = textInput
    }
}