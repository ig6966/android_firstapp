package com.example.testapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(toastButton: View) {
        val myToast = Toast.makeText(this, "Hello toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(countButton: View) {
        val textView = findViewById<TextView>(R.id.textView)
        val curText = textView.text.toString()

        textView.text = (curText.toInt()+1).toString()
    }
}
