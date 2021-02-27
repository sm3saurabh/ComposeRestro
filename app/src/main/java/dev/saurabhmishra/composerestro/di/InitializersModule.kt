package dev.saurabhmishra.composerestro.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import dev.saurabhmishra.composerestro.utils.initializers.Initializer
import dev.saurabhmishra.composerestro.utils.initializers.InitializerSet
import dev.saurabhmishra.composerestro.utils.initializers.InitializerSetImpl
import dev.saurabhmishra.composerestro.utils.initializers.TimberInitializer

@InstallIn(SingletonComponent::class)
@Module
object InitializersModule {

  @Provides @IntoSet
  fun provideTimberInitializer(): Initializer {
    return TimberInitializer()
  }

  @Provides
  fun provideInitializerSet(set: Set<@JvmSuppressWildcards Initializer>): InitializerSet {
    return InitializerSetImpl(set)
  }

}