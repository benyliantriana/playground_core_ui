package com.example.playground.core_ui.atom

import android.content.Context
import android.util.Log
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core_ui.state.ButtonState
import com.example.playground.core_ui.state.State
import com.example.playground.utils.sp

class ButtonAV<T: State>(context: Context) : Atom<T>() {

    private var defaultTextColor: Int = ContextCompat.getColor(context, R.color.colorWhite)
    private var buttonColor: Int = ContextCompat.getColor(context, R.color.colorAccent)

    lateinit var onClick: () -> Unit?

    lateinit var buttonAV: AppCompatButton

    init {
        buttonAV = AppCompatButton(context).apply {
            gravity = Gravity.CENTER_HORIZONTAL
            setBackgroundColor(buttonColor)
            setTextColor(defaultTextColor)
        }
    }

    override fun getView(): View = buttonAV

    override fun unBind() {
    }

    override fun render(data: T) {
        if(data is ButtonState.Normal) {
            buttonAV.text = data.text
            onClick = data.action
            buttonAV.setOnClickListener {
                data.action.invoke()
            }
        }
    }

}