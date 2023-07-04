package me.asiimwe.kmm_firebase_intergration_issue

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}