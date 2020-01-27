package com.example.playground.ui.home

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.DividerAV

class HomeFragment : CoreFragment() {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        renderView()
    }

    override fun renderView() {
        viewList.addAll(
            listOf(
                addButton(
                    label = "List Text 1",
                    action = { goToListText() }),
                dividerView(),
                addButton(
                    label = "Menu",
                    action = { goToListText() })
            )
        )
    }

    private fun addButton(
        label: String,
        action: () -> Unit
    ): View {
        return ButtonAV(requireContext()).apply {
            buttonAV.text = label
            buttonAV.setOnClickListener { action() }
        }.getView()
    }

    private fun dividerView(): View {
        return DividerAV(requireContext()).getView()
    }

    private fun goToListText() {
        view?.let {
            val goToListText = HomeFragmentDirections.goToListText()
            Navigation.findNavController(it).navigate(goToListText)
        }
    }
}