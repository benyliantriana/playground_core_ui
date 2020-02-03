package com.example.playground.ui.textlist

import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.DataPassing
import com.example.playground.core_ui.atom.TextViewAV

class TextListFragment : CoreFragment() {

    override fun renderView() {
        for (i in 1..1000) {
            if (i % 3 == 0){
                mAdapter.setData(DataPassing(data = addTextView(i), action = fun (){
                }), ButtonAV::class.java.simpleName)
            } else {
                mAdapter.setData(addTextView(i), TextViewAV::class.java.simpleName)
            }
        }


    }

    private fun addTextView(i: Int): String {
        return "textView $i"
    }
}