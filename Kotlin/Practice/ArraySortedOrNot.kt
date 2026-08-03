//Kotlin Program to check if an array is sorted

fun main() {
    val array1 = arrayOf(0,1,2,3,4,5)
    val array2 = arrayOf(5,4,3,2,1,0)
    val array3 = arrayOf(5,1,3,2,4,0)
    val array4 = arrayOf(-8,5,-1,2,10,0)
    
    println("Is Array1 Sorted: ${isSorted(array1)}")
    println("Is Array2 Sorted: ${isSorted(array2)}")
    println("Is Array3 Sorted: ${isSorted(array3)}")
    println("Is Array4 Sorted: ${isSorted(array4)}")
}
fun isSorted(array : Array<Int>) : Boolean {
    var ascendingOrder = true; var descendingOrder = true
    for(i in 0 until array.size-1) {
        if(array[i] > array[i+1]) {
            ascendingOrder = false
        }
        if(array[i] < array[i+1]) {
            descendingOrder = false
        }
    }
    return ascendingOrder || descendingOrder
}