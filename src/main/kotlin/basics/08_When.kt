package basics

fun main() {

    val someValue = "Something"

    //if-else blocks simplified
    when  {
        0 in 1..4 -> {
            println("Math is broken!")
        }
        "i" == "y" -> throw IllegalStateException("Czech is broken")
        someValue.length == 3 -> println("So small.\n That's what she said!")
        else -> {
            println("Everything fine")
        }
    }

    //java's switch
    val whoAreYou = 69
    when(whoAreYou) { //when (69) {
        !is Int -> println("I don't know you") //type check
        in Int.MIN_VALUE..-1 -> println("Bellow Ovčáček") // '<' ,'>' not allowed there :(
        in 0 until 69 -> println("Bellow The Number") // excludes 69
        69 -> println("The Number")
        else -> println("Above The Number")
    }
}