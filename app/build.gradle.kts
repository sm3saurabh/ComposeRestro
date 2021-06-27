plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(Application.COMPILE_SDK_VERSION)
    buildToolsVersion = Versions.BUILD_TOOLS_VERSION
    defaultConfig {
        applicationId = Application.APPLICATION_ID
        minSdkVersion(Application.MIN_SDK_VERSION)
        targetSdkVersion(Application.TARGET_SDK_VERSION)
        versionCode = Application.Version.VERSION_CODE
        versionName = Application.Version.VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    // For Kotlin projects
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
        dataBinding = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE_VERSION
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation("androidx.core:core-ktx:1.5.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("com.google.android.material:material:1.3.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN_VERSION}")

    
    implementation("androidx.compose.ui:ui:${Versions.COMPOSE_VERSION}")
    // Tooling support (Previews, etc.)
    implementation("androidx.compose.ui:ui-tooling:${Versions.COMPOSE_VERSION}")
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation("androidx.compose.foundation:foundation:${Versions.COMPOSE_VERSION}")
    // Material Design
    implementation("androidx.compose.material:material:${Versions.COMPOSE_VERSION}")
    // Material design icons
    implementation("androidx.compose.material:material-icons-core:${Versions.COMPOSE_VERSION}")
    implementation("androidx.compose.material:material-icons-extended:${Versions.COMPOSE_VERSION}")
    // Integration with observables
    implementation("androidx.compose.runtime:runtime-livedata:${Versions.COMPOSE_VERSION}")
    implementation("androidx.compose.runtime:runtime-rxjava2:${Versions.COMPOSE_VERSION}")


    implementation("androidx.appcompat:appcompat:1.4.0-alpha02")
    implementation("androidx.activity:activity-ktx:1.2.3")
    implementation("androidx.activity:activity-compose:1.3.0-beta02")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_VERSION}")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE_VERSION}")

    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.VIEWMODEL_COMPOSE_VERSION}")


    implementation("androidx.navigation:navigation-compose:${Versions.COMPOSE_NAVIGATION}")

    implementation("com.google.dagger:hilt-android:${Versions.HILT_VERSION}")
    kapt("com.google.dagger:hilt-compiler:${Versions.HILT_VERSION}")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES_VERSION}")

    implementation("com.jakewharton.timber:timber:${Versions.TIMBER_VERSION}")


    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.0")
    testImplementation("androidx.test.ext:junit:1.1.2")
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")

    // UI Tests
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE_VERSION}")
    implementation("androidx.core:core-ktx:+")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")

}
repositories {
    mavenCentral()
}