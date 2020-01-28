package com.example.playground.core_ui.molecule

import android.content.Context
import androidx.constraintlayout.widget.ConstraintSet
import com.example.playground.R
import com.example.playground.core_ui.atom.TextViewAV

class MenuAccountMV(context: Context) : ConstrainMV(context) {

    var textLabel: String? = null
    var textData: String? = null

    private val constrainLayout = getConstraint()

    private val TVLabel = TextViewAV(context).apply {
        id = R.id.mv_menuaccount_textlabel
        text = textLabel
    }.rootView

    private val TVData = TextViewAV(context).apply {
        text = textData
    }

    init {
        createComponent()
    }

    private fun createComponent() {

        constrainLayout.id = R.id.mv_menuaccount
        TVLabel.id = R.id.mv_menuaccount_textlabel

        constrainLayout.addView(TVLabel)

        ConstraintSet().also {
            it.clone(constrainLayout)
            it.connect(TVLabel.getId(), ConstraintSet.START, constrainLayout.id, ConstraintSet.START)
            it.applyTo(constrainLayout)
        }
    }

    fun getView() = constrainLayout
}