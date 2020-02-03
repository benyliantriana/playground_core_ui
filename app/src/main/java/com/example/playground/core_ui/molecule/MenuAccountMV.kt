package com.example.playground.core_ui.molecule

import android.content.Context
import androidx.constraintlayout.widget.ConstraintSet
import com.example.playground.R
import com.example.playground.core_ui.atom.TextViewAV

class MenuAccountMV(context: Context) : ConstrainMV(context) {

    var textLabel: String? = null
    var textData: String? = null

    private val constrainLayout = getConstraint()

//    private val TVLabel = TextViewAV(context).apply {
//        id = R.id.av_textview
//        text = textLabel
//    }

   /* private val TVData = TextViewAV(context).apply {
//        text = textData
    }

    init {
        createComponent()
    }

    private fun createComponent() {

        constrainLayout.id = R.id.mv_menuaccount
//        constrainLayout.addView(TVLabel)
//        constrainLayout.addView(TVData)

        ConstraintSet().apply {
            clone(constrainLayout)
//            it.connect(TVLabel.getTextViewId(), ConstraintSet.START, TVLabel.getTextViewId(), ConstraintSet.TOP)
            applyTo(constrainLayout)
        }
    }

    fun getView() = constrainLayout*/
}