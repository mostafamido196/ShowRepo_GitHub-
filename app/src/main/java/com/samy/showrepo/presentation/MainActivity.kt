package com.samy.showrepo.presentation

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samy.showrepo.presentation.navigation.AppNavHost
import com.samy.showrepo.presentation.theme.OrangeGitHubProjectShowRepoTheme
import com.samy.showrepo.presentation.theme.SetStatusBarStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrangeGitHubProjectShowRepoTheme {
                AppNavHost()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    OrangeGitHubProjectShowRepoTheme {
        Row(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Hello $name!")
            Text(text = "Hello World")
        }
    }
}
// Arrangemnt -> HorizontalArrangment
// Allignment -> verticalAllignemnt

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Greeting("Android")
}
