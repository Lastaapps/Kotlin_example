package basics

fun main() {

    val string1 = "Hello"
    val string2 = "Hello"
    val string3 = "There"


    //In Java
    string1 == string1          //true
    string1 == string2          //false
    string1.equals(string2)     //true
    string1 == string3          //false

    //In Kotlin
    string1 === string1          //true
    string1 == string2          //true
    string1.equals(string2)     //true
    string1 == string3          //false

}