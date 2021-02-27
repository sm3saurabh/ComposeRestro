package dev.saurabhmishra.composerestro.utils.initializers

import android.app.Application
import dev.saurabhmishra.composerestro.BuildConfig
import timber.log.Timber

class TimberInitializer: Initializer {

  override fun initialize(application: Application) {
    if(BuildConfig.DEBUG) {
      Timber.plant(Timber.DebugTree())
    }
  }

}