package OO

class Animal {
    var age: Int = 0
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    val name = ""
        get() = field
}

fun main() {
    var animal = Animal()
    animal.age = 10
    animal.age = -2
    println(animal.age)
}
