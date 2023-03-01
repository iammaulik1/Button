package com.example.a3buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button_1 :Button
    lateinit var button_2 :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1=findViewById(R.id.button_1)
        button_2=findViewById(R.id.button_2)

        button_1.setOnClickListener{
            Toast.makeText(applicationContext,"Button 1 Clicked",Toast.LENGTH_SHORT).show()
        }
       button_2.setOnClickListener {
           Toast.makeText(applicationContext,"Button 2 Clicked",Toast.LENGTH_SHORT).show()
       }



    }

    fun onClick(view: View){
        when(view.id){
            R.id.button_2 ->
                Toast.makeText(this,"Button 2 Clicked",Toast.LENGTH_SHORT).show()

        }
    }
    fun clickButton(v: View){
        val myToast = Toast.makeText(applicationContext,"Button 3 Clicked",Toast.LENGTH_SHORT)
        myToast.show()
    }
}