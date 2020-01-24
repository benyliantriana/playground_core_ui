package com.example.playground.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.playground.R
import com.example.playground.core_ui.CoreAdapter
import com.example.playground.core_ui.TextViewAV
import com.example.playground.core_ui.ViewGroupHolder
import com.mikepenz.fastadapter.FastAdapter
import kotlinx.android.synthetic.main.recycle_view.*

class HomeFragment : Fragment() {

    private var viewList: ArrayList<View> = arrayListOf()
    private lateinit var adapter: FastAdapter<ViewGroupHolder>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recycle_view, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListData()
        initAdapter()
        renderRecyclerView()
    }

    private fun initListData() {
        for (i in 1..100) {
            viewList.add(addTextView1(i))
        }
    }

    private fun initAdapter() {
        adapter = CoreAdapter(viewList).adapter
    }

    private fun renderRecyclerView() {
        recyclew_view.layoutManager = LinearLayoutManager(requireContext())
        recyclew_view.adapter = adapter
    }

    private fun addTextView1(i: Int): View {
        return TextViewAV(requireContext()).apply {
            textViewAV.text = "textView $i"
            textViewAV.setTextColor(resources.getColor(R.color.colorWhite))
        }.getView()
    }

}