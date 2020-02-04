package com.example.playground.ui.textlist

import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.state.ButtonState
import com.example.playground.core_ui.state.MenuAccountState
import com.example.playground.core_ui.state.State

class TextListFragment : CoreFragment() {

    override fun renderView() {
        var data = arrayListOf<State>()
        for (i in 1..20) {
            if (i % 2 == 0){
                data.add(ButtonState.Normal(addTextView(i), action = fun (){}))

            } else {
                data.add(MenuAccountState.Normal("arief", addTextView(i), action = fun () {  }))
            }
        }
        coreAdapter.dispatch(data)
    }

    private fun addTextView(i: Int): String {
        return "textView $i"
    }
}