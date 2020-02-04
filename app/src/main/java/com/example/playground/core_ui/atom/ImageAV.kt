package com.example.playground.core_ui.atom

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import com.example.playground.core.Atom

class ImageAV(context: Context) : Atom<ImageAV.State>() {

    var state: State = State()

    var imageView = AppCompatImageView(context)

    override fun getView(): View {
        render(state)
        return imageView
    }

    override fun unBind() {
        state = State()
    }

    override fun render(state: State) {
        val param = ViewGroup.LayoutParams(state.width, state.height)
        imageView.apply {
            state.imagePath?.let {
                setImageResource(it)
            }
            layoutParams = param
        }
    }

    override fun getAtomState(): State? {
        return state
    }

    class State {
        var imagePath: Int? = null
        var width: Int = 0
        var height: Int = 0
    }

}