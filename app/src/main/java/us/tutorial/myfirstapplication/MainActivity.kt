package us.tutorial.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btnClickMe = findViewById<Button>(R.id.Click_Me)
        val textField = findViewById<TextView>(R.id.CenterText)
        var timesClicked = 0

        btnClickMe.setOnClickListener {
            timesClicked += 1

            textField.text = timesClicked.toString()
            Toast.makeText(this, "Hey Im a toast!", Toast.LENGTH_LONG).show()
        }
    }
}