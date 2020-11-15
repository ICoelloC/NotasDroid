package com.icoelloc.notasdroid.entidadesBD

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.os.strictmode.SqliteObjectLeakedViolation
import android.util.Log
import com.icoelloc.notasdroid.R

object ModulosController {
    private const val  NOMRBE_BD = "NOTASDROID_BD_LITE"
    private const val  VERSION_BD = 1

    fun initModulos(): MutableList<Modulos> {
        val modulos = mutableListOf<Modulos>() //lista de modulos
        //DAM 1º
        modulos.add(Modulos("DAM", "1º","SISTEMAS INFORMATICOS", R.drawable.ic_modulos_sistemasinformaticos))
        modulos.add(Modulos("DAM", "1º","BASES DE DATOS", R.drawable.ic_modulos_basedatos))
        modulos.add(Modulos("DAM", "1º","PROGRAMACION", R.drawable.ic_modulos_programacion))
        modulos.add(Modulos("DAM", "1º","LENGUAJE DE MARCAS", R.drawable.ic_modulos_lm))
        modulos.add(Modulos("DAM", "1º","ENTORNOS DE DESARROLLO", R.drawable.ic_modulos_ed))
        modulos.add(Modulos("DAM", "1º","INGLES", R.drawable.ic_modulos_ingles))
        modulos.add(Modulos("DAM", "1º","FOL", R.drawable.ic_modulos_eie_fol))
        //DAM 2º
        modulos.add(Modulos("DAM", "2º","ACCESO A DATOS", R.drawable.ic_modulos_accdat))
        modulos.add(Modulos("DAM", "2º","DES. INTERFACES", R.drawable.ic_modulo_desint))
        modulos.add(Modulos("DAM", "2º","PROG. MULT. DISP. MOV", R.drawable.ic_modulos_pmydp))
        modulos.add(Modulos("DAM", "2º","PROG. SERV. PROC.", R.drawable.ic_modulos_psp))
        modulos.add(Modulos("DAM", "2º","SIST. GEST. EMP.", R.drawable.ic_modulos_sistgestemp))
        modulos.add(Modulos("DAM", "2º","EIE", R.drawable.ic_modulos_eie_fol))

        //DAW 1º
        modulos.add(Modulos("DAW", "1º","PROGRAMACION", R.drawable.ic_modulos_sistemasinformaticos))
        modulos.add(Modulos("DAW", "1º","BASES DE DATOS", R.drawable.ic_modulos_basedatos))
        modulos.add(Modulos("DAW", "1º","PROGRAMACION", R.drawable.ic_modulos_programacion))
        modulos.add(Modulos("DAW", "1º","LENGUAJE DE MARCAS", R.drawable.ic_modulos_lm))
        modulos.add(Modulos("DAW", "1º","ENTORNOS DE DESARROLLO", R.drawable.ic_modulos_ed))
        modulos.add(Modulos("DAW", "1º","INGLES", R.drawable.ic_modulos_ingles))
        modulos.add(Modulos("DAW", "1º","FOL", R.drawable.ic_modulos_eie_fol))
        //DAW 2º
        modulos.add(Modulos("DAW", "2º","DES. WEB. ENT. SERVIDOR", R.drawable.ic_modulos_dwes))
        modulos.add(Modulos("DAW", "2º","DES. WEB. ENT. CLIENTE", R.drawable.ic_modulos_dwec))
        modulos.add(Modulos("DAW", "2º","DESP. APPS. WEB", R.drawable.ic_modulos_dap))
        modulos.add(Modulos("DAW", "2º","DIS. INTERF. WEB", R.drawable.ic_modulos_diw))
        modulos.add(Modulos("DAW", "2º","EIE", R.drawable.ic_modulos_eie_fol))

        //ASIR 1º
        modulos.add(Modulos("ASIR", "1º","IMP. SSSOO", R.drawable.ic_modulos_impssoo))
        modulos.add(Modulos("ASIR", "1º","PLAN. ADMIN. REDES", R.drawable.ic_modulos_pladre))
        modulos.add(Modulos("ASIR", "1º","FUND. HARDWARE", R.drawable.ic_modulos_fh))
        modulos.add(Modulos("ASIR", "1º","GEST. BBDD", R.drawable.ic_modulos_basedatos))
        modulos.add(Modulos("ASIR", "1º","LENGUAJE DE MARCAS", R.drawable.ic_modulos_lm))
        modulos.add(Modulos("ASIR", "1º","INGLES", R.drawable.ic_modulos_ingles))
        modulos.add(Modulos("ASIR", "1º","FOL", R.drawable.ic_modulos_eie_fol))
        //ASIR 2º
        modulos.add(Modulos("ASIR", "2º","ADMIN. SSSOO", R.drawable.ic_modulos_impssoo))
        modulos.add(Modulos("ASIR", "2º","SERV RED INTERNET", R.drawable.ic_modulos_sri))
        modulos.add(Modulos("ASIR", "2º","IMP. APP. WEB", R.drawable.ic_modulos_diw))
        modulos.add(Modulos("ASIR", "2º","ADM. SIST. GEST. BBDD", R.drawable.ic_modulos_basedatos))
        modulos.add(Modulos("ASIR", "2º","SEG. ALT. DISP.", R.drawable.ic_modulos_sad))
        modulos.add(Modulos("ASIR", "2º","EIE", R.drawable.ic_modulos_eie_fol))
        return modulos;
    }
    @SuppressLint("Recycle")

