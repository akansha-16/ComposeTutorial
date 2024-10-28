package com.example.composetutorial

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme
import com.example.composetutorial.ui.theme.Purple80
import com.example.composetutorial.ui.theme.lightPurple

class ComposeQuadrant  {
}

@Preview
@Composable
fun ComposeQuadrantPreview() {
    ComposeTutorialTheme {
        Surface {
            ComposeQuadrantUI()
        }
    }
}


@Composable
fun ComposeQuadrantUI() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5F)
        ) {
            Card(
                modifier = Modifier
                    .weight(0.5F)
                    .fillMaxHeight()
                , colors = CardDefaults.cardColors(
                    containerColor = lightPurple,
                ), shape = RectangleShape
            ) {
                Column(modifier = Modifier.padding(all = 16.dp).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Text(text = "Text composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                    Text(text = "Displays text and follows the recommended Material Design guidelines.", textAlign = TextAlign.Justify)
                }
            }
            Card(
                modifier = Modifier
                    .weight(0.5F)
                    .fillMaxHeight(), colors = CardDefaults.cardColors(
                    containerColor = Purple80,
                ), shape = RectangleShape
            ) {
                Column(modifier = Modifier.padding(all = 16.dp).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Text(text = "Image composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                    Text(text = "Creates a composable that lays out and draws a given Painter class object.", textAlign = TextAlign.Justify)
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Card(
                modifier = Modifier
                    .weight(0.5F)
                    .fillMaxHeight(), colors = CardDefaults.cardColors(
                    containerColor = Purple80,
                ), shape = RectangleShape
            ) {
                Column(modifier = Modifier.padding(all = 16.dp).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Text(text = "Row composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                    Text(text = "A layout composable that places its children in a horizontal sequence.", textAlign = TextAlign.Justify)
                }
            }
            Card(
                modifier = Modifier
                    .weight(0.5F)
                    .fillMaxHeight(), colors = CardDefaults.cardColors(
                    containerColor = lightPurple,
                ), shape = RectangleShape
            ) {
                Column(modifier = Modifier.padding(all = 16.dp).fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                    Text(text = "Column composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                    Text(text = "A layout composable that places its children in a vertical sequence.", textAlign = TextAlign.Justify)
                }
            }
        }
    }
}