package com.example.playground.core_ui.molecule

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core_ui.atom.*
import com.example.playground.core_ui.state.ImageState
import com.example.playground.core_ui.state.MenuAccountState
import com.example.playground.core_ui.state.State
import com.example.playground.core_ui.state.TextState
import com.example.playground.utils.dp

class MenuAccountMV<T: State>(context: Context) : Atom<T>() {

    private val textLeft = TextViewAV<TextState>(context, Title)
    private val textRight = TextViewAV<TextState>(context, Subhead)
    private val iconAtom = ImageAV<ImageState>(context)

    private val constraintLayout: ConstraintLayout = ConstraintLayout(context).apply {
        isFocusable = false
        isFocusableInTouchMode = false
        clipToPadding = false
        layoutParams = ViewGroup.MarginLayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ).apply {
            setMargins(0, 4.dp(), 0, 0)
        }
        background = ContextCompat.getDrawable(context, R.color.colorWhite)
        setPadding(16.dp(), 8.dp(), 16.dp(), 8.dp())

    }

    init {
        combineView()
    }

    private fun combineView() {
        val viewLeft = textLeft.getView().apply {
            id = View.generateViewId()
        }
        val viewRight = textRight.getView().apply {
            id = View.generateViewId()
        }

        val icon = iconAtom.getView().apply {
            id = View.generateViewId()
        }

        constraintLayout.addView(viewLeft, 0)
        constraintLayout.addView(viewRight, 1)
        constraintLayout.addView(icon, 2)

        val constraintSet = ConstraintSet()
        constraintSet.clone(constraintLayout)
        constraintSet.connect(viewLeft.id, ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 0)
        constraintSet.connect(icon.id, ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT, 0)
        constraintSet.connect(viewRight.id, ConstraintSet.RIGHT, icon.id, ConstraintSet.LEFT, 0)
        constraintSet.applyTo(constraintLayout)

    }

    override fun getView(): View = constraintLayout

    override fun unBind() {

    }

    override fun render(data: T) {
        if (data is MenuAccountState.Normal) {
            textLeft.render(TextState(data.left))
            textRight.render(TextState(data.right))
            iconAtom.render(ImageState.Icon(R.drawable.ic_chevron_right))
        }
    }

    companion object {
        const val type = 12
    }


}