//Kotlin program to print diamond pattern
fun main() {
    val n = 5

    for (i in 1..n) {
        repeat(n - i) { print(" ") }
        for (k in 1..(2 * i - 1)) {
            if (k == 1 || k == (2 * i - 1) || i == n) print("*") else print(" ")
        }
        println()
    }

    for (i in n - 1 downTo 1) {
        repeat(n - i) { print(" ") }
        for (k in 1..(2 * i - 1)) {
            if (k == 1 || k == (2 * i - 1)) print("*") else print(" ")
        }
        println()
    }
}