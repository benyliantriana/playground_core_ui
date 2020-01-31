package com.example.playground.utils

import android.content.Context
import android.util.Log
import com.example.playground.core_ui.atom.Atom
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.TextViewAV

object AtomicHelper {
    fun <T: Atom> generateInstanceAtom(kclass: Class<T>, context: Context): Atom {
//        Log.d("AF", "name ${element.javaClass.simpleName}")
        return when (kclass) {
            TextViewAV::class ->
                TextViewAV(context)
            ButtonAV::class ->
                ButtonAV(context)
            else ->
                TextViewAV(context)
        }
    }
}