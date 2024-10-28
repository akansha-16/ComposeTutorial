package com.example.composetutorial.themeExample

import androidx.compose.ui.graphics.Color
import com.example.composetutorial.ui.theme.Pink80
import com.example.composetutorial.ui.theme.Purple80
import com.example.composetutorial.ui.theme.lightPurple

data class ReplyData(
    val title: String,
    val subtitle: String,
    val header: String,
    val description: String,
    val bgColor: Color
)

object ReplySampleData {
    val exampleChats = listOf(
        ReplyData(
            title = "Google",
            subtitle = "20 min ago",
            header = "Package is shipped",
            description = "Cucumber facial mask is shipped",
            bgColor = lightPurple
        ) ,
        ReplyData(
            title = "Alison",
            subtitle = "just now",
            header = "Brunch this weekend?",
            description = "Hi, let have brunch this weekend? I am free",
            bgColor = Pink80
        ),
        ReplyData(
            title = "Kim",
            subtitle = "1 hour ago",
            header = "high school reunion",
            description = "Hi friends, lets have a reunion, please be on time",
            bgColor = Purple80
        ),
        ReplyData(
            title = "Google",
            subtitle = "20 min ago",
            header = "Package is shipped",
            description = "Cucumber facial mask is shipped",
            bgColor = lightPurple
        ) ,
        ReplyData(
            title = "Alison",
            subtitle = "just now",
            header = "Brunch this weekend?",
            description = "Hi, let have brunch this weekend? I am free",
            bgColor = Pink80
        ),
        ReplyData(
            title = "Kim",
            subtitle = "1 hour ago",
            header = "high school reunion",
            description = "Hi friends, lets have a reunion, please be on time",
            bgColor = Purple80
        ),
        ReplyData(
            title = "Google",
            subtitle = "20 min ago",
            header = "Package is shipped",
            description = "Cucumber facial mask is shipped",
            bgColor = lightPurple
        ) ,
        ReplyData(
            title = "Alison",
            subtitle = "just now",
            header = "Brunch this weekend?",
            description = "Hi, let have brunch this weekend? I am free",
            bgColor = Pink80
        ),
        ReplyData(
            title = "Kim",
            subtitle = "1 hour ago",
            header = "high school reunion",
            description = "Hi friends, lets have a reunion, please be on time",
            bgColor = Purple80
        )
    )
}