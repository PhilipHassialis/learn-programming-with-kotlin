package loops

fun main() {

    var sum = 0
    for (i in 1..10) {
        println(i)
        sum += i
    }
    println("sum " + sum)

    val langs = listOf("Java", "Kotlin", "C#", "Typescript")
    for (lang in langs) {
        println(lang)
    }

    for ((index, value) in langs.withIndex()) {
        println("$index: $value")
    }

    var x = 9
    while (x >= 0) {
        println(x--)
    }

    for (c in "Python") {
        if (c == 'o') {
            break
        }
        print(c)
    }
    println()

    val list = listOf("book", "table", "laptop")
    for (str in list) {
        if (!str.contains("o")) {
            continue
        }
        println(str)
    }

    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) {
                break@outer
            }
            println("$i - $j")
        }
    }

    var challengeSum = 0
    for (i in 100..100000) {
        challengeSum += i
    }
    println("challengeSum $challengeSum")
}
