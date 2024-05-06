package com.example.mytamagotchizoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonnext = findViewById<Button>(R.id.buttonnext)
        buttonnext.setOnClickListener {
            val intent = Intent(applicationContext, MyZoeapp::class.java)
            startActivity(intent)
        }







    }
}