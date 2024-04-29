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


        binding.btnGetCompatibility.setOnClickListener {
            binding.txtResultCompatibility.text=
                Compatible(binding.txtEdtSignPerson1.text.toString(),binding.txtEdtSingPerson2.text.toString(),binding.txtEdtNamePerson1.text.toString(), binding.txtEdtNamePerson2.text.toString())
        }



        }

        private fun Compatible(sing1: String, sign2: String, person1:String, person2: String): String { //funcion presenta error ya que siempre devuelve compatibles

            if ((sing1 == "capricornio") && ((sign2 == "aries")||(sign2 == "geminis")||(sign2 == "libra"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            if ((sing1 == "acuario") && ((sign2 == "tauro")||(sign2 == "cancer")||(sign2 == "escorpio") ||(sign2 == "piscis"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            if ((sing1 == "piscis") && ((sign2 == "aries")||(sign2 == "geminis")||(sign2 == "acuario"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            if ((sing1 == "aries") && ((sign2 == "cancer")||(sign2 == "libra")||(sign2 == "capricornio") ||(sign2 == "piscis"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            if ((sing1 == "tauro") && ((sign2 == "leo")||(sign2 == "acuario"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            if ((sing1 == "geminis") && ((sign2 == "leo")||(sign2 == "virgo")||(sign2 == "capricornio") ||(sign2 == "piscis"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            if ((sing1 == "cancer") && ((sign2 == "aries")||(sign2 == "libra")||(sign2 == "sagitario") ||(sign2 == "acuario"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            if ((sing1 == "leo") && ((sign2 == "tauro")||(sign2 == "geminis")||(sign2 == "escorpio"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            if ((sing1 == "virgo") && ((sign2 == "libra")||(sign2 == "geminis"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            if ((sing1 == "libra") && ((sign2 == "aries")||(sign2 == "cancer")||(sign2 == "virgo") ||(sign2 == "capricornio"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            if ((sing1 == "escorpio") && ((sign2 == "leo")||(sign2 == "sagitario")||(sign2 == "acuario"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            if ((sing1 == "sagitario") && ((sign2 == "cancer")||(sign2 == "escorpio"))) return "I'm sorry $person1, you are a $sing1 and $person2, you are a $sign2, they are not very compatible, so to speak, their personalities and character can clash, I am very sorry."
            else return "Congratulations $person1, you are a $sing1 and $person2, you are a $sign2, they are compatible, however, do not forget the basis of a good relationship is communication."


        }
    }