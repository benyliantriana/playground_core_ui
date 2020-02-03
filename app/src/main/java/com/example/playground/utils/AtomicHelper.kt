package com.example.playground.utils

import android.content.Context
import com.example.playground.core_ui.atom.Atom
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.core_ui.state.State

object AtomicHelper {
    fun <T: State> generateInstanceAtom(kClass: String, context: Context): Atom<T> {
        return when (kClass) {
            TextViewAV::class.simpleName ->
                TextViewAV(context)
            ButtonAV::class.simpleName ->
                ButtonAV(context)
            else ->
                TextViewAV(context)
        }
    }

    fun getAtomType(kclass: String): Int {
        return when (kclass) {
            TextViewAV::class.simpleName ->
                TextViewAV.type
            ButtonAV::class.simpleName ->
                ButtonAV.type
            else ->
                0
        }
    }

}