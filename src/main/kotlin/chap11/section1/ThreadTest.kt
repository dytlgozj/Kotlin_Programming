package chap11.section1

class SimpleThread : Thread() {
    override fun run() {
        println("Current Threads : ${Thread.currentThread()}")
    }
}

class SimpleRunnable : Runnable {
    override fun run() {
        println("Current Threads : ${Thread.currentThread()}")
    }
}

fun main() {
//    val thread = SimpleThread()
//    thread.start()
//
//    val runnable1 = SimpleRunnable()
//    val thread1 = Thread(runnable1)
//    thread1.start()

    Thread { println("Current Threads : ${Thread.currentThread()}") }.start()
}
