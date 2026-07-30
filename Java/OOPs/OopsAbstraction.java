//Java program for Abstraction

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

class OopsAbstraction
{
public static void main(String args[])
{
AbstractClass ac;

ac = new class1();
ac.AbstractMethod();
ac.normalMethod();

ac = new class2();
ac.AbstractMethod();
ac.normalMethod();
}
}

abstract class AbstractClass
{
abstract void AbstractMethod();

void normalMethod()
{
System.out.println("Abstract Class : Normal Method");
}
}

class class1 extends AbstractClass
{
void AbstractMethod()
{
System.out.println("Abstract Method implemented in class1");
}
}

class class2 extends AbstractClass
{
void AbstractMethod()
{
System.out.println("Abstract Method implemented in class2");
}
}