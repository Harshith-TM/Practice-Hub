//Kotlin program for Nested Classes

fun main()
{
val outer = OuterClass()
outer.outerClassMethod()

val nestedInner = OuterClass.NestedInnerClass() //Nested inner class can be instantiated using outer class rather than its object. Same as static inner class in Java
nestedInner.nestedInnerClassMethod()

val inner = outer.InnerClass() //Non static inner class needs outer class object to be instantiated. Same as non static inner class in Java
inner.innerClassMethod()

outer.methodInnerClass()
}

class OuterClass
{
//Outer class can only access members and methods of Inner class using an object of the Inner Class

val outerClassVariable = "Outer class variable"
companion object{ val companionOjectVariable = "Companion Oject Variable"}

fun outerClassMethod()
{
println("Outer Class")
println(outerClassVariable)
println(companionOjectVariable)
}

class NestedInnerClass
{
//Nested inner class can only access static members and methods of outer class

val nestedInnerClassVariable = "Nested Inner class variable"
fun nestedInnerClassMethod()
{
println("\nNested Inner Class")
println(nestedInnerClassVariable)
println(companionOjectVariable)
}
}

inner class InnerClass
{
//inner class can access all the members and methods of outer class including private ones

val innerClassVariable = "Inner class variable"
fun innerClassMethod()
{
println("\nInner Class")
println(innerClassVariable)
println(outerClassVariable)
println(companionOjectVariable)
}
}

fun methodInnerClass()
{
class localInnerClass
{
val localInnerClassVariable = "Local Inner class variable"
}
val local = localInnerClass()
println("\n${local.localInnerClassVariable}")
/*classes can also be declared within block or a method of other class.
But it can only be accessed within that block or method, though it should still be instantiated.*/
}
}

/*Note: In Java by default nested inner class is non static to make them static we use "static" keyword, but in Kotlin by default nested inner class is static/ does not hold outer class refernece, to make the nested inner class non static we use "inner" keyword*/