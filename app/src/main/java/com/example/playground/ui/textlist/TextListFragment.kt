package com.example.playground.ui.textlist

import com.example.playground.core.Atom
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

    private fun addTextView1(txtLabel: String, txtData: String): Atom<*> {
        return MenuAccountMV(requireContext()).apply {
            state.apply {
                textLabel = txtLabel
                textData = txtData
            }
        }
    }

    private fun dividerView(): Atom<*> {
        return DividerAV(requireContext()).apply {
            state.apply { height = 4 }
        }
    }
}