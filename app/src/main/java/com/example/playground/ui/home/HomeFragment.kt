package com.example.playground.ui.home

import androidx.navigation.Navigation
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.core_ui.state.ButtonState
import com.example.playground.core_ui.state.TextState

class HomeFragment : CoreFragment() {
    override fun renderView() {

        mAdapter.setData(
            state = ButtonState.Normal("to fragment list") {
            goToListText()
        }, classItemName = ButtonAV::class.java.simpleName)

        mAdapter.setData(
            state = TextState.Basic("arief"),
            classItemName = TextViewAV::class.java.simpleName)

        mAdapter.reload()
    }

    private fun goToListText() {
        view?.let {
            val goToListText = HomeFragmentDirections.goToListText()
            Navigation.findNavController(it).navigate(goToListText)
        }
    }
}