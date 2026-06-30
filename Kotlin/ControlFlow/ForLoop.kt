//Kotlin program to print Fibonacci series using for loop

fun main()
{
//Starting two numbers of the Fibonacci Series.
var a=0
var b=1

//Variable for next Fibonacci number.
var next:Int

//Prompt user to enter number of terms to generate.
println("Enter number of terms: ")
var n = readLine()!!.toInt()

/*
Generate Fibonacci series using for loop.
Each time the loop print current term and calculates next term for the series.
*/

println("Fibonacci Series: ")

for(i in 0 until n)
{
//To print current element of the Series.
print("$a ")

//Calculate the next term.
next = a+b

//Update variables a & b for next iteration.
a=b
b=next
}
}