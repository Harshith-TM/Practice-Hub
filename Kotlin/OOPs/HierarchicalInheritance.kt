//Kotlin program for multiple inheritance

//multiple subclasses inherit from a single superclass

fun main()
{
val class2Object = class2()
class2Object.class2Method()
class2Object.class1Method()

val class3Object = class3()

class3Object.class3Method()
class3Object.class1Method()
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

class class2 : class1()
{
val class2Variable = "Class 2 Variable"
fun class2Method()
{
println("\nClass 2 Method")
println(class2Variable)
}
}

class class3 : class1()
{
val class3Variable = "Class 3 Variable"
fun class3Method()
{
println("\nClass 3 Method")
println(class3Variable)
}
}