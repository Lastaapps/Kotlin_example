package basics

fun main() {

    //0, 1, 2, 3, 4, 5
    for (i in 0..5) {
        println(i)
    }
    println()

    //0, 1, 2, 3, 4
    for (i in 0 until 5) {
        println(i)
    }
    println()

    //5, 4, 3, 2, 1, 0
    for (i in 5 downTo 0) {
        println(i)
    }
    println()
}