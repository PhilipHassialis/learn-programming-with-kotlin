package IO

import java.io.File

fun main() {
    val FILENAME: String = "IPS.txt"
    val ipToCount = mutableMapOf<String, Int>()
    File(FILENAME).forEachLine() {
        // if (ipToCount.containsKey(it)) {
        //     val previous = ipToCount.get(it)!!
        //     ipToCount.put(it, previous + 1)
        // } else {
        //     ipToCount.put(it, 1)
        // }

        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous + 1)
    }

    // var maxIp = ipToCount.keys.first()
    // var maxCount = 0
    // for ((ip, count) in ipToCount.entries) {
    //     if (count > maxCount) {
    //         maxCount = count
    //         maxIp = ip
    //     }
    // }

    val maxValues = ipToCount.entries.maxByOrNull { it.value }!!

    println("Most frequent ip address is ${maxValues.key} which occured ${maxValues.value} times")
}
