package chap08.section2

fun main() {
    val b = Array<Any>(10, { 0 })
    b[0] = "Hello World"
    b[1] = 1.1

    for (i in 0..2) {
        println(b[i])
    }
}
