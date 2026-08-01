//Kotlin program to rotate an array to the right by one position

fun main() {
    var array = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    val arraySize = array.size
    println("Original Array:")
    for(element in array) {
        print("$element ")
    }
    val lastElement = array[arraySize-1]
    for(i in arraySize-1 downTo 1) {
        array[i] = array[i-1]
    }
    array[0] = lastElement
    println("\nArray after right rotation by one position:")
    for(element in array) {
        print("$element ")
    }
}