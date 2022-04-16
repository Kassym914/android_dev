package com.example.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    companion object {
        private const val INPUT = "input"
        private const val OUTPUT = "output"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_0.setOnClickListener { setTextToBlock("0") }
        btn_1.setOnClickListener { setTextToBlock("1") }
        btn_2.setOnClickListener { setTextToBlock("2") }
        btn_3.setOnClickListener { setTextToBlock("3") }
        btn_4.setOnClickListener { setTextToBlock("4") }
        btn_5.setOnClickListener { setTextToBlock("5") }
        btn_6.setOnClickListener { setTextToBlock("6") }
        btn_7.setOnClickListener { setTextToBlock("7") }
        btn_8.setOnClickListener { setTextToBlock("8") }
        btn_9.setOnClickListener { setTextToBlock("9") }
        btn_openBracket.setOnClickListener { setTextToBlock("(") }
        btn_closedBracket.setOnClickListener { setTextToBlock(")") }
        btn_multiply.setOnClickListener { setTextToBlock("*") }
        btn_divide.setOnClickListener { setTextToBlock("/") }
        btn_plus.setOnClickListener { setTextToBlock("+") }
        btn_minus.setOnClickListener { setTextToBlock("-") }

        btn_AC.setOnClickListener {
            math_operation.text = ""
            result_text.text = ""
        }

        btn_back.setOnClickListener {
            val s = math_operation.text.toString()
            if(s.isNotEmpty()){
                math_operation.text = s.substring(0,s.length-1)
            }
            result_text.text = ""
        }

        btn_equals.setOnClickListener {
            try{
                val exe = ExpressionBuilder(math_operation.text.toString()).build()
                val res = exe.evaluate()
                result_text.text = res.toString()
            }
            catch(e:Exception) {
                Log.d("Error","message:${e.message}")
            }
        }
    }

    fun setTextToBlock(str: String){
        math_operation.append(str)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val input = math_operation.text.toString();
        val output = result_text.text.toString();
        outState.putString(INPUT, input)
        outState.putString(OUTPUT, output)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val inp = savedInstanceState.getString(INPUT)
        val out = savedInstanceState.getString(OUTPUT)
        math_operation.text = inp
        result_text.text = out
    }
}