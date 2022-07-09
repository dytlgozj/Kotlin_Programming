package chap09.section5

fun main() {
    val listBench = (1..1_000_000).toList()
    timeElapsed {
        listBench.map { it + 1 }.first { it % 100 == 0 }
    }

    timeElapsed {
        listBench.asSequence().map { it + 1 }.first { it % 100 == 0 }
    }
}

fun timeElapsed(task: () -> Unit) {
    val start = System.nanoTime()
    task()
    val stop = System.nanoTime()
    val speed = (stop - start) / 1000
    println("$speed ns")
}
