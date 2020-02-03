package com.example.playground.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.playground.R
import com.example.playground.core_ui.atom.Atom
import com.example.playground.core_ui.atom.ButtonAV
import com.example.playground.core_ui.atom.TextViewAV
import kotlinx.android.synthetic.main.recycle_view.*

open class CoreFragment : Fragment() {
    var viewList: ArrayList<Any> = arrayListOf()
     lateinit var mAdapter: CoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recycle_view, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initDataViewList()
        setAdapter()
        renderView()
        renderRecyclerView()
    }

    open fun renderView(){}

    open fun setAdapter() {
        mAdapter = CoreAdapter(viewList)
    }

    private fun renderRecyclerView() {
        recyclew_view?.apply {
            layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
            itemAnimator = null
            adapter = mAdapter
        }
    }

    fun updateView() {
        initDataViewList()
        renderView()
        updateAdapter()
    }

    private fun initDataViewList() {
        viewList.clear()
    }

    private fun updateAdapter() {
        mAdapter.apply {
            //setNewData(viewList)
        }
    }

}