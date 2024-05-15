package com.example.column

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.column.ui.theme.ColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ColumnTheme {

            }
        }
    }
}

@Composable
fun ColumnTest1() {
    Text(
        text = "반갑습니다 1",
        fontSize = (30.sp),
    )
    Text(
        text = "반갑습니다 2",
        fontSize = (30.sp),
        modifier = Modifier.padding(top = 50.dp)
    )
    Text(
        text = "반갑습니다 3",
        fontSize = (30.sp),
        modifier = Modifier.padding(top = 100.dp)
    )

}

@Composable
fun ColumnTest2() {
    Column(
        modifier = Modifier.padding(40.dp)
    ) {
        Text(
            text = "반갑습니다 1",
            fontSize = (30.sp),
        )
        Spacer(modifier = Modifier.padding(30.dp))
        Divider(
            thickness = 4.dp,
            color = Color.Red
        )
        Text(
            text = "반갑습니다 2",
            fontSize = (30.sp),
        )
        Text(
            text = "반갑습니다 3",
            fontSize = (30.sp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ColumnTheme {
        ColumnTest2()
    }
}