package dev.saurabhmishra.composerestro.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.saurabhmishra.composerestro.ui.home.HomeScreen
import dev.saurabhmishra.composerestro.ui.splash.SplashScreen
import dev.saurabhmishra.composerestro.ui.theme.ComposeRestroTheme
import dev.saurabhmishra.composerestro.utils.AppConstants.Routes


class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Content()
    }
  }
}

@Composable
fun Content() {
  val navController = rememberNavController()
  ComposeRestroTheme {
    NavHost(navController = navController, startDestination = Routes.SPLASH) {
      composable(Routes.SPLASH) { SplashScreen() }
      composable(Routes.HOME) { HomeScreen() }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ComposeRestroTheme {
    Content()
  }
}