package com.example.lesson5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.example.lesson5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
onClick()

    }
        fun onClick() {
            binding.btnPlus.setOnClickListener {
                count += 1
                binding.tvNum.text = count.toString()
                if (count == 10 || binding.tvNum.text.equals("-")) {
                    binding.btnPlus.text = "-"
                    binding.btnPlus.setOnClickListener {
                        count -= 1
                        binding.tvNum.text = count.toString()
                        if (count == 0) {
                            val intent = Intent(this, SecondActivity::class.java)
                            startActivity(intent)
                        }
                    }
                    }
        }
    }
}
