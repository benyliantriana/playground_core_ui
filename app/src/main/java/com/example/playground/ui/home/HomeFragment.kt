package com.example.playground.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.playground.R
import com.example.playground.core_ui.TextViewAV
import kotlinx.android.synthetic.main.recycle_view.*

class HomeFragment : Fragment() {

    private var viewList: ArrayList<View> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recycle_view, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        addTextView1()
        addTextView2()
        addTextView3()
        addTextView4()
        renderView()
    }

    private fun addTextView1() {
        viewList.add(TextViewAV(requireContext()).apply {
            textViewAV.text = "textView 1"
            textViewAV.setTextColor(resources.getColor(R.color.colorWhite))
        }.getView())
    }

    private fun addTextView2() {
        viewList.add(TextViewAV(requireContext()).apply {
            textViewAV.text = "textView 2"
            textViewAV.setTextColor(resources.getColor(R.color.colorWhite))
        }.getView())
    }

    private fun addTextView3() {
        viewList.add(TextViewAV(requireContext()).apply {
            textViewAV.text = "textView 3"
            textViewAV.setTextColor(resources.getColor(R.color.colorWhite))
        }.getView())
    }

    private fun addTextView4() {
        viewList.add(TextViewAV(requireContext()).apply {
            textViewAV.text = "textView 4"
            textViewAV.setTextColor(resources.getColor(R.color.colorWhite))
        }.getView())
    }

    private fun renderView() {
        viewList.map {
            linear_layout.addView(it)
        }
    }

}