package com.app.vales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.app.vales.Login.LoginActivity
import com.app.vales.databinding.ActivityMainBinding
import com.app.vales.menu.MenuPrincipalFragment
import com.app.vales.modulos.ModuloAdministradorFragment
import com.app.vales.modulos.ModuloSucursalFragment
import com.app.vales.service.FragmentService

class MainActivity : AppCompatActivity(), FragmentService {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.verMenuPrincipalFragment()
        supportFragmentManager.popBackStack(
            LoginActivity::class.java.simpleName,
            FragmentManager.POP_BACK_STACK_INCLUSIVE
        )
    }

    private fun showFragment(fragment: Fragment) {
        val ft = supportFragmentManager
            .beginTransaction()
            .replace(binding.mainFragmentPlaceholder.id, fragment)
            .addToBackStack(null)
        ft.commit()
    }

    override fun onBackPressed() {
        supportFragmentManager.executePendingTransactions()
        val currentFragment =
            supportFragmentManager.findFragmentById(binding.mainFragmentPlaceholder.id)

        if (currentFragment is ModuloAdministradorFragment) {
            this.verMenuPrincipalFragment();
        } else {
            super.onBackPressed()
        }
    }

    override fun verMenuPrincipalFragment() {
        val showFragment: MenuPrincipalFragment? = MenuPrincipalFragment().newInstance()
        showFragment(showFragment!!)
    }

    override fun verModuloAdministradorFragment() {
        val showFragment: ModuloAdministradorFragment? = ModuloAdministradorFragment().newInstance()
        showFragment(showFragment!!)
    }

    override fun verModuloSucursalFragment() {
        val showFragment: ModuloSucursalFragment? = ModuloSucursalFragment().newInstance()
        showFragment(showFragment!!)
    }


}