package com.example.tymr.util

import androidx.compose.ui.graphics.Color
import com.example.tymr.presentation.theme.Green
import com.example.tymr.presentation.theme.Orange
import com.example.tymr.presentation.theme.Red

enum class Priority(val title: String, val color: Color, val value: Int) {
    LOW(title = "Low", color = Green, value = 0),
    MEDIUM(title = "Medium", color = Orange, value = 1),
    HIGH(title = "High", color = Red, value = 2);

    companion object {
        fun fromInt(value: Int) = values().firstOrNull {it.value == value} ?: MEDIUM
    }
}