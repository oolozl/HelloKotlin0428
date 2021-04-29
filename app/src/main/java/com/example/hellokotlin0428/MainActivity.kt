package com.example.hellokotlin0428

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJava = findViewById<Button>(R.id.btnJava)
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)
        val btnVarJava = findViewById<Button>(R.id.btnJava)
        val btnVarKotlin = findViewById<Button>(R.id.btnVarKotlin)

        btnJava.setOnClickListener {

            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }
        btnKotlin.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))

            btnVarJava.setOnClickListener {
                startActivity(Intent(this@MainActivity,VariableJavaActivity::class.java))
            }
            btnVarKotlin.setOnClickListener {
                startActivity(Intent(this@MainActivity,VariableKotlinActivity::class.java))
            }
        }
    }
}