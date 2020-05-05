package ar.edu.unlam

import ar.edu.unlam.Direccion

class Fabricante(var Nombre: String, Calle: String, Numero: Int, Localidad: String) {

    var direccion: Direccion

    init {
        direccion = Direccion(Calle, Numero, Localidad)
    }


}