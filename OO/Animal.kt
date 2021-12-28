package OO

open class Animal {
    var age: Int = 0
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    val name = ""
        get() = field

    private var myRealAge: Int = 14

    protected val myRealName = "real name"

    internal val isDangerous = true

    public fun isOverTen(): Boolean {
        return myRealAge > 10
    }
}

class Verterbrae : Animal() {
    fun introduceYourself() {
        println(myRealName)
    }
}

fun main() {
    var animal = Animal()
    animal.age = 10
    animal.age = -2
    println(animal.age)

    var vert = Verterbrae()
    vert.introduceYourself()
}
