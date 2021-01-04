fun main(args: Array<String>) {

    //val x var
    val value = "You wouldn't change me!"
    var variable = "It depends..."
    variable = "Yeah, I agree."


    //types
    val typeUgly: String = "Good to know"
    val typeCleaner = "Better"


    //basic types :Anything is redundant
    val string: String = ""
    val number: Int = 1
    val decimal: Double = 1.0
    val boolean: Boolean = true
    val javaObjectReplacement: Any = Any()



    val string1 = "Hello"
    val string2 = "Tree"
    val isSameJava = string1.equals(string2)    //Java's == calls .equals() in Kotlin
    val isSameKotlin = string1 == string2       //=== checks if the objects are the same


    if (false) {

    }

    while (false) {

    }
    do {

    } while (false)


    for (i in 0..5) {
        //0, 1, 2, 3, 4, 5
    }
    for (i in 0 until 5) {
        //0, 1, 2, 3, 4
    }

    //if-else blocks simplified
    when  {
        0 in 1..4 -> {
            println("Math is broken!")
        }
        "i" == "y" -> throw IllegalStateException("Czech is broken")
        else -> {
            println("Everything fine")
        }
    }

    //java's switch
    val whoAreYou = 69
    when(whoAreYou) {
        !is Int -> println("I don't know you")
        in Int.MIN_VALUE..-1 -> println("Bellow Ovčáček level")
        in 0 until 69 -> println("Bellow The Number")
        69 -> println("The Number")
        else -> println("Above The Number")
    }


    //functions usage
    var toDivide = 1024.0
    toDivide = divideMe(toDivide)
    toDivide = divideMeCleaner(toDivide, 4)
    toDivide = toDivide.divideMeExtension(8)

}

//functions without the return type, ": Unit" is redundant
fun unitFunction(): Unit {

}

//normal function
fun divideMe(double: Double, divider: Int = 2): Double {
    return double / divider
}

//cleaner way to write short functions, ": Double" is redundant here
fun divideMeCleaner(double: Double, divider: Int = 2): Double = double / divider

//extension function example
fun Double.divideMeExtension(divider: Int = 2): Double {
    return this / divider
}


