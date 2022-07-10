package chap10.section3

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

fun main() {
    val path = "C:\\Users\\Administrator\\Documents\\Analysis\\Project\\Kotlin_Project\\KotlinProgramming\\src\\main\\kotlin\\chap10\\section1\\output.txt"
    val text = "안녕하세요! Hello World!\n"

    try {
        Files.write(Paths.get(path), text.toByteArray(), StandardOpenOption.CREATE)
    } catch (e: IOException) {
    }
}
