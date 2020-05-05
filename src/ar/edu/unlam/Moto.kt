package ar.edu.unlam

class Moto(
    Marca: String,
    Modelo: String,
    Precio: Double,
    Nombre: String,
    Calle: String,
    Numero: Int,
    Localidad: String,
    var cilindrada: Int,
    var velocidadMaxima: Int
) :
    Vehiculo(Marca, Modelo, Precio, Nombre, Calle, Numero, Localidad) {

    var velocidadActual: Int = 0

    fun incrementarVelocidad() {
        if (this.velocidadActual <= this.velocidadMaxima) {
            this.velocidadActual++
        } else {
            println("Superaste la velocidad Maxima ")
        }
    }

    fun incrementarVelocidad(velocidad: Int) {
        if (this.velocidadActual <= this.velocidadMaxima) {
            this.velocidadActual += velocidad
        } else {
            println("Superaste la velocidad Maxima ")
        }

    }
}