package com.example.zodiacal_sign.view.menu

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.zodiacal_sign.databinding.ActivityMenuBinding
import com.example.zodiacal_sign.view.compatibility.CompatibilityActivity
import com.example.zodiacal_sign.view.getMySign.GetMySignActivity

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.extras?.getString("Name")
        val saludo = "Hello $name, How can I help you today?"
        binding.txtGreeting.text = saludo
        initListeners()


    }

    private fun initListeners() {
        binding.btnGetMySign.setOnClickListener {
            startActivity(Intent(this, GetMySignActivity::class.java))
        }

        binding.btnCompatibility.setOnClickListener {
            startActivity(Intent(this,CompatibilityActivity::class.java))
        }
    }

}
