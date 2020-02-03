package com.example.playground.utils

import android.content.Context
import android.util.Log
import com.example.playground.core_ui.atom.Atom
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.TextViewAV
import java.util.*

object AtomicHelper {
    fun generateInstanceAtom(kclass: String, context: Context): Atom {
        return when (kclass) {
            TextViewAV::class.simpleName ->
                TextViewAV(context)
            ButtonAV::class.simpleName ->
                ButtonAV(context)
            else ->
                TextViewAV(context)
        }
    }
}