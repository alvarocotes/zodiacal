package com.example.zodiacal_sign.view.compatibility

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zodiacal_sign.R
import com.example.zodiacal_sign.databinding.ActivityCompatibilityBinding
import com.example.zodiacal_sign.databinding.ActivityMenuBinding
import java.util.zip.Inflater


class CompatibilityActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCompatibilityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCompatibilityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sign1 = binding.txtEdtSignPerson1.text.toString()
        val sign2 = binding.txtEdtSignPerson1.text.toString()

        binding.btnGetCompatibility.setOnClickListener {
            binding.txtResultCompatibility.text=
                Compatible(binding.txtEdtSignPerson1.text.toString(),binding.txtEdtSignPerson1.text.toString())
        }




        }

    private fun Compatible(sing1: String, sign2: String): String { //funcion presenta error ya que siempre devuelve compatibles
        if ((sing1 == "capricornio") && ((sign2 == "aries")||(sign2 == "geminis")||(sign2 == "libras"))) return "Enemigos naturales"
        if ((sing1 == "acuario") && ((sign2 == "tauro")||(sign2 == "cancer")||(sign2 == "escorpio") ||(sign2 == "piscis"))) return "Enemigos naturales"
        if ((sing1 == "piscis") && ((sign2 == "aries")||(sign2 == "geminis")||(sign2 == "acuario"))) return "Enemigos naturales"
        if ((sing1 == "aries") && ((sign2 == "cancer")||(sign2 == "libra")||(sign2 == "capricornio") ||(sign2 == "piscis"))) return "Enemigos naturales"
        if ((sing1 == "tauro") && ((sign2 == "leo")||(sign2 == "acuario"))) return "Enemigos naturales"
        if ((sing1 == "geminis") && ((sign2 == "leo")||(sign2 == "virgo")||(sign2 == "capricornio") ||(sign2 == "piscis"))) return "Enemigos naturales"
        if ((sing1 == "cancer") && ((sign2 == "aries")||(sign2 == "libra")||(sign2 == "sagitario") ||(sign2 == "acuario"))) return "Enemigos naturales"
        if ((sing1 == "leo") && ((sign2 == "tauro")||(sign2 == "geminis")||(sign2 == "escorpio"))) return "Enemigos naturales"
        if ((sing1 == "virgo") && ((sign2 == "libra")||(sign2 == "geminis"))) return "Enemigos naturales"
        if ((sing1 == "libra") && ((sign2 == "aries")||(sign2 == "cancer")||(sign2 == "virgo") ||(sign2 == "capricornio"))) return "Enemigos naturales"
        if ((sing1 == "escorpio") && ((sign2 == "leo")||(sign2 == "sagitario")||(sign2 == "acuario"))) return "Enemigos naturales"
        if ((sing1 == "sagitario") && ((sign2 == "cancer")||(sign2 == "escorpio"))) return "Enemigos naturales"
        else return "Compatibles"
    }
    }