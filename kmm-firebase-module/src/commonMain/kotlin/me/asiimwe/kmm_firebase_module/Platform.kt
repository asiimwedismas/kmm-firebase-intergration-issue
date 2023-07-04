package me.asiimwe.kmm_firebase_module

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform