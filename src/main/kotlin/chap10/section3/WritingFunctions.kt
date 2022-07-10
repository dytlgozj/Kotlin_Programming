package chap10.section3

import java.io.File
import java.io.FileWriter

fun main() {
    val outString: String = "안녕하세요!\tHello\r\nWorld!."
    val path = "C:\\Users\\Administrator\\Documents\\Analysis\\Project\\Kotlin_Project\\KotlinProgramming\\src\\main\\kotlin\\chap10\\section3\\output.txt"

    FileWriter(path, true).use { it.write(outString) }
}
