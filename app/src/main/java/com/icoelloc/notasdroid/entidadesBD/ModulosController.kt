package com.icoelloc.notasdroid.entidadesBD

import android.annotation.SuppressLint
import android.content.Context
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

    fun selectModulos(curso: String, ciclo: String, context: Context?):MutableList<Modulos>? {
        val lista = mutableListOf<Modulos>()

        return lista
    }

}

