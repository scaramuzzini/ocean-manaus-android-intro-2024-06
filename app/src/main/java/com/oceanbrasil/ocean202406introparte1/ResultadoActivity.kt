package com.oceanbrasil.ocean202406introparte1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        //Recupero o valor digitado
        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")

        //Bind do TextView
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)
        textViewResultado.text = "O nome digitado foi: $nomeDigitado"

        //Bind do Botao Voltar
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        //Acao do botao
        buttonVoltar.setOnClickListener {
            finish()
        }
    }
}