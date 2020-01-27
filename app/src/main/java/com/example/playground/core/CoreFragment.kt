package com.example.playground.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.playground.R
import com.example.playground.core_ui.CoreAdapter
import kotlinx.android.synthetic.main.recycle_view.*

open class CoreFragment : Fragment() {
    var viewList: ArrayList<View> = arrayListOf()
    private lateinit var mAdapter: CoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recycle_view, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        renderView()
        setAdapter()
        renderRecyclerView()
    }

    open fun renderView() {}

    private fun setAdapter() {
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
        clearDataViewList()
        renderView()
        updateAdapter()
    }

    private fun clearDataViewList() {
        viewList.clear()
    }

    private fun updateAdapter() {
        mAdapter.apply {
            setNewData(viewList)
        }
    }

}