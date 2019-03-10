package com.example.testapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    private companion object {
        val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showRandomNumber()
    }

    private fun showRandomNumber() {
        val count = intent.extras.getInt(TOTAL_COUNT)
        val random = Random()

        textviewRandom.text = if(count == 0) "0" else random.nextInt(count).toString()
        textviewLabel.text = getString(R.string.random_heading, count)
    }
}
