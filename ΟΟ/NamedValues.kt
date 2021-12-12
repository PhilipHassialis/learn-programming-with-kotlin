package OO

class House(val height: Double, val color: String, val price: Int = 15000) {

    fun print() {
        println("House [height=$height, color=$color, price=$price]")
    }
}

fun main(args: Array<String>) {
    val house = House(height = 4.5, color = "Blue", price = 1000)
    house.print()
    val redHouse = House(color = "Red", price = 2000, height = 9.8)
    redHouse.print()
    val yellowHouse = House(color = "Yellow", height = 5.7)
    yellowHouse.print()
}
