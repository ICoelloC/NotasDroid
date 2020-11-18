package com.icoelloc.notasdroid

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory
import android.database.sqlite.SQLiteOpenHelper

class AlumnosDBHelper(context: Context?, name: String?, factory: CursorFactory?, version: Int) :
    SQLiteOpenHelper(context, name, factory, version) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("create table usuarios(codigo integer primary key autoincrement,usuario text,contrasena text,ciclo text,curso text)")
        db.execSQL("insert into usuarios values('admin','admin','2º','DAM')")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("create table usuarios(codigo integer primary key autoincrement,usuario text,contrasena text,ciclo text,curso text)")
        db.execSQL("insert into usuarios values('admin','admin','2º','DAM')")
    }
} //FIN DE LA CLASE DBHelper
