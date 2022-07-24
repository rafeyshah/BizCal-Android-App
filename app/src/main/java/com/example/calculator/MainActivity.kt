package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import com.example.calculator.databinding.ActivityMainBinding
import java.lang.StringBuilder
import javax.script.ScriptEngine
import javax.script.ScriptEngineManager
import javax.script.ScriptException

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var check = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* Adding Scrolling Movement method and showcases its pressed */
        binding.inputText.movementMethod = ScrollingMovementMethod()
        binding.inputText.isActivated = true
        binding.inputText.isPressed = true

        /* onClicking Button show it to EditText */
        var text: String

        binding.button1.setOnClickListener {
            text = binding.inputText.text.toString() + "1"
            binding.inputText.setText(text)
            result(text)
        }
        binding.button0.setOnClickListener {
            text = binding.inputText.text.toString() + "0"
            binding.inputText.setText(text)
            result(text)
        }
        binding.button2.setOnClickListener {
            text = binding.inputText.text.toString() + "2"
            binding.inputText.setText(text)
            result(text)
        }
        binding.button3.setOnClickListener {
            text = binding.inputText.text.toString() + "3"
            binding.inputText.setText(text)
            result(text)
        }
        binding.button4.setOnClickListener {
            text = binding.inputText.text.toString() + "4"
            binding.inputText.setText(text)
            result(text)
        }
        binding.button5.setOnClickListener {
            text = binding.inputText.text.toString() + "5"
            binding.inputText.setText(text)
            result(text)
        }
        binding.button6.setOnClickListener {
            text = binding.inputText.text.toString() + "6"
            binding.inputText.setText(text)
            result(text)
        }
        binding.button7.setOnClickListener {
            text = binding.inputText.text.toString() + "7"
            binding.inputText.setText(text)
            result(text)
        }
        binding.button8.setOnClickListener {
            text = binding.inputText.text.toString() + "8"
            binding.inputText.setText(text)
            result(text)
        }
        binding.button9.setOnClickListener {
            text = binding.inputText.text.toString() + "9"
            binding.inputText.setText(text)
            result(text)
        }
        binding.button00.setOnClickListener {
            text = binding.inputText.text.toString() + "00"
            binding.inputText.setText(text)
            result(text)
        }
        binding.buttonPoint.setOnClickListener {
            text = binding.inputText.text.toString() + "."
            binding.inputText.setText(text)
            result(text)
        }
        binding.buttonDivide.setOnClickListener {
            text = binding.inputText.text.toString() + "/"
            binding.inputText.setText(text)
            check += 1
        }
        binding.buttonMinus.setOnClickListener {
            text = binding.inputText.text.toString() + "-"
            binding.inputText.setText(text)
            check += 1
        }
        binding.buttonPlus.setOnClickListener {
            text = binding.inputText.text.toString() + "+"
            binding.inputText.setText(text)
            check += 1
        }
        binding.buttonMultiply.setOnClickListener {
            text = binding.inputText.text.toString() + "*"
            binding.inputText.setText(text)
            result(text)
        }
        binding.buttonPercent.setOnClickListener {
            text = binding.inputText.text.toString() + "%"
            binding.inputText.setText(text)
            check += 1
        }
        binding.buttonEqual.setOnClickListener {
            text = binding.result.text.toString()
            binding.inputText.setText(text)
            binding.result.text = null
        }
        binding.clear.setOnClickListener {
            binding.inputText.text = null
            binding.result.text = null

        }
        binding.buttonBackspace.setOnClickListener {
            val backSpace: String?
            if (binding.inputText.length() > 0) {
                val stringBuilder = StringBuilder(binding.inputText.text)
                val find = binding.inputText.text.toString().last()

                if (find == '+' || find == '-' || find == '*' || find == '/' || find == '%'
                ) {
                    check -= 1
                }

                stringBuilder.deleteCharAt(binding.inputText.length()-1)
                backSpace = stringBuilder.toString()
                binding.inputText.setText(backSpace)
                result(backSpace)
            }
        }
    }

    private fun result(text: String) {
        /* Very Powerful statement to use javascript operation on Kotlin */
        val engine:ScriptEngine = ScriptEngineManager().getEngineByName("rhino")

        try {
            //  Eval in Javascript solves expression
            val result: Any = engine.eval(text)
            val mainr = result.toString()
            if(check==0){
                binding.result.text = null
            }
            else{
                binding.result.setText(mainr)
            }

        }catch (e: ScriptException){
            Log.d("TAG", "result: Error")
        }
    }
}