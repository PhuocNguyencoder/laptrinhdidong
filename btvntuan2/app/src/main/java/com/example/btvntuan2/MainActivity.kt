package com.example.btvntuan2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.btvntuan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCheck.setOnClickListener {
            val name = binding.editTextName.text.toString()
            val ageText = binding.editTextAge.text.toString()

            val result = viewModel.checkCategory(name, ageText)
            if (result.error != null) {
                Toast.makeText(this, result.error, Toast.LENGTH_SHORT).show()
            } else {
                binding.textViewResult.text = result.message
                binding.editTextName.text = null
                binding.editTextAge.text = null
            }
        }
    }
}
