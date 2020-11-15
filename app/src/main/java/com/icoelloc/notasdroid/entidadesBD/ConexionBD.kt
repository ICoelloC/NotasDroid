package com.icoelloc.notasdroid.entidadesBD

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.annotation.Nullable

class ConexionBD (@Nullable context: Context?, @Nullable name: String?, @Nullable factory: SQLiteDatabase.CursorFactory?, version: Int) :
    SQLiteOpenHelper(context, name, factory, version) {

    //Sentencia SQL para crear la tabla de Alumno
    private val CREATE_ALUMNOS_TABLE =
        "CREATE TABLE $ALUMNOS_TABLE (CORREO TEXT PRIMARY KEY, CONTRASENIA TEXT," +
                " NOMBRE_APELLIDOS TEXT, FOTO TEXT, CICLO TEXT, CURSO TEXT)"
    private val DELETE_ALUMNOS_TABLE = "DROP TABLE IF EXISTS $ALUMNOS_TABLE"

    //SENTECIA SQL PARA CREAR LA TABLA DE MODULOS
    private val CREATE_MODULOS_TABLE =
        "CREATE TABLE $MODULOS_TABLE (NOMBRE_MODULO TEXT PRIMARY KEY, CICLO TEXT, CURSO TEXT," +
                " FOTO_MODULO TEXT)"
    private val DELETE_MODULOS_TABLE = "DROP TABLE IF EXISTS $MODULOS_TABLE"

    //SENTECIA SQL PARA CREAR LA TABLA DE EXAMENES
    private val CREATE_EXAMENES_TABLE =
        "CREATE TABLE $EXAMENES_TABLE (TITULO_EXAMEN TEXT PRIMARY KEY, NOMBRE_MODULO TEXT," +
                " DIA INTEGER, MES INTEGER, ANIO INTEGER, PRESENTADO INTEGER, NOTA DECIMAL(3,2))"
    private val DELETE_EXAMENES_TABLE = "DROP TABLE IF EXISTS $EXAMENES_TABLE"

    /**
     * Crea la base de datos con las siguientes tablas
     * @param db Es la referencia a la Base de datos SQLite
     */
    override fun onCreate(db: SQLiteDatabase) {
        //Al llamar al onCreate :
        db.execSQL(CREATE_ALUMNOS_TABLE)
        db.execSQL(CREATE_MODULOS_TABLE)
        db.execSQL(CREATE_EXAMENES_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL(DELETE_ALUMNOS_TABLE)
        db.execSQL(DELETE_MODULOS_TABLE)
        db.execSQL(DELETE_EXAMENES_TABLE)
        onCreate(db)
    }

    companion object{
        val ALUMNOS_TABLE = "ALUMNOS"
        val MODULOS_TABLE = "MODULOS"
        val EXAMENES_TABLE = "EXAMENES"
    }

}