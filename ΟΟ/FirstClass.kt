package OO

import java.time.LocalDate

class Person {
    var name: String = "Philip"
    var age: Int = 45

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

    // fun getYearOfBirth(): Int {
    //     return 2021 - age
    // }

    fun getYearOfBirth(): Int = LocalDate.now().year - age
}

fun main() {
    val person = Person()
    person.speak()
    println("name is ${person.name}")
    person.greet("World")
    println("year of birth is ${person.getYearOfBirth()}")
}
