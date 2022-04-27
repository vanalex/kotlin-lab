package com.kotlinlab

class Library {
    fun someLibraryMethod(): Boolean {
        return true
    }

    fun returnHelloWorldMessage(): String{
        return "Hello World!"
    }

    fun tryingKotlinMessageInterpolation(value: String): String{
        return "Hi, $value!"
    }

    fun tryingKotlinLoop() {
        for (i in 0..10)
            print("i")
    }
}
