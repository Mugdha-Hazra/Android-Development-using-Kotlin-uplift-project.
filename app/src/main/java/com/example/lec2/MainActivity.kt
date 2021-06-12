package com.example.lec2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var age:Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
        println(sum(5,9))

        val op=Sum()
        println(op.Sum(5,9))
        val op2=Div()
        println(op2.Div(20,4))
        println(op.Div(40,4))

    }

    // create a function
    fun test(){
        val x=5*4
        println(x)
        println("test test test")
    }

    // another way of creating a function
    fun sum(a:Int,b:Int):Int{
        return a+b
    }

    fun Hello_World(view: View)
    {
        textView.text="Hii Everyone!!"
    }

    fun make_simpson(view:View)
    {
        val name=name_text.text.toString()
        if(!age_text.text.toString().equals("")){
        val age=age_text.text.toString().toInt()}
        val job=job_text.text.toString()
        val bio=Simpson(name,age,job)
       //to assign the values in the test view
        textView.text="Name :"+bio.name+" Age :"+bio.age+" Job :"+bio.job
    }

    //Null safety

    //Inheritance
    class Sum:Div(){
        fun Sum(a:Int,b: Int):Int{
            return a+b
        }
    }
    open class Div{
        fun Div(a: Int,b: Int):Int
        {
            return a/b
        }
    }


}