pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "kmm-firebase-intergration-issue"
include(":androidApp")
include(":shared")
include(":kmm-firebase-module")
