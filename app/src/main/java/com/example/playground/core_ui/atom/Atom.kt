package com.example.playground.core_ui.atom

import android.view.View

abstract class Atom {

    abstract fun getView(): View
    abstract fun unBind()
    abstract fun render(data: Any)
}