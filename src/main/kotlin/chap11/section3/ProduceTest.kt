package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

@OptIn(ExperimentalCoroutinesApi::class)
fun CoroutineScope.producer(): ReceiveChannel<Int> = produce {
    var total = 0
    for (x in 1..5) {
        total += x
        send(total)
    }
}

@OptIn(ObsoleteCoroutinesApi::class)
fun main() = runBlocking {
    val result = producer()
    result.consumeEach { print("$it ") }
}
