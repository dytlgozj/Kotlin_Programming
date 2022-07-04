package chap05.section5.internal

internal class InternalClass {
    internal var i = 1
    internal fun isFunc() {
        i += 1
    }

    fun access() {
        isFunc()
    }
}

class Other {
    internal val ic = InternalClass()
    fun test() {
        ic.i
        ic.isFunc()
    }
}

fun main() {
    val mic = InternalClass()
    mic.i
    mic.isFunc()
}
