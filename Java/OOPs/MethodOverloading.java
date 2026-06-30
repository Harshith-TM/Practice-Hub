//Java Polymorphism, Method Overloading

/*Polymorphism is a concept in OOPs programming where a class can have multiple methods with same name but different parameters.
There are two types: Compile Time Polymorphism(Method Overloading) and Run Time Polymorphism(Method Overriding)*/

class MethodOverloading
{
public static void main(String args[])
{
class1 class1Object = new class1();
class1Object.class1Method();
class1Object.class1Method("Polymorphism : Method Overloading");
class1Object.class1Method(10,10);
}
}

class class1
{

void class1Method()
{
System.out.println("Method without any parameters");
} 

void class1Method(String str)
{
System.out.println("\nMethod with one parameter");
System.out.println("String Parameter Value: " + str);
} 

void class1Method(int a, float b)
{
System.out.println("\nMethod with two or more parameters");
System.out.println("Int Parameter Value: " + a);
System.out.println("Float Parameter Value: " + b);
} 

}