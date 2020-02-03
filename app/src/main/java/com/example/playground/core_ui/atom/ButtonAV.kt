package com.example.playground.core_ui.atom

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core.Atom

class ButtonAV(context: Context) : Atom<ButtonAV.State>() {

    private var defaultTextColor: Int = ContextCompat.getColor(context, R.color.colorWhite)
    private var buttonColor: Int = ContextCompat.getColor(context, R.color.colorAccent)
    var state: State? = null

    private val buttonAV = AppCompatButton(context).apply {
        id = R.id.av_button
        textSize = 14f
        gravity = Gravity.CENTER_HORIZONTAL
        setBackgroundColor(buttonColor)
        setTextColor(defaultTextColor)
    }

    override fun getView(): View = buttonAV.apply {
        state?.let {
            render(it)
        }
    }

    override fun unBind() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun render(state: State) {
        buttonAV.apply {
            text = state.text
            setOnClickListener { state.onClick() }
        }
    }

    override fun getAtomState(): State? = state

    class State {
        var text: String? = null
        var onClick: () -> Unit? = {}
    }

}