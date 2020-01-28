package com.example.playground.ui.textlist

import android.os.Bundle
import android.view.View
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.TextViewAV

class TextListFragment : CoreFragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        renderView()
    }

    override fun renderView() {
        for (i in 1..100) {
            viewList.add(addTextView1(i))
        }
    }

    private fun addTextView1(i: Int): View {
        return TextViewAV(requireContext()).apply {
            text = "textView $i"
        }.getView()
    }
}