            /**
             * Método selectMódulos, método que nos permite escoger los módulos, por su curso y ciclo
             * esto, nos permite elegir los modulos que está impartiendo dicho alumno.
             * Esto nos servirá para cargar la lista recyclerview con la información para cada
             * módulo, cada módulo, irá en un cardview
             */


    fun insertDato(modulo: Modulos, context: Context?): Boolean {
        // se insertan sin problemas porque lugares es clave primaria, si ya están no hace nada
        // Abrimos la BD en modo escritura
        val bdDatos = ConexionBD(context, NOMRBE_BD, null, VERSION_BD)
        val bd: SQLiteDatabase = bdDatos.writableDatabase
        var sal = false
        try {
            //Cargamos los parámetros
            val valores = ContentValues()
            valores.put("NOMBRE_MODULO", modulo.nombreModulo)
            valores.put("CICLO",modulo.ciclo)
            valores.put("CURSO",modulo.curso)
            valores.put("FOTO_MODULO", modulo.fotoModulo)
            val res = bd.insert(ConexionBD.MODULOS_TABLE, null, valores)
            sal = true
        } catch (ex: SQLException) {
        } finally {
            bd.close()
            bdDatos.close()
            return sal
        }
    }

    fun selectModulos(curso: String, ciclo: String, context: Context?):MutableList<Modulos>? {
        //Se abre la base de datos en modo lectura
        val lista = mutableListOf<Modulos>()
        val bdModulos = ConexionBD(context, NOMRBE_BD, null, VERSION_BD)
        val bd:SQLiteDatabase = bdModulos.readableDatabase

        val filtro = "WHERE CICLO = $ciclo AND CURSO = $curso"

        val c: Cursor = bd.rawQuery("SELECT * FROM MODULOS WHERE CICLO='"+ciclo+"' AND CURSO='"+curso+"'",null)
        if (c.moveToFirst()){
            do {
                val aux = Modulos(c.getString(1), c.getString(2), c.getString(3), c.getInt(4))
                lista.add(aux)
            }while (c.moveToNext())
        }
        bd.close()
        bdModulos.close()
        return lista
    }

    fun removeAll(context: Context?): Boolean {
        // Abrimos la BD en modo escritura
        val bdDatos = ConexionBD(context, NOMRBE_BD, null, VERSION_BD)
        val bd: SQLiteDatabase = bdDatos.writableDatabase
        var sal = false
        try {
            bd.execSQL("DELETE FROM ${ConexionBD.MODULOS_TABLE}")
            sal = true
        } catch (ex: SQLException) {
        } finally {
            bd.close()
            bdDatos.close()
            return sal
        }
    }

}

