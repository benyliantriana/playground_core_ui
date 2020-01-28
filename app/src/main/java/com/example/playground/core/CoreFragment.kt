package com.example.playground.core

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.playground.R
import kotlinx.android.synthetic.main.recycle_view.*

open class CoreFragment : Fragment() {
    var viewList: ArrayList<View> = arrayListOf()
    private lateinit var mAdapter: CoreAdapter

    private val countItem
        get() = mAdapter.itemAdapter.adapterItemCount

    private val listSize
        get() = viewList.size

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.recycle_view, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initDataViewList()
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
            setItemViewCacheSize(20)
        }
    }

    fun updateView() {
        val countItems = mAdapter.itemAdapter.adapterItemCount
        val listSize = viewList.size

        when {
            listSize == countItems -> updateItemAdapter()
            listSize > countItems -> addItemAdapter(viewList)
            else -> deleteItemAdapter()
        }
    }

    private fun initDataViewList() {
        viewList.clear()
    }

    private fun updateItemAdapter() {
        mAdapter.setNewData(viewList)
    }

    private fun addItemAdapter(listView: ArrayList<View>) {
//        Log.d("size_countitem", countItem.toString())
//        Log.d("size_listsize", listSize.toString())
        for (i in countItem until listSize) {
            mAdapter.addNewData(listView[i])
        }
    }

    private fun deleteItemAdapter() {
        // todo
    }
}