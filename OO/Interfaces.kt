package OO

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
    fun finishBuilding() {
        println("finish building a Buildable")
    }
}

class Car(val color: CarColors, override val timeRequired: Int) : Driveable, Buildable {
    override fun drive() {
        println("Driving a car")
    }

    override fun build() {
        println("Building a car in $timeRequired hours")
    }
}

class Motorcycle(val color: String, override val timeRequired: Int) : Driveable, Buildable {
    override fun drive() {
        println("Driving a motorcycle")
    }

    override fun build() {
        println("Building a motorcycle in $timeRequired hours")
    }
}

fun main() {
    val d: Driveable = Car(CarColors.RED, 120)

    d.drive()

    println((d as Car).color)

    val b: Buildable = Motorcycle("blue", 20)

    b.build()
    b.finishBuilding()
}
