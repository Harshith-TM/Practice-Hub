//Open Keyword in Kotlin

/*Open keyword: is used to allow.
Open keyword can be used to allow class, function or property to be inherited or overridden by subclasses.
In Kotlin by default a class cannot be inherited by other class, to make class available for inheritance we use open keyword.*/

fun main()
{
val nonOpenClassObject = nonOpenClass()
nonOpenClassObject.nonOpenClassMethod()

val class1Object = class1()
class1Object.openMethod()

val class2Object = class2()
class2Object.class1Method()
class2Object.class2Method()
class2Object.openMethod()
}

class nonOpenClass
{
val nonOpenClassVariable = "Non Open Class Variable"

fun nonOpenClassMethod()
{
println(nonOpenClassVariable)
}
}

/*class newClass : nonOpenClass(){} this causes an error*/

open class class1
{
val class1Variable = "Class 1 Variable"
open val name = "Parent Class"

fun class1Method() /*Methods which are not open can be accessed by child class but cannot override them*/
{
println("\nClass 1 Method")
println(class1Variable)
}
open fun openMethod(){println("\nClass 1 Open Method")}
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
override fun openMethod(){println("Overridden Class 1 Open Method")} /*override keyword is compulsory while overriding methods from other classed*/

//fun class1Method(){println("Override Class 1 Method") tihs causes an error}
}

/*final keyword can be used in kotlin to avoid further overriding from a member that is already overriding a method
open class class2 : class1()
{
final override fun openMethod(){println("Overridden Class 1 Open Method")}
}
class class3 : class2()
{
override fun openMethod(){println("Overriding from class2")} //this causes an error
}
*/