package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{
    lateinit var editText: EditText
    lateinit var textView: TextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.inputID)
        textView = findViewById(R.id.showID)
        button = findViewById(R.id.btnShowID)
        button.setOnClickListener(this)
        textView.setOnClickListener(this)
        // second click listener
       /* val clickListener=object :View.OnClickListener{
            override fun onClick(v: View?) {
                when(v?.id){
                    R.id.showID->{
                        val result = editText.text
                        textView.text = "Hello input $result"
                    }
                    R.id.btnShowID->{
                        val result = editText.text
                        textView.text = "Hello View $result"
                    }
                }

            }

        }
         button.setOnClickListener(clickListener)
        textView.setOnClickListener (clickListener)*/


        // Recommended click listener
        /*button.setOnClickListener {
            val result = editText.text
            textView.text = "Hello input $result"
        }
        textView.setOnClickListener {
            val result = editText.text
            textView.text = "Hello View $result"
        }*/
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.showID->{
                val result = editText.text
                textView.text = "Hello input $result"
            }
            R.id.btnShowID->{
                val result = editText.text
                textView.text = "Hello View $result"
            }
        }
    }

    /*override fun onClick(v: View?) {
        val result=editText.text
        textView.text="Hello input $result"

    }*/
}