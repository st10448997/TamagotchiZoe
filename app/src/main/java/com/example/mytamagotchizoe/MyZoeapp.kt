package com.example.mytamagotchizoe

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView


class MyZoeapp : AppCompatActivity() {
    private var pethunger = 100
    private var pethealth = 90
    private var petcleanliness = 50

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_zoeapp)

        // Set the buttons and text views
        val btnfeed = findViewById<Button>(R.id.btnfeed)
        val btnclean = findViewById<Button>(R.id.btnclean)
        val btnplay = findViewById<Button>(R.id.btnplay)
        val txthunger = findViewById<EditText>(R.id.txthunger)
        val txthappy = findViewById<EditText>(R.id.txthappy)
        val txtclean = findViewById<EditText>(R.id.txtclean)
        val petimage = findViewById<ImageView>(R.id.petimage)


        // Set the initial text view
        txthunger.setText(pethunger.toString())
        txthappy.setText(pethealth.toString())
        txtclean.setText(petcleanliness.toString())

        // Handle buttons clicks
        btnfeed.setOnClickListener {
            pethunger += 10
            pethealth += 10
            petcleanliness += 5

            txthunger.setText(pethunger.toString())

            R.drawable._ba5c84112f9e4c80dc7ec77f2569ffe.animateImangechange(petimage)
        }

        btnclean.setOnClickListener {
            petcleanliness += 10
            pethealth += 10

            txtclean.setText(petcleanliness.toString())
            R.drawable.depositphotos_15642489_stock_illustration_cartoon_dog_and_poo.animateImangechange(petimage)

        }

        btnplay.setOnClickListener {
            pethealth += 10

            txthappy.setText(pethealth.toString())
            R.drawable._d_rendering_cartoon_dog_portrait_23_2150907206.animateImangechange(petimage)

        }


    }

    }

private fun Int.animateImangechange(petimage: ImageView?) {

}



