package chap09.section5

fun main() {
    val fib = generateSequence(1 to 1) { it.second to it.first + it.second }.map { it.first }
    println(fib.take(10).toList())
}
