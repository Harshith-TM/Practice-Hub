//Kotlin program for inheritance

/*OOPs Inheritance is a concept where a class acquires variables and methods of another class.
>A parent class or superclass is the class whose properties and methods are inherited by another class.
>A child class or superclass is the class that inherits the properties and methods of parent class.
[Note: Super Keyword, the super keyword is used to refer to the immediate parent class object.
 super.variableName
 super.methodName
 super() parent class constructor, if variable or property names are same in both class we should use override keyword.]
*/

fun main()
{
val class2Object = class2()
class2Object.class1Method()
class2Object.class2Method()
class2Object.displayClassName()
}

open class class1
{
val class1Variable = "Class 1 Variable"
open val name = "Parent Class"
fun class1Method()
{
println("Class 1 Method")
println(class1Variable)
}
}

class class2 : class1()
{
val class2Variable = "Class 2 Variable"
override val name = "Child Class"
fun class2Method()
{
println("\nClass 2 Method")
println(class2Variable)
}
fun displayClassName()
{
println("\n")
println(super.name) //using super keyword to access parent class variable
println(name)
}
}