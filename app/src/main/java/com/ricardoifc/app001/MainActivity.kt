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
        vehiculo()

        //Validacion de la cedula ecuatoriana
        //validacionCedula()
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
        val estudiantes = arrayListOf<String>("David", "Daniel", "nohelia", "Ricardo")
        estudiantes.sort()
        val grupos = arrayListOf<String>("Comunistas", "Anonymous", "GuamosCrew")
        grupos.sort()
        println(estudiantes)
        println(grupos)

    }
    private fun vehiculo(){
        val veh1 = Vehiculo("Hyunday","Tucson","Delantera","3.0","SUV",5)
        println(veh1.toString())
    }

    private fun validacionCedula() {
        var cadenaCedula = "1102647010"
        var splitCedula = cadenaCedula.split("")
        var suma = 0
        var temp1 = 0

        for (i in 1..9){
            if(i.equals(2) || i.equals(4) || i.equals(6) || i.equals(8) ){
                suma = suma + splitCedula[i].toInt()
            }else{
                temp1 = 2 * splitCedula[i].toInt()
                if (temp1 >= 10){
                    suma = suma + (temp1 - 9)
                } else{
                    suma = suma + temp1
                }
            }
        }
        var val1 = ((suma.toDouble() /10) - (suma.toDouble() /10).toInt())
        var val2 = val1 * 10
        val digVal =(10 - val2.toInt() )

        if(splitCedula[10].toInt() == digVal){
            println("La cedula es valida")
        }else{
            println("La cedula es invalida")
        }


    }


}
class Vehiculo(
    private var marca: String,
    private var modelo: String,
    private var traccion: String,
    private var motor: String,
    private var tipo: String,
    private var capacidad: Int
) {
    override fun toString(): String {
        return "Vehiculo(marca='$marca',modelo='$modelo', traccion=$traccion, motor='$motor', tipo='$tipo', " +
                "capacidad=$capacidad)"
    }
    fun setMarca(marca:String){
        this.marca = marca
    }fun setModelo(modelo:String){
        this.modelo = modelo
    }
    fun setTraccion(traccion: String){
        this.traccion=traccion
    }
    fun setMotor(motor: String){
        this.motor=motor
    }
    fun setTipo(tipo: String){
        this.tipo=tipo
    }
    fun setCapacidad(capacidad: Int){
        this.capacidad=capacidad
    }


}