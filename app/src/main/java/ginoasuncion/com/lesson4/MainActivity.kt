package ginoasuncion.com.lesson4

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceNumberText: TextView = findViewById(R.id.diceNumber)
        val rollButton: Button = findViewById(R.id.rollButton)

        rollButton.setOnClickListener {
            val randomNumber = Random.nextInt(1, 7)
            diceNumberText.text = randomNumber.toString()
        }
    }
}
