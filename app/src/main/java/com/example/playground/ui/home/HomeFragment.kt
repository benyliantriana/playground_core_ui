package com.example.playground.ui.home

import androidx.navigation.Navigation
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.core_ui.state.ButtonState
import com.example.playground.core_ui.state.TextState

class HomeFragment : CoreFragment() {
    override fun renderView() {

        for (i in 0..1) {
            if (i == 0) {
                mAdapter.setData(ButtonState.Normal("to fragment list") {
                    goToListText()
                }, ButtonAV::class.java.simpleName)
            }else {
                mAdapter.setData(TextState.Basic("arief"), TextViewAV::class.java.simpleName)
            }
        }

        mAdapter.reload()
    }

    private fun goToListText() {
        view?.let {
            val goToListText = HomeFragmentDirections.goToListText()
            Navigation.findNavController(it).navigate(goToListText)
        }
    }
}