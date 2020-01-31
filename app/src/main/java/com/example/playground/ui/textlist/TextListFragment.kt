package com.example.playground.ui.textlist

import android.view.View
import com.example.playground.core.CoreFragment
import com.example.playground.core_ui.atom.DividerAV
import com.example.playground.core_ui.molecule.MenuAccountMV

class TextListFragment : CoreFragment() {

    override fun renderView() {
        viewList.add(addTextView1("Tipe Akun", "Full Service"))
        viewList.add(addTextView1("LinkAja Syariah", "Tidak Aktif"))
        viewList.add(addTextView1("Metode Pembayaran", ""))
        viewList.add(addTextView1("LinkAja TAP", "Belum diatur"))
        viewList.add(dividerView())
        viewList.add(addTextView1("Tipe Akun", "Full Service"))
        viewList.add(addTextView1("LinkAja Syariah", "Tidak Aktif"))
        viewList.add(addTextView1("Metode Pembayaran", ""))
        viewList.add(addTextView1("LinkAja TAP", "Belum diatur"))

    }

    private fun addTextView1(txtLabel: String, txtData: String): View {
        return MenuAccountMV(requireContext()).apply {
            textLabel = txtLabel
            textData = txtData
        }.getView()
    }

    private fun dividerView(): View {
        return DividerAV(requireContext())
    }
}