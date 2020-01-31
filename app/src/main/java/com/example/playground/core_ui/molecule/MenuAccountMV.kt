package com.example.playground.core_ui.molecule

import android.content.Context
import android.view.View
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.utils.dp

class MenuAccountMV(context: Context) : ConstrainMV(context) {

    var textLabel: String? = null
    var textData: String? = null

    private val TVLabel = TextViewAV(context).apply {
        id = R.id.mv_menuaccount_textlabel
        text = textLabel
    }

    private val TVData = TextViewAV(context).apply {
        text = textData
    }

    init {
        createComponent()
    }

    private fun createComponent() {

        id = R.id.mv_menuaccount
        TVLabel.id = R.id.mv_menuaccount_textlabel
        TVData.id = R.id.mv_menuaccount_textdata

        setBackgroundColor(ContextCompat.getColor(context, R.color.colorWhite))
        setPadding(8.dp(), 8.dp(), 8.dp(), 8.dp())

        addView(TVLabel)
        addView(TVData)

        ConstraintSet().also {
            it.clone(this)

            it.connect(TVLabel.id, ConstraintSet.START, this.id, ConstraintSet.START)
            it.connect(TVLabel.id, ConstraintSet.TOP, this.id, ConstraintSet.TOP)

            it.connect(TVData.id, ConstraintSet.END, this.id, ConstraintSet.END)
            it.connect(TVData.id, ConstraintSet.TOP, this.id, ConstraintSet.TOP)

            it.applyTo(this)
        }
    }

    private fun setData() {
        TVLabel.text = textLabel
        TVData.text = textData
    }

    fun getView(): View {
        setData()
        return this
    }
}