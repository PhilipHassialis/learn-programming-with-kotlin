package functions

import java.util.Date

fun helloworld() {
    println("hello world")
}

fun printWithSpaces(text: String) {
    for (char in text) {
        print("$char ")
    }
    println()
}

fun getCurrentDate(): Date {
    return Date()
}

fun max(a: Int, b: Int): Int {
    if (a > b) return a else return b
}

fun main() {
    helloworld()
    printWithSpaces("Kotlin")
    println(getCurrentDate())
    println(max(3, 5))
}
