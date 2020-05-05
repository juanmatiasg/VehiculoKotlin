package ar.edu.unlam

import ar.edu.unlam.Fabricante

open class Vehiculo(
    var Marca: String,
    var Modelo: String,
    var Precio: Double,
    Nombre: String,
    Calle: String,
    Numero: Int,
    Localidad: String
) {

    var fabricante: Fabricante

    init {
        fabricante = Fabricante(Nombre, Calle, Numero, Localidad)
    }

}