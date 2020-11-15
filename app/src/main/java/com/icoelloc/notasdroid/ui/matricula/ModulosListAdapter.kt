package com.icoelloc.notasdroid.ui.matricula

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.icoelloc.notasdroid.R
import com.icoelloc.notasdroid.entidadesBD.Modulos
import kotlinx.android.synthetic.main.list_matricula.view.*

class ModulosListAdapter(
    private val listaModulos:MutableList<Modulos>,
    private val listener: (Modulos) -> Unit
) : RecyclerView.Adapter<ModulosListAdapter.DatoViewHolder>() {
    /**
     * Asociamos la vista
     *
     * @param parent
     * @param viewType
     * @return
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatoViewHolder {
        return DatoViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_matricula, parent, false)
        )
    }

    /**
     * Procesamos los datos y las metemos en un Holder
     *
     * @param holder
     * @param position
     */
    override fun onBindViewHolder(holder: DatoViewHolder, position: Int) {
        holder.nombreAsignatura.text = listaModulos[position].nombreModulo
        holder.logoAsignatura.setImageResource(listaModulos[position].fotoModulo)
        // Programamos el clic de cada fila (itemView)
        holder.itemView
            .setOnClickListener {
                listener(listaModulos[position])
            }
    }

    /**
     * Devuelve el número de items de la lista
     *
     * @return
     */
    override fun getItemCount(): Int {
        return listaModulos.size
    }

    fun list(): MutableList<Modulos> {
        return this.listaModulos
    }


    /**
     * Holder que encapsula los objetos a mostrar en la lista
     */
    class DatoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Elementos graficos con los que nos asociamos
        var nombreAsignatura = itemView.matricula_nombreAsignatura
        var logoAsignatura = itemView.matricula_logoAsignatura
    }
}