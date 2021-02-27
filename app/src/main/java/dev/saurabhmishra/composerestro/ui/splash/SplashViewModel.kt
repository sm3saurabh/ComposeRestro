package dev.saurabhmishra.composerestro.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.time.ExperimentalTime
import kotlin.time.seconds

@HiltViewModel
class SplashViewModel @Inject constructor(): ViewModel() {

  private val _viewState = MutableLiveData<SplashViewState>()
  val viewState: LiveData<SplashViewState> = _viewState

  init {
    toggleStatesPeriodically()
  }

  @OptIn(ExperimentalTime::class)
  private fun toggleStatesPeriodically() {
    viewModelScope.launch {
      while (true) {
        delay(3.seconds)
        val newValue = when (_viewState.value) {
          SplashViewState.Idle -> {
            SplashViewState.AnimateLogo
          }
          SplashViewState.AnimateLogo -> {
            SplashViewState.NavigateForward
          }
          else -> {
            SplashViewState.Idle
          }
        }
        _viewState.value = newValue
      }
    }
  }


  fun animationEnded() {
    _viewState.value = SplashViewState.NavigateForward
  }

}

sealed class SplashViewState {
  object Idle: SplashViewState()
  object NavigateForward: SplashViewState()
  object AnimateLogo: SplashViewState()
}