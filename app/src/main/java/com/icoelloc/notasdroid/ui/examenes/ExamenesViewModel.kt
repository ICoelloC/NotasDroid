package com.icoelloc.notasdroid.ui.examenes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExamenesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Mis Examenes"
    }
    val text: LiveData<String> = _text
}