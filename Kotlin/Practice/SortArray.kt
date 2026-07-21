//Kotlin Program to sort an array (without using built-in methods)

fun main()
{

var array = arrayOf(-23,14,0,7,-9,31,-16,5,18,-2,27,-11,42,10,-35)
val sortingOrder = SortingOrder()
sortingOrder.ascendingOrder(array)
sortingOrder.descendingOrder(array)

}

class SortingOrder
{

fun ascendingOrder(array:Array<Int>)
{
val arraySize = array.size
for(i in 0 until arraySize)
{
for(j in i+1 until arraySize)
{
if(array[i]>array[j])
{
var temp = array[i]
array[i] = array[j]
array[j] = temp
}
}
}
println("Sorted Array: ")
println("${array.contentToString()}")
}

fun descendingOrder(array:Array<Int>)
{
val arraySize = array.size
for(i in 0 until arraySize)
{
for(j in i+1 until arraySize)
{
if(array[i]<array[j])
{
var temp = array[i]
array[i] = array[j]
array[j] = temp
}
}
}
println("Sorted Array: ")
println("${array.contentToString()}")
}

}