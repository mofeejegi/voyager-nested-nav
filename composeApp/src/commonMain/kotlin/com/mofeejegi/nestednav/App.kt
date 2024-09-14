package com.mofeejegi.nestednav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface {
            Navigator(screen = FirstScreen())
        }

    }
}

class FirstScreen : Screen {
    @Composable
    override fun Content() {
        Box(modifier = Modifier.fillMaxSize().background(color = Color.Blue)) {
            Navigator(screen = SecondScreen())
        }
    }
}

class SecondScreen : Screen {
    @Composable
    override fun Content() {
        Box(modifier = Modifier.fillMaxSize().systemBarsPadding().background(color = Color.Green)) {}
    }
}