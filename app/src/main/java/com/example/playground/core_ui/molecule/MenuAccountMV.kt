package com.example.playground.core_ui.molecule

import android.content.Context
import android.view.View
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core.Atom
import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.core_ui.atom.TextViewMenuAV
import com.example.playground.utils.dp

class MenuAccountMV(context: Context) : Atom<MenuAccountMV.State>() {

    var state: State = State()
    private val constraint = ConstrainMV(context)
    private val labelAV = TextViewAV(context)
    private val dataAV = TextViewMenuAV(context)

    override fun render(state: State) {

        labelAV.apply {
            this.state.apply { text = state.textLabel }
        }

        dataAV.apply {
            this.state.apply {
                text = state.textData
                color = R.color.colorGrey
            }
        }

        constraint.apply {
            id = R.id.mv_menuaccount
            labelAV.textView.id = R.id.mv_menuaccount_textlabel
            dataAV.textView.id = R.id.mv_menuaccount_textdata

            setBackgroundColor(ContextCompat.getColor(context, R.color.colorWhite))
            setPadding(8.dp(), 8.dp(), 8.dp(), 8.dp())

            addView(labelAV.getView())
            addView(dataAV.getView())
        }

        ConstraintSet().also {
            it.clone(constraint)

            it.connect(labelAV.textView.id, ConstraintSet.START, constraint.id, ConstraintSet.START)
            it.connect(labelAV.textView.id, ConstraintSet.TOP, constraint.id, ConstraintSet.TOP)

            it.connect(dataAV.textView.id, ConstraintSet.END, constraint.id, ConstraintSet.END)
            it.connect(dataAV.textView.id, ConstraintSet.TOP, constraint.id, ConstraintSet.TOP)

            it.applyTo(constraint)
        }
    }

    override fun getView(): View {
        render(state)
        return constraint
    }

    override fun unBind() {
        state = State()
    }

    override fun getAtomState(): State? = state

    class State {
        var textLabel: String? = null
        var textData: String? = null
    }
}