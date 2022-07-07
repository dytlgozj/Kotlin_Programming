package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100), Pair("D", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

//    println("elementAt : " + list.elementAt(1))
//    println("elementAtOrElse : " + list.elementAtOrElse(10) { it * 2 })
//    println("elementAtOrNull : " + list.elementAtOrNull(10))
//
//    println("first : " + listPair.last { it.second == 200 })

//    println("single : " + listPair.single { it.second == 100 })

    println("binarySearch : " + list.binarySearch(3))
    println("find : " + list.find { it > 3 })
}
