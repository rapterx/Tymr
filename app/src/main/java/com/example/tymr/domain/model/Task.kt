package com.example.tymr.domain.model

data class Task(
    val title: String,
    val description: String,
    val dueDate: String,
    val priority: String,
    val relatedToSubject: String,
    val isComplete: String
)
