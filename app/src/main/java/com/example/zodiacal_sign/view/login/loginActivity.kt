package com.example.zodiacal_sign.view.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zodiacal_sign.R
import com.example.zodiacal_sign.view.menu.menuActivity

class loginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login2)
        val getstaredButton:Button = findViewById(R.id.getstared)
        val name = findViewById<AppCompatEditText>(R.id.nombre)

        getstaredButton.setOnClickListener {
            val nombre = name.text.toString()

            if (nombre.isNotEmpty()) {
                val intent = Intent(this, menuActivity::class.java)
                intent.putExtra("nameUser", nombre)
                startActivity(intent)
            }
        }


        }
    }
