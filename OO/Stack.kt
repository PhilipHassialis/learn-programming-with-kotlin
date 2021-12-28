package OO

open class Stack<E>(vararg val items: E) {

    val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) return elements.removeAt(elements.size - 1)
        return null
    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

fun main() {
    val myStack = Stack(12, 3, 56, 7, 8)
    myStack.push(13)
    myStack.push(22)

    println(myStack.pop())
}
