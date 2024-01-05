package com.app.vales.modulos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.vales.R
import com.app.vales.menu.MenuPrincipalFragment

class ModuloAdministradorFragment : Fragment() {
    fun newInstance(): ModuloAdministradorFragment? {
        return ModuloAdministradorFragment()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_modulo_administrador, container, false)
    }
}