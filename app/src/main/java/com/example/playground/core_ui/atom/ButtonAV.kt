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
    var state: State = State()

    val buttonView = AppCompatButton(context).apply {
        textSize = 14f
        gravity = Gravity.CENTER_HORIZONTAL
        setBackgroundColor(buttonColor)
        setTextColor(defaultTextColor)
    }

    override fun getView(): View {
        render(state)
        return buttonView
    }

    override fun unBind() {
        state = State()
    }

    override fun render(state: State) {
        buttonView.apply {
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