package chap11.section2

import kotlinx.coroutines.*

suspend fun doSomething() {
    println("Do Something!")
}

fun main() {
    GlobalScope.launch {
        delay(1000L)
        doSomething()
        println("World!")
    }
    println("Hello,")
    Thread.sleep(2000L)
}
