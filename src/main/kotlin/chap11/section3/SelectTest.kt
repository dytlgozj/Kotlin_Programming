package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlinx.coroutines.selects.*
import java.util.Random

@OptIn(ExperimentalCoroutinesApi::class)
fun main() = runBlocking {
    val routine1 = GlobalScope.produce {
        val delayNum = Random().nextInt(1000).toLong()
        println("routine1 delay number is $delayNum")
        delay(delayNum)
        send("A")
    }
    val routine2 = GlobalScope.produce {
        val delayNum = Random().nextInt(1000).toLong()
        println("routine2 delay number is $delayNum")
        delay(delayNum)
        send("B")
    }

    val result = select<String> {
        routine1.onReceive { it }
        routine2.onReceive { it }
    }

    println("더 빨랐던 루틴은 $result 입니다!")
}
