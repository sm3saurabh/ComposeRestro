package dev.saurabhmishra.composerestro.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val darkColorPalette = darkColors(
  primary = grey200,
  primaryVariant = grey500,
  secondary = teal200,
  secondaryVariant = teal500,
  error = errorRed,

)

private val lightColorPalette = lightColors(
  primary = teal200,
  primaryVariant = teal500,
  secondary = grey200,
  secondaryVariant = grey500,
  error = errorRed,
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