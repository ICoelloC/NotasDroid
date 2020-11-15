package com.icoelloc.notasdroid.ui.matricula

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.icoelloc.notasdroid.R

class MatriculaFragment : Fragment() {

    private lateinit var matriculaViewModel: MatriculaViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        matriculaViewModel = ViewModelProvider(this).get(MatriculaViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_matricula, container, false)
        val textView: TextView = root.findViewById(R.id.matricula_lbl_titulo)
        matriculaViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}