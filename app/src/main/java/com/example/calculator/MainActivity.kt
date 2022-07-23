package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;

    var check = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* Adding Scrolling Movement method and showcases its pressed */
        binding.inputText.movementMethod = ScrollingMovementMethod()
        binding.inputText.isActivated = true;
        binding.inputText.isPressed = true;

        /* onClicking Button show it to EditText */
        var text: String;

        binding.button1.setOnClickListener{
            text = binding.inputText.text.toString()+"1";
            binding.inputText.setText(text);
            result(text)
        }
        binding.button0.setOnClickListener{
            text = binding.inputText.text.toString()+"0";
            binding.inputText.setText(text);
            result(text)
        }
        binding.button2.setOnClickListener{
            text = binding.inputText.text.toString()+"2";
            binding.inputText.setText(text);
            result(text)
        }
        binding.button3.setOnClickListener{
            text = binding.inputText.text.toString()+"3";
            binding.inputText.setText(text);
            result(text)
        }
        binding.button4.setOnClickListener{
            text = binding.inputText.text.toString()+"4";
            binding.inputText.setText(text);
            result(text)
        }
        binding.button5.setOnClickListener{
            text = binding.inputText.text.toString()+"5";
            binding.inputText.setText(text);
            result(text)
        }
        binding.button6.setOnClickListener{
            text = binding.inputText.text.toString()+"6";
            binding.inputText.setText(text);
            result(text)
        }
        binding.button7.setOnClickListener{
            text = binding.inputText.text.toString()+"7";
            binding.inputText.setText(text);
            result(text)
        }
        binding.button8.setOnClickListener{
            text = binding.inputText.text.toString()+"8";
            binding.inputText.setText(text);
            result(text)
        }
        binding.button9.setOnClickListener{
            text = binding.inputText.text.toString()+"9";
            binding.inputText.setText(text);
            result(text)
        }
        binding.button00.setOnClickListener{
            text = binding.inputText.text.toString()+"00";
            binding.inputText.setText(text);
            result(text)
        }
        binding.buttonPoint.setOnClickListener{
            text = binding.inputText.text.toString()+".";
            binding.inputText.setText(text);
            result(text)
        }
        binding.buttonDivide.setOnClickListener{
            text = binding.inputText.text.toString()+"/";
            binding.inputText.setText(text);
            result(text)
        }
        binding.buttonMinus.setOnClickListener{
            text = binding.inputText.text.toString()+"-";
            binding.inputText.setText(text);
            result(text)
        }
        binding.buttonPlus.setOnClickListener{
            text = binding.inputText.text.toString()+"+";
            binding.inputText.setText(text);
            result(text)
        }
        binding.buttonMultiply.setOnClickListener{
            text = binding.inputText.text.toString()+"*";
            binding.inputText.setText(text);
            result(text)
        }
        binding.buttonPercent.setOnClickListener{
            text = binding.inputText.text.toString()+"%";
            binding.inputText.setText(text);
            result(text)
        }
    }

    private fun result(text: String) {

    }
}