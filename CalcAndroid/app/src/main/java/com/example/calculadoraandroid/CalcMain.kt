package com.example.calculadoraandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class CalcMain : AppCompatActivity() {
    //0 - nada, 1 - Suma, 2 - Resta, 3 - Mult, 4 - Div
    var oper: Int = 0
    var valor1: Double = 0.0
    lateinit var tv_num1: TextView
    lateinit var tv_num2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calc_main)

        tv_num1 = findViewById(R.id.tv_num1)
        tv_num2 = findViewById(R.id.tv_num2)

        val btnClear: Button = findViewById(R.id.btnClear)
        val btnIgual: Button = findViewById(R.id.btnIgual)

        btnIgual.setOnClickListener{
            var valor2: Double = tv_num2.text.toString().toDouble()
            var resp: Double = 0.0

            when(oper){
                1 -> resp = valor1 + valor2
                2 -> resp = valor1 - valor2
                3 -> resp = valor1 * valor2
                4 -> {

                    if (valor1 == 0.0 || valor2 == 0.0){
                        Toast.makeText(this,"No puedes dividir por cero!",Toast.LENGTH_SHORT).show()
                        tv_num1.setText("")
                        tv_num2.setText("")
                        valor1 = 0.0
                        oper = 0
                    }else{
                        resp = valor1 / valor2
                    }
                }
            }
            tv_num2.setText(resp.toString())
            tv_num1.setText("")
        }

        btnClear.setOnClickListener{
            tv_num1.setText("")
            tv_num2.setText("")
            valor1 = 0.0
            oper = 0
        }
    }

    fun presionarDigito(view: View){
        //val tv_operacion: TextView = findViewById(R.id.tv_operacion)
        var opr: String = tv_num2.text.toString()

        when(view.id){
            //pone los tecleos de digitos y modificadores en el tv_operacion
            R.id.btn0 -> tv_num2.setText(opr + "0")
            R.id.btn1 -> tv_num2.setText(opr + "1")
            R.id.btn2 -> tv_num2.setText(opr + "2")
            R.id.btn3 -> tv_num2.setText(opr + "3")
            R.id.btn4 -> tv_num2.setText(opr + "4")
            R.id.btn5 -> tv_num2.setText(opr + "5")
            R.id.btn6 -> tv_num2.setText(opr + "6")
            R.id.btn7 -> tv_num2.setText(opr + "7")
            R.id.btn8 -> tv_num2.setText(opr + "8")
            R.id.btn9 -> tv_num2.setText(opr + "9")
            R.id.btnDecimal -> tv_num2.setText(opr + ".")
        }

    }

    fun clicOperacion(view: View){
        valor1 = tv_num2.text.toString().toDouble()
        var oprText: String = tv_num2.text.toString()
        tv_num2.setText("")
        when(view.id){
            R.id.btnMas ->{
                tv_num1.setText(oprText + "+")
                oper = 1
            }
            R.id.btnMenos ->{
                tv_num1.setText(oprText + "-")
                oper = 2
            }
            R.id.btnMult ->{
                tv_num1.setText(oprText + "*")
                oper = 3
            }
            R.id.btnDiv ->{
                tv_num1.setText(oprText + "/")
                oper = 4
            }
        }
    }

}