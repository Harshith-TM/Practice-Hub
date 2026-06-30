//Kotlin program to take user input

fun main()
{
println("Enter Your Name")
val name = readln()

println("Enter any Number")
val number = readln().toInt()

println("Enter Your Weight")
val weight = readln().toDouble() // readln().toFloat() for float type

println("Enter Your Height")
val height = readln().toDouble()

println("Is your age above 18 years [enter true or false]")
val age = readln().toBoolean()

println("\n--Entered Details--")
println("Name: $name")
println("Random Number: $number")
println("Weight: $weight")
println("Height: $height")
println("Above 18 Years: $age")
}

/*
Example using readLine()
val text = readLine()
val number = readLine()!!.toInt()

| Function   | Returns | Null-safe | Notes              |
| ---------- | ------- | --------- | ------------------ |
| readln()   | String  | Yes       | Throws if no input |
| readLine() | String? | No        | Can return null    |
*/