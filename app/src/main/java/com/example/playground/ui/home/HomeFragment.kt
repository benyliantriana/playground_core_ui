package com.example.playground.ui.home

import androidx.navigation.Navigation
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.core_ui.molecule.MenuAccountMV
import com.example.playground.core_ui.state.ButtonState
import com.example.playground.core_ui.state.MenuAccountState
import com.example.playground.core_ui.state.TextState

class HomeFragment : CoreFragment() {
    override fun renderView() {

       val data = arrayListOf (
           ButtonState.Normal("to fragment list") { goToListText() },
           MenuAccountState.Normal("arief", "maffrudin") { goToListText() }
       )
        coreAdapter.dispatch(data)
    }

    private fun goToListText() {
        view?.let {
            val goToListText = HomeFragmentDirections.goToListText()
            Navigation.findNavController(it).navigate(goToListText)
        }
    }
}