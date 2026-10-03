//Kotlin program on Arraylist. Finding max and min elements in a ArrayList

fun main() {
    val numbers = listOf(15, 89, 42, 7, 63)
    val max = numbers.maxOrNull()
    val min = numbers.minOrNull()
    println("Maximum: $max") // 89
    println("Minimum: $min") // 7
}