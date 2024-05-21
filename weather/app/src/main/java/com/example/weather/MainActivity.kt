package com.example.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather.ui.theme.DarkBlue
import com.example.weather.ui.theme.VeryLightGray
import com.example.weather.ui.theme.WeatherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    WeatherPage()
                }
            }
        }
    }
}

@Composable
fun WeatherPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 64.dp, start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderImage()
        MainInfo()
    }

}

@Composable
fun HeaderImage() {
    Image(
        painter = painterResource(id = R.drawable.header),
        contentDescription = null,
        modifier = Modifier
            .width(300.dp)
            .height(300.dp)
    )
}

@Composable
fun MainInfo() {
    Column(
        modifier = Modifier.padding(top = 24.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "11°", color = DarkBlue, fontSize = 48.sp, fontWeight = FontWeight.Bold
        )
        Text(
            text = "New York City, NY",
            color = DarkBlue,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "Rainy to partly cloudy.\nWinds WSW at 10 to 15 km",
            color = Color.Gray,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 24.dp)
        )
        InfoItem()
    }
}

@Composable
fun InfoItem() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .background(color = VeryLightGray)
            .wrapContentHeight()
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier.wrapContentSize()
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.rain),
                        contentDescription = "rain",
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                    )
                    Column(
                        modifier = Modifier
                            .height(50.dp)
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "Humidity", color = Color.LightGray, fontSize = 15.sp)
                        Text(
                            text = "85%",
                            color = DarkBlue,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    }
                }
            }
            Box(
                modifier = Modifier.wrapContentSize()
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.sunny),
                        contentDescription = "sunny",
                        modifier = Modifier
                            .width(50.dp)
                            .height(50.dp)
                    )
                    Column(
                        modifier = Modifier
                            .height(50.dp)
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "UV Index", color = Color.LightGray, fontSize = 15.sp)
                        Text(
                            text = "2 of 10",
                            color = DarkBlue,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 390, heightDp = 800)
@Composable
fun GreetingPreview() {
    WeatherTheme {
        WeatherPage()
    }
}
