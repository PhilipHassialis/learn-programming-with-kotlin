fun main() {
    print("Enter the word to guess")
    var word = readLine()
    if (word == null) {
        println("No word, game end")
        return
    }
    for (i in 1..100) println()

    var letters = word.lowercase().toCharArray().toHashSet()
    var correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses) {
        printExploredWord(word, correctGuesses)
        println("Wrong guesses $fails")
        print("Guess a letter: ")
        val input = readLine()
        if (input == null) {
            continue
        } else if (input.length != 1) {
            println("Type a single character")
            continue
        }
        if (word.lowercase().contains(input.lowercase())) {
            correctGuesses.add(input[0].lowercaseChar())
        } else {
            fails++
        }
    }
}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {

    for (c in word) {
        if (correctGuesses.contains(c.lowercaseChar())) print(c) else print("_")
    }
    println()
}
