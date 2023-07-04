package me.asiimwe.kmm_firebase_intergration_issue

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform