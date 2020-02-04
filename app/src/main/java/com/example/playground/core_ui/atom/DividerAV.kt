package com.example.playground.core_ui.atom

import android.content.Context
import android.view.View
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core.Atom
import com.example.playground.utils.dp

class DividerAV(context: Context) : Atom<DividerAV.State>() {

    var state: State = State()

    val dividerView: View = View(context)

    override fun getView(): View {
        render(state)
        return dividerView
    }

    override fun unBind() {
        state = State()
    }

    override fun render(state: State) {
        dividerView.apply {
            R.id.av_divider
            minimumHeight = state.height.dp()
            state.color?.let { setBackgroundColor(ContextCompat.getColor(context, it)) }
        }
    }

    override fun getAtomState(): State? = state

    class State {
        var height: Int = 4
        var color: Int? = null
    }
}