//Kotlin Polymorphism, Method Overloading

/*Polymorphism is a concept in OOPs programming where a class can have multiple methods with same name but different parameters.
There are two types: Compile Time Polymorphism(Method Overloading) and Run Time Polymorphism(Method Overriding)*/

fun main()
{
val class1Object = class1()
class1Object.class1Method()
class1Object.class1Method("Polymorphism : Method Overloading")
class1Object.class1Method(10,10.0f)
}

class class1
{

fun class1Method()
{
println("Method without any parameters")
} 

fun class1Method(str : String)
{
println("\nMethod with one parameter")
println("String Parameter Value: $str")
} 

fun class1Method(a : Int, b : Float)
{
println("\nMethod with two or more parameters")
println("Int Parameter Value: $a")
println("Float Parameter Value: $b");
} 

}