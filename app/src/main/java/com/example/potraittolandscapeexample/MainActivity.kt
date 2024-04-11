package com.example.potraittolandscapeexample

import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
    * This function is called when showMessage button is pressed.
    * It checks the orientation of the phone to show different messages
    */
    fun showMessageButton(view: View) {
        val message: String
        // Check the orientation to show different messages
        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            message = "We are in portrait orientation"
        } else {
            message = "We are in landscape orientation"
        }

        // Display the message
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}