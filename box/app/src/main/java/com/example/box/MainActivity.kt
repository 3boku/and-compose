package com.example.box

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.box.ui.theme.BoxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BoxTheme {
                BoxExample()
            }
        }
    }
}

@Composable
fun BoxExample() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .padding(16.dp)
                .background(color = Color.Blue)
                .align(Alignment.TopStart)
        ) {
            Text(text = "왼쪽 위")
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .padding(16.dp)
                .background(color = Color.Green)
                .align(Alignment.TopCenter)
        ) {
            Text(text = "중앙 위")
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .padding(16.dp)
                .background(color = Color.Blue)
                .align(Alignment.TopEnd)
        ) {
            Text(text = "오른쪽 위")
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            Text("중앙 왼쪽")
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text("중앙 중앙")
        }
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            Text("중앙 오른쪽")
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .padding(16.dp)
                .background(color = Color.Blue)
                .align(Alignment.BottomStart)
        ) {
            Text(text = "왼쪽 아래")
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .padding(16.dp)
                .background(color = Color.Green)
                .align(Alignment.BottomCenter)
        ) {
            Text(text = "중앙 아래")
        }
        Box(
            modifier = Modifier
                .size(100.dp)
                .padding(16.dp)
                .background(color = Color.Blue)
                .align(Alignment.BottomEnd)
        ) {
            Text(text = "오른쪽 아래")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BoxTheme {
        BoxExample()
    }
}