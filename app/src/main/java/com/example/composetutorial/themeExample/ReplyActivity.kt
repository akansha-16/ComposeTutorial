package com.example.composetutorial.themeExample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme
import com.example.composetutorial.ui.theme.Purple40
import com.example.composetutorial.ui.theme.Purple80

class ReplyActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                ReplyApp(ReplySampleData.exampleChats)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReplyAppPreview() {
    ComposeTutorialTheme {
        ReplyApp(ReplySampleData.exampleChats)
    }
}

@Composable
fun ReplyApp(replies : List<ReplyData>) {
//    Column(modifier = Modifier.fillMaxSize()) {
//        val query = remember { mutableStateOf("") }
//        SearchBar(
//            query = query.value,
//            onQueryChanged = { newQuery -> query.value = newQuery }
//        )
//        LazyColumn {
//            items(replies) {
//                ReplyCardUI(replyData = it)
//            }
//        }
//
//    }
    MyApp(replies)
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    query: String,
    onQueryChanged: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(Color.White)
    ) {
        TextField(
            value = query,
            onValueChange = onQueryChanged,
            modifier = Modifier
                .fillMaxWidth()
                .clip(CircleShape)
                .border(0.4.dp, Color.Gray, CircleShape),
            placeholder = { Text(text = "Search replies", fontSize = 13.sp, fontWeight = FontWeight.Bold) },
            textStyle = TextStyle(fontSize = 16.sp),
            singleLine = true,
            trailingIcon = {
                Image(imageVector = Icons.Default.Person, contentDescription = "person", modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .background(Color.Gray))
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search, // replace with your search icon
                    contentDescription = "Search Icon",
                    tint = Color.Gray
                )
            },
            colors = TextFieldDefaults.textFieldColors(containerColor = Color.White, unfocusedIndicatorColor = Color.Transparent)
        )
    }
}

@Composable
fun ReplyCardUI(replyData: ReplyData) {
    Card (
        elevation = CardDefaults.outlinedCardElevation(),
        shape = CardDefaults.elevatedShape,
        modifier = Modifier.padding(12.dp),
        colors = CardDefaults.cardColors( containerColor = replyData.bgColor)
    )
    {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(modifier = Modifier
                .fillMaxWidth()) {
                Image(imageVector = Icons.Default.Person, contentDescription = "person", modifier = Modifier.align(Alignment.CenterVertically))
                Column(modifier = Modifier.padding(start = 12.dp)) {
                    Text(text = replyData.title)
                    Text(text = replyData.subtitle)
                }
                Spacer(modifier = Modifier.weight(0.1f))
                Icon(imageVector = Icons.Outlined.Star, contentDescription = "favoutites", modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(end = 16.dp))
            }
            Text(text = replyData.header, modifier = Modifier.padding(top = 16.dp), fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text(text = replyData.description, modifier = Modifier.padding(top = 8.dp), textAlign = TextAlign.Justify)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(replies : List<ReplyData>) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                content = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // First Icon
                        IconButton(onClick = { /* Handle Click */ }) {
                            Icon(
                                imageVector = Icons.Default.Home,
                                contentDescription = "Home"
                            )
                        }

                        IconButton(
                            onClick = { /* Handle Click */ }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Add"
                            )
                        }

                        // Second Icon
                        IconButton(onClick = { /* Handle Click */ }) {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "Settings"
                            )
                        }
                        IconButton(onClick = { /* Handle Click */ }) {
                            Icon(
                                imageVector = Icons.Default.Settings,
                                contentDescription = "Settings"
                            )
                        }
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}, containerColor = Purple80) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Settings"
                )
            }
        }
    ) { innerPadding ->
        // Main content of the screen
        Box(modifier = Modifier.padding(innerPadding)) {
            Column(modifier = Modifier.fillMaxSize()) {
                val query = remember { mutableStateOf("") }
                SearchBar(
                    query = query.value,
                    onQueryChanged = { newQuery -> query.value = newQuery }
                )
                LazyColumn {
                    items(replies) {
                        ReplyCardUI(replyData = it)
                    }
                }

            }
        }
    }
}

