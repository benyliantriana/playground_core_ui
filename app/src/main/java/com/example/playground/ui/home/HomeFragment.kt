package com.example.playground.ui.home

import android.util.Log
import android.view.View
import androidx.navigation.Navigation
import com.example.playground.core.CoreAdapter
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.DataPassing
import com.example.playground.core_ui.atom.DividerAV
import com.example.playground.core_ui.atom.TextViewAV
import com.example.playground.core_ui.holder.ViewGroupHolder

class HomeFragment : CoreFragment() {
    override fun renderView() {

        viewList.addAll(
            listOf(
                DataPassing("sample data list") {
                    goToListText()
                },
                DataPassing("sample data 1") {
                    goToListText()
                }
            )
        )

       mAdapter.setData(ButtonAV::class.java.simpleName)

    }

    private fun goToListText() {
        view?.let {
            Log.d("AF", "go to list")
            val goToListText = HomeFragmentDirections.goToListText()
            Navigation.findNavController(it).navigate(goToListText)
        }
    }
}