package com.example.playground.core_ui.atom

import android.view.View

abstract class Atom<T: Any> {

    abstract fun getView(): View
    abstract fun unBind()
    abstract fun render(data: T)
}