package com.example.playground.core_ui.atom

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core.Atom


class TextViewAV(context: Context) : Atom<TextViewAV.State>() {

    private var color: Int = ContextCompat.getColor(context, R.color.colorBlack)
    var state: State = State()

    val textView = AppCompatTextView(context).apply {
        textSize = 14f
        gravity = Gravity.CENTER_HORIZONTAL
        setTextColor(color)
    }

    override fun getView(): View {
        render(state)
        return textView
    }

    override fun unBind() {
        state = State()
    }

    override fun render(state: State) {
        textView.apply {
            text = state.text
        }
    }

    override fun getAtomState(): State? = state

    class State {
        var text: String? = null
    }

}