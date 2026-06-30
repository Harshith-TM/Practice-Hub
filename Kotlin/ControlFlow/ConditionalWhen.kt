//Kotlin program implementing simple calculator using when statement
//In Kotlin instead of switch statement we use when statement

fun main()
{
println("Enter First Number") //Prompt user to enter first number
var num1 = readLine()!!.toDouble()

println("Enter Second Number") //Prompt user to enter second number
var num2 = readLine()!!.toDouble()

//Display menu options
println("Choose operation")
println("1.Addition")
println("2.Subtraction")
println("3.Multiplication")
println("4.Division")

var choice = readLine()!!.toInt() //Read user's choice 

when(choice)
{
//Addition
1 -> {
println("Sum = ${num1 + num2}")
}
//Subtraction
2 -> {
println("Difference = ${num1 - num2}")
}
//Multiplication
3 -> {
println("Product = ${num1 * num2}")
}
//Division
4 -> {
if(num2!=0.0){
println("Division: ${num1 / num2}")
}else{
println("Cannot divide by zero")
}
}
else -> {
println("Invalid Choice")
}
}

}