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

    lateinit var onClick: () -> Unit?

    init {
        textSize = 14f
        gravity = Gravity.CENTER_HORIZONTAL
        setBackgroundColor(buttonColor)
        setTextColor(defaultTextColor)
        setOnClickListener { onClick() }
    }

}