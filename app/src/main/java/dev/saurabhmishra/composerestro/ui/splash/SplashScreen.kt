package dev.saurabhmishra.composerestro.ui.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SplashScreen() {
  Box(modifier = Modifier.fillMaxSize()) {
    Text(text = "Splash screen", modifier = Modifier.align(Alignment.Center))
  }
}

@Composable
@Preview(name = "Splash screen")
fun SplashScreenPreview() {
  SplashScreen()
}