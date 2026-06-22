//Kotlin practice program

fun main()
{
println("Enter a Number")
var number = readln().toInt()
val mathutils = MathUtils()
mathutils.factorial(number)
mathutils.fibonacci(number)
}

class MathUtils
{

fun factorial(number:Int)
{
var factNumber=1
if(number < 0)
{
println("For Factorial, Number should be greater than 0")
}
else
{
for(i in 1..number)
{
factNumber*=i
}
println("Factorial of number $number is: $factNumber")
}
}

fun fibonacci(number:Int)
{
var fibNumber=0
var temp1=0
var temp2=1
if(number < 0)
{
println("For Fibonacci, Number should be greater than 0")
}
else
{
print("Fibonacci Series for $number is: ")
for(i in 0..number)
{
print("$fibNumber ")
temp1=fibNumber+temp2
fibNumber=temp2
temp2=temp1
}
}
}

}