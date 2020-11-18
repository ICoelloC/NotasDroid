package com.icoelloc.notasdroid;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class cl extends AppCompatActivity {

    //creamos la variables locales
    EditText correo,contrasenia;
    private Cursor fila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //emperejamos las variable con el xml
        correo= (EditText) findViewById(R.id.login_mail);
        contrasenia= (EditText) findViewById(R.id.login_pass);
    }
    //metodo de ingreso
    public void ingresar(View v){
        AlumnosDBHelper admin=new AlumnosDBHelper(this,"NOTASDROID",null,1);
        SQLiteDatabase db=admin.getWritableDatabase();

        String usuario=correo.getText().toString();
        String contrasena=contrasenia.getText().toString();
        fila=db.rawQuery("select usuario,contrasena from usuarios where usuario='"+usuario+"' and contrasena='"+contrasena+"'",null);
        //preguntamos si el cursor tiene algun valor almacenado
        if(fila.moveToFirst()==true){

            //capturamos los valores del cursos y lo almacenamos en variable
            String usua=fila.getString(0);
            String pass=fila.getString(1);

            //preguntamos si los datos ingresados son iguales
            if (usuario.equals(usua)&&contrasena.equals(pass)){

                //si son iguales entonces vamos a otra ventana

                //Menu es una nueva actividad empty
                Intent ven=new Intent(this,MainActivity.class);
                startActivity(ven);

                //limpiamos las las cajas de texto
                correo.setText("");
                contrasenia.setText("");
            }

        }
    }


}//FIN DE LA CLASE MAIN.