package chap06.section1.customproperty

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var age: Int = _age
    private var tempName: String? = null
    var name: String = _name
        get() {
            if (tempName == null) tempName = "NONAME"
            return tempName ?: throw AssertionError("Asserted by others")
        }
}

fun main() {
    val user1 = User(1, "kildong", 35)
    user1.name = ""
    println("user1.name = ${user1.name}")
    user1.name = "coco"
    println("user1.name = ${user1.name}")
}
