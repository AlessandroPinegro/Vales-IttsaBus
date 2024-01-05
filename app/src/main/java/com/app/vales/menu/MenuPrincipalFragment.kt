package com.app.vales.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.vales.MainActivity
import com.app.vales.R
import com.app.vales.databinding.FragmentMenuPrincipalBinding


class MenuPrincipalFragment : Fragment() {

     private var _binding  : FragmentMenuPrincipalBinding? = null
    private val   binding get() =  _binding!!
    fun newInstance(): MenuPrincipalFragment? {
        return MenuPrincipalFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuPrincipalBinding.inflate(inflater, container, false)
        setupView()
        confIU()
        return binding.root
    }
     fun setupView() {
         binding.btnSucursal.setOnClickListener{
             (activity as MainActivity?)!!.verModuloSucursalFragment()
         }

     }
     fun confIU() {

     }

}