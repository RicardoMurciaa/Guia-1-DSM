package com.example.myapplicationpractica02dsm104

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

lateinit var nombre: EditText
lateinit var enviar: Button
lateinit var resultado: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombre = findViewById(R.id.TxtNombre)
        enviar = findViewById(R.id.BtnEnviar)
        resultado = findViewById(R.id.LlbResultado)

        enviar.setOnClickListener{
            var nombreUsuario: String = nombre.text.toString()
            resultado.setText(nombreUsuario)
        }
    }
}