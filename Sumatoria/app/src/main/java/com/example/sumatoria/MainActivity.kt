package com.example.sumatoria

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var num1:EditText
    private lateinit var num2:EditText
    private lateinit var txt_total:TextView
    private lateinit var cargarImagen: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
    }
    private fun bind(){
        num1 = findViewById(R.id.id_input_num1)
        num2 = findViewById(R.id.id_input_num2)
        txt_total = findViewById(R.id.Resultado_total)
        cargarImagen = findViewById(R.id.PoroImagen)
    }
    fun Suma(view: View){

        var total= num1.getText().toString().toInt() + num2.getText().toString().toInt()
        txt_total.text="total de la suma es: $total"
    }
}