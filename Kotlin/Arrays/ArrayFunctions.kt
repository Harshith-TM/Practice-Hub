//Kotlin program for array functions

fun main()
{
val array1 = intArrayOf(8,5,10,13,1)

//Array Length
println("Array Length: ${array1.size}") //Returns the number of elements in the array

//Converting Array to a String
var strArray = array1.contentToString()
println("Array to String: $strArray") //Converts array into readable string format

//Sorting an Array
println("\nSorted Array: ")
array1.sort()
System.out.println("Sorted Array: ${array1.contentToString()}") //Sorts the array elements in ascending order

//Comparing two Arrays
val array2 = intArrayOf(1,5,8,10,13)
val array3 = intArrayOf(1,2,3,4,5)
println("\nComparing two Arrays")
println("array1 equals to array2: ${array1.contentEquals(array2)}") //Compares two arrays and check if they are equal or not
println("array1 equals to array3: ${array1.equals(array3)}")

//Copying an array
val copyOfArray1 = array1.copyOf(10)
println("\nCopy of array1:\n${array1.contentToString()}") /*Creates a copy of the array with specified size. If the original array has less elements than the size specified for the copy it fills the empty positions with zeros*/

//Filling an array
val filledArray = intArrayOf(1,2,3,4,5)
filledArray.fill(10);
println("\nFilled array:\n${filledArray.contentToString()}") //Fills all elements of the array with given value

//Binary Search an sorted array
val position = array1.binarySearch(13)
println("\nPosition of number 13 in sorted array1:\n$position") //Search for an element in a sorted array and returns its index/position

}