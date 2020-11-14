package com.icoelloc.notasdroid.entidadesBD

/**
 * Clase POJO para definir el modelo de la tabla de Asignatura
 *  En esta tabla lo único que hay es la información de cada asignatura
 * @property modulo
 */
class Asignatura(
    var modulo: String, var curso: String, var nombreAsignatura: String,
    var fotoAsociada: String
)