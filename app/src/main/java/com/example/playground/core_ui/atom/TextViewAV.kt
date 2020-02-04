package com.example.playground.core_ui.atom

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core.Atom


open class TextViewAV(context: Context) : Atom<TextViewAV.State>() {

    open var state: State = State()

    val textView = AppCompatTextView(context).apply {
        gravity = Gravity.CENTER_HORIZONTAL
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
            textSize = state.textSize
            setTextColor(ContextCompat.getColor(context, state.color))
        }
    }

    override fun getAtomState(): State? = state

    class State {
        var text: String? = null
        var color: Int = R.color.colorBlack
        var textSize: Float = 14f
    }

}