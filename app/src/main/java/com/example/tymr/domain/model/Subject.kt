package com.example.tymr.domain.model

import androidx.compose.ui.graphics.Color
import com.example.tymr.presentation.theme.gradient1
import com.example.tymr.presentation.theme.gradient2
import com.example.tymr.presentation.theme.gradient3
import com.example.tymr.presentation.theme.gradient4
import com.example.tymr.presentation.theme.gradient5

data class Subject(
    val name: String,
    val goalHours: String,
    val colors: List<Color>
) {
    companion object {
        val subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
    }
}
