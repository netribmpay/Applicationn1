package com.example.laba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.laba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding){
            val dog1 = dogs[0]
            tvName1.text = dog1.name
            tvDescription1.text = dog1.description

            val dog2 = dogs[1]
            tvName2.text = dog2.name
            tvDescription2.text = dog2.description

            val dog3 = dogs[2]
            tvName3.text = dog3.name
            tvDescription3.text = dog3.description

            val button1 = findViewById<Button>(R.id.button1)
            val button2 = findViewById<Button>(R.id.button2)
            val button3 = findViewById<Button>(R.id.button3)

            button1.setOnClickListener{
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra(dogs_array, dogs[0])
                startActivity(intent)
            }
            button2.setOnClickListener{
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra(dogs_array, dogs[1])
                startActivity(intent)
            }
            button3.setOnClickListener{
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra(dogs_array, dogs[2])
                startActivity(intent)
            }
        }
    }

    companion object {
        val dogs_array = "dog1"
    }
}