package com.example.playground.utils

import android.content.Context
import com.example.playground.core_ui.atom.Atom
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.core_ui.state.ButtonState
import com.example.playground.core_ui.state.State
import com.example.playground.core_ui.state.TextState

object AtomicHelper {
    fun <T: State> generateInstanceAtom(state: State, context: Context): Atom<T> {
        return when (state) {
            is TextState ->
                TextViewAV(context)
            is ButtonState ->
                ButtonAV(context)
            else -> TextViewAV(context)
        }
    }

    fun getAtomType(state: State): Int {
        return when (state) {
            is TextState->
                TextViewAV.type
            is ButtonState ->
                ButtonAV.type
            else ->
                0

        }
    }

}