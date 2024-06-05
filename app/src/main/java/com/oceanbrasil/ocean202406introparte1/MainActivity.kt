package com.oceanbrasil.ocean202406introparte1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSalvar = findViewById<Button>(R.id.button2)
        val nomeDoUsuario = findViewById<EditText>(R.id.nomeDoUsuario)
        val nomeDigitado = findViewById<TextView>(R.id.nomeDigitado)

        val resultadoIntent = Intent(this, ResultadoActivity::class.java)
        buttonSalvar.setOnClickListener {
            //Log.d("oceanbrasil", "O texto do botao e:"+button2.text.toString())
            val nome = nomeDoUsuario.text.toString()
            //nomeDigitado.text = "O nome digitado foi: $nome"

            if (nome.isNotEmpty()) {
                resultadoIntent.putExtra("NOME_DIGITADO", nomeDoUsuario.text.toString())
                startActivity(resultadoIntent)
            } else {
                Toast.makeText(this, "Voce precisa digitar um nome primeiro",
                    Toast.LENGTH_LONG).show()
            }

        }
    }
}
