package com.example.tymr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tymr.presentation.dashboard.DashboardScreen
import com.example.tymr.presentation.theme.TymrTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TymrTheme {
                DashboardScreen()
            }
        }
    }
}
