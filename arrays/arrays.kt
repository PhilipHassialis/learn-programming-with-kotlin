package arrays

fun main() {
    // Arrays
    var array = arrayOf("Athens", "Thessaloniki", "Patras")
    var mixed = arrayOf("Philip", 45)
    var numbers = intArrayOf(3, 17, 89)
    println(mixed[0])
    mixed[1] = 3.14159
    println(mixed[1])

    var str = "Udemy"
    println(str[1])

    var etiasMember1 = arrayOf("Philip", "Stratos", "Stavros")
    var etiasMember2 = arrayOf("Neli", "Effie", "George")

    val etiasMembers = etiasMember1 + etiasMember2

    println("Etias members size " + etiasMembers.size)

    println("Etias members is empty " + etiasMembers.isEmpty())

    if (etiasMembers.contains("Neli")) {
        println("Neli is contained in etiasMembers")
    }

    val listOfFoods = listOf("Pasta", "Beef", "Chinese")

    var arrayListOfNames = arrayListOf("Philip", "Alex", "Helen")
    arrayListOfNames.add("Glyceria")

    println(listOfFoods + arrayListOfNames)

    arrayListOfNames.add("Effie")
    arrayListOfNames.add(1, "Daniel")
    println(arrayListOfNames)

    val removed = arrayListOfNames.remove("Dimitri")
    println(removed)

    val subList = arrayListOfNames.subList(0, 3)
    println(subList)
}
