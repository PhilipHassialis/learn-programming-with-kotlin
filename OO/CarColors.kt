package OO

public enum class CarColors(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

fun main() {
    println(0x10)
    println(0x1F)
    println(0xDEADBEEF)

    println(0x000000) // black
    println(0xFFFFFF) // white
    println(0xFF0000) // red
}
