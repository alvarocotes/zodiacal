package com.example.zodiacal_sign.view.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import com.example.zodiacal_sign.databinding.ActivityLogin2Binding
import com.example.zodiacal_sign.view.menu.MenuActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLogin2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLogin2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.edtImputName.doAfterTextChanged {
            if (binding.edtImputName.text!!.isNotEmpty()){
                binding.btnGetStared.isEnabled = true
            }else{
                binding.btnGetStared.isEnabled = false
            }

        }


        binding.btnGetStared.setOnClickListener {
                val intent = Intent(this, MenuActivity::class.java)
                intent.putExtra("Name", binding.edtImputName.text.toString())
                startActivity(intent)
        }
        }
    }