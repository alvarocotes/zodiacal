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

        binding.edtName.doAfterTextChanged {
            binding.btnGetStared.isEnabled = binding.edtName.text!!.isNotEmpty()

        }


        binding.btnGetStared.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            intent.putExtra("Name", binding.edtName.text.toString())
            startActivity(intent)
        }
    }
}