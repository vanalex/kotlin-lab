package org.example.strings

fun templatifyGreeting(strValue: String): String {
    val value = if (strValue.isNotBlank()) strValue else "Kotlin"
    return "Hello, $value!"
}

fun templatifyGreetingWithIf(strValue: String): String {
    return "Hello, ${if (strValue.isBlank()) "someone" else strValue}!"
}