package com.icoelloc.notasdroid.ui.matricula

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MatriculaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Mi matricula"
    }
    val text: LiveData<String> = _text
}