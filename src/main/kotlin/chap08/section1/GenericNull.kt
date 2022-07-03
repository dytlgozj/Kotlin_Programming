package chap08.section1

class GenericNull<T: Any> {
    fun equalityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>()
    obj.equalityFunc("Hello", "World")

    val obj2 = GenericNull<Int?>()
    obj2.equalityFunc(null, 10)
}
