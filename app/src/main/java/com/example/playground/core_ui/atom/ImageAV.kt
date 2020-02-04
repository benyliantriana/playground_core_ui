package com.example.playground.core_ui.atom

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatImageView
import com.example.playground.core.Atom

class ImageAV(context: Context) : Atom<ImageAV.State>() {

    private var state: State = State()

    private var imageView = AppCompatImageView(context).apply {
        layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT)
    }

    override fun getView(): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unBind() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun render(state: ImageAV.State) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAtomState(): ImageAV.State? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class State {
        var imagePath: Int? = null
    }

}