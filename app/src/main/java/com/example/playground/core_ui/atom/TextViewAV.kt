package com.example.playground.core_ui.atom

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.utils.sp


class TextViewAV(context: Context) : Atom() {

    private var color: Int = ContextCompat.getColor(context, R.color.colorAccent)
    private val textViewAV = AppCompatTextView(context).apply {
        id = id
        textSize = 14f
        gravity = Gravity.CENTER_HORIZONTAL
        setTextColor(color)
    }

    var id: Int? = R.id.av_textview
    private val textId
        get() = id ?: R.id.av_textview

    override fun getView(): View = textViewAV

    override fun unBind() {
        textViewAV.text = null
    }

    override fun render(data: Any) {
        textViewAV.text = data as String
    }

}