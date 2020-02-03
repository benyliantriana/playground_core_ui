package com.example.playground.ui.textlist

import android.view.View
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.TextViewAV

class TextListFragment : CoreFragment() {

    override fun renderView() {
        for (i in 1..1000) {
            viewList.add(addTextView(i))
        }

        mAdapter.setData(TextViewAV::class.java.simpleName)
    }

    private fun addTextView(i: Int): String {
        return "textView $i"
    }
}