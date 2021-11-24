package functions

fun main() {
    var list = listOf(1, 2, 3, 5, 7, 8, 9)
    println(reverse(list))
}

fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in list.size - 1 downTo 0) {
        result.add(list[i])
    }
    return result
}
