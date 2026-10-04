//Kotlin program to remove duplicates in a arraylist

fun main() {
    val list = arrayListOf(10, 20, 40, 50, 30, 30, 60, 10, 40, 20)
    val unique = arrayListOf<Int>()
    for (n in list) {
        if (!unique.contains(n)) {
            unique.add(n)
        }
    }
    println(unique)
}