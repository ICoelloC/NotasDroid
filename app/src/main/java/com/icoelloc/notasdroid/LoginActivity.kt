package com.icoelloc.notasdroid

import android.content.Intent
import android.database.Cursor
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    //creamos la variables locales
    lateinit var correo: EditText
    lateinit var contrasenia: EditText
    private lateinit var fila: Cursor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //emperejamos las variable con el xml
        correo = findViewById<View>(R.id.login_mail) as EditText
        contrasenia = findViewById<View>(R.id.login_pass) as EditText
    }

    //metodo de ingreso
    fun ingresar(v: View?) {
        val admin = AlumnosDBHelper(this, "NOTASDROID", null, 1)
        val db = admin.writableDatabase
        val usuario = correo!!.text.toString()
        val contrasena = contrasenia!!.text.toString()
        fila = db.rawQuery(
            "select usuario,contrasena from usuarios where usuario='$usuario' and contrasena='$contrasena'",
            null
        )
        //preguntamos si el cursor tiene algun valor almacenado
        if (fila.moveToFirst()) {

            //capturamos los valores del cursos y lo almacenamos en variable
            val usua = fila.getString(0)
            val pass = fila.getString(1)

            //preguntamos si los datos ingresados son iguales
            if (usuario == usua && contrasena == pass) {

                //si son iguales entonces vamos a otra ventana

                //Menu es una nueva actividad empty
                val ven = Intent(this, MainActivity::class.java)
                startActivity(ven)

                //limpiamos las las cajas de texto
                correo!!.setText("")
                contrasenia!!.setText("")
            }
        }
    }
} //FIN DE LA CLASE MAIN.
