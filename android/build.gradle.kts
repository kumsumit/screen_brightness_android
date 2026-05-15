import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

group = "com.aaassseee.screen_brightness_android"
version = "1.0-SNAPSHOT"

repositories {
        google()
        mavenCentral()
    }

android {
    namespace = "com.aaassseee.screen_brightness_android"

    compileSdk = 37

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/kotlin")
        }
    }

    defaultConfig {
        minSdk = 24
    }
}

kotlin {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_21)
        }
    }