package dev.saurabhmishra.composerestro.ui.main

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.saurabhmishra.composerestro.ui.theme.ComposeRestroTheme


class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeRestroTheme {
        MainScreen()
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ComposeRestroTheme {
    MainScreen()
  }
}