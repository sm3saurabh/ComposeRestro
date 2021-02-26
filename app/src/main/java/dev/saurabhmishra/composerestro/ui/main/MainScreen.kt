package dev.saurabhmishra.composerestro.ui.main

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import dev.saurabhmishra.composerestro.R

@Composable
fun MainScreen() {
  Greeting(name = stringResource(id = R.string.app_name))
}

@Composable
fun Greeting(name: String) {
  Text(text = "Hello $name")
}