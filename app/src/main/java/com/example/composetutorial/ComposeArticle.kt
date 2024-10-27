package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class ComposeArticle : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ComposeArticleUI()
                }
            }

        }
    }

}

@Preview
@Composable
fun ComposeArticlePreview() {
    ComposeTutorialTheme {
        Surface {
            ComposeArticleUI()
        }
    }
}

@Composable
fun ComposeArticleUI() {
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = "background"
        )
        Text(
            modifier = Modifier.padding(all = 16.dp),
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp
        )
        Text(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            textAlign = TextAlign.Justify
        )
        Text(
            modifier = Modifier.padding(all = 16.dp),
            textAlign = TextAlign.Justify,
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
        )
    }
}