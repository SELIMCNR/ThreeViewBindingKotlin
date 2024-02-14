package com.cinar.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cinar.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //FindView de çok fazla işlem yapıyor verimsiz
        //View Binding az işlem yapıyor verimli bunu kullan
        binding.textView.setText("Boş metin")
        
        binding.editText.setText("Boş input")

        binding.button.setText("Yazdır")
        binding.button.setOnClickListener {
            binding.textView.text ="Hello binding"
            binding.textView.textSize = 24f
            binding.textView.textAlignment = View.TEXT_ALIGNMENT_CENTER


            binding.editText.setText("Binding Activated")
            binding.editText.textSize = 24f
            binding.editText.textAlignment = View.TEXT_ALIGNMENT_CENTER

            binding.button.setText("Tıklandı")
            binding.button.textSize = 24f
            binding.button.hint = ""
        }

        binding.button2.setText("Sil")
        binding.button2.setOnClickListener {
            binding.textView.text=""
            binding.editText.setText("")
            binding.textView.hint = "Deleted"
            binding.editText.hint = "Deleted"

            binding.button2.setText("Tıklandı")
            binding.button2.textSize = 24f
            binding.button2.width = 75
        }


    }
}
