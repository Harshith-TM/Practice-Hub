//Kotlin Program to find second largest number in an array

fun main()
{
var largest = Int.MIN_VALUE
var secondLargest = Int.MIN_VALUE
println("Enter number of array elements")
val size = readln().toInt()
if(size<2)
{
println("Array should contain atleast 2 elements")
return
}
var array = IntArray(size)
println("Enter array elements")
for(i in 0 until size)
{
array[i]=readln().toInt()
}
for (number in array)
{
if (number > largest)
{
secondLargest = largest
largest = number
}
else if (number > secondLargest && number != largest)
{
secondLargest = number
}
}
println("Second Largest Element: $secondLargest")
}