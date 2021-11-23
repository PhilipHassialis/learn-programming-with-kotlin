package conditionals

fun main() {
    val age: Int = 45
    if (age < 18) {
        println("You cannot register")
    } else if (age < 50) {
        println("You can register for our premium package")
    } else {
        println("You can register")
    }

    val mode: Int = 4
    when (mode) {
        1 -> println("The mode is lazy")
        2 -> {
            println("The mode is 2")
            println("The mode is busy")
        }
        3 -> println("The mode is productive")
        else -> println("Mode unknown")
    }

    val result: String =
            when (mode) {
                1 -> "The mode is lazy"
                2 -> "The mode is busy"
                3 -> "The mode is productive"
                else -> "Unknown mode"
            }

    println(result)

    val result2 =
            if (mode == 1) {
                "The mode is lazy"
            } else if (mode == 2) {
                "The mode is busy"
            } else if (mode == 3) {
                "The mode is productive"
            } else {
                "Unknown mode"
            }

    println(result2)

    val x = 10

    when (x) {
        5 -> println("x is 5")
        3 * 12 -> println("x is 3 * 12")
        "Hello world".length -> println("x is length of string 'Hello world'")
        in 1..10 -> println("x between 1 and 10")
        !in 1..9 -> println("x is not between to 9")
    }
}
