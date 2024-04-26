package com.example.zodiacal_sign.view.getMySign

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged

import com.example.zodiacal_sign.databinding.ActivityGetMySignBinding

class GetMySignActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGetMySignBinding

    private var day: String = ""
    private var month: String = ""
    private var year: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGetMySignBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()
    }

    private fun activeButton() {
        binding.btnGetSign.isEnabled = day.isNotEmpty() && month.isNotEmpty() && year.isNotEmpty()
    }

    private fun initListeners() {
        binding.btnGetSign.setOnClickListener {
            binding.txtResult.text =
                getSign(binding.edtDay.text.toString().toInt(), binding.edtMonth.text.toString().toInt())
            binding.txtResult.visibility = View.VISIBLE
        }
        binding.edtDay.doAfterTextChanged {
            day = binding.edtDay.text?.trim().toString()
            activeButton()
        }
        binding.edtMonth.doAfterTextChanged {
            month = binding.edtMonth.text?.trim().toString()
            activeButton()
        }
        binding.edtYear.doAfterTextChanged {
            year = binding.edtYear.text?.trim().toString()
            activeButton()
        }
    }

    private fun getSign(day: Int, month: Int): String {
        if ((month == 1 && day <= 20) || (month == 12 && day > 21)) return "Eres capricornio"
        if ((month == 1 && day > 20) || (month == 2 && day <= 18)) return  "Eres acuario"
        if ((month == 2 && day > 18) || (month == 3 && day <= 20)) return "Eres piscis"
        if ((month == 3 && day > 20) || (month == 4 && day <= 19)) return "Eres aries"
        if ((month == 4 && day > 19) || (month == 5 && day <= 20)) return "Eres tauro"
        if ((month == 5 && day > 20) || (month == 6 && day <= 20)) return "Eres geminis"
        if ((month == 6 && day > 20) || (month == 7 && day <= 22)) return "Eres cancer"
        if ((month == 7 && day > 22) || (month == 8 && day <= 22)) return "Eres leo"
        if ((month == 8 && day > 22) || (month == 9 && day <= 22)) return "Eres virgo"
        if ((month == 9 && day > 22) || (month == 10 && day <= 22)) return "Eres libra"
        if ((month == 10 && day > 22) || (month == 11 && day <= 21)) return "Eres escorpio"
        if ((month == 11 && day > 21) || (month == 12 && day <= 21)) return "Eres sagitario"
        return "Fecha no válida"
    }
}
