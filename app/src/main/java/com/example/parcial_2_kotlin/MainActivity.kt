package com.example.parcial_2_kotlin

import android.content.Intent
import android.icu.text.IDNA
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Usamos para cambiar de activity main a la de registro
        val RegistrarBtn=findViewById<Button>(R.id.RegistrarBtn)
        RegistrarBtn.setOnClickListener{
            val lanzar = Intent(this, Registrar::class.java)
            startActivity(lanzar)
        }
        //Usamos para cambiar de activity main a la de Ver registro
        val VerRegistrosBtn=findViewById<Button>(R.id.VerRegistrosBtn)
        VerRegistrosBtn.setOnClickListener{
            val lanzar2 = Intent(this, VerRegistros::class.java)
            startActivity(lanzar2)
        }


    }


    //Donde creamos el menu de opciones que los dara la opcion de ver mas informacion del desarrollador
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    //Aqui los camos a la actividy Informacion
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {

            R.id.info-> {
                val intent = Intent(this, Information::class.java).apply {

                }
                startActivity(intent)
                true

                }
            else -> super.onOptionsItemSelected(item)

        }

        return super.onOptionsItemSelected(item)
    }




}