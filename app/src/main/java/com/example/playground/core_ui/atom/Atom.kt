package com.example.playground.core_ui.atom

import android.view.View
import com.example.playground.core_ui.state.State

abstract class Atom<T: State> {

    abstract fun getView(): View
    abstract fun unBind()
    abstract fun render(data: T)
}