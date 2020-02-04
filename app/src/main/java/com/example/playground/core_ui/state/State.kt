package com.example.playground.core_ui.state

sealed class State

data class TextState(val text: String) : State()

sealed class ButtonState: State() {
    data class Normal(val text: String, val action: () -> Unit?): ButtonState()
}

object Empty: State()

sealed class MenuAccountState: State() {
    data class Normal(val left: String, val right: String, val action: ()-> Unit?): MenuAccountState()
}