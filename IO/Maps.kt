package IO

fun main() {
    val namesToAges = mapOf(Pair("Philip", 45), Pair("Helen", 45), Pair("Kiki", 23))
    val namesToAges2 = mapOf("Philip" to 45, "Helen" to 45, "Kiki".to(23))
    println(namesToAges == namesToAges2)
    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countriesToInhabitants = mutableMapOf(Pair("Greece", 10_500_000), "USA" to 330_000_000)
    countriesToInhabitants.put("Australia", 25_000_000)
    countriesToInhabitants.putIfAbsent("USA", 320_000_000)
    println(countriesToInhabitants.entries)

    if (countriesToInhabitants.contains("USA")) {
        println(countriesToInhabitants.get("USA"))
    }
    println(countriesToInhabitants.getOrDefault("France", 0))

    namesToAges.entries.forEach { println("${it.key} is ${it.value} old") }
}
