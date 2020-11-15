package com.icoelloc.notasdroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.icoelloc.notasdroid.entidadesBD.ConexionBD

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val conexion = ConexionBD(this, "NOTASDROID_BD_LITE", null, 1)

        val botonIniciarSesion = findViewById<FloatingActionButton>(R.id.login_btn_login)
        botonIniciarSesion.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val botonRegistrarse = findViewById<FloatingActionButton>(R.id.login_btn_registrarse)
        botonRegistrarse.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}