package chap09.section3

fun main() {
    val capitalCityMap: MutableMap<String, String> =
        mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap.keys)
    println(capitalCityMap.values)

    capitalCityMap["UK"] = "London"
    capitalCityMap.remove("China")
    println(capitalCityMap)

    val addData = mutableMapOf("USA" to "Washington")
//    capitalCityMap.putAll(addData)
    capitalCityMap += addData

    println(capitalCityMap)
}
