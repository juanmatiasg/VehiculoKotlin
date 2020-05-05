package ar.edu.unlam

import junit.framework.Assert
import org.junit.Assert.*
import org.junit.Test

class VehiculoTest{
    @Test
    fun testQueVerifiqueLaCalleDelFabricanteDeUnVehiculo() {
        var vehiculoUno =
            Vehiculo("Ferrari", "4532", 24330.0, "Jose", "Tapalque", 4572, "Floresta")

        var resultadoObtenido: String = vehiculoUno.fabricante.direccion.Calle
        var resultadoEsperado: String = "Tapalque"

        Assert.assertEquals(resultadoObtenido, resultadoEsperado)
    }

    @Test
    fun testQueVerifiqueArrancarUnCamion() {
        var camion: Camion = Camion(
            "Ford",
            "Xsara",
            24.000,
            "Juan",
            "Moreto",
            123,
            "Floresta",
            5,
            5000,
            1000,
            true
        )

        var resultadoEsperado: Boolean = camion.arrancar()

        assertTrue(resultadoEsperado)
    }

     @Test
      fun testeQueDescargueTodasLasCargas(){
          var camion:ar.edu.unlam.Camion=  ar.edu.unlam.Camion("Ford","Xsara",24.000,"Juan","Moreto",123,"Floresta",5,2000,1000,true)

         camion.descargar(0)

         var valorObtenido:Int = camion.pesoDeCarga
         var valorEsperado:Int = 0


          assertEquals(valorObtenido,valorEsperado)
      }

    @Test
    fun testQueVerifiqueQueUnaMotoQueAlIncrementarlaVelocidadNoSuperarLaVelocidadMaxima() {
        var moto: Moto = Moto(
            "Yamaha",
            "x125",
            1200.0,
            "Jose",
            "Basualdo",
            1236,
            "Floresta",
            4,
            1000
        )

        moto.incrementarVelocidad(999)
        moto.incrementarVelocidad()

        var resultadoObtenido:Int = moto.velocidadActual
        var resultadoEsperado:Int = 1000

        Assert.assertEquals(resultadoObtenido, resultadoEsperado)
    }

    @Test
    fun testVerificarQueUnCamionNoPuedaCargaUnaCargaQueSuperaSuPesoMaximo(){
        var camion:ar.edu.unlam.Camion=  ar.edu.unlam.Camion("Ford","Xsara",24.000,"Juan","Moreto",123,"Floresta",5,2000,1500,true)
        var carga=Carga(2500,"Pirelli")

        var valorEsperado:Boolean= camion.agregarCarga(carga)

        assertFalse(valorEsperado)



    }
}