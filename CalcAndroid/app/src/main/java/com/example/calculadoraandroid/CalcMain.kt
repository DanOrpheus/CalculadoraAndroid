package com.example.calculadoraandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class CalcMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calc_main)
    }

    fun presionarDigito(view: View){
        val tv_operacion: TextView = findViewById(R.id.tv_operacion)
        var opr: String = tv_operacion.text.toString()

        when(view.id){
            //pone los tecleos de digitos y modificadores en el tv_operacion
            R.id.btn0 -> tv_operacion.setText(opr + "0")
            R.id.btn1 -> tv_operacion.setText(opr + "1")
            R.id.btn2 -> tv_operacion.setText(opr + "2")
            R.id.btn3 -> tv_operacion.setText(opr + "3")
            R.id.btn4 -> tv_operacion.setText(opr + "4")
            R.id.btn5 -> tv_operacion.setText(opr + "5")
            R.id.btn6 -> tv_operacion.setText(opr + "6")
            R.id.btn7 -> tv_operacion.setText(opr + "7")
            R.id.btn8 -> tv_operacion.setText(opr + "8")
            R.id.btn9 -> tv_operacion.setText(opr + "9")
            R.id.btnDecimal -> tv_operacion.setText(opr + ".")

            /*R.id.btnMas -> tv_operacion.setText(opr + "+")
            R.id.btnMenos -> tv_operacion.setText(opr + "-")
            R.id.btnDiv -> tv_operacion.setText(opr + "0")
            R.id.btnMult -> tv_operacion.setText(opr + "0")
            R.id.btnIgual -> tv_operacion.setText(opr + "0")
            R.id.btnClear -> tv_operacion.setText(opr + "0")*/
        }

    }

}