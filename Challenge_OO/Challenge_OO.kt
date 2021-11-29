package Challenge_OO

class Book(val title: String, val author: String, val publicationYear: Int) {

    var borrowed: Boolean = false

    fun borrowBook() {
        borrowed = true
    }

    fun returnBook() {
        borrowed = false
    }

    override fun toString() =
            "Book [Title: $title Author: $author Pub Year: $publicationYear] - " +
                    if (borrowed) "borrowed" else "available"
}

fun main() {
    var myBook = Book("Design Patterns", "Gang of Four", 1994)
    println(myBook)
    myBook.borrowBook()
    println(myBook)
}
