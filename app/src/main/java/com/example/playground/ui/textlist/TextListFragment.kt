package com.example.playground.ui.textlist

import android.view.View
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.TextViewAV

class TextListFragment : CoreFragment() {

    override fun renderView() {
        for (i in 1..100) {
            viewList.add(addTextView1(i))
        }
    }

    private fun addTextView1(i: Int): View {
        return TextViewAV(requireContext()).getView()/*.apply {
            id = i
            text = "textView $i"
            setTextColor(ContextCompat.getColor(context, R.color.colorWhite))
        }*/
    }
}