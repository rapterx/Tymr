package com.example.tymr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.tymr.domain.model.Session
import com.example.tymr.domain.model.Subject
import com.example.tymr.domain.model.Task
import com.example.tymr.presentation.dashboard.DashboardScreen
import com.example.tymr.presentation.subject.SubjectScreen
import com.example.tymr.presentation.theme.TymrTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TymrTheme {
                SubjectScreen()
            }
        }
    }
}

val subjects = listOf(
    Subject(name = "ijdfsd", goalHours = "10", colors = Subject.subjectCardColors[0], subjectId = 0),
    Subject(name = "ijdfsd", goalHours = "10", colors = Subject.subjectCardColors[2], subjectId = 0),
    Subject(name = "ijdfsd", goalHours = "10", colors = Subject.subjectCardColors[0], subjectId = 0),
    Subject(name = "ijdfsd", goalHours = "10", colors = Subject.subjectCardColors[0], subjectId = 0),
    Subject(name = "ijdfsd", goalHours = "10", colors = Subject.subjectCardColors[0], subjectId = 0),
    Subject(name = "ijdfsd", goalHours = "10", colors = Subject.subjectCardColors[0], subjectId = 0),
    Subject(name = "ijdfsd", goalHours = "10", colors = Subject.subjectCardColors[0], subjectId = 0)
)

val tasks = listOf(
    Task(
        title = "Prepare",
        description = "",
        dueDate = 2L,
        priority = 0,
        relatedToSubject = "",
        isComplete = false,
        taskSubjectId = 0,
        taskId = 1
    ),
    Task(
        title = "Prepare",
        description = "",
        dueDate = 2L,
        priority = 1,
        relatedToSubject = "",
        isComplete = true,
        taskSubjectId = 0,
        taskId = 1
    ),
    Task(
        title = "Prepare",
        description = "",
        dueDate = 2L,
        priority = 2,
        relatedToSubject = "",
        isComplete = true,
        taskSubjectId = 0,
        taskId = 1
    ),
    Task(
        title = "Prepare",
        description = "",
        dueDate = 2L,
        priority = 0,
        relatedToSubject = "",
        isComplete = false,
        taskSubjectId = 0,
        taskId = 1
    ),
    Task(
        title = "Prepare",
        description = "",
        dueDate = 2L,
        priority = 1,
        relatedToSubject = "",
        isComplete = false,
        taskSubjectId = 0,
        taskId = 1
    )
)

val sessions = listOf(
    Session(
        relatedToSubject = "English",
        date = 0L,
        duration = 2L,
        sessionSubjectId = 0,
        sessionId = 0
    ),
    Session(
        relatedToSubject = "English",
        date = 0L,
        duration = 2L,
        sessionSubjectId = 0,
        sessionId = 0
    ),
    Session(
        relatedToSubject = "English",
        date = 0L,
        duration = 2L,
        sessionSubjectId = 0,
        sessionId = 0
    ),
    Session(
        relatedToSubject = "English",
        date = 0L,
        duration = 2L,
        sessionSubjectId = 0,
        sessionId = 0
    ),
    Session(
        relatedToSubject = "English",
        date = 0L,
        duration = 2L,
        sessionSubjectId = 0,
        sessionId = 0
    )

)
