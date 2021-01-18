package basics

import kotlin.random.Random

fun main() {
    val doILive = true

    while (doILive) {
        if (Random.nextInt(10) == 5) {
            println("I died :(")
            break
        }
        println("I live!")
    }

    do {
        println("I live again!")
    } while (Random.nextInt(10) != 5)
    println("Not any more...")

}