package com.example.testapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private companion object {
        val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(toastButton: View) {
        val myToast = Toast.makeText(this, "Hello toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(countButton: View) {
        val curText = textView.text.toString()

        textView.text = (curText.toInt()+1).toString()
    }

    fun randomMe(randomButton: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)

        val curValue = textView.text.toString().toInt()
        randomIntent.putExtra(TOTAL_COUNT, curValue)

        startActivity(randomIntent)
    }
}
