package dev.saurabhmishra.composerestro.utils.initializers

import android.app.Application

interface Initializer {
  fun initialize(application: Application)
}

interface InitializerSet {
  fun initialize(application: Application)
}

class InitializerSetImpl(
  private val initializers: Set<@JvmSuppressWildcards Initializer>
): InitializerSet {

  override fun initialize(application: Application) {
    initializers.forEach { initializer ->
      initializer.initialize(application = application)
    }
  }
}