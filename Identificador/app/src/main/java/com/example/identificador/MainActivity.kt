package com.example.identificador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIr = findViewById<Button>(R.id.btnIr)
        val txtNome = findViewById<EditText>(R.id.txtNome)
        val txtSobrenome = findViewById<EditText>(R.id.txtSobrenome)

        btnIr.setOnClickListener{
            if (txtNome.text.toString()!="" && txtSobrenome.text.toString()!=""){
                Toast.makeText(this, "Seja bem vindo " + txtNome.text.toString() + txtSobrenome.text.toString(), Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Por favor preencha todos os campos", Toast.LENGTH_LONG).show()
            }
        }

    }
}