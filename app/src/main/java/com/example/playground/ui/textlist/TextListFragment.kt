package com.example.playground.ui.textlist

import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.core_ui.state.ButtonState
import com.example.playground.core_ui.state.State
import com.example.playground.core_ui.state.TextState

class TextListFragment : CoreFragment() {

    override fun renderView() {
        var data = arrayListOf<State>()
        for (i in 1..1000) {
            if (i % 3 == 0){
                data.add(ButtonState.Normal(addTextView(i), action = fun (){}))

            } else {
               data.add(TextState.Basic(addTextView(i)))
            }
        }
        coreAdapter.dispatch(data)
    }

    private fun addTextView(i: Int): String {
        return "textView $i"
    }
}