package com.icoelloc.notasdroid.entidadesBD

/**
 * Clase POJO para definir el modelo de la tabla de Alumno
 * @property nombreApellidos String, son el nombre y los apellidos del alumno
 * @property correo String, va a ser el correo del alumno, es campo va a ser la PK de la tabla, por lo tanto no se podrá repetir
 * @property contraseña String, va a ser la contraseña del alumno, tiene que estar encriptada
 * @property foto String, este campo va a contener la uri de la foto del alumno
 * @property curso String, este campo indica solo si el alumno esta en 1º o 2º.
 * @property cicloFormativo String, este campo indica el módulo, en el que está matriculado el alumno en particular
 */

class Alumno(
    var nombreApellidos: String, var correo: String, var contraseña: String,
    var foto: String, var curso: String, var cicloFormativo: String
)