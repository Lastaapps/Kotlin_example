package basics

fun main() {

    val shouldSayHello = true

    val saidHello = if (shouldSayHello) {
        println("Hello")
        true
    } else
        false

    if (saidHello) {
        println("F*ck off, I have a boyfriend!")
    }
}