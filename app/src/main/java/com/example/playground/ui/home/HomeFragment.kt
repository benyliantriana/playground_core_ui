package com.example.playground.ui.home

import android.util.Log
import androidx.navigation.Navigation
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.DataPassing
import com.example.playground.core_ui.atom.TextViewAV

class HomeFragment : CoreFragment() {
    override fun renderView() {


            mAdapter.setData("arief", TextViewAV::class.java.simpleName)

        mAdapter.setData(DataPassing("to fragment list") {
            goToListText()
        }, ButtonAV::class.java.simpleName)

    }

    private fun goToListText() {
        view?.let {
            Log.d("AF", "go to list")
            val goToListText = HomeFragmentDirections.goToListText()
            Navigation.findNavController(it).navigate(goToListText)
        }
    }
}