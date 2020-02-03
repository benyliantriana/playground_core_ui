package com.example.playground.core_ui.state

sealed class State

sealed class TextState : State() {
    data class Basic(val text: String): TextState()
}

sealed class ButtonState: State() {
    data class Normal(val text: String, val action: () -> Unit?): ButtonState()
}