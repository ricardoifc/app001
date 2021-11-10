package com.ricardoifc.app001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Validar si una persona es mayor o menor de edad
        validar()
        // Presentar la tabla de multiplicar de n numero de forma
        // ascendente y descendente
        //tablaMultiplicar()
        // Mostrar el listado de paralelo de la materia de plataformas
        // moviles y los subgrupos por proyecto
        // listadoParalelo()
        // Presentar las propiedades de un vehiculo utilizando
        // clases, como traccion, motor, tipo de vehuculo, capacidd
        // propiedadesVehiculo()
    }

    private fun validar() {
        var edad = 17

        if (edad <= 18) {
            println("Es mayor de edad")
        } else {
            println("Es menor de edad")
        }
    }

    private fun tablaMultiplicar() {
        var n = 4
        /*
        var i = 0
        var j = 0
        for(i = 1; i<=10; i++){
            println(n + " * " + i + " = " + n * i);
        }
        for(j = 10; j<=1; j--){
            println(j + " * " + j + " = " + n * j);
        }
        
         */

    }

    private fun listadoParalelo() {
    }
}