//Kotlin program to reverse a string without built-in functions

fun main()
{
println("Enter a String")
val str = readln()
var reversed = ""

for(i in str.length-1 downTo 0)
{
reversed += str[i]
}

println("Reversed String is: $reversed")
}