package OO

import OO.CarColors.BLUE
import OO.CarFactory.produceCar
import functions.getCurrentDate
import java.math.BigInteger
import java.time.LocalDate

// simple class cannot be inherited at all - simple classes are final
// open can be inherited and instantiated
// abstract can be inherited only

abstract class Person(open val name: String, open var age: Int) {

    var birthYear: Int

    init {
        println("Object was created")
        birthYear = LocalDate.now().year - age
        val bigInt = BigInteger("3")
        val myCurrentData = getCurrentDate()
        produceCar()
        val blue = BLUE
    }

    // abstract methods MUST be overriden and implemented
    abstract fun speak()

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

    override fun speak() {
        println("Hi I am a student")
    }
}

class Employee(override val name: String, override var age: Int) : Person(name, age) {
    fun receivePayment() {
        println("Received payment")
    }
    override fun speak() {
        println("Hi I am an employee")
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

    println(6 / 2 * (1 + 2))
}
