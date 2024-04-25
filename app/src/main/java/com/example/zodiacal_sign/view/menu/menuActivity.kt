package com.example.zodiacal_sign.view.menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zodiacal_sign.R
import com.example.zodiacal_sign.view.getMySign.getMySignActivity

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
            val intent2 = Intent(this,getMySignActivity::class.java)
            startActivity(intent2)
        }


        }
    }
