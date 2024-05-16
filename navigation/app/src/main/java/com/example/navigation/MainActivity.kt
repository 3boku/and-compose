package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationTheme {
                MyNav()
                }
            }
        }
    }


@Composable
fun MyScreen1(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "화면1",
            fontSize = 50.sp
        )
        Button(onClick = {
            navController.navigate("MyScreen2")
        }) {
            Text(
                text = "2번화면으로 가기",
                fontSize = 30.sp
            )
        }
    }
}

@Composable
fun MyScreen2(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "화면2",
            fontSize = 50.sp
        )
        Button(onClick = {
            navController.navigate("MyScreen3")
        })
         {
            Text(
                text = "3번화면으로 가기",
                fontSize = 30.sp
            )
        }
    }
}

@Composable
fun MyScreen3(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "화면3",
            fontSize = 50.sp
        )
        Button(onClick = {
            navController.navigate("MyScreen1")
        }) {
            Text(
                text = "1번화면으로 가기",
                fontSize = 30.sp
            )
        }
    }
}

@Composable
fun MyNav() {

    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = "MyScreen1") {
        composable("MyScreen1") {
            MyScreen1(navController = navController)
        }
        composable("MyScreen2") {
            MyScreen2(navController = navController)
        }
        composable("MyScreen3") {
            MyScreen3(navController = navController)
        }
    }
}