package chap09.section3

import java.util.SortedMap

fun main() {
    val hashMap: HashMap<Int, String> = hashMapOf(1 to "hello", 2 to "world")
    println("hashMap = $hashMap")

    val sortedMap: SortedMap<Int, String> = sortedMapOf(1 to "Apple", 2 to "Banana")
    println("sortedMap = $sortedMap")

    val linkedHashMap: LinkedHashMap<Int, String> = linkedMapOf(1 to "Computer", 2 to "mouse")
    println("linkedHashMap = $linkedHashMap")
}
