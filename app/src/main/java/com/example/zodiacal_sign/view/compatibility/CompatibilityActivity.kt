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




        }
    }