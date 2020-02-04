package com.example.playground.core_ui.molecule

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.playground.core_ui.atom.Atom
import com.example.playground.core_ui.state.State

open class ConstrainMV<T: State>(context: Context) : Atom<T>() {

    override fun getView(): View = constraintLayout

    override fun unBind() {
    }

    override fun render(data: T) {
    }

    private val constraintLayout = ConstraintLayout(context)

    init {
        constraintLayout.apply {
            isFocusable = false
            isFocusableInTouchMode = false
            clipToPadding = false
            layoutParams = ViewGroup.MarginLayoutParams(MATCH_PARENT, WRAP_CONTENT)
        }
    }

}