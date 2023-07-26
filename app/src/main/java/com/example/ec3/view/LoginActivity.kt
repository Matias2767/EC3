package com.example.ec3.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.ec3.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mostrarLogin()
    }

    private fun mostrarLogin(){
        binding.tilEmail.editText?.addTextChangedListener {text ->
            binding.btnLogin.isEnabled = validarEntrada(text.toString(), binding.tilPassword.editText?.text.toString())
        }
        binding.tilPassword.editText?.addTextChangedListener {text ->
            binding.btnLogin.isEnabled = validarEntrada(binding.tilEmail.editText?.text.toString(), text.toString())
        }
        binding.btnLogin.setOnClickListener{
            val email = binding.tilEmail.editText?.text.toString()
            val password = binding.tilPassword.editText?.text.toString()
            if (validarDatos(email, password)) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validarEntrada(email: String, password: String): Boolean{
        val isEmailOk = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val isPasswordOk = password.length >= 6
        return isPasswordOk && isEmailOk
    }

    private fun validarDatos(email: String, password: String): Boolean{
        val isEmailOk = email == "ejemplo@idat.edu.pe"
        val isPasswordOk = password == "123456"
        return isPasswordOk && isEmailOk
    }
}