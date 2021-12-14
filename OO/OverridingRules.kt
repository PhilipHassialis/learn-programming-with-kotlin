package OO

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course")
    }
}

interface Learnable {
    fun learn() {
        println("Learning something")
    }
}

open class KotlinCourse() : Course(topic = "Kotlin", price = 11.99) {
    override final fun learn() { // disable override from descendants
        println("Learning the kotlin language")
    }
}

class KotlinDualInheritanceCourse() :
        Course(topic = "Kotlin inheritiance", price = 12.99), Learnable {
    override final fun learn() {
        super<Learnable>.learn()
        println("Learning kotlin without ambiguity")
    }
}

fun main() {
    val ck = KotlinDualInheritanceCourse()
    ck.learn()
}
