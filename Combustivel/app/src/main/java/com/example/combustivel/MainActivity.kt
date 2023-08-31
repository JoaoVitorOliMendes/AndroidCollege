package com.example.combustivel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.roundToLong

class MainActivity : AppCompatActivity() {
    /**
     * Autor do projeto
     * MATRICULA 72200790
     * NOME JOÃO VITOR DE OLIVEIRA MENDES
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtDistancia = findViewById<EditText>(R.id.txtDistancia)
        val txtPreco = findViewById<EditText>(R.id.txtPreco)
        val txtAutonomia = findViewById<EditText>(R.id.txtAutonomia)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val lblGasto = findViewById<TextView>(R.id.lblGasto)

        btnCalcular.setOnClickListener {
            val distancia = txtDistancia.text.toString()
            val preco = txtPreco.text.toString()
            val autonomia = txtAutonomia.text.toString()

            if (distancia.isNotBlank() && preco.isNotBlank() && autonomia.isNotBlank()){
                val distanciaFloat = distancia.toFloatOrNull()
                val precoFloat = preco.toFloatOrNull()
                val autonomiaFloat = autonomia.toFloatOrNull()

                if (distanciaFloat!=null && precoFloat!=null && autonomiaFloat!=null){
                    lblGasto.setText("R$ " + BigDecimal(((distanciaFloat * precoFloat) / autonomiaFloat).toDouble()).setScale(2, RoundingMode.FLOOR).toString())
                }
            }else{
                lblGasto.setText("R$ 0,00")
                Toast.makeText(this, "Por favor preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }

    }
}