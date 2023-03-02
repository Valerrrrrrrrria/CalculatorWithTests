package com.example.caclulatorwithtests

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import com.example.caclulatorwithtests.calculator.Calculator
import com.example.caclulatorwithtests.databinding.ActivityMainBinding
import com.example.caclulatorwithtests.utils.ConvertUtils


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val calculator = Calculator()
        var firstNum: Int? = null
        var secondNum: Int? = null

        binding.firstNum.addTextChangedListener {
            firstNum = ConvertUtils.stringToInteger(it.toString())
        }

        binding.secondNum.addTextChangedListener {
            secondNum = ConvertUtils.stringToInteger(it.toString())
        }

        binding.plusButton.setOnClickListener {
            if (calculator.checkIfNotNull(firstNum, secondNum)) {
                binding.resultTextView.text = calculator.add(firstNum!!, secondNum!!).toString()
            } else return@setOnClickListener
        }

        binding.subtractButton.setOnClickListener {
            if (calculator.checkIfNotNull(firstNum, secondNum)) {
                binding.resultTextView.text = calculator.subtract(firstNum!!, secondNum!!).toString()
            } else return@setOnClickListener
        }

        binding.multiplyButton.setOnClickListener {
            if (calculator.checkIfNotNull(firstNum, secondNum)) {
                binding.resultTextView.text = calculator.multiply(firstNum!!, secondNum!!).toString()
            } else return@setOnClickListener
        }

        binding.divideButton.setOnClickListener {
            if (calculator.checkIfNotNull(firstNum, secondNum)) {
                binding.resultTextView.text = calculator.divide(firstNum!!, secondNum!!).toString()
            } else return@setOnClickListener
        }
    }
}