package com.example.textfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.textfield.ui.theme.TextfieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextfieldTheme {
                MyTextField3()
            }
        }
    }
}

@Composable
fun MyTextField1() {
    var textState by remember { mutableStateOf("Hello") }

    TextField(value = textState, onValueChange = {
        textState = it
    },
        label = {
            Text(text = "입력하는 공간")
        }
    )
}

@Composable
fun MyTextField3() {
    var textState by remember { mutableStateOf("") }

    var enteredText by remember {
        mutableStateOf("")
    }

    Column(
        Modifier.padding(30.dp)
    ) {
        TextField(
            value = textState,
            onValueChange = {
                textState = it
            },
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = {
                enteredText = textState
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "입력하기")
        }
        Text(
            text = enteredText
        )
    }
}

@Composable
fun MyTextField2() {
    var textState by remember { mutableStateOf("Hello") }

    OutlinedTextField(
        value = textState,
        onValueChange =
        {
            textState = it
        },
        label = {
            Text(text = "입력하는 공간")
        }
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TextfieldTheme {
        MyTextField3()
    }
}