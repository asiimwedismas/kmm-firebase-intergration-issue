plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    android {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        version = "1.0"
        ios.deploymentTarget = "14.1"
        framework {
            baseName = "kmm-firebase-module"
        }

        pod("FirebaseCore") {
            version = "10.9.0"
        }
        pod("FirebaseCrashlytics") {
            version = "10.9.0"
        }
        pod("FirebaseAuth") {
            version = "10.9.0"
        }
        pod("FirebaseFirestore") {
            version = "10.9.0"
        }
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

android {
    namespace = "me.asiimwe.kmm_firebase_module"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
    }
}
