package com.icoelloc.notasdroid.entidadesBD

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.annotation.Nullable

class ConexionBD (@Nullable context: Context?, @Nullable name: String?, @Nullable factory: SQLiteDatabase.CursorFactory?, version: Int) :
    SQLiteOpenHelper(context, name, factory, version) {

    //Sentencia SQL para crear la tabla de Módulos
    private val MODULOS_DB = "Asignatura"
    private val CREATE_MODULO_DB = "CREATE TABLE $MODULOS_DB()"

    //Sentencia SQL para crear la tabla de Alumno
    private val ALUMNO_DB = "Alumno"

    override fun onCreate(db: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}