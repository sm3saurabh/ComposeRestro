package dev.saurabhmishra.composerestro.ui.splash

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.animateValueAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import dev.saurabhmishra.composerestro.R

@Composable
fun SplashScreen(splashViewModel: SplashViewModel = viewModel()) {
  val viewState: SplashViewState by splashViewModel.viewState.observeAsState(SplashViewState.Idle)

  Surface {
    SplashItem(viewState)
  }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
private fun SplashItem(state: SplashViewState) {
  val isVisible = state != SplashViewState.Idle
  AnimatedVisibility(visible = isVisible) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
      Text(text = stringResource(id = R.string.app_name))
    }
  }
}

@Composable
@Preview(name = "Splash screen")
fun SplashScreenPreview() {
  SplashScreen()
}