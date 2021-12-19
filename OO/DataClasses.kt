package OO

class Book(val title: String, val author: String, val publicationYear: Int, var price: Double) {

    override fun toString(): String {
        return "Book [title=$title, author=$author, publicationYear=$publicationYear, price=$price]"
    }
}

data class DataBook(
        val title: String,
        val author: String,
        val publicationYear: Int,
        var price: Double
) {}

fun main() {
    val book = Book("Super book", "Me", 2021, 123.00)
    val book2 = Book("Super book", "Me", 2021, 123.00)
    val databook = DataBook("Super book", "Me", 2021, 123.00)
    val databook2 = DataBook("Super book", "Me", 2021, 123.00)
    val databook3 = databook.copy()
    val databook4 = databook.copy(price = 99.99)

    println(book)
    println(databook)
    println(databook4)

    println(book.equals(book2))
    println(databook.equals(databook2))

    val (title, author, pubYear, price) = databook4

    println(title)
    println(pubYear)

    val set = hashSetOf(databook, databook2, databook3, databook4)
    val set2 = hashSetOf(book, book2)

    println(set)
    println(set2)
}
