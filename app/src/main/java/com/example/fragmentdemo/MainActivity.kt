package com.example.fragmentdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //instance of the fragment
        val welcomeFg = WelcomeFragment();

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainFg, welcomeFg)
            commit()
        }

        val btnAbout = findViewById<Button>(R.id.btnAbout)

        btnAbout.setOnClickListener(){
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)

        }

    }
}