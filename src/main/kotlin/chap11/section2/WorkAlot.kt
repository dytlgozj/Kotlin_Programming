package chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val jobs = repeat(100_000) {
        launch {
            delay(1000L)
            print("#")
        }
    }
}
