package basics_challenge

fun main() {

    val books =
            arrayOf(
                    "Neuromancer",
                    "Atrocity Archive",
                    "Snowcrash",
                    "Excession",
                    "The player of games"
            )
    for (book in books) {
        if (book.contains("e")) {
            for (bookChar in book) {
                println(bookChar)
            }
            println("---")
        }
    }
}
