package com.example.parcial_2_kotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_ver_registros.*
import org.w3c.dom.Text
import kotlin.concurrent.fixedRateTimer

class VerRegistros : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_registros)

        //Llamamos a la funcion para ver registro
        Obtener()

    }


    //Mostramos registro
    private fun Obtener() {
        @Suppress("DEPRECATION")
        val prefs=PreferenceManager.getDefaultSharedPreferences(this)

        val name:TextView=tVNombre
        val raza:TextView=tVRaza
        val vacuna:TextView=tVVacuna
        val dotor:TextView=tVDoctor
        val veterinaria:TextView=tVVeterinaria
        val telefono:TextView=tVTelefono


        val nombre=prefs.getString("etName","No hay dato")
        val etRaza=prefs.getString("etRaza","No hay dato")
        val MascotaSpinner=prefs.getString("MascotaSpinner","No hay dato")
        val etDoctor=prefs.getString("etDoctor","No hay dato")
        val etVeterinaria=prefs.getString("etVeterinaria","No hay dato")
        val editTextPhone=prefs.getString("editTextPhone","No hay dato")

        name.text=nombre
        raza.text=etRaza
        vacuna.text=MascotaSpinner
        dotor.text=etDoctor
        veterinaria.text=etVeterinaria
        telefono.text=editTextPhone

    }


}