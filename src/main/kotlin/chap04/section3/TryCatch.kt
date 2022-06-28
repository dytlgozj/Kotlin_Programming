package chap04.section3

import java.lang.ArithmeticException
import java.lang.Exception

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b
    } catch (e: ArithmeticException) {
        println("Exception is handled. ${e.message}")
    } finally {
        println("finally 블록은 항상 실행됨.")
    }
}
