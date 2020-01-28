package com.example.playground.core_ui.atom

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.utils.sp

class ButtonAV(context: Context) : AppCompatButton(context) {

    private var defaultTextColor: Int = ContextCompat.getColor(context, R.color.colorWhite)
    private var buttonColor: Int = ContextCompat.getColor(context, R.color.colorAccent)

    init {
        text = "button"
        setBackgroundColor(buttonColor)
        textSize = 14f.sp()
        gravity = Gravity.CENTER_HORIZONTAL
        setTextColor(defaultTextColor)
    }

}