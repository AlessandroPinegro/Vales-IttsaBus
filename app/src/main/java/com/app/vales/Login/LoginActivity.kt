package com.app.vales.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.vales.MainActivity
import com.app.vales.R
import com.app.vales.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var bindig : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindig = ActivityLoginBinding.inflate(layoutInflater);
        setContentView(bindig.root)

        setupView()


    }
    fun setupView() {
        bindig.btnLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}