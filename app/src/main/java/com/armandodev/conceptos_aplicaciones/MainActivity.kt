package com.armandodev.conceptos_aplicaciones

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val appNativa = findViewById<Button>(R.id.btnAppsNativas)
        appNativa.setOnClickListener{
            val intent = Intent(this, AppsNativas::class.java)
            startActivity(intent)
        }
        val appMultiplataforma = findViewById<Button>(R.id.btnAppsMultiplataforma)
        appMultiplataforma.setOnClickListener{
            val intent = Intent(this, AppsMultiplataforma::class.java)
            startActivity(intent)
        }
        val appWeb = findViewById<Button>(R.id.btnAppsWeb)
        appWeb.setOnClickListener{
            val intent = Intent(this, AppsWeb::class.java)
            startActivity(intent)
        }
    }
}
