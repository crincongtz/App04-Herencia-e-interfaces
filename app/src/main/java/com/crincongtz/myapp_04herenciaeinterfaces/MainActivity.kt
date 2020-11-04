package com.crincongtz.myapp_04herenciaeinterfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}



open class Vehiculo {

    open fun encender() {
        ingnition()
    }

    fun ingnition() {

    }

    fun apagar() {

    }

}




class Carro : Vehiculo(), Lujos {

    override fun encender() {
        super.encender()
    }

    override fun encenderAireAcondicionado() {
    }
}

class Moto : Vehiculo() {

    override fun encender() {
        super.encender()
    }
}

class Autobus : Vehiculo() {

    override fun encender() {
        super.encender()
    }
}


interface Lujos {
    fun encenderAireAcondicionado()
}