package OO

import java.time.LocalDate

open class Person(open val name: String, open var age: Int) {

    var birthYear: Int

    init {
        println("Object was created")
        birthYear = LocalDate.now().year - age
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
    fun getYearOfBirth(): Int = LocalDate.now().year - age
}

class Student(override val name: String, override var age: Int, val studentId: String) :
        Person(name, age) {
    fun isIntelligent() = true
}

class Employee(override val name: String, override var age: Int) : Person(name, age) {
    fun receivePayment() {
        println("Received payment")
    }
}

fun main() {
    // val person = Person("Philip Alexander", 45)
    // person.speak()
    // println("name is ${person.name}")
    // person.greet("World")
    // println("year of birth is ${person.getYearOfBirth()}")

    val student = Student("Philip", 45, "1234")
    student.speak()
    student.greet("Alex")

    println(student.isIntelligent())

    val employee = Employee("Helen", 45)
    println(employee.getYearOfBirth())

    employee.receivePayment()
}
