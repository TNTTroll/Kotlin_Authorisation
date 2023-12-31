package com.example.authorization

import LoginFragment
import WelcomeFragment
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, LoginFragment()).commit()
    }

    fun showWelcomeFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, WelcomeFragment()).commit()
    }
}