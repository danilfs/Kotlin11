package com.example.kotlin11

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var click_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            initView()
    }
    private fun initView(){
        findViewById<Button>(R.id.click_button).setOnClickListener{
            Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
        }
    findViewById<Button>(R.id.data_class).setOnClickListener{
        val spb = Weather(12, "Saint-Petersburg")
        Toast.makeText(this, spb.toString(), Toast.LENGTH_SHORT).show()

        val samara = spb.copy(city = "Samara")
        println(samara)
    }
        findViewById<Button>(R.id.while_circle).setOnClickListener{
            var i = 2
            while (i<10){
                println("While ${i++}")
            }
        }
        findViewById<Button>(R.id.for_circle).setOnClickListener{
            for (i in 10 downTo 1){
                println("for $i")
            }
        }
    }
}

