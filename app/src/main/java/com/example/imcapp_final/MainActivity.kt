package com.example.imcapp_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Remover a toolbar
        supportActionBar!!.hide()

        //Instanciar o botão entrar
        val botaoEntrar = findViewById<Button>(R.id.button_criar_conta)

        botaoEntrar.setOnClickListener {
            //Criar uma intent(intenção)
            val abrirCadastro = Intent (this, cadastro_1::class.java)
            startActivity(abrirCadastro)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }
}