package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_0.setOnClickListener{ setTextFields("0")}
        btn_1.setOnClickListener{ setTextFields("1")}
        btn_2.setOnClickListener{ setTextFields("2")}
        btn_3.setOnClickListener{ setTextFields("3")}
        btn_4.setOnClickListener{ setTextFields("4")}
        btn_5.setOnClickListener{ setTextFields("5")}
        btn_6.setOnClickListener{ setTextFields("6")}
        btn_7.setOnClickListener{ setTextFields("7")}
        btn_8.setOnClickListener{ setTextFields("8")}
        btn_9.setOnClickListener{ setTextFields("9")}
        minus_btn.setOnClickListener{ setTextFields("-")}
        plus_btn.setOnClickListener{ setTextFields("+")}
        open_br.setOnClickListener{ setTextFields("(")}
        close_br.setOnClickListener{ setTextFields(")")}
        slsh_btn.setOnClickListener{ setTextFields("/")}
        mlt_btn.setOnClickListener{ setTextFields("*")}
        AC_btn.setOnClickListener{
            math_operation.text=""
            result_text.text=""
        }
        btn_back.setOnClickListener{
             val str = math_operation.text.toString()
             if(str.isNotEnpty())
                 math_operation.text = str.substring(0,str.length-1)
             result_text.text=""
        }
        equal_btn.setOnClickListener{
            try{

                val ex = ExpressionBuilder(math_operation.text.toString())
                val result = ex.evaluate()
                val longres = result.toLong()
                if(result = longres.toDouble){
                    result_text.text = longres.toString()
                }
                else{
                    result_text.text = result.toString()
                }

            } catch(e:Exception){
                Log.d("Error","message: ${e.message}")
            }
        }

    }
    fun setTextFields(str: String){
        math_operation.append(str)


    }
}
