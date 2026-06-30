//Java program to display Arithmetic and Assignment operators

class OperatorsPart1
{
public static void main(String args[])
{
int a = 10, b = 5;

//Arithmetic Operators
System.out.println("Arithmetic Operators");
System.out.println("Addition: "+ (a + b)); // Addition Operator gives sum of two numbers
System.out.println("Subtraction: "+ (a - b)); // Subtraction Operator gives difference of two numbers
System.out.println("Multiplication: "+ (a * b)); // Multiplication Operator gives product of two numbers
System.out.println("Division: "+ (a / b)); // Division Operator gives quotient of two numbers
System.out.println("Modulus: "+ (a % b)); // Modulus Operator gives remainder of two numbers

//Assignment Operators
System.out.println("Assignment Operators");

a += b;
System.out.println("a += b: "+ a); // Same as a = a + b; after this "a" value will be 15 (10+5)
a -= b;
System.out.println("a -= b: "+ a); // Same as a = a - b; after this "a" value will be 10 (15-5). As a value is changed using a += b;
a *= b;
System.out.println("a *= b: "+ a); // Same as a = a * b; after this "a" value will be 50 (10*5). As a value is changed using a -= b;
a /= b;
System.out.println("a /= b: "+ a); // Same as a = a / b; after this "a" value will be 10 (50/5). As a value is changed using a *= b;
a %= b;
System.out.println("a %= b: "+ a); // Same as a = a % b; after this "a" value will be 0 (10%5). As a value is changed using a /= b;
a = b;
System.out.println("a = b: "+ a); // Same as a = a + b; after this "a" value will be same as "b". so "a" will be 5;

}
}