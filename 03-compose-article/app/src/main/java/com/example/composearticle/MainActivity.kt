package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeArticleApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp(modifier: Modifier = Modifier) {
    ArticleCard(
        imagePainter = painterResource(R.drawable.bg_compose_background),
        modifier = modifier
    )
}

@Composable
fun ArticleCard(imagePainter: Painter, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Image(
            painter = imagePainter,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
    }
}
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticleTheme {
        ComposeArticleApp()
    }
}
