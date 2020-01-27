package com.example.playground.core_ui.atom

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import com.example.playground.R

class ButtonAV(context: Context) : AppCompatButton(context) {

    private var defaultTextColor: Int = context.resources.getColor(R.color.colorWhite)
    private var buttonColor: Int = context.resources.getColor(R.color.colorAccent)

    val buttonAV = AppCompatButton(context).apply {
        text = "button"
        setBackgroundColor(buttonColor)
        textSize = 14f
        gravity = Gravity.CENTER_HORIZONTAL
        setTextColor(defaultTextColor)
    }

    fun getView(): View = buttonAV
}