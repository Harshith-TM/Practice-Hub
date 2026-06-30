//Kotlin Polymorphism, Method Overriding

fun main()
{
val class1Object = class1()
class1Object.OverrideMethod()

val class2Object = class2();
class2Object.OverrideMethod()
}

open class class1
{
open fun OverrideMethod()
{
println("Method from Class1")
} 
}

class class2 : class1()
{
override fun OverrideMethod() /*while overriding a method override keyword is compulsory and the method should be open*/
{
println("\nMethod from Class1 Overridden by Class2")
} 
}