package chap11.section4

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

var counter = 0
val mutex = Mutex()
//var counter = AtomicInteger(0)

suspend fun massiveRun(action: suspend () -> Unit) {
    val n = 1000
    val k = 1000

    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch {
                repeat(k) {
                    action()
                }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking {
    massiveRun {
        mutex.withLock {
            counter++
        }
    }

    println("Counter = ${counter}")
}
