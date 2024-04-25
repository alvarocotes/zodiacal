package com.example.zodiacal_sign.view.getMySign

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zodiacal_sign.R

class getMySignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_get_my_sign)

        val dia = findViewById<EditText>(R.id.dia)
        val mes = findViewById<EditText>(R.id.mes)
        val año = findViewById<EditText>(R.id.año)
        val getSign = findViewById<Button>(R.id.obtener)
        val resultado = findViewById<TextView>(R.id.resultado)

        var Dia = dia.text.toString()
        var Mes = mes.text.toString()
        var Año = año.text.toString()

        getSign.setOnClickListener {


        }

    }
}