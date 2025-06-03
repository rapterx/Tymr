package com.example.tymr.presentation.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.tymr.R
import com.example.tymr.domain.model.Subject
import com.example.tymr.domain.model.Task
import com.example.tymr.presentation.components.CountCard
import com.example.tymr.presentation.components.SubjectCard
import com.example.tymr.presentation.components.tasksList

@Composable
fun DashboardScreen() {
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
            isComplete = false,
            taskSubjectId = 0,
            taskId = 1
        ),
        Task(
            title = "Prepare",
            description = "",
            dueDate = 2L,
            priority = 2,
            relatedToSubject = "",
            isComplete = false,
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
    Scaffold (
        topBar = { DashboardScreenTopBar() }
    ) { paddingValues ->

        LazyColumn (
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            item {
                CountCardSection(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    subjectCount = "5",
                    studiedHours = "10",
                    goalHours = "12"
                )
            }
            item {
                SubjectsCardSection(
                    modifier = Modifier.fillMaxWidth(),
                    subjectList = subjects
                )
            }
            item {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 48.dp, vertical = 20.dp)
                ) {
                    Text(text = "Start the task")
                }
            }
            tasksList(
                sectionTitle = "UPCOMING TASKS",
                emptyListText = "You don't have any tasks.\n Click the + button to add new task.",
                tasks = tasks,
                onCheckBoxClick = {},
                onTaskCardClick = {}
            )
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun DashboardScreenTopBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Tymr",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    )
}

@Composable
private fun CountCardSection(
    modifier: Modifier,
    subjectCount: String,
    studiedHours: String,
    goalHours: String
) {
    Row (modifier = modifier) {
        CountCard(
            modifier = Modifier.weight(1f),
            headingText = "Subject count",
            count = subjectCount
        )
        Spacer(modifier = Modifier.width(10.dp))
        CountCard(
            modifier = Modifier.weight(1f),
            headingText = "Study hours",
            count = studiedHours
        )
        Spacer(modifier = Modifier.width(10.dp))
        CountCard(
            modifier = Modifier.weight(1f),
            headingText = "Goal",
            count = goalHours
        )
    }
}

@Composable
private fun SubjectsCardSection(
    modifier: Modifier,
    subjectList:List<Subject>,
    emptyListText: String = "You don't have any tasks.\n Click the + button to add new task."
    ) {
    Column (modifier = modifier) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Subjects",
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(start = 12.dp)
            )
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add subject"
                )
            }
        }
        if (subjectList.isEmpty()) {
            Image(
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(R.drawable.img_books),
                contentDescription = emptyListText
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = emptyListText,
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
        LazyRow (
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(start = 12.dp, end = 12.dp)
        ) {
            items(subjectList) { subject->
                SubjectCard(
                    subjectName = subject.name,
                    gradientColor = subject.colors,
                    onClick = {}
                )
            }
        }
    }
}