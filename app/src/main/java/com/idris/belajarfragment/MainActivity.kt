package com.idris.belajarfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentSatu = FragmentSatu()
        val fragmentDua = FragmentDua()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.f1Fragment, fragmentSatu)
            commit()
        }

        val btnFragmentSatu = findViewById<Button>(R.id.btnFirstFragment)

        btnFragmentSatu.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.f1Fragment, fragmentSatu)
                commit()
            }
        }

        val btnFragmentDua = findViewById<Button>(R.id.btnSecondFragment)

        btnFragmentDua.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.f1Fragment, fragmentDua)
                commit()

            }
        }
    }
}