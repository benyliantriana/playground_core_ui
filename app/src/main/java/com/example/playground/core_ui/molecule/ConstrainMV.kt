package com.example.playground.core_ui.molecule

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import androidx.constraintlayout.widget.ConstraintLayout

open class ConstrainMV(context: Context) : View(context) {

    private val constraintLayout = ConstraintLayout(context)

    init {
        constraintLayout.apply {
            isFocusable = false
            isFocusableInTouchMode = false
            clipToPadding = false
            layoutParams = ViewGroup.MarginLayoutParams(MATCH_PARENT, WRAP_CONTENT)
        }
    }

    fun getConstraint() = constraintLayout
}