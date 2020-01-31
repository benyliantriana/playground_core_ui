package com.example.playground.ui.home

import android.view.View
import androidx.navigation.Navigation
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.DividerAV

class HomeFragment : CoreFragment() {

    override fun renderView() {
        viewList.addAll(
            listOf(
                addButton("List Text 1", action = { goToListText() }),
                dividerView(),
                addButton("Menu", action = { goToListText() }),
                dividerView()
            )
        )
    }

    private fun addButton(
        label: String,
        action: () -> Unit
    ): View {
        return ButtonAV(requireContext()).apply {
            text = label
            onClick = { action() }
        }
    }

    private fun dividerView(): View {
        return DividerAV(requireContext())
    }

    private fun goToListText() {
        view?.let {
            val goToListText = HomeFragmentDirections.goToListText()
            Navigation.findNavController(it).navigate(goToListText)
        }
    }
}