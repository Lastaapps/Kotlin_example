package basics

fun main() {

    unitFunction()

    //functions usage
    var toDivide = 1024.0
    println(toDivide)

    toDivide = divideMe(toDivide)
    println(toDivide)

    toDivide = divideMeCleaner(toDivide, 4)
    println(toDivide)

    toDivide = toDivide.divideMeExtension(8)
    println(toDivide)

    println(toDivide.toInt())
}

//functions without the return type, ": Unit" is redundant
fun unitFunction(): Unit {
    println("I won't give you anything!")
}

//normal function with a default parameter
fun divideMe(double: Double, divider: Int = 2): Double {
    return double / divider
}

//cleaner way to write short functions, ": Double" is redundant here
fun divideMeCleaner(double: Double, divider: Int = 2): Double = double / divider

//extension function example
fun Double.divideMeExtension(divider: Int = 2): Double {
    return this / divider
}