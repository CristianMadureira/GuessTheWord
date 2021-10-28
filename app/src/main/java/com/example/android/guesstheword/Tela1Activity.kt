package com.example.android.guesstheword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tela1Activity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela1)
    }

    fun criarButton(){
        button = findViewById(R.id.buttonTeste)
        button.setOnClickListener {
           irTelaDois()
        }
    }

    fun irTelaDois(){
        val intent = Intent(this, Tela2Activity::class.java)
        startActivity(intent)
    }





}