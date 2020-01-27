package com.example.playground.ui.textlist

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.getColor
import com.example.playground.R
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
            textViewAV.id = i
            textViewAV.text = "textView $i"
            textViewAV.setTextColor(getColor(context, R.color.colorWhite))
        }.getView()
    }
}