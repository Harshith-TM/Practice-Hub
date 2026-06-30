//Kotlin Program to implement Unary and Relational Operators

fun main()
{

//Unary Operators
/* we can use either the operator or the internal function in Kotlin.

| Operator        | Expression     | Internal function        |
| --------------- | -------------- | ------------------------ |
| +a              | unary plus     | a.unaryPlus()            |
| -a              | unary minus    | a.unaryMinus()           |
| !a              | logical NOT    | a.not()`                 |
| ++a             | pre-increment  | a.inc()                  |
| a++             | post-increment | a.inc() + temporary copy |
| --a             | pre-decrement  | a.dec()                  |
| a--             | post-decrement | a.dec() + temporary copy |

*/
var a=10; var b: Int
println("Unary Operators")
println("Original value of a: $a")

println("Unary Plus: ${+a}")

println("Unary Minus: ${-a}");

b = ++a
println("Pre Increment, a= $a b= $b"); 

b = a++
println("Post Increment, a= $a b= $b");

b = --a
System.out.println("Pre Decrement, a= $a b= $b");

b = a--
System.out.println("Post Decrement, a= $a b= $b");

var flag = true
System.out.println("Logical Not: ${!flag}");

//Relational Operators
//Relational Operators returns only Boolean value
var num1 = 20; var num2 = 30

println("\nRelational Operators")
println("num1 == num2: ${num1 == num2}");

println("num1 != num2: ${num1 != num2}")

println("num1 > num2: ${num1 > num2}")

println("num1 < num2: ${num1 < num2}")

println("num1 >= num2: ${num1 >= num2}")

println("num1 <= num2: ${num1 <= num2}")

}