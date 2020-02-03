package com.example.playground.ui.textlist

import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.core_ui.state.ButtonState
import com.example.playground.core_ui.state.TextState

class TextListFragment : CoreFragment() {

    override fun renderView() {
        for (i in 1..100) {
            if (i % 3 == 0){
                mAdapter.setData(ButtonState.Normal(addTextView(i), action = fun (){
                }), ButtonAV::class.java.simpleName)
            } else {
                mAdapter.setData(TextState.Basic(addTextView(i)), TextViewAV::class.java.simpleName)
            }
        }
        mAdapter.reload()
    }

    private fun addTextView(i: Int): String {
        return "textView $i"
    }
}