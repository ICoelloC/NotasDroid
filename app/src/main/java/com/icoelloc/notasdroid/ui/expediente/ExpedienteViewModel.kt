package com.icoelloc.notasdroid.ui.expediente

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExpedienteViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "MI EXPEDIENTE"
    }
    val text: LiveData<String> = _text
}