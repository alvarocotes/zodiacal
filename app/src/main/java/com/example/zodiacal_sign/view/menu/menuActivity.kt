package com.example.zodiacal_sign.view.menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.zodiacal_sign.R
import com.example.zodiacal_sign.view.getMySign.GetMySignActivity

class menuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val saludo = findViewById<TextView>(R.id.saludo)
        val name: String = intent.extras?.getString("nameUser").orEmpty()

        saludo.text = "Hola $name , Que deseas hacer hoy?"

        val sabersigno = findViewById<Button>(R.id.saberSigno)


        sabersigno.setOnClickListener {
            val intent2 = Intent(this,GetMySignActivity::class.java)
            startActivity(intent2)
        }


        }
    }
