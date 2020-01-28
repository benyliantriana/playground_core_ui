package com.example.playground.ui.textlist

import android.view.View
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.molecule.MenuAccountMV

class TextListFragment : CoreFragment() {

    override fun renderView() {
        for (i in 1..100) {
            viewList.add(addTextView1(i))
        }
    }

    private fun addTextView1(i: Int): View {
        return MenuAccountMV(requireContext()).apply {
            textLabel = "textView $i"
        }.getView()
    }
}