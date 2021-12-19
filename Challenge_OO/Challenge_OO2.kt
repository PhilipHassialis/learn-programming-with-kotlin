package Challenge_OO

interface Lendable {

    fun borrow()
}

abstract class InventoryItem(val title: String, val genre: String, val publicationYear: Int) :
        Lendable {}

class LendableBook(title: String, val author: String, genre: String, publicationYear: Int) :
        InventoryItem(title, genre, publicationYear) {
    override fun borrow() {
        println("Borrowing a book")
    }
}

class LendableDVD(title: String, val length: Int, genre: String, publicationYear: Int) :
        InventoryItem(title, genre, publicationYear) {
    override fun borrow() {
        println("Borrowing a dvd")
    }
}
