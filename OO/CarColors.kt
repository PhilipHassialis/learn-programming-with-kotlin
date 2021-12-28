package OO

public enum class CarColors(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}

fun main() {
    println(0x10)
    println(0x1F)
    println(0xDEADBEEF)

    println(0x000000) // black
    println(0xFFFFFF) // white
    println(0xFF0000) // red

    println(0b1010)
    println(0b11111111 == 0xFF)
    println(0b11111111_00000000_00000000 == 0xFF0000)

    println(0b1101 and 0b1011)

    var cc = CarColors.GREEN
    println(cc.containsRed())

    var cc2 = CarColors.YELLOW
    println(cc.containsRed())

    println(CarColors.YELLOW.containsRed())
}
