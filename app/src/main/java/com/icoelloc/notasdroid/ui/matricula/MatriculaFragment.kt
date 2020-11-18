package com.icoelloc.notasdroid.ui.matricula

import android.graphics.Paint
import android.os.AsyncTask
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.icoelloc.notasdroid.R
import com.icoelloc.notasdroid.entidadesBD.Modulos
import com.icoelloc.notasdroid.entidadesBD.ModulosController
import kotlinx.android.synthetic.main.fragment_matricula.*

class MatriculaFragment : Fragment() {

    private var modulos = mutableListOf<Modulos>()//lista
    private lateinit var matriculaViewModel: MatriculaViewModel

    //Iterfaz gráfica
    private lateinit var adapter: ModulosListAdapter //recycler
    private lateinit var tarea: TareaCargarDatos
    private var paintSweep = Paint()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_matricula, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Iniciamos la interfaz
        initUI()

    }

    private fun initUI() {
        // iniciamos el swipe para recargar
        iniciarSwipeRecarga();
        // Cargamos los datos por primera vez
        cargarDatos()
        // Mostramos las vistas de listas y adaptador asociado
        matricula_listrecycleview.layoutManager = LinearLayoutManager(context)
    }


    /**
     * Iniciamos el swipe de recarga
     */
    private fun iniciarSwipeRecarga() {
        modulosSwipe.setColorSchemeResources(R.color.design_default_color_primary)
        //datosSwipe.setProgressBackgroundColorSchemeResource(R.color.design_default_color_primary)
        modulosSwipe.setOnRefreshListener {
            cargarDatos()
        }
    }
    /**
     * Carga las datos
     */
    private fun cargarDatos() {
        tarea = TareaCargarDatos()
        tarea.execute()
    }

    fun getDatosFromBD() {

        ModulosController.removeAll(context)

        ModulosController.insertDato(Modulos("DAM", "1º","SISTEMAS INFORMATICOS", R.drawable.ic_modulos_sistemasinformaticos),context)
        ModulosController.insertDato(Modulos("DAM", "1º","BASES DE DATOS", R.drawable.ic_modulos_basedatos),context)
        ModulosController.insertDato(Modulos("DAM", "1º","PROGRAMACION", R.drawable.ic_modulos_programacion),context)
        ModulosController.insertDato(Modulos("DAM", "1º","LENGUAJE DE MARCAS", R.drawable.ic_modulos_lm),context)
        ModulosController.insertDato(Modulos("DAM", "1º","ENTORNOS DE DESARROLLO", R.drawable.ic_modulos_ed),context)
        ModulosController.insertDato(Modulos("DAM", "1º","INGLES", R.drawable.ic_modulos_ingles),context)
        ModulosController.insertDato(Modulos("DAM", "1º","FOL", R.drawable.ic_modulos_eie_fol),context)

        ModulosController.insertDato(Modulos("DAM", "2º","ACCESO A DATOS", R.drawable.ic_modulos_accdat),context)
        ModulosController.insertDato(Modulos("DAM", "2º","DES. INTERFACES", R.drawable.ic_modulo_desint),context)
        ModulosController.insertDato(Modulos("DAM", "2º","PROG. MULT. DISP. MOV", R.drawable.ic_modulos_pmydp),context)
        ModulosController.insertDato(Modulos("DAM", "2º","PROG. SERV. PROC.", R.drawable.ic_modulos_psp),context)
        ModulosController.insertDato(Modulos("DAM", "2º","SIST. GEST. EMP.", R.drawable.ic_modulos_sistgestemp),context)
        ModulosController.insertDato(Modulos("DAM", "2º","EIE", R.drawable.ic_modulos_eie_fol),context)

        ModulosController.insertDato(Modulos("DAW", "1º","SISTEMAS INFORMATICOS", R.drawable.ic_modulos_sistemasinformaticos),context)
        ModulosController.insertDato(Modulos("DAW", "1º","BASES DE DATOS", R.drawable.ic_modulos_basedatos),context)
        ModulosController.insertDato(Modulos("DAW", "1º","PROGRAMACION", R.drawable.ic_modulos_programacion),context)
        ModulosController.insertDato(Modulos("DAW", "1º","LENGUAJE DE MARCAS", R.drawable.ic_modulos_lm),context)
        ModulosController.insertDato(Modulos("DAW", "1º","ENTORNOS DE DESARROLLO", R.drawable.ic_modulos_ed),context)
        ModulosController.insertDato(Modulos("DAW", "1º","INGLES", R.drawable.ic_modulos_ingles),context)
        ModulosController.insertDato(Modulos("DAW", "1º","FOL", R.drawable.ic_modulos_eie_fol),context)

        ModulosController.insertDato(Modulos("DAW", "2º","DES. WEB. ENT. SERVIDOR", R.drawable.ic_modulos_dwes),context)
        ModulosController.insertDato(Modulos("DAW", "2º","DES. WEB. ENT. CLIENTE", R.drawable.ic_modulos_dwec),context)
        ModulosController.insertDato(Modulos("DAW", "2º","DESP. APPS. WEB", R.drawable.ic_modulos_dap),context)
        ModulosController.insertDato(Modulos("DAW", "2º","DIS. INTERF. WEB", R.drawable.ic_modulos_diw),context)
        ModulosController.insertDato(Modulos("DAW", "2º","EIE", R.drawable.ic_modulos_eie_fol),context)

        ModulosController.insertDato(Modulos("ASIR", "1º","IMP. SSSOO", R.drawable.ic_modulos_impssoo),context)
        ModulosController.insertDato(Modulos("ASIR", "1º","PLAN. ADMIN. REDES", R.drawable.ic_modulos_pladre),context)
        ModulosController.insertDato(Modulos("ASIR", "1º","FUND. HARDWARE", R.drawable.ic_modulos_fh),context)
        ModulosController.insertDato(Modulos("ASIR", "1º","GEST. BBDD", R.drawable.ic_modulos_basedatos),context)
        ModulosController.insertDato(Modulos("ASIR", "1º","LENGUAJE DE MARCAS", R.drawable.ic_modulos_lm),context)
        ModulosController.insertDato(Modulos("ASIR", "1º","INGLES", R.drawable.ic_modulos_ingles),context)
        ModulosController.insertDato(Modulos("ASIR", "1º","FOL", R.drawable.ic_modulos_eie_fol),context)

        ModulosController.insertDato(Modulos("ASIR", "2º","ADMIN. SSSOO", R.drawable.ic_modulos_impssoo),context)
        ModulosController.insertDato(Modulos("ASIR", "2º","SERV RED INTERNET", R.drawable.ic_modulos_sri),context)
        ModulosController.insertDato(Modulos("ASIR", "2º","IMP. APP. WEB", R.drawable.ic_modulos_diw),context)
        ModulosController.insertDato(Modulos("ASIR", "2º","ADM. SIST. GEST. BBDD", R.drawable.ic_modulos_basedatos),context)
        ModulosController.insertDato(Modulos("ASIR", "2º","SEG. ALT. DISP.", R.drawable.ic_modulos_sad),context)
        ModulosController.insertDato(Modulos("ASIR", "2º","EIE", R.drawable.ic_modulos_eie_fol),context)
        //this.modulos = ModulosController.selectModulosFiltrado("2º","DAM",context)!!

        this.modulos = ModulosController.selectModulos(context)!!
    }


    /**
     * Evento cli asociado a una fila
     * @param modulo Modulos
     */
    private fun eventoClicFila(modulo: Modulos) {

    }

    /**
     * Tarea asíncrona para la carga de datos
     */
    inner class TareaCargarDatos : AsyncTask<String?, Void?, Void?>() {
        /**
         * Acciones antes de ejecutarse
         */
        override fun onPreExecute() {
            if (modulosSwipe.isRefreshing) {
                modulosSwipe.isRefreshing = false
            }
            Toast.makeText(context, "Actualizando", Toast.LENGTH_LONG).show()
        }

        override fun doInBackground(vararg p0: String?): Void? {
            try {
                getDatosFromBD()
            } catch (e: Exception) {
            }
            return null
        }

        /**
         * Procedimiento a realizar al terminar
         * Cargamos la lista
         *
         * @param args
         */
        override fun onPostExecute(args: Void?) {
            adapter = ModulosListAdapter(modulos) {
                eventoClicFila(it)
            }
            matricula_listrecycleview.adapter = adapter
            // Avismos que ha cambiado
            adapter.notifyDataSetChanged()
            matricula_listrecycleview.setHasFixedSize(true)
            modulosSwipe.isRefreshing = false
            Toast.makeText(context, "Modulos actualizados", Toast.LENGTH_LONG).show()
        }


    }
}