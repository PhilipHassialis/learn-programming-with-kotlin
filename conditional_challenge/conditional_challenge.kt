package conditional_challenge

import java.util.Random

fun main() {

    // val random = (1..50).random()
    // when (random) {
    //     in 1..10 -> println("Random number between 1 and 10")
    //     in 11..20 -> println("Random number between 11 and 20")
    //     in 21..30 -> println("Random number between 21 and 30")
    //     in 31..40 -> println("Random number between 31 and 40")
    //     in 41..50 -> println("Random number between 41 and 50")
    //     else -> println("How did you get here?")
    // }

    val x = Random().nextInt(50) + 1
    println("Random number from java:" + x)
}
