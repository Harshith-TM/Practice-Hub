//Kotlin program for multiple inheritance

/*A Subclass inherits from a parent class, which in turn inherits from another parent class. It forms a chain of inheritance*/

fun main()
{
val class3Object = class3()

class3Object.class1Method()
class3Object.class2Method()
class3Object.class3Method()
}

open class class1
{
val class1Variable = "Class 1 Variable"
fun class1Method()
{
println("Class 1 Method")
println(class1Variable)
}
}

open class class2 : class1()
{
val class2Variable = "Class 2 Variable"
fun class2Method()
{
println("\nClass 2 Method")
println(class2Variable)
}
}

class class3 : class2()
{
val class3Variable = "Class 3 Variable"
fun class3Method()
{
println("\nClass 3 Method")
println(class3Variable)
}
}