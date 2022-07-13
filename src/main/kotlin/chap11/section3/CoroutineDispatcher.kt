package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking {
//    val jobs = arrayListOf<Job>()
//
//    jobs += launch(Dispatchers.Unconfined) {
//        println("Unconfined : \t\t ${Thread.currentThread().name}")
//    }
//    jobs += launch(coroutineContext) {
//        println("coroutineContext : \t\t ${Thread.currentThread().name}")
//    }
//    jobs += launch(Dispatchers.Default) {
//        println("Default : \t\t ${Thread.currentThread().name}")
//    }
//    jobs += launch(Dispatchers.IO) {
//        println("IO : \t\t ${Thread.currentThread().name}")
//    }
//    jobs += launch {
//        println("main runBlocking : \t\t ${Thread.currentThread().name}")
//    }
//    jobs += launch(newSingleThreadContext("MyThread")) {
//        println("MyThread : \t\t ${Thread.currentThread().name}")
//    }
//
//    jobs.forEach { it.join() }

    val job = launch {
        try {
            repeat(1000) { i ->
                println("I'm sleeping $i ...")
                delay(500L)
            }
        } finally {
//            println("Bye!")
            withContext(NonCancellable) {
                println("I'm running finally")
                delay(1000L)
                println("Non-Cancellable")
            }
        }
    }

    delay(1300L)
    job.cancelAndJoin()
    println("main : Quit!")
}
