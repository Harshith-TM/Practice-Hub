//Kotlin program related to arrays

fun main()
{
//array index starts from 0 i.e., starting point of the array is 0
var array1 = IntArray(2) //Declaring and initialising without values.
array1[0] = 1
array1[1] = 2
var array2 = intArrayOf(10,20,30,40,50,60,70,80,90,100) //Declaring and initialising with values.

println("Arrays")
println("\nAccessing single element from an array")
println("array1[0]: ${array1[0]}")
println("array1[1]: ${array1[1]}")

println("\nLength of array1")
println("Length: ${array1.size}")
println("\nLength of array2")
println("Length: ${array2.size}")

println("\nAccessing all elements from an array")
for(i in array2.indices){
println("array2[$i]: ${array2[i]}")
}
}