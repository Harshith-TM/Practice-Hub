//Kotlin program for Abstraction

/*Abstraction is a concept in oops that hides implementation details and shows only the essential functionality to the user.
Note:
An abstract class must be declared using the abstract keyword.
An abstract class cannot be instantiated (no objects can be created).
An abstract class can contain both abstract and concrete/normal (non-abstract) methods.
An abstract method does not have a method body (implementation).
A subclass must implement all abstract methods of the abstract class.
If a subclass does not implement all abstract methods, it must also be declared abstract.
An abstract class can have constructors, variables (fields), and static methods.
An abstract class can extend another abstract class or a concrete/normal class.
A class can extend only one abstract class (single inheritance).
*/

fun main()
{
var ac: AbstractClass

ac = class1()
ac.AbstractMethod()
ac.normalMethod()

ac = class2()
ac.AbstractMethod()
ac.normalMethod()
}

abstract class AbstractClass
{
abstract fun AbstractMethod()

fun normalMethod()
{
println("Abstract Class : Normal Method")
}
}

class class1 : AbstractClass()
{
override fun AbstractMethod()
{
println("Abstract Method implemented in class1")
}
}

class class2 : AbstractClass()
{
override fun AbstractMethod()
{
println("Abstract Method implemented in class2")
}
}