//Kotlin program to demonstrate enum class
/*In Kotlin, an enum (short for enumeration) is a special data type used to define a fixed set of predefined constants in a type-safe way.*/

enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    val isWeekend: Boolean
        get() = this == SATURDAY || this == SUNDAY
}
fun main() {
    val today = Day.SATURDAY
    println("$today is weekend? ${today.isWeekend}")

    for (d in Day.values()) {
        println("${d.ordinal}: ${d.name}")
    }
    when (today) {
        Day.SATURDAY, Day.SUNDAY -> println("Relax!")
        else -> println("Work day.")
    }
}