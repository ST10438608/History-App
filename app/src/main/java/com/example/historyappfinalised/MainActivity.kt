package com.example.historyappfinalised

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val user_age = findViewById<EditText>(R.id.editTextNumber)
        val historical_data = findViewById<TextView>(R.id.textView2)
        val generate = findViewById<Button>(R.id.button)
        val clear = findViewById<Button>(R.id.button2)


        val text_bubble = findViewById<ImageView>(R.id.imageView)
        historical_data.setVisibility(View.INVISIBLE)
        text_bubble.setVisibility(View.INVISIBLE)


        generate?.setOnClickListener {

            //Setting the user_age variable equal to a new variable so I don't have to change it to int type each time.
            val age = user_age.text.toString().toInt()
            val result: String

            //If statements for the 10 different ages, if one of these ages are entered then data is outputted.
            if (age == 95) {

                //The textview and imageview have to be made visible when the button is pressed.
                text_bubble.setVisibility(View.VISIBLE)
                historical_data.setVisibility(View.VISIBLE)
                result =
                    "You are 95 years old. This is the same age that Nelson Mandela passed away. He was a famous Philanthropist, politician and activist."


            } else if (age == 52) {
                text_bubble.setVisibility(View.VISIBLE)
                historical_data.setVisibility(View.VISIBLE)
                result =
                    "You are 52 years old. This is the same age that William Shakespeare passed away. He is regarded as one of the greatest poets."

            }

            else if (age == 76) {
                text_bubble.setVisibility(View.VISIBLE)
                historical_data.setVisibility(View.VISIBLE)
                result = "You are 76 years old. This is the same age that Albert Einstein passed away. He was a genius scientist."
            }

            else if (age == 78) {
                text_bubble.setVisibility(View.VISIBLE)
                historical_data.setVisibility(View.VISIBLE)
                result = "You are 78 years old. This is the same age that Gandhi passed away. He was a famous political ethicist and lawyer."
            }

            else if (age == 39) {
                text_bubble.setVisibility(View.VISIBLE)
                historical_data.setVisibility(View.VISIBLE)
                result = "You are 39 years old. This is the same age that Martin Luther King Jr. passed away. He was a famous activist and political philosopher."
            }

            else if (age == 73) {
                text_bubble.setVisibility(View.VISIBLE)
                historical_data.setVisibility(View.VISIBLE)
                result = "You are 73 years old. This is the same age that Charles Darwin passed away. He was a famous geologist and biologist."
            }

            else if (age == 67) {
                text_bubble.setVisibility(View.VISIBLE)
                historical_data.setVisibility(View.VISIBLE)
                result = "You are 67 years old. This is the same age that Leonardo da Vinci passed away. He was a genius polymath, mostly known for his art."
            }

            else if (age == 84) {
                text_bubble.setVisibility(View.VISIBLE)
                historical_data.setVisibility(View.VISIBLE)
                result = "You are 84 years old. This is the same age that Isaac Newton passed away. He was a genius mathematician and physicist."
            }

            else if (age == 54) {
                text_bubble.setVisibility(View.VISIBLE)
                historical_data.setVisibility(View.VISIBLE)
                result = "You are 54 years old. This is the same age that Christopher Columbus passed away. He was an Italian explorer and navigator."
            }

            else if (age == 35) {
                text_bubble.setVisibility(View.VISIBLE)
                historical_data.setVisibility(View.VISIBLE)
                result = "You are 35 years old. This is the same age that Mozart passed away. He was a genius and influential composer."
            }

            //If a number that is within range but isn't one of the ten is inputted this message is outputted.
            else {
                text_bubble.setVisibility(View.VISIBLE)
                historical_data.setVisibility(View.VISIBLE)
                result = "There is no historical data for this age."
            }
            //Error handling for if the user enters a number that is out of range.
            if (age < 20 || age > 100 ) {
                historical_data.text = "Age is out of range. Number must be between 20 and 100"
            } else {
                historical_data.text = result
            }

            //Coding for the clear button. It simply makes the textview invisible.
            clear?.setOnClickListener {
                text_bubble.setVisibility(View.INVISIBLE)
                historical_data.setVisibility(View.INVISIBLE)
            }
        }
    }
}