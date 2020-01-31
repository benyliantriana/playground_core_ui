package com.example.playground.ui.home

import android.view.View
import androidx.navigation.Navigation
import com.example.playground.core.CoreAdapter
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.DividerAV
import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.core_ui.holder.ViewGroupHolder

class HomeFragment : CoreFragment() {
    override fun renderView() {

        viewList.addAll(
            listOf("sample data", "sample data 1")

           /* listOf(
                addButton(
                    label = "List Text 1",
                    action = { goToListText() }),
                dividerView(),
                addButton(
                    label = "Menu",
                    action = { goToListText() })
            )*/
        )
       mAdapter.setData()

    }

    private fun goToListText() {
        view?.let {
            val goToListText = HomeFragmentDirections.goToListText()
            Navigation.findNavController(it).navigate(goToListText)
        }
    }
}