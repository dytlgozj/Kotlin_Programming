package chap10.section1

import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("C:\\Users\\Administrator\\Documents\\Analysis\\Project\\Kotlin_Project\\KotlinProgramming\\src\\main\\kotlin\\chap10\\section1\\output.txt"))
        .use { it.println("Hello") }
}
