package com.example.playground.core_ui.atom

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core_ui.state.State
import com.example.playground.core_ui.state.TextState
import com.example.playground.utils.sp


class TextViewAV<S: State> (context: Context) : Atom<S>() {

    private var color: Int = ContextCompat.getColor(context, R.color.colorAccent)
    private var textViewAV: AppCompatTextView
    init {
      textViewAV =  AppCompatTextView(context).apply {
            id = id
            textSize = 14f
            gravity = Gravity.CENTER_HORIZONTAL
            setTextColor(color)
        }
    }

    override fun getView(): View = textViewAV

    override fun unBind() {

    }

    override fun render(data: S) {
        if (data is TextState) {
            textViewAV.text = data.text
        }
    }

    companion object {
        const val type = 11
    }

}




