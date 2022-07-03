package chap08.section1

class Box<T>(var name: T)

fun main() {
    val box1 = Box(1)
    val box2 = Box("Hello")

    println(box1.name)
    println(box2.name)
}
