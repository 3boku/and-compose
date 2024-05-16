package com.example.surface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.surface.ui.theme.SurfaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SurfaceTheme {

            }
        }
    }
}

@Composable
fun MySurface1() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        color = Color.Red,
        shape = RoundedCornerShape(20.dp),
        shadowElevation = 20.dp
    ) {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Green
            )
        ) {
            Text(text = "클릭해보시긔")
        }
    }
}

@Composable
fun MySurface2() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray,
        border = BorderStroke(2.dp, Color.Red),
        contentColor = Color.Blue
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Surface(
                modifier = Modifier
                    .size(200.dp),
                color = Color.Red

            ) {
                Text(text = "This is Jetpack compose")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "이것은 제ㅠㅔㅅ 컴포즈다.")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SurfaceTheme {
        MySurface2()
    }
}