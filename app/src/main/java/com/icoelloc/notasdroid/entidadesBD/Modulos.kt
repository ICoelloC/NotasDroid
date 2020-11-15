package com.icoelloc.notasdroid.entidadesBD

/**
 * Clase POJO para definir el modelo de la tabla Modulos
 * @property ciclo String, este campo indica el módulo,al que pertence dicho módulo
 * @property curso String, este campo indica solo si el módulo pertenece a 1º o 2º.
 * @property nombreModulo String, este campo indica el nombre de dicho modulo
 * @property fotoModulo String, este campo es la dirección uri de la imagen asociada del módulo
 */
class Modulos (
    var ciclo: String, var curso: String, var nombreModulo: String,
    var fotoModulo: String
)