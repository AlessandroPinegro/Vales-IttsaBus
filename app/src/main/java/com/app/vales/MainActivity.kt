package com.app.vales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.app.vales.databinding.ActivityMainBinding
import com.app.vales.menu.MenuPrincipalFragment
import com.app.vales.service.FragmentService

class MainActivity : AppCompatActivity(), FragmentService {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.verMenuPrincipalFragment()
    }

    private fun showFragment(fragment: Fragment) {
        val ft = supportFragmentManager
            .beginTransaction()
            .replace(binding.mainFragmentPlaceholder.id, fragment)
            .addToBackStack(null)
        ft.commit()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        supportFragmentManager.executePendingTransactions()
        val currentFragment =
            supportFragmentManager.findFragmentById(binding.mainFragmentPlaceholder.id)

      /*  if (currentFragment is LoginFragment) {
            finishAffinity()
        }else if (currentFragment is ProductosAsignadosFragment||currentFragment is LecturaMasivaFragment||currentFragment is ReconteoProductosFragment){
            this.verMantenedorFragment()
        }else if (currentFragment is MantendorFragment) {
            finishAffinity()
        }*/
    }

    override fun verMenuPrincipalFragment() {
        val showFragment: MenuPrincipalFragment? = MenuPrincipalFragment().newInstance()
        showFragment(showFragment!!)
    }
}