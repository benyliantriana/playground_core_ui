package com.example.playground.core_ui.atom

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import com.example.playground.core_ui.state.ImageState
import com.example.playground.core_ui.state.State
import com.example.playground.utils.dp

class ImageAV<T: State>(context: Context) : Atom<T>() {

    val image = AppCompatImageView(context).apply {
       layoutParams = ViewGroup.LayoutParams(24.dp(), 24.dp())
    }

    override fun getView(): View = image

    override fun unBind() {

    }

    override fun render(data: T) {
        if (data is ImageState.Icon) {
            image.setImageResource(data.resId)
        }
    }

}