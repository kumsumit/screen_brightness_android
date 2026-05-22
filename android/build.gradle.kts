import com.android.build.api.dsl.LibraryExtension

plugins {
    id("com.android.library")
}

group = "com.aaassseee.screen_brightness_android"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

extensions.configure<LibraryExtension>("android") {

    namespace = "com.aaassseee.screen_brightness_android"
    compileSdk = 37

    defaultConfig {
        minSdk = 24
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/kotlin")
        }
    }
}

