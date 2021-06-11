package com.example.class1lecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // variable
        val v=10
        val y=20
        var x=100
        x=20
       //strings
        val name = "Mugdha"
        val surname= "Hazra"
        val fulname=name+" "+surname
        println(fulname)
        println(v*y)
        println("hee everyone")
        val isalive=true

        // predefining a varaible
        val myInt : Int=5
        val myDouble: Double=2.9
        val myString: String="Pranita"
        val myBool : Boolean= true

        // Arrays
        val myArray= arrayOfNulls<String>(4)
        //inserting an element in an array
        myArray[0]="Mugdha"
        myArray[1]="Ram"
        myArray[2]="Madhu"
        myArray[3]="Raju"
        println(myArray[2])

        val myNumber= intArrayOf(10,23,44,55,66,77,88)
        println(myNumber.size)

        myNumber.set(2,30)
        println(myNumber[2])
        myNumber.get(2)



        //List
        val myMusicians=ArrayList<String>()
        myMusicians.add("James")
        myMusicians.add("Mugdha")
        myMusicians.add("Sanket")

        println(myMusicians)
        myMusicians.add(1,"Kirk")
        println(myMusicians)

        myMusicians.add("Kirk")
        println(myMusicians)

        //Sets

        val myset = HashSet<String>()
        myset.add("Mugdha")
        myset.add("Madhu")
        myset.add("Mugdha")
        println(myset.size)

        //Maps
        val myHashMap=HashMap<String,String>()
        myHashMap.put("names","James")
        myHashMap.put("instrument","Piano")
        println(myHashMap["names"])
        println(myHashMap["instrument"])

        var m=5
        println(m)
        m*=1
        ++m
        println(m<1)
         val n=10
        //if conditions
        if(m>n)
        {
            println("M is greater then n")
        }
        else if(m==n)
        {
            println("m is equal to n")
        }
        else
        {
            println("M is smaller than n")
        }
        var daystring=""
        var day=2
        when(day)
        {
            1-> daystring="1"
            2-> daystring="Tuesday"
            else-> daystring="Sunday"
        }
        println(daystring)

        val myNumber2= intArrayOf(11,22,33,445,66,77,74)
        val q=myNumber2[0]/3*5
        println(q)
         for(number in myNumber2)
         {
             val z=number/3*5
             println(z)
         }

        for( i in myNumber2.indices)
        {
            val y=myNumber2[i]/3*5
            println(y)
        }

        for(a in 0..9)
        {
            val b=a*10
            println(b)
        }

        // while loops

        var j=0
        while(j<10)
        {
            val x=j*10
            println(x)
            j++

        }
    }
}