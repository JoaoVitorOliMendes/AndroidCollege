package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btLogin = findViewById<Button>(R.id.button1)
        val txtUsuario = findViewById<EditText>(R.id.editTextTextPersonName1)
        val txtSenha = findViewById<EditText>(R.id.editTextTextPassword1)

        btLogin.setOnClickListener {
            if (txtUsuario.text.toString() != "") {
                Toast.makeText(this, "aaaaaaaaaaaaaaaaaaaa", Toast.LENGTH_SHORT).show()
            }
        }

    }
}