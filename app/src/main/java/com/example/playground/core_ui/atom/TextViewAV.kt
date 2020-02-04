package com.example.playground.core_ui.atom

import android.content.Context
import android.view.Gravity
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import com.example.playground.R
import com.example.playground.core_ui.state.State
import com.example.playground.core_ui.state.TextState
import com.example.playground.utils.sp


class TextViewAV<S: State> (context: Context, style: Style = Subhead) : Atom<S>() {

    private var textPrimary: Int = ContextCompat.getColor(context, R.color.text_primary)
    private var textSecondary: Int = ContextCompat.getColor(context, R.color.text_secondary)
    private var textViewAV: AppCompatTextView

    init {
      textViewAV =  AppCompatTextView(context).apply {
          id = id
          if (style == Title) {
              textSize = 14f
              setTextColor(textPrimary)
          } else if (style == Subhead) {
              textSize = 12f
              setTextColor(textSecondary)
          }
          gravity = Gravity.CENTER
        }
    }

    override fun getView(): View = textViewAV

    override fun unBind() {

    }


    override fun render(data: S) {
        if (data is TextState) {
            textViewAV.text = data.text
        }
    }

    companion object {
        const val type = 11
    }

}

sealed class Style
object Title : Style()
object Subhead : Style()
object Caption : Style()




