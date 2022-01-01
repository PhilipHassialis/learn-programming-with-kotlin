package OO

import java.io.File

fun main() {
    var lineNumber = 0
    File("input.txt").forEachLine() {
        ++lineNumber
        println("$lineNumber $it")
    }
}
