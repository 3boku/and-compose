package com.example.webview

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.webview.ui.theme.WebViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WebViewTheme {
                MyWebView("https://www.speedat.site")
            }
        }
    }
}

@Composable
fun MyWebView(url: String) {
    AndroidView(factory = {
        WebView(it).apply {
            loadUrl(url)
        }
    })
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WebViewTheme {
        
    }
}