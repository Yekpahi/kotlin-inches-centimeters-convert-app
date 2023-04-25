package fr.prince.convertapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val inchValue = 2.54
    private lateinit var enterInches : EditText
    private lateinit var convertButton: Button
    private lateinit var textViewCentimeters: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enterInches = findViewById(R.id.edit_id)
        convertButton = findViewById(R.id.butt_id)
        textViewCentimeters = findViewById(R.id.result_id)


        //onclick on button

        convertButton.setOnClickListener {
            if (enterInches.text.toString().isNotEmpty()) {
                val result = enterInches.text.toString().toDouble() * inchValue
                textViewCentimeters.text = result.toString()
            } else {
                textViewCentimeters.text = getString(R.string.erro_text)
            }
        }
    }
}