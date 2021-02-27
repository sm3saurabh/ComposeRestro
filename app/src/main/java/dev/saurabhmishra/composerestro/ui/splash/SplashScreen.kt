package dev.saurabhmishra.composerestro.ui.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SplashScreen() {
  Surface {
    SplashItem()
  }
}

@Composable
private fun SplashItem() {
  Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
    Text(text = "Splash screen")
  }
}

@Composable
@Preview(name = "Splash screen")
fun SplashScreenPreview() {
  SplashScreen()
}