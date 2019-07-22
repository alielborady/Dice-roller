package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollDice = findViewById<Button>(R.id.rollDice)
        val number = findViewById<TextView>(R.id.number)
        val seekBar = findViewById<SeekBar>(R.id.limit)

        rollDice.setOnClickListener {
            if(seekBar.progress ==0){
                number.text = "0"
            }else {
                val rand = java.util.Random().nextInt(seekBar.progress) +1
                number.text = rand.toString()
            }

        }

    }
}
