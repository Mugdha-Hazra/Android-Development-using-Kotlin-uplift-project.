package com.example.calculate_me_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Sum(view: View){
        val a=num1.text.toString().toInt()
        val b=num2.text.toString().toInt()
        val Result=a+b
        textView_Result.text="Result $Result"
    }
    fun Sub(view: View){
        val a=num1.text.toString().toInt()
        val b=num2.text.toString().toInt()
        val Result=a-b
        textView_Result.text="Result $Result"
    }
    fun Div(view: View){
        val a=num1.text.toString().toInt()
        val b=num2.text.toString().toInt()
        val Result=a/b
        textView_Result.text="Result $Result"
    }
    fun Mul(view: View){
        val a=num1.text.toString().toInt()
        val b=num2.text.toString().toInt()
        val Result=a*b
        textView_Result.text="Result $Result"
    }
}