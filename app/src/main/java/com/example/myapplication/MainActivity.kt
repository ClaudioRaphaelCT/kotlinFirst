package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calcular.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        calculate();
    }



    private fun calculate() {
        if(binding.distancia.text.toString() == "" && binding.preco.text.toString() == "" && binding.autonomia.text.toString() == ""){
            return Toast.makeText(this, "Preencha os campos corretamente", Toast.LENGTH_SHORT).show()
        }
        val distancia = binding.distancia.text.toString().toFloat();
        val preco = binding.preco.text.toString().toFloat();
        val autonomia = binding.preco.text.toString().toFloat();
        val valorTotal = (distancia * preco) / autonomia
        binding.gastoTotal.text = "R$ ${"%.2f".format(valorTotal)}"








       // Toast.makeText(this, valorTotalStr, Toast.LENGTH_SHORT).show()
    }
}