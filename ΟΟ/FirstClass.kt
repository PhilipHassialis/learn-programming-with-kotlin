package OO

import java.time.LocalDate

class Person(var name: String, var age: Int) {

    var birthYear = LocalDate.now().year - age

    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

    // fun getYearOfBirth(): Int {
    //     return 2021 - age
    // }

    // fun getYearOfBirth(): Int = LocalDate.now().year - age
    fun getYearOfBirth(): Int = birthYear
}

fun main() {
    val person = Person("Philip Alexander", 45)
    person.speak()
    println("name is ${person.name}")
    person.greet("World")
    println("year of birth is ${person.getYearOfBirth()}")
}
