package com.example.imcapp_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText

class CadastroUsuario : AppCompatActivity() {

    lateinit var editEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_usuario)

        editEmail = findViewById(R.id.edit_novo_email)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu_cadastro, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        // Salvar os dados do usuário em um sharedPreferences
        // Criar um arquivo sharedPreferences
        // Se o arquivo já existir ele será aberto
        val dados = getSharedPreferences("cadastro", MODE_PRIVATE)

        // Criar um editor para o arquivo (Se eu não for gravar nada no arquivo, não precisamos utilizar o editor)
        val editor = dados.edit()
        editor.putString("email", editEmail.text.toString())
        editor.apply()

        return true
    }
}