plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
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

    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.3.0")


    implementation("androidx.compose.runtime:runtime:${Versions.COMPOSE_VERSION}")
    implementation("androidx.compose.ui:ui:${Versions.COMPOSE_VERSION}")
    implementation("androidx.compose.foundation:foundation-layout:${Versions.COMPOSE_VERSION}")
    implementation("androidx.compose.material:material:${Versions.COMPOSE_VERSION}")
    implementation("androidx.compose.material:material-icons-extended:${Versions.COMPOSE_VERSION}")
    implementation("androidx.compose.foundation:foundation:${Versions.COMPOSE_VERSION}")
    implementation("androidx.compose.animation:animation:${Versions.COMPOSE_VERSION}")
    implementation("androidx.compose.ui:ui-tooling:${Versions.COMPOSE_VERSION}")
    implementation("androidx.compose.runtime:runtime-livedata:${Versions.COMPOSE_VERSION}")

    implementation("androidx.appcompat:appcompat:1.3.0-beta01")
    implementation("androidx.activity:activity-ktx:1.2.0")
    implementation("androidx.core:core-ktx:1.5.0-beta02")
    implementation("androidx.activity:activity-compose:1.3.0-alpha03")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.0")
    implementation("androidx.test.ext:junit:1.1.2")
    implementation("junit:junit:4.+")
    implementation("androidx.test.espresso:espresso-core:3.3.0")
}