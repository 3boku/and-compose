package com.example.image

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.example.image.ui.theme.ImageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageTheme {
                MyImageTest2()
            }
        }
    }
}

@Composable
fun MyImageTest1() {
    Image(
        painter = painterResource(id = R.drawable.spam),
        contentDescription = "spam"
    )
}

@Composable
fun MyImageTest2() {
    AsyncImage(
        model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQb_kwzYvdGgTcDxXNN_eJpA4ltwZAYIZUeB4YSjjuVjw&s",
        contentDescription = "고퍼"
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ImageTheme {
        MyImageTest1()
    }
}