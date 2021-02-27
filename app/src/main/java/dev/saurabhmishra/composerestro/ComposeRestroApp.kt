package dev.saurabhmishra.composerestro

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import dev.saurabhmishra.composerestro.utils.initializers.InitializerSet
import javax.inject.Inject

@HiltAndroidApp
class ComposeRestroApp: Application() {
  @Inject lateinit var initializerSet: InitializerSet

  override fun onCreate() {
    super.onCreate()
    initializerSet.initialize(this)
  }
}