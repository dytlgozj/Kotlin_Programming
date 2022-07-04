package chap08.section2

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("arr : ${arr.contentToString()}")
    println("size : ${arr.size}")
    println("sum() : ${arr.sum()}")

    println(arr[2])

    arr[0] = 8
    println("size : ${arr.size}, arr[0] : ${arr[0]}, arr[2] : ${arr[2]}")

    for (i in 0..arr.size - 1) {
        println("arr[${i}] = ${arr[i]}")
    }
}
