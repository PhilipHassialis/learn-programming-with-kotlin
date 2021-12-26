package OO

// objects can only be created once (singleton)
object Cache {
    val name = "Philip"
    fun retrieveData(): Int {
        return 0
    }
}

object CarFactory {
    fun produceCar() {
        println("producing a car")
    }
}
