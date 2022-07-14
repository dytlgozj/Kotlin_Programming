package chap11.section4

import kotlin.concurrent.thread

@Volatile private var running = false
private var count = 0

fun stop() {
    running = false
}

fun start() {
    running = true
    thread (start = true) {
        while (running) {
            println("${Thread.currentThread()}, count = ${count++}")
        }
    }
}

fun main() {
    start()
    start()
    Thread.sleep(1)
    stop()
}
