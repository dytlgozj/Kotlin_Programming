package chap11.section2

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello, ")
//    delay(1000L)
}
