package com.example.hacksprintpokedex.presentation.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.hacksprintpokedex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        Thread.sleep(8000)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        inicializarEventoClique()
    }

    private fun inicializarEventoClique() {
        with(binding) {

        }
    }
}
