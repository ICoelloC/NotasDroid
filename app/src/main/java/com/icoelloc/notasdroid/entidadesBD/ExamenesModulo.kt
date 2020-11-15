package com.icoelloc.notasdroid.entidadesBD

/**
 *Clase POJO para definir el modelo de la tabla ExamenesModulo
 * @property nombreModulo String, este campo indica a que asignatura pertenece el examen
 * @property tituloExamen String, este campo indica cual es el nombre de la prueba
 * @property dia Int, este campo junto con mes y anio, forman la fecha de la prueba
 * @property mes Int, este campo junto con dia y anio, forman la fecha de la prueba
 * @property anio Int, este campo junto con dia y mes, forman la fecha de la prueba
 * @property presentado Boolean, este campo sirve para indicar si un examen ha sido presentado o no
 * @property nota Float, este es el campo de la nota del examen
 */
class ExamenesModulo(
    var nombreModulo: String, tituloExamen: String, var dia: Int, var mes: Int, var anio: Int,
    var presentado: Integer, var nota: Float
)