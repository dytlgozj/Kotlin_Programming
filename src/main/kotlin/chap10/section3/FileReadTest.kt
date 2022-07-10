package chap10.section3

import java.io.File
import java.io.FileReader
import java.nio.file.Paths

fun main() {
    val path = "C:\\Users\\Administrator\\Documents\\Analysis\\Project\\Kotlin_Project\\KotlinProgramming\\src\\main\\kotlin\\chap10\\section3\\over_the_rainbow.txt"

    try {
        val read = FileReader(path)
        println(read.readText())
        read.close()
    } catch (e: Exception) {
        println(e.message)
    }

//    println(File(path).readText())
}
