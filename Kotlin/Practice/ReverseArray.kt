//Kotlin program to reverse an array

fun main()
{
val arr = arrayOf(10,20,30,40,50)

println("Original array elements")
for(i in arr.indices){
print("${arr[i]} ")
}

println("\n\nReversed array elements")
for(i in arr.size-1 downTo 0){
print("${arr[i]} ")
}

//Kotlin also has 2 in-built functions to reverse an array
//1.reversed() -> this returns an reversed list. does not modify the original array
println("\n\nUsing reversed()")
println("Reversed array elements")
println("${arr.reversed()}")

//2.reverse() -> this modifies the original array
println("\nUsing reverse()")
println("Reversed array elements")
arr.reverse()
for(i in arr.indices){
print("${arr[i]} ")
}
}