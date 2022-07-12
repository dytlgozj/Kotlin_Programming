package chap11.section2

import kotlinx.coroutines.*

suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

private fun worksInSerial() {
    GlobalScope.launch {
        val one = chap11.section2.starttest.doWork1()
        val two = chap11.section2.starttest.doWork2()
        println("Kotlin One : $one")
        println("Kotlin Two : $two")
    }
}

private fun worksInParallel() {
    val one = GlobalScope.async {
        chap11.section2.starttest.doWork1()
    }
    val two = GlobalScope.async {
        chap11.section2.starttest.doWork2()
    }

    GlobalScope.launch {
        val combined = one.await() + "_" + two.await()
        println("Kotlin Combined : $combined")
    }
}

fun main() {
//    worksInSerial()
    worksInParallel()
    readLine()
}
