package com.app.vales.modulos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.vales.R

class ModuloSucursalFragment : Fragment() {
    fun newInstance(): ModuloSucursalFragment? {
        return ModuloSucursalFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_modulo_sucursal, container, false)
    }

}