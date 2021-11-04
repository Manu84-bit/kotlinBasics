package manu84.bit.demo_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        val clickBtn = findViewById<Button>(R.id.clickBtn)
        val hiText = findViewById<TextView>(R.id.hiText)

        clickBtn.setOnClickListener {
            counter++
            hiText.text = counter.toString()
            Toast.makeText(this, "I'm a toast", Toast.LENGTH_LONG).show()
        }

    }
}