package com.luizafmartinez.at02_simplecalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.luizafmartinez.at02_simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val n1 = binding.edtnumber1.text
        val n2 = binding.edtNumber2.text

        binding.btnPlus.setOnClickListener {
            var sumResult = n1.toString().toDouble() + n2.toString().toDouble()
            binding.txtResult.text = sumResult.toString()
        }

        binding.btnMinus.setOnClickListener {
            var sumResult = n1.toString().toDouble() - n2.toString().toDouble()
            binding.txtResult.text = sumResult.toString()
        }

        binding.btnMultiply.setOnClickListener {
            var sumResult = n1.toString().toDouble() * n2.toString().toDouble()
            binding.txtResult.text = sumResult.toString()
        }

        binding.btnDivide.setOnClickListener {
            var sumResult = n1.toString().toDouble() / n2.toString().toDouble()
            binding.txtResult.text = sumResult.toString()
        }
    }
}