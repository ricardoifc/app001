package com.ricardoifc.app001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Validar si una persona es mayor o menor de edad
        //validar()
        // Presentar la tabla de multiplicar de n numero de forma
        // ascendente y descendente
        // tablaMultiplicar()
        // Mostrar el listado de paralelo de la materia de plataformas
        // moviles y los subgrupos por proyecto
        // listadoParalelo()
        // Presentar las propiedades de un vehiculo utilizando
        // clases, como traccion, motor, tipo de vehuculo, capacidd
        // propiedadesVehiculo()

        //Validacion de la cedula ecuatoriana
        validacionCedula()
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
        var concat1 = ""
        var concat2 = ""
        concat1 = "Ascendente \n"
        for(num1 in 1..12) {

            concat1 = String.format("%s%d * %d = %d\n",concat1, n, num1, n * num1)

        }
        concat1 = String.format("%s\nDescendente\n",concat1)
        for(num2 in 12..1) {
            concat1 = String.format("%s%d * %d = %d\n",concat1, n, num2, n * num2)

        }
        println(concat1)

    }

    private fun listadoParalelo() {
    }

    private fun validacionCedula() {
        var cadenaCedula = "1100279254"
        var splitCedula = cadenaCedula.split("")
        var suma = 0
        var temp1 = 0


        for (i in 1..9){
            //println(String.format("\nnum %d dig %d ", i, splitCedula[i].toInt() ))
            if(i.equals(2) || i.equals(4) || i.equals(6) || i.equals(8) ){
                suma = suma + splitCedula[i].toInt()
                //println(String.format(" x1: %d ", splitCedula[i].toInt() ))
            }else{
                //println(String.format(" x2: %d ", splitCedula[i].toInt() * 2 ))
                temp1 = 2 * splitCedula[i].toInt()
                if (temp1 >= 10){
                    //print(String.format(" final1: %d ", temp1 - 9 ))
                    suma = suma + (temp1 - 9)
                } else{
                    //print(String.format(" final2: %d ", temp1))
                    suma = suma + temp1
                }
            }
        }
        var val1 = ((suma.toDouble() /10) - (suma.toDouble() /10).toInt())
        var val2 = val1 * 10
        println(val1)
        println(val2.toInt())
        println(10 - val2.toInt() )
        val digVal =(10 - val2.toInt() )
        println(digVal)

        if(splitCedula[10].toInt() == digVal){
            println("La cedula es valida")
        }else{
            println("La cedula es invalida")
        }
        println(String.format("%d,%d", suma,digVal.toInt()))
        //var concatenar = String.format("\n %s %s %s \n",splitCedula[1], splitCedula[2], splitCedula[3])
        //println(concatenar)


    }

}