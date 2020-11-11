package com.icoelloc.notasdroid.ui.expediente

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.icoelloc.notasdroid.R

class ExpedienteFragment : Fragment() {

    private lateinit var expedienteViewModel: ExpedienteViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        expedienteViewModel =
                ViewModelProvider(this).get(ExpedienteViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_expediente, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        expedienteViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}