package IO

fun main() {
    val number = (1..100).random()
    var input: String?
    var guess = -1

    while (guess != number) {
        print("Guess a number between 1 and 100:")
        input = readLine()
        if (input != null) {
            // can throw number format exception
            guess = input.toInt()
        }
        if (guess < number) {
            println("Too low")
        } else if (guess > number) {
            println("Too high")
        } else {
            println("You won!")
        }
    }
}
