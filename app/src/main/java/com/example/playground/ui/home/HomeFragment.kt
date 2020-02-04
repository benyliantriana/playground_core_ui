package com.example.playground.ui.home

import androidx.navigation.Navigation
import com.example.playground.core.Atom
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV

class HomeFragment : CoreFragment() {

    var text: String = "Test Random Number 1"

    override fun renderView() {
        viewList.addAll(
            listOf(
                addButton(text, action = { editText() }),
                addButton("Menu", action = { goToListText() })
            )
        )
    }

    private fun addButton(
        label: String,
        action: () -> Unit
    ): Atom<*> {
        return ButtonAV(requireContext()).apply {
            state.apply {
                text = label
                onClick = { action() }
            }
        }
    }

//    private fun dividerView(): View {
//        return DividerAV(requireContext())
//    }

    private fun goToListText() {
        view?.let {
            val goToListText = HomeFragmentDirections.goToListText()
            Navigation.findNavController(it).navigate(goToListText)
        }
    }

    private fun editText() {
        text = "Test Random Number " + (1..100).random()
        updateView()
    }
}