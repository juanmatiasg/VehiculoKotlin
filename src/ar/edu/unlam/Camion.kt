package ar.edu.unlam

class Camion(
    Marca: String,
    Modelo: String,
    Precio: Double,
    Nombre: String,
    Calle: String,
    Numero: Int,
    Localidad: String,
    var numeroDeEjes: Int,
    var PesoMaximo: Int,
    var pesoDeCarga: Int,
    var enMarcha: Boolean
) :
    Vehiculo(Marca, Modelo, Precio, Nombre, Calle, Numero, Localidad) {

    fun agregarCarga(carga: Carga): Boolean {
        if (carga.Peso <= PesoMaximo) {
            this.pesoDeCarga += carga.Peso
            return true
        } else {
            println("Superaste la carga")
            return false
        }
    }

    fun arrancar(): Boolean {
        return this.enMarcha == true
    }

    fun descargar(peso: Int) {
        this.pesoDeCarga = peso
    }
}