package dev.saurabhmishra.composerestro.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val darkColorPalette = darkColors(
  primary = grey200,
  primaryVariant = grey500,
  secondary = teal200,
  secondaryVariant = teal500,
  error = errorRed,
  onPrimary = Color.White,
  onSecondary = Color.Black,
  onBackground = Color.White,
  onSurface = Color.White,
  onError = Color.White
)

private val lightColorPalette = lightColors(
  primary = teal200,
  primaryVariant = teal500,
  secondary = grey200,
  secondaryVariant = grey500,
  error = errorRed,
  onPrimary = Color.Black,
  onSecondary = Color.White,
  onBackground = Color.Black,
  onSurface = Color.Black,
  onError = Color.Black
)

@Composable
fun ComposeRestroTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable() () -> Unit
) {
  val colors = if (darkTheme) {
    darkColorPalette
  } else {
    lightColorPalette
  }

  MaterialTheme(
    colors = colors,
    shapes = shapes,
    content = content
  )
}