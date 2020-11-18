package com.icoelloc.notasdroid.ui.examenes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.icoelloc.notasdroid.R

class ExamenesFragment : Fragment() {

    private lateinit var examenesViewModel: ExamenesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        examenesViewModel =
                ViewModelProvider(this).get(ExamenesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_examenes, container, false)
        val textView: TextView = root.findViewById(R.id.text_examenes)
        examenesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}