//Kotlin program to rotate an array to the right by one position

fun main() {
    var originalArray = arrayOf(0,1,2,3,4,5,6,7,8,9)
    val rightArray = originalArray.copyOf()
    val leftArray = originalArray.copyOf()
    
    val arrayRotation = ArrayRotation()
    println("Original Array:")
    println("${originalArray.contentToString()}")
    println("Rigth Rotate:")
    arrayRotation.RightRotate(rightArray)
    println("Left Rotate:")
    arrayRotation.LeftRotate(leftArray)
}
class ArrayRotation{
    fun RightRotate(array:Array<Int>) {
        val arraySize = array.size
        val lastElement = array[arraySize-1]
        for(i in arraySize-1 downTo 1) {
            array[i] = array[i-1]
        }
        array[0] = lastElement
        println("${array.contentToString()}")
    }
    fun LeftRotate(array:Array<Int>) {
        val arraySize = array.size
        val firstElement = array[0]
        for(i in 0 until arraySize-1) {
            array[i] = array[i+1]
        }
        array[arraySize-1] = firstElement
        println("${array.contentToString()}")
    }
}