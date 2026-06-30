//Kotlin program to display Arithmetic and Assignment operators

fun main()
{
var a = 10; var b = 5

//Arithmetic Operators
println("Arithmetic Operators")
println("Addition: ${a + b}") // Addition Operator gives sum of two numbers
println("Subtraction: ${a - b}") // Subtraction Operator gives difference of two numbers
println("Multiplication: ${a * b}") // Multiplication Operator gives product of two numbers
println("Division: ${a / b}") // Division Operator gives quotient of two numbers
println("Modulus: ${a % b}") // Modulus Operator gives remainder of two numbers

//Assignment Operators
println("Assignment Operators")

a += b;
System.out.println("a += b: $a") // Same as a = a + b; after this "a" value will be 15 (10+5)
a -= b;
System.out.println("a -= b: $a") // Same as a = a - b; after this "a" value will be 10 (15-5). As a value is changed using a += b;
a *= b;
System.out.println("a *= b: $a") // Same as a = a * b; after this "a" value will be 50 (10*5). As a value is changed using a -= b;
a /= b;
System.out.println("a /= b: $a") // Same as a = a / b; after this "a" value will be 10 (50/5). As a value is changed using a *= b;
a %= b;
System.out.println("a %= b: $a") // Same as a = a % b; after this "a" value will be 0 (10%5). As a value is changed using a /= b;
a = b;
System.out.println("a = b: $a") // Same as a = a + b; after this "a" value will be same as "b". so "a" will be 5;

}