package com.example.parcial_2_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import android.widget.*

class Registrar : AppCompatActivity() {

    //Mandamos a llamar elementos y los ponemos null
    var etName:EditText?=null
    var etRaza:EditText?=null
    var MascotaSpinner:EditText?=null
    var etDoctor:EditText?=null
    var etVeterinaria:EditText?=null
    var editTextPhone:EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        //Vinculacion de los elementos
        etName=findViewById(R.id.etName)
        etRaza=findViewById(R.id.etRaza)
        MascotaSpinner=findViewById(R.id.Vacuna)
        etDoctor=findViewById(R.id.etDoctor)
        etVeterinaria=findViewById(R.id.etVeterinaria)
        editTextPhone=findViewById(R.id.editTextPhone)



            /*
            //Datos de nuestro spinner (NO SE LOGRO HACER FUNCIONAR El SPINNER A LA HORA DE MOSTRAR EL DATO,
            NO SE COMO GUARDAR EL DATO DE UN SPINNER EN PREFERENCIAS Y DEPUES USARLO)
            val spinner = findViewById<Spinner>(R.id.Vacuna)
            val lista = listOf("Ninguna seleccionada","(Perro)Vacuna contra el parvovirus y moquillo","(Perro)Vacuna Polivalente",
                "(Perro)Refuerzo de la vacuna polivalente",
                "(Perro)Vacuna de la Rabia", "(Perro)Vacuna contra enfermedad de Lyme",
                "(Perro)Leptospirosis","(Perro)Leishmaniosis", "(Perro)Coronavirus","(Gato)Leucemia",
                "(Gato)Rinotraqueitis","(Gato)Panleucopenia",
                "(Gato)Calcivirosis","(Gato)Vacuna de la Rabia")

            val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item, lista)
            spinner.adapter = adaptador*/
}


//Funcion de nuestras preferencias para guarda preferencias al momento de dar click
fun guardar(view: View){

val prefs = PreferenceManager.getDefaultSharedPreferences(this)
val editor=prefs.edit()
editor.putString("etName", etName?.text.toString())
editor.putString("etRaza", etRaza?.text.toString())
editor.putString("MascotaSpinner", MascotaSpinner?.text.toString())
editor.putString("etDoctor", etDoctor?.text.toString())
editor.putString("etVeterinaria", etVeterinaria?.text.toString())
editor.putString("editTextPhone", editTextPhone?.text.toString())
editor.commit()
Toast.makeText(this, "Registro de datos exitoso",Toast.LENGTH_LONG).show()

}


}