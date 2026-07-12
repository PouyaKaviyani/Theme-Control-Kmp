rootProject.name = "ThemeControlKmp"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        maven { url = uri("https://en-mirror.ir") }
        maven { url = uri("https://maven.myket.ir") }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        maven { url = uri("https://en-mirror.ir") }
        maven { url = uri("https://maven.myket.ir") }
        google()
        mavenCentral()
    }
}

include(":androidApp")
include(":shared")